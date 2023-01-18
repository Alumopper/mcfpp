package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Cache;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.command.Commands;
import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.exception.VariableDuplicationException;
import top.alumopper.mcfpp.type.Int;
import top.alumopper.mcfpp.type.Var;

import java.util.ArrayList;

public class McfppImListener extends mcfppBaseListener {

    @Override
    public void enterFunctionBody(mcfppParser.FunctionBodyContext ctx){
        if(ctx.parent.parent instanceof mcfppParser.ClassMemberContext){
            //TODO:类成员
        }else {
            //函数的定义
            Function f = new Function(((mcfppParser.FunctionDeclarationContext)ctx.parent).Identifier().getText());
            if(((mcfppParser.FunctionDeclarationContext) ctx.parent).namespaceID() != null){
                f.tag = ((mcfppParser.FunctionDeclarationContext) ctx.parent).namespaceID().getText();
            }
            f.isClassMember = false;
            Function.currFunction = f;
            if(!Cache.functions.containsKey(f.name)){
                Cache.functions.put(f.name,f);
            }else {
                Project.logger.error("Already defined function:" + ((mcfppParser.FunctionDeclarationContext)ctx.parent).Identifier().getText());
                Project.errorCount ++;
                Function.currFunction = Function.nullFunction;
            }
            if(f.tag != null && (f.tag.equals("load") || f.tag.equals("tick")) && ((mcfppParser.FunctionDeclarationContext) ctx.parent).parameterList().parameter().size() != 0){
                Project.logger.error("Entrance function shouldn't have parameter:" + ((mcfppParser.FunctionDeclarationContext)ctx.parent).Identifier().getText());
                Project.errorCount ++;
            }
            if(((mcfppParser.FunctionDeclarationContext) ctx.parent).parameterList() != null){
                //函数参数解析
                for (mcfppParser.ParameterContext param : ((mcfppParser.FunctionDeclarationContext) ctx.parent).parameterList().parameter()) {
                    FunctionParam param1 = new FunctionParam(
                            param.type().getText(),
                            param.Identifier().getText(),
                            param.STATIC() == null);
                    f.params.add(param1);
                    if(param1.type.equals("int")){
                        f.cache.vars.put(param1.identifier,new Int(f.GetNamespaceID()+ "_param_" + param1.identifier));
                    }
                }
            }
        }
    }

    @Override
    public void exitFieldDeclaration(mcfppParser.FieldDeclarationContext ctx){
        Var var = null;
        if(ctx.type().className() == null){
            //普通类型
            switch (ctx.type().getText()){
                case "int" -> {
                    if(Function.currFunction.cache.vars.containsKey(ctx.Identifier().getText())){
                        Project.logger.error("Duplicate defined variable name:" + ctx.Identifier().getText() +
                                " at " + Project.currFile.getName() + " line:" + ctx.getStart().getLine());
                        Project.errorCount ++;
                        throw new VariableDuplicationException();
                    }
                    var = new Int(ctx.Identifier().getText());
                    if(ctx.parent instanceof mcfppParser.CompilationUnitContext){
                        //全局变量
                        Cache.globalVars.put(ctx.Identifier().getText(),var);
                    } else if(ctx.parent instanceof mcfppParser.ClassMemberContext){
                        //TODO 类成员
                    } else {
                        //函数变量
                        Function.currFunction.cache.vars.put(ctx.Identifier().getText(), var);
                    }
                }
            }
        }else {
            //TODO
        }
        //变量初始化
        if(ctx.expression() != null){
            Var init = new McfppExprVisitor().visit(ctx.expression());
            if(var instanceof Int var1){
                if(init instanceof Int init1){
                    //变量声明的标记，用于在优化阶段处理是否进行临时变量优化进行标记和定位
                    Function.addCommand("#Int " + var.identifier);
                    var1.assignCommand(init1);
                }else {
                    Project.logger.error("Cannot convert " + init.getClass() + " to " + var.getClass() +
                            " at " + Function.currFunction.GetID() + " line:" + ctx.getStart().getLine());
                    Project.errorCount ++;
                    throw new VariableConverseException();
                }
            }
        }
    }

    @Override
    public void exitStatementExpression(mcfppParser.StatementExpressionContext ctx){
        Var left = new McfppExprVisitor().visit(ctx.varWithSelector());
        Var right = new McfppExprVisitor().visit(ctx.expression());
        if(left instanceof Int left1){
            if(right instanceof Int right1){
                left1.assignCommand(right1);
            }else {
                Project.logger.error("Cannot convert " + left.getClass() + " to " + right.getClass() +
                        " at " + Function.currFunction.GetID() + " line:" + ctx.getStart().getLine());
                Project.errorCount ++;
                throw new VariableConverseException();
            }
        }
    }

    /**
     * 调用一个函数。参考：
     * <a href="https://www.mcbbs.net/thread-1393132-1-1.html">[命令] [数据包] 局部变量、程序控制流程在数据包中的实现 借助汇编语言函数堆栈思想 - mcbbs</a>
     * @param ctx the parse tree
     */
    @Override
    public void exitFunctionCall(mcfppParser.FunctionCallContext ctx){
        //参数获取
        ArrayList<Var> args = new ArrayList<>();
        McfppExprVisitor exprVisitor = new McfppExprVisitor();
        for (mcfppParser.ExpressionContext expr : ctx.arguments().expressionList().expression()) {
            args.add(exprVisitor.visit(expr));
        }
        //函数对象获取
        Function curr = new McfppFuncVisitor().visit(ctx);
        //参数比对
        if(curr.params.size() != args.size()){
            Project.logger.error("Need " + curr.params.size() + "arguments, but get " + args.size() + ":" + ctx.Identifier().getText() +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            Project.errorCount ++;
        }
        //给子函数开栈
        Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
        //函数调用
        if(curr.isClassMember){
            //TODO
        }else {
            //参数传递
            for (int i = 0; i < curr.params.size(); i++) {
                if(args.get(i) instanceof Int pint){
                    if(curr.params.get(i).type.equals("int")){
                        //参数传递和子函数的参数压栈
                        Function.addCommand("execute store result storage mcfpp:system " + Project.name + ".stack_frame[0]." + curr.params.get(i).identifier + " run "
                            + Commands.SbPlayerOperation(new Int(curr.GetNamespaceID()+ "_param_" + curr.params.get(i).identifier),"=",pint).toString()
                        );
                    }else {
                        Project.logger.error("Can't convert int to " + curr.params.get(i).type + ":" + args.get(i).identifier +
                                " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                        Project.errorCount ++;
                    }
                }
            }
            //函数调用的命令
            Function.addCommand(Commands.Function(curr).toString());
            //static关键字，将值传回
            for (int i = 0; i < curr.params.size(); i++) {
                if(curr.params.get(i).isStatic){
                    //如果是static参数
                    if(args.get(i) instanceof Int pint){
                        if(curr.params.get(i).type.equals("int")){
                            //如果是int取出到记分板
                            Function.addCommand("execute store result score " + pint.identifier + " " + pint.object + " run "
                                    + "data get storage mcfpp:system " + Project.name + ".stack_frame[0]." + curr.params.get(i).identifier
                            );
                        }
                    }
                }
            }
            //调用完毕，将子函数的栈销毁
            Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
            //取出栈内的值到记分板
            for (Var var : Function.currFunction.cache.vars.values()) {
                if(var instanceof Int int1){
                    //如果是int取出到记分板
                    Function.addCommand("execute store result score " + int1.identifier + " " + int1.object + " run "
                        + "data get storage mcfpp:system " + Project.name + ".stack_frame[0]." + Cache.getKey(Function.currFunction.cache.vars, var)
                    );
                }
            }
            //函数树
            Function.currFunction.child.add(curr);
            curr.parent = Function.currFunction;
        }
    }
}

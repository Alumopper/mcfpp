package top.alumopper.mcfpp.lib;

import org.antlr.v4.runtime.RuleContext;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.command.Commands;
import top.alumopper.mcfpp.exception.*;
import top.alumopper.mcfpp.lang.*;
import top.alumopper.mcfpp.type.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class McfppImListener extends mcfppBaseListener {

    /**
     * 进入一个函数体
     * @param ctx the parse tree
     */
    @Override
    public void enterFunctionBody(mcfppParser.FunctionBodyContext ctx){
        Function f;
        //获取函数对象
        if(!(ctx.parent.parent instanceof mcfppParser.ClassMemberContext)){
            //不是类成员
            //创建函数对象
            mcfppParser.FunctionDeclarationContext parent = (mcfppParser.FunctionDeclarationContext) ctx.parent;
            if(parent.namespaceID().Identifier().size() == 1){
                f = new Function(parent.namespaceID().Identifier(0).getText());
            }else {
                f = new Function(parent.namespaceID().Identifier(0).getText(),parent.namespaceID().Identifier(1).getText());
            }
            //解析参数
            if(parent.parameterList() != null){
                f.addParams(((mcfppParser.FunctionDeclarationContext) ctx.parent).parameterList());
            }
            //获取缓存中的对象
            f = Project.global.cache.getFunction(f.namespace, f.name, f.getParamTypeList());
        }else if(ctx.parent instanceof mcfppParser.ConstructorDeclarationContext constructor) {
            //是构造函数
            //创建构造函数对象并解析参数
            Function temp = new Function("temp");
            if(constructor.parameterList() != null){
                temp.addParams(constructor.parameterList());
            }
            //获取缓存中的对象
            f = Class.currClass.getConstructor(FunctionParam.toStringList(temp.params));
        }else {
            //是类的成员函数
            //创建函数对象并解析参数
            mcfppParser.ClassFunctionDeclarationContext qwq = (mcfppParser.ClassFunctionDeclarationContext)ctx.parent;
            f = new Function(qwq.Identifier().getText(),Class.currClass, false);
            if(qwq.parameterList() != null){
                f.addParams(qwq.parameterList());
            }
            //获取缓存中的对象
            f = Class.currClass.cache.getFunction(f.namespace,f.name,f.getParamTypeList());
        }
        Function.currFunction = f;
    }

    /**
     * 离开一个函数体
     * @param ctx the parse tree
     */
    @Override
    public void exitFunctionBody(mcfppParser.FunctionBodyContext ctx){
        if(Class.currClass == null){
            //不在类中
            Function.currFunction = Project.global.globalInit;
        }else {
            Function.currFunction = Class.currClass.classPreInit;
        }
    }

    /**
     * 进入命名空间声明的时候
     * @param ctx the parse tree
     */
    @Override
    public void exitNamespaceDeclaration(mcfppParser.NamespaceDeclarationContext ctx){
        Project.currNamespace = ctx.Identifier().getText();
    }

    /**
     * 变量声明
     * @param ctx the parse tree
     */
    @Override
    public void exitFieldDeclaration(mcfppParser.FieldDeclarationContext ctx){
        //变量生成
        Var var;
        if(ctx.parent instanceof mcfppParser.ClassMemberContext) {
            return;
        }else {
            //函数变量，生成
            var = Var.build(ctx, Function.currFunction);
        }
        assert var != null;
        //变量注册
        //一定是函数变量
        if(!Function.currFunction.cache.putVar(ctx.Identifier().getText(), var)){
            Project.logger.error("Duplicate defined variable name:" + ctx.Identifier().getText() +
                    " at " + Project.currFile.getName() + " line:" + ctx.getStart().getLine());
            Project.errorCount ++;
            throw new VariableDuplicationException();
        }
        Function.addCommand("#" + ctx.type().getText() + " " + ctx.Identifier().getText() + (ctx.expression() != null?" = " + ctx.expression().getText():""));
        //变量初始化
        if(ctx.expression() != null){
            Var init = new McfppExprVisitor().visit(ctx.expression());
            try{
                var.assign(init);
            }catch (VariableConverseException e){
                Project.logger.error("Cannot convert " + init.getClass() + " to " + var.getClass() +
                        " at " + Function.currFunction.GetID() + " line:" + ctx.getStart().getLine());
                Project.errorCount ++;
                throw new VariableConverseException();
            }
        }
    }

    /**
     * 一个赋值的语句
     * @param ctx the parse tree
     */
    @Override
    public void exitStatementExpression(mcfppParser.StatementExpressionContext ctx){
        Function.addCommand("#" + ctx.getText());
        Var left = new McfppExprVisitor().visit(ctx.basicExpression());
        if(left.isConst == Var.ConstStatus.ASSIGNED){
            Project.logger.error("Cannot assign a constant repeatedly: " + left.key +
                    " at " + Function.currFunction.GetID() + " line:" + ctx.getStart().getLine());
            Project.errorCount ++;
            throw new ConstChangeException();
        }else if(left.isConst == Var.ConstStatus.NULL){
            left.isConst = Var.ConstStatus.ASSIGNED;
        }
        Var right = new McfppExprVisitor().visit(ctx.expression());
        try{
            left.assign(right);
        }catch (VariableConverseException e){
            Project.logger.error("Cannot convert " + right.getClass() + " to " + left.getClass() +
                    " at " + Function.currFunction.GetID() + " line:" + ctx.getStart().getLine());
            Project.errorCount ++;
            throw new VariableConverseException();
        }
    }

    /**
     * 自加或自减语句
     * @param ctx the parse tree
     */
    @Override
    public void exitSelfAddOrMinusStatement(mcfppParser.SelfAddOrMinusStatementContext ctx){
        Function.addCommand("#" + ctx.getText());
        Var re = Function.currFunction.getVar(ctx.selfAddOrMinusExpression().Identifier().getText());
        if(re == null){
            Project.logger.error("Undefined variable:" + ctx.selfAddOrMinusExpression().Identifier().getText() +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            Project.errorCount ++;
            throw new VariableNotDefineException();
        }
        if(ctx.selfAddOrMinusExpression().op.getText().equals("++")){
            if(re instanceof Int i){
                if(re.isConcrete){
                    i.value ++;
                }else {
                    Function.addCommand(Commands.SbPlayerAdd(i,1));
                }
            }
        }else {
            if(re instanceof Int i){
                if(re.isConcrete){
                    i.value --;
                }else {
                    Function.addCommand(Commands.SbPlayerRemove(i,1));
                }
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
        Function.addCommand("#" + ctx.getText());
        //参数获取
        ArrayList<Var> args = new ArrayList<>();
        McfppExprVisitor exprVisitor = new McfppExprVisitor();
        for (mcfppParser.ExpressionContext expr : ctx.arguments().expressionList().expression()) {
            args.add(exprVisitor.visit(expr));
        }
        //函数对象获取
        Function curr = new McfppFuncVisitor().getFunction(ctx,FunctionParam.getVarTypes(args));
        if(curr == null){
            Project.logger.error("Function " + ctx.getText() + " not defined " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            throw new FunctionNotDefineException();
        }
        if(curr instanceof NativeFunction nativeCurr){
            //是native方法
            if(curr.isClassMember){
                //TODO
                throw new TODOException("");
            }else {
                nativeCurr.invoke(args,ctx.getStart().getLine());
            }
            return;
        }
        curr.invoke(args,ctx.getStart().getLine());
        //函数树
        Function.currFunction.child.add(curr);
        curr.parent.add(Function.currFunction);
    }

    Bool lastBool;  //if语句的条件

    //TODO 条件判断语句实现方式与参考文章有出入，可能存在bug

    /**
     * 进入if语句块
     * @param ctx the parse tree
     */
    @Override
    public void enterIfBlock(mcfppParser.IfBlockContext ctx){
        Function.addCommand("#if start");
        mcfppParser.IfStatementContext parent = (mcfppParser.IfStatementContext)ctx.parent;
        //是if语句，获取参数
        int index = parent.ifBlock().indexOf(ctx);
        //匿名函数的定义
        Function f = new InternalFunction("_if_",Function.currFunction);
        Project.global.cache.functions.add(f);
        if(index == 0){
            //第一个if
            Bool exp = (Bool)new McfppExprVisitor().visit(parent.expression());
            if(exp.isConcrete && exp.value){
                //函数调用的命令
                //给子函数开栈
                Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
                Function.addCommand(Commands.Function(f));
                Project.logger.warn("The condition is always true. " +
                        " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            }else if(exp.isConcrete) {
                Function.addCommand("#" + Commands.Function(f));
                Project.logger.warn("The condition is always false. " +
                        " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            }else {
                //给子函数开栈
                Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
                Function.addCommand("execute " +
                        "if score " + exp.identifier + " " + SbObject.MCS_boolean + " matches 1 " +
                        "run " + Commands.Function(f));
            }
            lastBool = exp;
        }else{
            //else语句
            Function.addCommand("execute " +
                    "unless score " + lastBool.identifier + " " + SbObject.MCS_boolean + " matches 1 " +
                    "run " + Commands.Function(f));
        }
        Function.currFunction = f;
    }

    /**
     * 离开if语句块
     * @param ctx the parse tree
     */
    @Override
    public void exitIfBlock(mcfppParser.IfBlockContext ctx){
        Function.currFunction = Function.currFunction.parent.get(0);
        //调用完毕，将子函数的栈销毁
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        Function.addCommand("#if end");
    }

    /**
     * 进入else-if语句块
     * @param ctx the parse tree
     */
    @Override
    public void enterElseIfStatement(mcfppParser.ElseIfStatementContext ctx){
        Function.addCommand("#else if start");
        //匿名函数的定义
        Function f = new InternalFunction("_if_",Function.currFunction);
        Project.global.cache.functions.add(f);
        if(lastBool.isConcrete && !lastBool.value){
            //函数调用的命令
            //给子函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand("#" + Commands.Function(f));
            Project.logger.warn("The condition is always false. " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
        }else if(lastBool.isConcrete) {
            //给子函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand(Commands.Function(f));
            Project.logger.warn("The condition is always true. " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
        }else {
            //给子函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand("execute " +
                    "unless score " + lastBool.identifier + " " + SbObject.MCS_boolean + " matches 1 " +
                    "run " + Commands.Function(f));
        }
        lastBool = null;
        Function.currFunction = f;
    }

    /**
     * 离开else-if语句块
     * @param ctx the parse tree
     */
    @Override
    public void exitElseIfStatement(mcfppParser.ElseIfStatementContext ctx){

        Function.currFunction = Function.currFunction.parent.get(0);
        //调用完毕，将子函数的栈销毁
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        Function.addCommand("#else if end");
    }

    /**
     * 进入while语句块
     * @param ctx the parse tree
     */
    @Override
    public void enterWhileBlock(mcfppParser.WhileBlockContext ctx){
        Function.addCommand("#while start");
        mcfppParser.WhileStatementContext parent = (mcfppParser.WhileStatementContext) ctx.parent;
        Bool exp = (Bool) new McfppExprVisitor().visit(parent.expression());
        //匿名函数的定义
        Function f = new InternalFunction("_while_",Function.currFunction);
        f.child.add(f);
        f.parent.add(f);
        Project.global.cache.functions.add(f);
        if(exp.isConcrete && exp.value){
            //给子函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand(Commands.Function(f));
            Project.logger.warn("The condition is always true. " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
        }else if(exp.isConcrete){
            //给子函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand("#" + Commands.Function(f));
            Project.logger.warn("The condition is always false. " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
        }else {
            //给子函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand("execute " +
                    "if score " + exp.identifier + " " + SbObject.MCS_boolean + " matches 1 " +
                    "run " + Commands.Function(f));
        }
        //调用完毕，将子函数的栈销毁
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        Function.currFunction = f;  //后续块中的命令解析到递归的函数中
    }

    /**
     * 离开while语句块
     * @param ctx the parse tree
     */
    @Override
    public void exitWhileBlock(mcfppParser.WhileBlockContext ctx){
        if(!Function.isBreak && Function.isLastFunctionEnd != 0){
            Function.currFunction = Function.currFunction.parent.get(0);
        }
        //递归调用函数
        //重新计算表达式
        mcfppParser.WhileStatementContext parent = (mcfppParser.WhileStatementContext) ctx.parent;
        Bool exp = (Bool) new McfppExprVisitor().visit(parent.expression());
        //给子函数开栈
        Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
        Function.addCommand("execute " +
                "if score " + exp.identifier + " " + SbObject.MCS_boolean + " matches 1 " +
                "run " + Commands.Function(Function.currFunction));
        //调用完毕，将子函数的栈销毁
        Function.currFunction = Function.currFunction.parent.get(0);
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        Function.addCommand("#while end");
    }

    /**
     * 进入do-while语句块，开始匿名函数调用
     * @param ctx the parse tree
     */
    @Override
    public void enterDoWhileBlock(mcfppParser.DoWhileBlockContext ctx){
        Function.addCommand("#do while start");
        //匿名函数的定义
        Function f = new InternalFunction("_dowhile_",Function.currFunction);
        f.child.add(f);
        f.parent.add(f);
        Project.global.cache.functions.add(f);
        //给子函数开栈
        Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
        Function.addCommand(Commands.Function(f));
        //调用完毕，将子函数的栈销毁
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        Function.currFunction = f;  //后续块中的命令解析到递归的函数中
    }

    /**
     * 离开do-while语句
     * @param ctx the parse tree
     */
    @Override
    public void exitDoWhileStatement(mcfppParser.DoWhileStatementContext ctx){
        Bool exp = (Bool) new McfppExprVisitor().visit(ctx.expression());
        if(exp.isConcrete && exp.value){
            //给子函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand(Commands.Function(Function.currFunction));
            Project.logger.warn("The condition is always true. " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStop().getLine());
        }else if(exp.isConcrete){
            //给子函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand("#" + Commands.Function(Function.currFunction));
            Project.logger.warn("The condition is always false. " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStop().getLine());
        }else {
            //给子函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand("execute " +
                    "if score " + exp.identifier + " " + SbObject.MCS_boolean + " matches 1 " +
                    "run " + Commands.Function(Function.currFunction));
        }
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        //调用完毕，将子函数的栈销毁
        Function.currFunction = Function.currFunction.parent.get(0);
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        Function.addCommand("#do while end");
    }

    /**
     * 整个for语句本身额外有一个栈，无条件调用函数
     * @param ctx the parse tree
     */
    @Override
    public void enterForStatement(mcfppParser.ForStatementContext ctx){
        Function.addCommand("#for start");
        Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
        Function forFunc = new InternalFunction("_for_",Function.currFunction);
        forFunc.parent.add(Function.currFunction);
        Project.global.cache.functions.add(forFunc);
        Function.addCommand(Commands.Function(forFunc));
        Function.currFunction = forFunc;
    }

    @Override
    public void exitForStatement(mcfppParser.ForStatementContext ctx){
        Function.currFunction = Function.currFunction.parent.get(0);
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        Function.addCommand("#for end");
    }

    /**
     * 进入for update语句块。
     * 由于在编译过程中，编译器会首先编译for语句的for control部分，也就是for后面的括号，这就意味着forUpdate语句将会先forBlock
     * 被写入到命令函数中。因此我们需要将forUpdate语句中的命令临时放在一个函数内部，然后在forBlock调用完毕后加上中间的命令
     * <p>
     *     值得注意的是，for update和for block相对于整个父函数的栈的位置应该是相同的，如果它们想要调用父函数中声明的变量，都应该
     *     用索引[1]来访问，因此可以直接将for update中的命令转移到for block中而不会出现任何问题。
     * </p>
     * @param ctx the parse tree
     */
    @Override
    public void enterForUpdate(mcfppParser.ForUpdateContext ctx){
        Function.currFunction = new InternalFunction("_forblock_",Function.currFunction);
    }

    Function forupdate;

    /**
     * 离开for update。将for update缓存，同时切换当前函数为父函数
     * @param ctx the parse tree
     */
    @Override
    public void exitForUpdate(mcfppParser.ForUpdateContext ctx){
        forupdate = Function.currFunction;
        Function.currFunction = forupdate.parent.get(0);
    }

    /**
     * 进入for block语句。此时当前函数为父函数
     * @param ctx the parse tree
     */
    @Override
    public void enterForBlock(mcfppParser.ForBlockContext ctx){
        mcfppParser.ForStatementContext parent = (mcfppParser.ForStatementContext) ctx.parent;
        Bool exp = (Bool) new McfppExprVisitor().visit(parent.forControl().expression());
        //匿名函数的定义。这里才是正式的for函数哦喵
        Function f = new InternalFunction("_forblock_",Function.currFunction);
        f.child.add(f);
        f.parent.add(f);
        Project.global.cache.functions.add(f);
        if(exp.isConcrete && exp.value){
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand(Commands.Function(f));
            Project.logger.warn("The condition is always true. " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
        }else if(exp.isConcrete){
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand("#" + Commands.Function(f));
            Project.logger.warn("The condition is always false. " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
        }else {
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand("execute " +
                    "if score " + exp.identifier + " " + SbObject.MCS_boolean + " matches 1 " +
                    "run " + Commands.Function(f));
        }
        //调用完毕，将子函数的栈销毁。这条命令仍然是在for函数中的。
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        Function.currFunction = f;  //后续块中的命令解析到递归的函数中
    }

    /**
     * 离开for block语句。此时当前函数仍然是for的函数
     * @param ctx the parse tree
     */
    @Override
    public void exitForBlock(mcfppParser.ForBlockContext ctx){
        //for update的命令压入
        Function.currFunction.commands.addAll(forupdate.commands);
        forupdate = null;
        //递归调用函数
        //重新计算表达式
        mcfppParser.ForStatementContext parent = (mcfppParser.ForStatementContext) ctx.parent;
        Bool exp = (Bool) new McfppExprVisitor().visit(parent.forControl().expression());
        //这里就需要给子函数开栈
        Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
        Function.addCommand("execute " +
                "if score " + exp.identifier + " " + SbObject.MCS_boolean + " matches 1 " +
                "run " + Commands.Function(Function.currFunction));
        //调用完毕，将子函数的栈销毁
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        Function.currFunction = Function.currFunction.parent.get(0);
    }

    @Override
    public void exitOrgCommand(mcfppParser.OrgCommandContext ctx){
        Function.addCommand(ctx.getText().substring(1));
    }

    /**
     * 进入任意语句，检查此函数是否还能继续添加语句
     * @param ctx the parse tree
     */
    @Override
    public void enterStatement(mcfppParser.StatementContext ctx){
        if(Function.currFunction.isEnd){
            Project.logger.warn("Unreachable code: " + ctx.getText() +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
        }
        if(Function.isLastFunctionEnd == 1){
            //循环经历了break语句的洗礼，后面的语句需要全部放在匿名函数中。
            Function.addCommand("#" + (Function.isBreak?"break":"continue") + " function");
            //匿名函数的定义
            Function f = new InternalFunction("_" + (Function.isBreak?"break":"continue") + "_",Function.currFunction);
            f.child.add(f);
            f.parent.add(f);
            Project.global.cache.functions.add(f);
            //给函数开栈
            Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
            Function.addCommand("execute " +
                    "unless score " + temp.identifier + " " + SbObject.MCS_boolean + " matches 1 " +
                    "run " + Commands.Function(f)
            );
            //调用完毕，将子函数的栈销毁
            Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
            Function.currFunction = f;  //后续块中的命令解析到递归的函数中
        }
    }

    Bool temp;

    @Override
    public void exitControlStatement(mcfppParser.ControlStatementContext ctx){
        if(!inLoopStatement(ctx)){
            Project.logger.error("'continue' or 'break' can only be used in loop statements: " +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            throw new SyntaxException();
        }
        if(Function.currFunction.isEnd || Function.isLastFunctionEnd != 0){
            return;
        }
        Function.addCommand("#" + ctx.getText());
        temp = new Bool();
        //变量进栈
        Function.addCommand("scoreboard players set " + this.temp.identifier + " " + SbObject.MCS_boolean + " = " + 1);
        Function.currFunction.isEnd = true;
        Function.isLastFunctionEnd = 1;
        if(ctx.BREAK() != null){
            Function.isBreak = true;
        }
    }

    /**
     * 离开任意代码块。主要用于break语句和continue语句的匿名函数出栈判定。
     * @param ctx the parse tree
     */
    @Override
    public void exitBlock(mcfppParser.BlockContext ctx){
        if(!Function.currFunction.isEnd && Function.isLastFunctionEnd == 2){
            if(ctx.parent instanceof mcfppParser.IfBlockContext){
                //如果是if语句，出栈
                Function.currFunction = Function.currFunction.parent.get(0);
                Function.isLastFunctionEnd = 1;
            }
            if(ctx.parent instanceof mcfppParser.ForBlockContext
                ||ctx.parent instanceof mcfppParser.WhileBlockContext
                ||ctx.parent instanceof mcfppParser.DoWhileBlockContext
            ){
                //是循环语句，出栈的同时重置isLastFunctionEnd标志
                Function.currFunction = Function.currFunction.parent.get(0);
                Function.isLastFunctionEnd = 0;
            }
        }
    }

    /**
     * 进入类体。
     * @param ctx the parse tree
     */
    @Override
    public void enterClassBody(mcfppParser.ClassBodyContext ctx){
        //获取类的对象
        mcfppParser.ClassDeclarationContext parent = (mcfppParser.ClassDeclarationContext)ctx.parent;
        String identifier = parent.className(0).getText();
        //设置作用域
        Class.currClass = Project.global.cache.classes.get(identifier);
        Function.currFunction = Class.currClass.classPreInit;
    }

    /**
     * 离开类体。将缓存重新指向全局
     * @param ctx the parse tree
     */
    @Override
    public void exitClassBody(mcfppParser.ClassBodyContext ctx){
        Class.currClass = null;
        Function.currFunction = Project.global.globalInit;
    }

    /**
     * 类成员的声明
     * @param ctx the parse tree
     */
    @Override
    public void exitClassMemberDeclaration(mcfppParser.ClassMemberDeclarationContext ctx){
        mcfppParser.ClassMemberContext memberContext = ctx.classMember();
        if(memberContext.classFunctionDeclaration() != null){
            //函数声明由函数的listener处理
            return;
        }
    }

    /**
     * 判断这个语句是否在循环语句中。包括嵌套形式。
     * @param ctx 需要判断的语句
     * @return 是否在嵌套中
     */
    private static boolean inLoopStatement(RuleContext ctx){
        if(ctx instanceof mcfppParser.ForStatementContext){
            return true;
        }
        if(ctx instanceof mcfppParser.DoWhileStatementContext){
            return true;
        }
        if(ctx instanceof mcfppParser.WhileStatementContext){
            return true;
        }
        if(ctx.parent != null){
            return inLoopStatement(ctx.parent);
        }
        return false;
    }
}

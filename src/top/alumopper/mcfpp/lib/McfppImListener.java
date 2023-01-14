package top.alumopper.mcfpp.lib;

import org.antlr.runtime.tree.ParseTree;
import top.alumopper.mcfpp.Cache;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.command.Commands;
import top.alumopper.mcfpp.exception.FunctionDuplicationException;
import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.exception.VariableDuplicationException;
import top.alumopper.mcfpp.type.Int;
import top.alumopper.mcfpp.type.Number;
import top.alumopper.mcfpp.type.Var;

public class McfppImListener extends mcfppBaseListener {

    @Override
    public void enterFunctionBody(mcfppParser.FunctionBodyContext ctx){
        Function f = new Function(((mcfppParser.FunctionDeclarationContext)ctx.parent).Identifier().getText());
        Function.currFunction = f;
        if(!Cache.functions.containsKey(f.GetID())){
            Cache.functions.put(f.GetID(),f);
        }else {
            Project.logger.error("重复定义的变量名:" + ((mcfppParser.FunctionDeclarationContext)ctx.parent).Identifier().getText());
            throw new FunctionDuplicationException();
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
                        throw new VariableDuplicationException();
                    }
                    var = new Int(ctx.Identifier().getText());
                    Function.currFunction.cache.vars.put(Function.currFunction.GetNamespaceID() + "_" + ctx.Identifier().getText(), var);
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
                    var1.assignCommand(init1);
                }else {
                    Project.logger.error("Cannot convert " + init.getClass() + " to " + var.getClass() +
                            " at " + Function.currFunction.GetID() + " line:" + ctx.getStart().getLine());
                    throw new VariableConverseException();
                }
            }
        }
    }

    @Override
    public void exitStatementExpression(mcfppParser.StatementExpressionContext ctx){
        if(ctx.expression() != null){
            //是赋值表达式
            if(ctx.var().selector().size() == 0 && ctx.var().Identifier() != null && ctx.var().identifierSuffix() != null){
                Var left = new McfppExprVisitor().visit(ctx.var());
                Var right = new McfppExprVisitor().visit(ctx.expression());
                if(left instanceof Int left1){
                    if(right instanceof Int right1){
                        left1.assignCommand(right1);
                    }else {
                        Project.logger.error("Cannot convert " + left.getClass() + " to " + right.getClass() +
                                " at " + Function.currFunction.GetID() + " line:" + ctx.getStart().getLine());
                        throw new VariableConverseException();
                    }
                }
            }
        }else {
            //TODO:函数调用
        }
    }
}

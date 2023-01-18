package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.type.Int;
import top.alumopper.mcfpp.type.Var;

import java.util.Objects;

/**
 * 获取表达式结果用的visitor
 */
public class McfppExprVisitor extends mcfppBaseVisitor<Var>{

    @Override
    public Var visitExpression(mcfppParser.ExpressionContext ctx){
        return visit(ctx.conditionalExpression());
    }

    @Override
    public Var visitConditionalExpression(mcfppParser.ConditionalExpressionContext ctx){
        if(ctx.expression().size() == 0){
            return visit(ctx.conditionalOrExpression());
        }else {
            return null;
        }
    }

    @Override
    public Var visitConditionalOrExpression(mcfppParser.ConditionalOrExpressionContext ctx){
        if(ctx.conditionalAndExpression().size() == 1){
            return visit(ctx.conditionalAndExpression(0));
        }else {
            return null;
        }
    }

    @Override
    public Var visitConditionalAndExpression(mcfppParser.ConditionalAndExpressionContext ctx){
        if(ctx.equalityExpression().size() == 1){
            return visit(ctx.equalityExpression(0));
        }else {
            //TODO
            return null;
        }
    }

    @Override
    public Var visitEqualityExpression(mcfppParser.EqualityExpressionContext ctx){
        if(ctx.relationalExpression().size() == 1){
            return visit(ctx.relationalExpression(0));
        }else {
            //TODO
            return null;
        }
    }

    @Override
    public Var visitRelationalExpression(mcfppParser.RelationalExpressionContext ctx){
        if(ctx.additiveExpression().size() == 1){
            return visit(ctx.additiveExpression(0));
        }else {
            //TODO
            return null;
        }
    }

    @Override
    public Var visitAdditiveExpression(mcfppParser.AdditiveExpressionContext ctx){
        if(ctx.multiplicativeExpression().size() == 1){
            return visit(ctx.multiplicativeExpression(0));
        }else {
            Var a = visit(ctx.multiplicativeExpression(0));
            Var b = visit(ctx.multiplicativeExpression(1));
            if(Objects.equals(ctx.op.getText(),"+")){
                if(a instanceof Int a1 && b instanceof Int b1){
                    return a1.addCommand(b1);
                }else {
                    //TODO
                    return null;
                }
            }else if(Objects.equals(ctx.op.getText(), "-")){
                if(a instanceof Int a1 && b instanceof Int b1){
                    return a1.minusCommand(b1);
                }else {
                    //TODO
                    return null;
                }
            }else {
                return  null;
            }
        }
    }

    @Override
    public Var visitMultiplicativeExpression(mcfppParser.MultiplicativeExpressionContext ctx){
        if(ctx.unaryExpression().size() == 1){
            return visit(ctx.unaryExpression(0));
        }else {
            Var a = visit(ctx.unaryExpression(0));
            Var b = visit(ctx.unaryExpression(1));
            if(Objects.equals(ctx.op.getText(), "*")){
                if(a instanceof Int a1 && b instanceof Int b1){
                    return a1.multipleCommand(b1);
                }else {
                    //TODO
                    return null;
                }
            }else if(Objects.equals(ctx.op.getText(), "/")){
                if(a instanceof Int a1 && b instanceof Int b1){
                    return a1.divideCommand(b1);
                }else {
                    //TODO
                    return null;
                }
            }else if(Objects.equals(ctx.op.getText(), "/")){
                if(a instanceof Int a1 && b instanceof Int b1){
                    return a1.modularCommand(b1);
                }else {
                    //TODO
                    return null;
                }
            }else {
                return null;
            }
        }
    }

    @Override
    public Var visitUnaryExpression(mcfppParser.UnaryExpressionContext ctx){
        if(ctx.basicExpression() != null){
            return visit(ctx.basicExpression());
        }else {
            //TODO
            return null;
        }
    }

    @Override
    public Var visitBasicExpression(mcfppParser.BasicExpressionContext ctx){
        if(ctx.primary() != null){
            return visit(ctx.primary());
        }else {
            //TODO
            return null;
        }
    }

    @Override
    public Var visitPrimary(mcfppParser.PrimaryContext ctx){
        if(ctx.var() != null) {
            //变量
            return visit(ctx.var());
        }else{
            //数字
            mcfppParser.NumberContext num = ctx.number();
            if(num.INT() != null){
                return new Int(Integer.parseInt(num.INT().getText()));
            }
        }
        return null;
    }

    @Override
    public Var visitVar(mcfppParser.VarContext ctx){
        if(ctx.Identifier() != null) {
            if (ctx.identifierSuffix() == null || ctx.identifierSuffix().size() == 0) {
                //没有数组选取
                String qwq = ctx.Identifier().getText();
                if (!Function.currFunction.cache.vars.containsKey(qwq)) {
                    Project.logger.error("Undefined variable:" + qwq +
                            " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                    Project.errorCount ++;
                    return null;
                } else {
                    return Function.currFunction.cache.vars.get(qwq);
                }
            } else {
                //TODO
                return null;
            }
        }else if(ctx.expression() != null){
            return visit(ctx.expression());
        }else {
            //TODO
            return null;
        }
    }
}

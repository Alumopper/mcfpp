package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.exception.TODOException;
import top.alumopper.mcfpp.type.Bool;
import top.alumopper.mcfpp.type.Int;
import top.alumopper.mcfpp.type.Var;

import java.util.Objects;

/**
 * 获取表达式结果用的visitor
 */
public class McfppExprVisitor extends mcfppBaseVisitor<Var>{

    @Override
    public Var visitExpression(mcfppParser.ExpressionContext ctx){
        return visit(ctx.conditionalOrExpression());
    }

    //TODO 三目表达式
    //@Override
    //public Var visitConditionalExpression(mcfppParser.ConditionalExpressionContext ctx){
    //    if(ctx.expression().size() == 0){
    //        return visit(ctx.conditionalOrExpression());
    //    }else {
    //        return null;
    //    }
    //}

    //或
    @Override
    public Var visitConditionalOrExpression(mcfppParser.ConditionalOrExpressionContext ctx){
        Var re = visit(ctx.conditionalAndExpression(0));
        for (int i = 1; i < ctx.conditionalAndExpression().size();i ++){
            Var b = visit(ctx.conditionalAndExpression(i));
            if(re instanceof Bool re2 && b instanceof Bool b2){
                re = re2.orCommand(b2);
            }else {
                throw new ArgumentNotMatchException("运算符'||'只能用于bool类型");
            }
        }
        return re;
    }

    //和
    @Override
    public Var visitConditionalAndExpression(mcfppParser.ConditionalAndExpressionContext ctx){
        Var re = visit(ctx.equalityExpression(0));
        for (int i = 1; i < ctx.equalityExpression().size();i ++){
            Var b = visit(ctx.equalityExpression(i));
            if(re instanceof Bool re2 && b instanceof Bool b2){
                re = re2.andCommand(b2);
            }else {
                throw new ArgumentNotMatchException("运算符'&&'只能用于bool类型");
            }
        }
        return re;
    }

    //等于或不等于
    @Override
    public Var visitEqualityExpression(mcfppParser.EqualityExpressionContext ctx){
        Var re = visit(ctx.relationalExpression(0));
        for (int i = 1; i < ctx.relationalExpression().size();i ++){
            Var b = visit(ctx.relationalExpression(i));
            if(ctx.op.getText().equals("==")){
                if(re instanceof Int re1 && b instanceof Int b1){
                    re = re1.equalCommand(b1);
                }else if(re instanceof Bool re2 && b instanceof Bool b2){
                    re = re2.equalCommand(b2);
                }
            }else{
                if(re instanceof Int re1 && b instanceof Int b1){
                    re = re1.notEqualCommand(b1);
                }else if(re instanceof Bool re2 && b instanceof Bool b2){
                    re = re2.notEqualCommand(b2);
                }
            }
        }
        return re;
    }

    //大小比较
    @Override
    public Var visitRelationalExpression(mcfppParser.RelationalExpressionContext ctx){
        Var re = visit(ctx.additiveExpression(0));
        if(ctx.additiveExpression().size() != 1){
            Var b = visit(ctx.additiveExpression(1));
            if(re instanceof Int re1 && b instanceof Int b1){
                switch (ctx.relationalOp().getText()){
                    case ">" -> re = re1.greaterCommand(b1);
                    case ">=" -> re = re1.greaterOrEqualCommand(b1);
                    case "<" -> re = re1.lessCommand(b1);
                    case "<=" -> re = re1.lessOrEqualCommand(b1);
                }
            }else {
                //TODO
                throw new TODOException("");
            }
        }
        return re;
    }

    //加法
    @Override
    public Var visitAdditiveExpression(mcfppParser.AdditiveExpressionContext ctx){
        Var re = visit(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size();i ++){
            Var b = visit(ctx.multiplicativeExpression(i));
            if(Objects.equals(ctx.op.getText(),"+")){
                if(re instanceof Int re1 && b instanceof Int b1){
                    re = re1.addCommand(b1);
                }else {
                    //TODO
                    throw new TODOException("");
                }
            }else if(Objects.equals(ctx.op.getText(), "-")){
                if(re instanceof Int re1 && b instanceof Int b1){
                    re = re1.minusCommand(b1);
                }else {
                    //TODO
                    throw new TODOException("");
                }
            }else {
                return  null;
            }
        }
        return re;
    }

    //乘法
    @Override
    public Var visitMultiplicativeExpression(mcfppParser.MultiplicativeExpressionContext ctx){
        Var a = visit(ctx.unaryExpression(0));
        Var re = a;
        for (int i = 1; i < ctx.unaryExpression().size();i ++){
            Var b = visit(ctx.unaryExpression(i));
            if(Objects.equals(ctx.op.getText(),"*")){
                if(re instanceof Int re1 && b instanceof Int b1){
                    re = re1.multipleCommand(b1);
                }else {
                    //TODO
                    throw new TODOException("");
                }
            }else if(Objects.equals(ctx.op.getText(), "/")){
                if(re instanceof Int re1 && b instanceof Int b1){
                    re = re1.divideCommand(b1);
                }else {
                    //TODO
                    throw new TODOException("");
                }
            }else if(Objects.equals(ctx.op.getText(), "%")){
                if(re instanceof Int re1 && b instanceof Int b1){
                    re = re1.modularCommand(b1);
                }else {
                    //TODO
                    throw new TODOException("");
                }
            }else {
                return  null;
            }
        }
        return re;
    }

    //单变量表达式
    @Override
    public Var visitUnaryExpression(mcfppParser.UnaryExpressionContext ctx){
        if(ctx.basicExpression() != null){
            return visit(ctx.basicExpression());
        }else if(ctx.unaryExpression() != null){
            Var a = visit(ctx.unaryExpression());
            if(a instanceof Bool a1){
                return a1.opposeCommand();
            }else {
                throw new ArgumentNotMatchException("运算符'!'只能用于bool类型");
            }
        }
        else {
            //TODO
            throw new TODOException("");
        }
    }

    //基本表达式
    @Override
    public Var visitBasicExpression(mcfppParser.BasicExpressionContext ctx){
        if(ctx.primary() != null){
            return visit(ctx.primary());
        }else {
            //TODO
            throw new TODOException("");
        }
    }

    //初级表达式
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

    //变量
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
                //TODO 是数组调用
                throw new TODOException("");
            }
        }else if(ctx.expression() != null){
            return visit(ctx.expression());
        }else {
            //TODO
            throw new TODOException("");
        }
    }
}

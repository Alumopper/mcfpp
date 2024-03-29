package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.command.Commands;
import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.exception.FunctionNotDefineException;
import top.alumopper.mcfpp.exception.TODOException;
import top.alumopper.mcfpp.lang.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * 获取表达式结果用的visitor。解析并计算一个形如a+b*c的表达式。
 */
public class McfppExprVisitor extends mcfppBaseVisitor<Var>{

    /**
     * 计算一个复杂表达式
     * @param ctx the parse tree
     * @return 表达式的结果
     */
    @Override
    public Var visitExpression(mcfppParser.ExpressionContext ctx){
        return visit(ctx.conditionalOrExpression());
    }

    //TODO 三目表达式。可能会实现，但是泠雪是懒狐，不想做。
    //@Override
    //public Var visitConditionalExpression(mcfppParser.ConditionalExpressionContext ctx){
    //    if(ctx.expression().size() == 0){
    //        return visit(ctx.conditionalOrExpression());
    //    }else {
    //        return null;
    //    }
    //}

    /**
     * 计算一个或表达式。例如 a || b。
     * @param ctx the parse tree
     * @return 表达式的值
     */
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

    /**
     * 计算一个与表达式。例如a && b
     * @param ctx the parse tree
     * @return 表达式的值
     */
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

    /**
     * 计算一个等于或不等于表达式，例如a == b和a != b
     * @param ctx the parse tree
     * @return 表达式的值
     */
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

    /**
     * 计算一个比较表达式，例如a > b
     * @param ctx the parse tree
     * @return 表达式的值
     */
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

    /**
     * 计算一个加减法表达式，例如a + b
     * @param ctx the parse tree
     * @return 表达式的值
     */
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

    /**
     * 计算一个乘除法表达式，例如a * b
     * @param ctx the parse tree
     * @return 表达式的值
     */
    //乘法
    @Override
    public Var visitMultiplicativeExpression(mcfppParser.MultiplicativeExpressionContext ctx){
        Var re = visit(ctx.unaryExpression(0));
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

    /**
     * 计算一个单目表达式。比如!a 或者 (int)a
     * @param ctx the parse tree
     * @return 表达式的值
     */
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
            //类型强制转换
            return visit(ctx.castExpression());
        }
    }

    /**
     * 计算一个强制转换表达式。
     * @param ctx the parse tree
     * @return 表达式的值
     */
    @Override
    public Var visitCastExpression(mcfppParser.CastExpressionContext ctx){
        Var a = visit(ctx.unaryExpression());
        return a.cast(ctx.type().getText());
    }

    /**
     * 计算一个基本的表达式。可能是一个变量，也可能是一个数值
     * @param ctx the parse tree
     * @return 表达式的值
     */
    //基本表达式
    @Override
    public Var visitBasicExpression(mcfppParser.BasicExpressionContext ctx){
        if(ctx.primary() != null){
            return visit(ctx.primary());
        }else {
            //Var With Selector
            return visit(ctx.varWithSelector());
        }
    }

    @Override
    public Var visitVarWithSelector(mcfppParser.VarWithSelectorContext ctx){
        CanSelectMember curr = null;
        if(ctx.var() != null){
            //Var
            curr = (ClassPointer) Function.currFunction.getVar(ctx.getText());
            if(curr == null && Function.currFunction.Class() != null){
                curr = (ClassPointer) Function.currFunction.Class().getMemberVar(ctx.getText());
            }
            if(curr == null){
                Project.logger.error("Undefined variable:" + ctx.var().getText() +
                        " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                Project.errorCount ++;
            }
        }else {
            //ClassName
            Class qwq = Project.global.cache.classes.getOrDefault(ctx.className().getText(),null);
            if(qwq == null){
                Project.logger.error("Undefined class:" + ctx.className().getText() +
                        " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                Project.errorCount ++;
            }
            curr = new ClassType(qwq);
        }
        Var member = null;
        //开始选择
        for (int i = 0; i < ctx.selector().size(); i++, curr = (CanSelectMember) member) {
            assert curr != null;
            member = curr.getVarMember(ctx.selector(i).getText());
            if(member == null){
                Project.logger.error("Undefined member " + ctx.selector(i).getText() + " in class " + curr.Class().identifier +
                        " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                Project.errorCount ++;
            }
        }
        return member;
    }

    /**
     * 一个初级表达式，可能是一个变量，也可能是一个数值
     * @param ctx the parse tree
     * @return 表达式的值
     */
    @Override
    public Var visitPrimary(mcfppParser.PrimaryContext ctx){
        if(ctx.var() != null) {
            //变量
            return visit(ctx.var());
        }else{
            //数字
            mcfppParser.ValueContext num = ctx.value();
            if(num.INT() != null){
                return new Int(Integer.parseInt(num.INT().getText()));
            }else if(num.STRING() != null){
                String r = num.STRING().getText();
                return new MCString(r.substring(1,r.length()-1));
            }
        }
        return null;
    }

    /**
     * 变量
     * @param ctx the parse tree
     * @return 变量
     */
    @Override
    public Var visitVar(mcfppParser.VarContext ctx){
        if(ctx.Identifier() != null) {
            // Identifier identifierSuffix*
            if (ctx.identifierSuffix() == null || ctx.identifierSuffix().size() == 0) {
                //没有数组选取
                String qwq = ctx.Identifier().getText();
                Var re = Function.currFunction.getVar(qwq);
                //TODO 从类的成员中选取。待定特性。
                /*
                if(re == null && Function.currFunction.Class() != null){
                    re = Function.currFunction.Class().getMemberVar(ctx.getText());
                }
                */
                if(re == null){
                    Project.logger.error("Undefined variable:" + qwq +
                            " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                    Project.errorCount ++;
                }
                return re;
            } else {
                //TODO 是数组调用
                throw new TODOException("");
            }
        }else if(ctx.expression() != null) {
            // '(' expression ')'
            return visit(ctx.expression());
        }else if(ctx.constructorCall() != null){
            // constructorCall
            return visit(ctx.constructorCall());
        }else {
            //TODO
            throw new TODOException("");
        }
    }

    @Override
    public Var visitConstructorCall(mcfppParser.ConstructorCallContext ctx){
        Class cls = Project.global.cache.classes.getOrDefault(ctx.className().getText(),null);
        if(cls == null){
            Project.logger.error("Undefined class:" + ctx.className().getText() +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            Project.errorCount ++;
        }
        //获取参数列表
        //参数获取
        ArrayList<Var> args = new ArrayList<>();
        McfppExprVisitor exprVisitor = new McfppExprVisitor();
        if(ctx.arguments().expressionList() != null){
            for (mcfppParser.ExpressionContext expr : ctx.arguments().expressionList().expression()) {
                args.add(exprVisitor.visit(expr));
            }
        }
        //如果是native类
        if(cls instanceof NativeClass ncls){
            //创建新实例并返回
            try {
                return ncls.newInstance(args);
            } catch (InvocationTargetException|InstantiationException|IllegalAccessException|NoSuchMethodException e) {
                Project.logger.error("Catch Exception when instantiate native class: " + ncls.cls +
                        " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                Project.logger.error(e.getMessage() + " " + e.getCause() + "\n");
                throw new RuntimeException(e);
            }
        }
        //构造函数获取
        assert cls != null;
        Constructor constructor = cls.getConstructor(FunctionParam.getVarTypes(args));
        if(constructor == null){
            Project.logger.error("No constructor like: " + FunctionParam.getVarTypes(args) + " defined in class " + ctx.className().getText() +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            Project.errorCount ++;
            throw new FunctionNotDefineException();
        }
        //调用构造函数
        ClassObject obj = cls.newInstance();
        constructor.invoke(args,ctx.getStart().getLine(),obj.initPointer);
        //调用函数
        return obj;
    }
}

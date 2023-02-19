package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.TODOException;

import java.util.ArrayList;

/**
 * 获取函数用的visitor
 */
public class McfppFuncVisitor extends mcfppBaseVisitor<Function>{

    @Override
    public Function visitFunctionCall(mcfppParser.FunctionCallContext ctx){
        if(ctx.namespaceID() != null && ctx.basicExpression() == null) {
            Function qwq;
            //获取函数的参数列表
            //参数获取
            ArrayList<String> args = new ArrayList<>();
            McfppExprVisitor exprVisitor = new McfppExprVisitor();
            for (mcfppParser.ExpressionContext expr : ctx.arguments().expressionList().expression()) {
                args.add(exprVisitor.visit(expr).getType());
            }
            if(ctx.namespaceID().Identifier().size() == 1){
                qwq = Project.global.cache.getFunction(Project.currNamespace,ctx.namespaceID().Identifier(0).getText(),args);
            }else {
                qwq = Project.global.cache.getFunction(ctx.namespaceID().Identifier(0).getText(),ctx.namespaceID().Identifier(1).getText(),args);
            }
            return qwq;
        }else if(ctx.basicExpression() != null){
            //TODO
            throw new TODOException("");
        }else {
            //TODO
            return null;
        }
    }
}

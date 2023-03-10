package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.TODOException;

import java.util.ArrayList;

/**
 * 获取函数用的visitor
 */
public class McfppFuncVisitor extends mcfppBaseVisitor<Function>{

    public Function getFunction(mcfppParser.FunctionCallContext ctx, ArrayList<String> args){
        if(ctx.namespaceID() != null && ctx.basicExpression() == null) {
            Function qwq;
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

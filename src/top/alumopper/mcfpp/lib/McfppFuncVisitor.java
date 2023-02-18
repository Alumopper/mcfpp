package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.TODOException;

/**
 * 获取函数用的visitor
 */
public class McfppFuncVisitor extends mcfppBaseVisitor<Function>{

    @Override
    public Function visitFunctionCall(mcfppParser.FunctionCallContext ctx){
        if(ctx.Identifier() != null && ctx.basicExpression() == null) {
            if (Cache.globalFunctions.containsKey(ctx.Identifier().getText())) {
                return Cache.globalFunctions.get(ctx.Identifier().getText());
            } else {
                Project.logger.error("Undefined function:" + ctx.Identifier().getText() +
                        " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                Project.errorCount++;
                return null;
            }
        }else if(ctx.basicExpression() != null){
            //TODO
            throw new TODOException("");
        }else {
            //TODO
            return null;
        }
    }
}

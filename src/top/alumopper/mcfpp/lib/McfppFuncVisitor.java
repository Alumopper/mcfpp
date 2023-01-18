package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Cache;
import top.alumopper.mcfpp.Project;

/**
 * 获取函数用的visitor
 */
public class McfppFuncVisitor extends mcfppBaseVisitor<Function>{

    @Override
    public Function visitFunctionCall(mcfppParser.FunctionCallContext ctx){
        if(ctx.Identifier() != null){
            if(Cache.functions.containsKey(ctx.Identifier().getText())){
                return Cache.functions.get(ctx.Identifier().getText());
            }else {
                Project.logger.error("Undefined function:" + ctx.Identifier().getText() +
                        " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                Project.errorCount ++;
                return null;
            }
        }else {
            //TODO
            return null;
        }
    }
}

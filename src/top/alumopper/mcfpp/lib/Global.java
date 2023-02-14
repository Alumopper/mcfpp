package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;

/**
 * 全局
 */
public class Global implements CacheContainer {

    public Function globalInit;

    public Global(){
        globalInit = new Function("_global_init");
        Function.currFunction = globalInit;
    }

    @Override
    public String getPrefix(){
        return Project.name + "_global_";
    }
}

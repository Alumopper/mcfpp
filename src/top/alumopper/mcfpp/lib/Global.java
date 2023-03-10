package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;

import java.util.ArrayList;

/**
 * 全局
 */
public class Global implements CacheContainer {

    public Function globalInit;

    /**
     * 全局函数
     */
    public Cache cache;

    /**
     *
     */
    public ArrayList<FunctionTag> functionTags = new ArrayList<>();

    public Global init(){
        cache = new Cache(null,this);
        globalInit = new Function("_global_init");
        Function.currFunction = globalInit;
        return this;
    }

    @Override
    public String getPrefix(){
        return Project.name + "_global_";
    }
}

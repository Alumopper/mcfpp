package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;

/**
 * 一个函数的标签
 */
public class FunctionTag {

    /**
     * 函数标签的命名空间
     */
    public String namespace;

    /**
     * 函数标签的名字
     */
    public String tag;

    /**
     * 这个标签含有那些函数
     */
    public Cache functions;

    public static final String MINECRAFT = "minecraft";

    public static final FunctionTag TICK = new FunctionTag(MINECRAFT,"tick");
    public static final FunctionTag LOAD = new FunctionTag(MINECRAFT,"load");

    public FunctionTag(String namespace, String tag){
        this.tag = tag;
        if(tag.equals("tick") || tag.equals("load")){
            this.namespace = MINECRAFT;
        }else {
            this.namespace = namespace;
        }
        this.functions = new Cache(Project.global.cache);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof FunctionTag f){
            return f.namespace.equals(namespace) && f.tag.equals(tag);
        }
        return false;
    }
}

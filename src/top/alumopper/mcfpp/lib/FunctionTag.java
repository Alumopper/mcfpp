package top.alumopper.mcfpp.lib;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
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
    public Cache cache;

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
        this.cache = new Cache(Project.global.cache);
    }

    public String getNamespaceID(){
        return namespace + ":" + tag;
    }

    public String getTagJSON(){
        JSONObject json = new JSONObject();
        JSONArray values = new JSONArray();
        for (Function f : cache.functions) {
            values.add(f.getNamespaceID());
        }
        json.put("values",values);
        return json.toString(SerializerFeature.PrettyFormat);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof FunctionTag f){
            return f.namespace.equals(namespace) && f.tag.equals(tag);
        }
        return false;
    }
}

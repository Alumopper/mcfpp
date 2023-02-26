package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;

import java.util.ArrayList;

/**
 * 一个类
 */
public class Class implements CacheContainer {
    /**
     * 这个类的标识符
     */
    public String identifier;

    /**
     * 类的命名空间
     */
    public String namespace;

    /**
     * 这个类的父类
     */
    public Class parent;

    /**
     * 成员变量和成员函数
     */
    public Cache cache;

    /**
     * 构造函数
     */
    public ArrayList<Constructor> constructors = new ArrayList<>();

    /**
     * 类的字段初始化函数
     */
    public Function classInit;

    /**
     * 当前编译的类
     */
    public static Class currClass = null;

    public Class(String identifier){
        this.identifier = identifier;
        classInit = new Function("_class_preinit_" + identifier);
        cache = new Cache();
    }

    @Override
    public String getPrefix(){
        return Project.name + "_class_" + identifier + "_";
    }

    /**
     * 根据参数列表获取一个类的构造函数
     * @param params 构造函数的参数列表
     * @return 返回这个类的参数
     */
    public Constructor getConstructor(ArrayList<FunctionParam> params){
        for (Constructor f : constructors) {
            if(f.params.size() == params.size()){
                //参数比对
                for (int i = 0; i < params.size(); i++) {
                    if(params.get(i).type.equals(f.params.get(i).type)){
                        return f;
                    }
                }
            }
        }
        return null;
    }
}

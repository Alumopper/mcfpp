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
     * 这个类的父类
     */
    public Class parent;

    /**
     * 成员变量和成员函数
     */
    public Cache members;

    /**
     * 构造函数
     */
    public ArrayList<Constructor> structFunctions = new ArrayList<>();

    /**
     * 类的字段初始化函数
     */
    public Function classInit;

    /**
     * 当前编译的类
     */
    public static Class currClass;

    public Class(String identifier){
        this.identifier = identifier;
        classInit = new Function("_class_preinit_" + identifier);
        members = new Cache();
    }

    @Override
    public String getPrefix(){
        return Project.name + "_class_" + identifier + "_";
    }


}

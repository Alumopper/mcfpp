package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Cache;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.reader.McfppFileReader;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 一个函数
 */
public class Function {
    /**
     * 包含的所有命令
     */
    public ArrayList<String> commands;

    /**
     * 函数的名字
     */
    public String name;

    /**
     * 函数的标签
     */
    public String tag;

    /**
     * 函数的路径
     */
    public String path;

    /**
     *  参数列表
     */
    public ArrayList<FunctionParam> params;

    /**
     *  是否是类的成员函数
     */
    public boolean isClassMember;

    /**
     * 函数编译时的缓存
     */
    public Cache cache = new Cache();

    /**
     * 这个函数调用的函数
     */
    public ArrayList<Function> child = new ArrayList<>();

    /**
     * 调用这个函数的函数
     */
    public ArrayList<Function> parent = new ArrayList<>();

    public Stack<Function> blockStack;

    /**
     * 目前处在的函数
     */
    public static Function currFunction;

    public static Function nullFunction = new Function("null");

    public Function(String name){
        this.path = McfppFileReader.currPath;
        this.name = name;
        this.commands = new ArrayList<>();
        this.params = new ArrayList<>();
        this.blockStack = new Stack<>();
    }

    public Function(String name, String tag){
        this(name);
        this.tag = tag;
    }

    public String GetID(){
        return path + "/" + name;
    }

    public String GetNamespaceID(){
        return Project.root.getName() + ":" + (path.equals("") ? "" : path + "/") + name;
    }

    public static void addCommand(String str){
        currFunction.commands.add(str);
    }
}

package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Cache;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.reader.McfppFileReader;

import java.util.ArrayList;

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
     * 函数的路径
     */
    public String path;

    /**
     * 函数编译时的缓存
     */
    public Cache cache = new Cache();

    /**
     * 目前处在的函数
     */
    public static Function currFunction;

    public Function(String name){
        this.path = McfppFileReader.currPath;
        this.name = name;
        commands = new ArrayList<>();
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

package top.alumopper.mcfpp.lib;

import java.util.*;

import top.alumopper.mcfpp.type.Var;

/**
 * 一个缓存。在编译过程中，编译器读取到的变量，函数等会以键值对的方式储存在其中。键为函数的id或者变量的
 * 标识符，而值则是这个函数或者变量的对象。
 */
public final class Cache {

    /**
     * 局部变量
     */
    public HashMap<String,Var> vars = new HashMap<>();

    public HashMap<String, Function> functions = new HashMap<>();

    /**
     * 全局变量
     */
    public static HashMap<String,Var> globalVars = new HashMap<>();

    /**
     * 全局函数
     */
    public static HashMap<String, Function> globalFunctions = new HashMap<>();

    /**
     * 全局类
     */
    public static HashMap<String, Class> globalClasses = new HashMap<>();

    //TODO:DEBUG
    public static void printAll(){
        for (Function s: globalFunctions.values()) {
            if(s instanceof NativeFunction){
                System.out.println("native " + s.getNamespaceID());
            }else {
                System.out.println(s.getNamespaceID());
                for (String c : s.commands) {
                    System.out.println("\t" + c);
                }
            }
        }
        for (Class s: globalClasses.values()){
            System.out.println("class " + s.identifier);
            System.out.println("\tconstructors:");
            for (Constructor c : s.structFunctions) {
                if(c instanceof NativeConstructor){
                    System.out.println("\t\tnative " + c.getNamespaceID());
                }else {
                    System.out.println("\t\t" + c.getNamespaceID());
                    for (String d : c.commands) {
                        System.out.println("\t\t\t" + d);
                    }
                }
            }
            System.out.println("\tfunctions:");
            for (Function f : s.members.functions.values()){
                if(f instanceof NativeFunction){
                    System.out.println("\t\t" + f.accessModifier.name().toLowerCase() + " native " + (f.isStatic?"static":"") + f.getNamespaceID());
                }else {
                    System.out.println("\t\t" + f.accessModifier.name().toLowerCase() + " " + (f.isStatic?"static":"") + f.getNamespaceID());
                    for (String d : f.commands) {
                        System.out.println("\t\t\t" + d);
                    }
                }
            }
            System.out.println("\tattributes:");
            for (Var v : s.members.vars.values()){
                System.out.println("\t\t" + v.accessModifier.name().toLowerCase() + " " + (v.isStatic?"static":"") + " " + v.getType() + " " + v.identifier);
            }
        }
    }

    public static Object getKey(Map map, Object value){
        List<Object> keyList = new ArrayList<>();
        for(Object key: map.keySet()){
            if(map.get(key).equals(value)){
                keyList.add(key);
            }
        }
        return keyList;
    }
}

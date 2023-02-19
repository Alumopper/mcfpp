package top.alumopper.mcfpp.lib;

import java.util.*;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.lang.Var;

/**
 * 一个缓存。在编译过程中，编译器读取到的变量，函数等会以键值对的方式储存在其中。键为函数的id或者变量的
 * 标识符，而值则是这个函数或者变量的对象。
 */
public final class Cache {

    /**
     * 变量缓存
     */
    public HashMap<String,Var> vars = new HashMap<>();

    /**
     * 函数缓存
     */
    public ArrayList<Function> functions = new ArrayList<>();

    /**
     * 类缓存
     */
    public HashMap<String, Class> classes = new HashMap<>();

    /**
     * 根据所给的函数名和参数获取一个函数
     * @param key 函数名
     * @param argsTypes 参数类型
     * @param namespace 命名空间
     * @return 如果此缓存中存在这个函数，则返回这个函数的对象，否则返回null
     */
    public Function getFunction(String namespace,String key, List<String> argsTypes){
        for (Function f : functions) {
            if(f.namespace.equals(namespace) && f.name.equals(key) && f.params.size() == argsTypes.size()){
                //参数比对
                for (int i = 0; i < argsTypes.size(); i++) {
                    if(argsTypes.get(i).equals(f.params.get(i).type)){
                        return f;
                    }
                }
            }
        }
        return null;
    }

    /**
     * TODO:DEBUG
     * 打印所有的函数和类
     */
    public static void printAll(){
        for (Function s: Project.global.cache.functions) {
            if(s instanceof NativeFunction){
                System.out.println("native " + s.getNamespaceID());
            }else {
                System.out.println(s.getNamespaceID());
                for (String c : s.commands) {
                    System.out.println("\t" + c);
                }
            }
        }
        for (Class s: Project.global.cache.classes.values()){
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
            for (Function f : s.cache.functions){
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
            for (Var v : s.cache.vars.values()){
                System.out.println("\t\t" + v.accessModifier.name().toLowerCase() + " " + (v.isStatic?"static":"") + " " + v.getType() + " " + v.identifier);
            }
        }
    }

    public static Object getKey(Map<?,?> map, Object value){
        List<Object> keyList = new ArrayList<>();
        for(Object key: map.keySet()){
            if(map.get(key).equals(value)){
                keyList.add(key);
            }
        }
        return keyList.get(0);
    }
}

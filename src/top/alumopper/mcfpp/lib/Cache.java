package top.alumopper.mcfpp.lib;

import java.util.*;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.lang.Var;

/**
 * 一个缓存。在编译过程中，编译器读取到的变量，函数等会以键值对的方式储存在其中。键为函数的id或者变量的
 * 标识符，而值则是这个函数或者变量的对象。
 * 缓存应该是一个链式的结构，主要分为如下几种情况：<br>
 * 类的静态变量 ---> 类的成员变量 --> 函数 ---> 匿名内部函数<br>
 * 类的静态变量 ---> 静态函数 ---> 匿名内部函数<br>
 * 函数 ---> 匿名内部函数
 * 寻找变量的时候，应当从当前的作用域开始寻找
 */
public final class Cache {

    /**
     * 变量缓存
     */
    private HashMap<String,Var> vars = new HashMap<>();

    /**
     * 函数缓存
     */
    public ArrayList<Function> functions = new ArrayList<>();

    /**
     * 类缓存
     */
    public HashMap<String, Class> classes = new HashMap<>();

    /**
     * 父级缓存。函数的父级缓存可能是类，也可能是全局。类的父级缓存总是全局，而全局则没有父级缓存
     */
    public Cache parent;

    /**
     * 这个缓存在哪一个容器中
     */
    public CacheContainer container;

    public Cache(){}

    /**
     * 创建一个缓存，并指定它的父级
     * @param parent 父级缓存。若没有则设置为null
     * @param cacheContainer 此缓存所在的容器
     */
    public Cache(Cache parent, CacheContainer cacheContainer){
        this.parent = parent;
        this.container = cacheContainer;
    }

    /**
     * 复制一个缓存。
     * @param cache 原来的缓存
     */
    public Cache(Cache cache){
        this.parent = cache.parent;
        //变量复制
        for (String key: cache.vars.keySet()) {
            Var var = cache.vars.get(key);
            this.vars.put(key, (Var) var.clone());
        }
        this.functions.addAll(cache.functions);
    }

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
                if(f.params.size() == 0){
                    return f;
                }
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

    //region Var

    /**
     * 向此缓存中添加一个新的变量键值对。如果已存在此对象，将不会进行覆盖。
     * @param key 变量的标识符
     * @param var 变量的对象
     * @return 如果缓存中已经存在此对象，则返回false，否则返回true。
     */
    public boolean putVar(String key, Var var){
        if(vars.containsKey(key)){
            return false;
        }else {
            vars.put(key, var);
            return true;
        }
    }

    /**
     * 从缓存中取出一个变量。如果此缓存中没有，则从父缓存中寻找。
     * @param key 变量的标识符
     * @return 变量的对象。若不存在，则返回null。
     */
    public Var getVar(String key){
        return vars.getOrDefault(key,null);
    }

    /**
     * 获取此缓存中的全部变量
     * @return 变量的对象，若不存在，则返回null
     */
    public Collection<Var> getAllVars(){
        return vars.values();
    }

    /**
     * 缓存中是否包含某个变量
     * @param id 变量名
     * @return 如果包含则返回true，否则返回false
     */
    public boolean containVar(String id){
        return vars.containsKey(id);
    }
    //endregion

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
            for (Constructor c : s.constructors) {
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
                System.out.println("\t\t" + v.accessModifier.name().toLowerCase() + " " + (v.isStatic?"static ":"") + v.getType() + " " + v.identifier);
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

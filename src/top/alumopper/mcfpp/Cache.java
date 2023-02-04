package top.alumopper.mcfpp;

import java.util.*;

import top.alumopper.mcfpp.lib.Function;
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

    /**
     * 全局变量
     */
    public static HashMap<String,Var> globalVars = new HashMap<>();

    /**
     * 全局函数
     */
    public static HashMap<String, Function> functions = new HashMap<>();

    //TODO:DEBUG
    public static void printAll(){
        for (Function s: functions.values()) {
            System.out.println(s.GetNamespaceID());
            for (String c : s.commands) {
                System.out.println("\t" + c);
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

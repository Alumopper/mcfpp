package top.alumopper.mcfpp;

import java.util.*;

import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.type.Var;

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

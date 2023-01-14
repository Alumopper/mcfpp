package top.alumopper.mcfpp;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.tokens.FunctionToken;
import top.alumopper.mcfpp.type.Number;
import top.alumopper.mcfpp.type.Var;

public final class Cache {
    //变量
    public HashMap<String,Var> vars = new HashMap<>();
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
}

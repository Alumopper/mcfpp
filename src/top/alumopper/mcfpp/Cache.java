package top.alumopper.mcfpp;

import java.util.ArrayList;
import java.util.HashMap;

import top.alumopper.mcfpp.tokens.FunctionToken;
import top.alumopper.mcfpp.type.Number;

public final class Cache {
    //变量
    public static ArrayList<Number> vars = new ArrayList<>();
    public static ArrayList<Double> constsnum = new ArrayList<>();
    public static ArrayList<Number> constvars = new ArrayList<>();
    public static HashMap<String, FunctionToken> functions = new HashMap<>();
}

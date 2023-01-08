package top.alumopper.mcfpp;

import java.util.ArrayList;
import java.util.HashMap;

import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.lib.FunctionParam;
import top.alumopper.mcfpp.type.Number;

public final class Cache {
    //变量
    public static ArrayList<Number> vars = new ArrayList<>();
    public static ArrayList<Double> constsnum = new ArrayList<>();
    public static ArrayList<Number> constvars = new ArrayList<>();
    public static HashMap<String, Function> functions = new HashMap<>();
}

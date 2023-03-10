package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.lang.Var;

import java.util.ArrayList;

/**
 * 函数的参数。用于函数声明的时候。
 */
public class FunctionParam {

    /**
     * 参数类型
     */
    public String type;

    /**
     * 参数是否为静态的
     */
    public boolean isStatic;

    /**
     * 参数的名字
     */
    public String identifier;

    public FunctionParam(String type, String name, boolean isStatic){
        this.type = type;
        this.identifier = name;
        this.isStatic = isStatic;
    }

    /**
     * 将一个参数列表转换为对应的字符串列表
     * @param params 参数列表
     * @return 它的字符串列表
     */
    public static ArrayList<String> toStringList(ArrayList<FunctionParam> params){
        ArrayList<String> qwq = new ArrayList<>();
        for (FunctionParam param : params) {
               qwq.add(param.type);
        }
        return qwq;
    }

    /**
     * 将一个变量列表转换为对应的字符串列表
     * @param params 参数列表
     * @return 它的字符串列表
     */
    public static ArrayList<String> getVarTypes(ArrayList<Var> params){
        ArrayList<String> qwq = new ArrayList<>();
        for (Var param : params) {
            qwq.add(param.getType());
        }
        return qwq;
    }
}

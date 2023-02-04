package top.alumopper.mcfpp.lib;

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
}

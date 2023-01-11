package top.alumopper.mcfpp.lib;

/**
 * 函数的参数
 */
public class FunctionParam {

    /**
     * 参数类型
     */
    public String type;

    /**
     * 参数是否为静态
     */
    public boolean isStatic;

    /**
     * 参数的名字
     */
    public String name;

    public FunctionParam(String type, String name, boolean isStatic){
        this.type = type;
        this.name = name;
        this.isStatic = isStatic;
    }
}

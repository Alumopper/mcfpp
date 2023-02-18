package top.alumopper.mcfpp.lib;

import java.util.List;

/**
 * 表示了一个native方法
 */
public class NativeFunction extends Function implements Native{
    /**
     * native方法引用的java方法的词法上下文
     */
    public mcfppParser.JavaReferContext javaMethod;

    /**
     * 引用的java方法的类名。包含包路径
     */
    public String javaClassName;

    /**
     * 引用的java方法的参数名。
     */
    public String javaMethodName;

    public NativeFunction(String name, mcfppParser.JavaReferContext javaMethod) {
        super(name);
        this.javaMethod = javaMethod;
        List<mcfppParser.StringNameContext> strs = javaMethod.stringName();
        this.javaMethodName = strs.get(strs.size()-1).getText();
        this.javaClassName = javaMethod.getText().substring(0,javaMethod.getText().lastIndexOf(javaMethodName)-1);
    }
}

package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.exception.IllegalFormatException;
import top.alumopper.mcfpp.lang.ClassObject;
import top.alumopper.mcfpp.lang.ClassPointer;
import top.alumopper.mcfpp.lang.Var;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 表示了一个native方法
 */
public class NativeFunction extends Function implements Native{
    /**
     * native方法引用的java方法的词法上下文
     */
    public mcfppParser.JavaReferContext javaReferContext;

    /**
     * 要调用的java方法
     */
    public Method javaMethod;

    /**
     * 引用的java方法的类名。包含包路径
     */
    public String javaClassName;

    /**
     * 引用的java方法的参数名。
     */
    public String javaMethodName;

    public NativeFunction(String name, mcfppParser.JavaReferContext javaMethod) throws IllegalFormatException, NoSuchMethodException, ClassNotFoundException {
        super(name);
        this.javaReferContext = javaMethod;
        List<mcfppParser.StringNameContext> strs = javaMethod.stringName();
        try{
            this.javaMethodName = strs.get(strs.size()-1).getText();
            this.javaClassName = javaMethod.getText().substring(0,javaMethod.getText().lastIndexOf(javaMethodName)-1);
            java.lang.Class<?> cls = java.lang.Class.forName(javaClassName);
            this.javaMethod = cls.getMethod(javaMethodName,Var[].class, ClassPointer.class);
        }catch (StringIndexOutOfBoundsException e){
            throw new IllegalFormatException(javaReferContext.getText());
        }catch (NoSuchMethodException e){
            throw new NoSuchMethodException(javaMethodName);
        }catch (ClassNotFoundException e){
            throw new ClassNotFoundException(javaClassName);
        }
    }

    @Override
    public void invoke(ArrayList<Var> args, int lineNo) {
        Var[] argsArray = new Var[args.size()];
        args.toArray(argsArray);
        try {
            javaMethod.invoke(null,argsArray,null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void invoke(ArrayList<Var> args, int lineNo, ClassPointer cls) {
        Var[] argsArray = new Var[args.size()];
        args.toArray(argsArray);
        try {
            javaMethod.invoke(null,argsArray,cls);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}

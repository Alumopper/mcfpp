package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.lang.ClassPointer;
import top.alumopper.mcfpp.lang.Var;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invoker {
    /**
     * 根据native上下文，调用一个java方法
     * @param args native方法参数
     * @param javaClass java的类。
     * @param javaMethod java方法。重载根据方法参数数量调用
     */
    public static void nativeInvoke(Var[] args, String javaClass , String javaMethod) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //反射获取java的类的对象，并调用方法
        java.lang.Class<?> cls = java.lang.Class.forName(javaClass);
        Method method = cls.getMethod(javaMethod,Var[].class, ClassPointer.class);
        method.invoke(null, (Object) args, null);
    }

    /**
     * 根据native上下文，调用一个java方法。这个native方法是一个类中的成员方法。
     * @param args native方法参数
     * @param cls 方法所在的类的对象
     * @param javaClass java的类
     * @param javaMethod java方法。包含了完整的包名.类名.方法名。重载根据方法参数数量调用
     */
    public static void nativeInvoke(Var[] args, ClassPointer cls, String javaClass, String javaMethod) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //反射获取java的类的对象，并调用方法
        java.lang.Class<?> jClass = java.lang.Class.forName(javaClass);
        Method method = jClass.getMethod(javaMethod,Var[].class, ClassPointer.class);
        method.invoke(null, (Object) args, cls);
    }
}

package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lib.Cache;
import top.alumopper.mcfpp.lib.Class;
import top.alumopper.mcfpp.lib.NativeClass;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;

public class NativeClassObject extends Var {
    /**
     * 它的类型
     */
    public NativeClass cls;

    /**
     * 它的java类的实例
     */
    public INativeClass javaClassObject;

    /**
     * 类的字符串标识符
     */
    public String type;

    /**
     * 初始化类实例的时候自动生成的临时指针
     */
    public ClassPointer initPointer;

    public NativeClassObject(NativeClass cls, ArrayList<Var> args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.cls = cls;
        this.type = cls.identifier;
        this.initPointer = new ClassPointer(cls, cls, UUID.randomUUID().toString());
        //创建java实例
        //列表转数组
        Var[] vars = new Var[args.size()];
        this.javaClassObject = cls.cls.getDeclaredConstructor(Var[].class, ClassPointer.class).newInstance(vars, initPointer);
    }

    @Override
    public void assign(Var b) throws VariableConverseException {

    }

    @Override
    public Var cast(String type) {
        return null;
    }

    @Override
    public Object clone() {
        return null;
    }

    @Override
    public String getType(){
        return type;
    }
}

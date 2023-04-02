package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.lang.ClassObject;
import top.alumopper.mcfpp.lang.INativeClass;
import top.alumopper.mcfpp.lang.NativeClassObject;
import top.alumopper.mcfpp.lang.Var;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * 代表了mcfpp中声明的一个native类
 */
public class NativeClass extends Class{

    public java.lang.Class<INativeClass> cls;

    public NativeClass(String identifier, java.lang.Class<INativeClass> cls) {
        this(identifier, Project.currNamespace, cls);
    }

    public NativeClass(String identifier, String namespace, java.lang.Class<INativeClass> cls){
        this.identifier = identifier;
        this.namespace = namespace;
        this.cls = cls;
    }

    public NativeClassObject newInstance(ArrayList<Var> args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return new NativeClassObject(this, args);
    }

}

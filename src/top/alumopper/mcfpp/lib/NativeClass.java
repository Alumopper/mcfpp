package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.lang.INativeClass;

public class NativeClass extends Class{

    public NativeClass(String identifier, java.lang.Class<INativeClass> cls) {
        super(identifier);
    }

    public NativeClass(String identifier, String namespace, java.lang.Class<INativeClass> cls){
        super(identifier,namespace);
    }
}

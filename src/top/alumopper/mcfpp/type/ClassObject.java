package top.alumopper.mcfpp.type;

import top.alumopper.mcfpp.lib.Class;

/**
 * 一个类的实例
 */
public class ClassObject extends Var{
    public Class cls;

    public String type;

    public ClassObject(Class cls){
        this.cls = cls;
        this.type = cls.identifier;
    }

    @Override
    public String getType(){
        return type;
    }
}

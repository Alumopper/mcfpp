package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lang.Var;
import top.alumopper.mcfpp.lib.Class;

/**
 * 一个类的实例
 */
public class ClassObject extends Var {
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

    @Override
    public void assign(Var b) throws VariableConverseException {

    }

    @Override
    public Var cast(String type) {
        return null;
    }
}

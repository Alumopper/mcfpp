package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lib.Class;
import top.alumopper.mcfpp.lib.Function;

import java.util.List;

/**
 * ClassType代表了一种类，它仅仅用于编译过程中。通过此类可以获取它代表的类的静态成员。
 */
public class ClassType extends ClassObject implements CanSelectMember{

    public ClassType(Class cls){
        super(cls);
    }

    @Override
    public boolean getIsStatic() {
        return true;
    }

    @Override
    public Object clone() {
        return null;
    }

    @Override
    public String getType(){
        return "ClassType";
    }

    @Override
    public void assign(Var b) throws VariableConverseException {

    }

    @Override
    public Var cast(String type) {
        return null;
    }

    @Override
    public Var getVarMember(String key) {
        return null;
    }

    @Override
    public Function getFunctionMember(String key, List<String> params) {
        return null;
    }
}

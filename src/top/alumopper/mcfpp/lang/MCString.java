package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lang.Var;

public class MCString extends Var {

    public String value;

    public String type = "string";

    public MCString(String value){
        this.value = value;
        isTemp = true;
    }

    public MCString(String value, String identifier){
        this.identifier = identifier;
    }

    @Override
    public String toString(){
        return value;
    }

    @Override
    public void assign(Var b) throws VariableConverseException {

    }

    @Override
    public Var cast(String type) {
        return null;
    }
}

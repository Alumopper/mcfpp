package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lib.Class;
import top.alumopper.mcfpp.lib.Function;

public class Selector extends Var {
    public String type = "selector";

    public String text;

    public Selector(String identifier){
        this.identifier = identifier;
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public void assign(Var b){
        if(b instanceof MCString init1){
            this.text = init1.toString();
        }else {
            throw new VariableConverseException();
        }
    }

    public void addTag(Var[] args, Class cls){
        System.out.println("addTag");
    }
}

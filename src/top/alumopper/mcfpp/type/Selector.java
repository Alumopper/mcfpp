package top.alumopper.mcfpp.type;

import top.alumopper.mcfpp.lang.Var;

/**
 * 一个目标选择器
 */
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
}

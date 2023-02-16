package top.alumopper.mcfpp.type;

public class MCString extends Var{

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

}

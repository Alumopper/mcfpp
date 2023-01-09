package top.alumopper.mcfpp.type;

public class Bool extends Number {
    public boolean value;

    public Bool(boolean b,String id){
        super(id);
        value = b;
    }
    public Bool(Bool b){
        super(b.identifier);
        value = b.value;
    }
}

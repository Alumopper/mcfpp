package top.alumopper.mcfpp.type;

public class Int extends Number{
    public int value;

    public Int(int b,String id){
        super(id);
        value = b;
    }
    public Int(Int b){
        super(b.identifier);
        value = b.value;
    }
}

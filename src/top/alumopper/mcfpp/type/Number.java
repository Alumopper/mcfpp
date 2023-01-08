package top.alumopper.mcfpp.type;

/**
 * 代表了mcfpp中的一个数字类型
 */
public abstract class Number extends Type {
    /**
     * 这个数字变量的标识符
     */
    String identifier;   //标识符

    public Number(String i){
        identifier = i;
    }
}

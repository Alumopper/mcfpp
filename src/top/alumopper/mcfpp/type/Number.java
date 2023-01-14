package top.alumopper.mcfpp.type;

/**
 * 代表了mcfpp中的一个数字类型
 */
public class Number<T> extends Var {

    public T value;

    public SbObject object;

    /**
     * 是否是动态的
     */
    public boolean isConcrete = false;

    /**
     * 是否是临时变量
     */
    public boolean isTemp = false;

    public Number(){
        super();
        object = SbObject.MCS_default;
    }

    public Number(String i){
        identifier = i;
        object = SbObject.MCS_default;
    }

    public void assignCommand(Number<T> a){}

    public Number<T> addCommand(Number<T> a){
        return null;
    }

    public Number<T> minusCommand(Number<T> a){
        return null;
    }

    public Number<T> multipleCommand(Number<T> a){
        return null;
    }

    public Number<T> divideCommand(Number<T> a){
        return null;
    }

    public Number<T> modularCommand(Number<T> a){
        return null;
    }
}

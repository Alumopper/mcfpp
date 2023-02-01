package top.alumopper.mcfpp.type;

/**
 * 代表了mcfpp中的一个数字类型
 */
public class Number<T> extends Var {

    public T value;

    public SbObject object;

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

    public Bool greaterCommand(Number<T> a){return null;}

    public Bool lessCommand(Number<T> a){return null;}

    public Bool lessOrEqualCommand(Number<T> a){return null;}

    public Bool greaterOrEqualCommand(Number<T> a){return null;}

    public Bool equalCommand(Number<T> a){return null;}

    public Bool notEqualCommand(Number<T> a){return null;}
}

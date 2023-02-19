package top.alumopper.mcfpp.type;

import top.alumopper.mcfpp.lang.Bool;
import top.alumopper.mcfpp.lang.Number;

public class Decimal extends Number {
    public int bp;  //小数点前
    public int ap;  //小数点后
    public double value;    //值

    public Decimal(int bp,double ap,String id){
        super(id);
        this.bp = bp;
        this.ap = (int)ap;
        while(ap > 1){
            ap /= 10;
        }
        value = bp + ap;
    }
    public Decimal(double value,String id){
        super(id);
        this.value = value;
        bp = (int)Math.floor(value);
        double ap = value - bp;
        while(ap != (int)ap){
            ap *= 10;
        }
        this.ap = (int)ap;
    }

    public Decimal(Decimal d){
        super(d.identifier);
        bp = d.bp;
        ap = d.ap;
        value = d.value;
    }

    @Override
    public void assignCommand(Number a) {

    }

    @Override
    public Number addCommand(Number a) {
        return null;
    }

    @Override
    public Number minusCommand(Number a) {
        return null;
    }

    @Override
    public Number multipleCommand(Number a) {
        return null;
    }

    @Override
    public Number divideCommand(Number a) {
        return null;
    }

    @Override
    public Number modularCommand(Number a) {
        return null;
    }

    @Override
    public Bool greaterCommand(Number a) {
        return null;
    }

    @Override
    public Bool lessCommand(Number a) {
        return null;
    }

    @Override
    public Bool lessOrEqualCommand(Number a) {
        return null;
    }

    @Override
    public Bool greaterOrEqualCommand(Number a) {
        return null;
    }

    @Override
    public Bool equalCommand(Number a) {
        return null;
    }

    @Override
    public Bool notEqualCommand(Number a) {
        return null;
    }
}

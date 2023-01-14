package top.alumopper.mcfpp.type;

import top.alumopper.mcfpp.command.Commands;
import top.alumopper.mcfpp.lib.Function;

import java.util.UUID;

public class Int extends Number<Integer>{


    public Int(){
        this(UUID.randomUUID().toString());
        this.isTemp = true;
    }

    public Int(int value){
        this(UUID.randomUUID().toString());
        this.isTemp = true;
        isConcrete = true;
        this.value = value;
    }

    public Int(String id,int value){
        super(Function.currFunction.GetNamespaceID() + "_" + id);
        this.isConcrete = true;
        this.value = value;
    }

    public Int(String id){
        super(Function.currFunction.GetNamespaceID() + "_" + id);
    }

    public Int(Int b){
        super(b.identifier);
        value = b.value;
        this.isConcrete = b.isConcrete;
        this.isTemp = b.isTemp;
    }


    @Override
    public void assignCommand(Number<Integer> a){
        //t = a
        if(a.isConcrete){
            this.isConcrete = true;
            this.value = a.value;
        }else {
            this.isConcrete = false;
            Function.addCommand(Commands.SbPlayerOperation(this,"=", (Int) a).toString());
        }
    }

    @Override
    public Number<Integer> addCommand(Number<Integer> a){
        //re = t + a
        Int re = new Int();
        if(a.isConcrete){
            if(this.isConcrete){
                re.value = this.value + a.value;
                re.isConcrete = true;
            }else {
                if(!this.isTemp){
                    Function.addCommand(Commands.SbPlayerOperation(re,"=",this).toString());
                }else {
                    re = this;
                }
                Function.addCommand(Commands.SbPlayerAdd(re,a.value).toString());
            }
        }else {
            if(this.isConcrete){
                if(!a.isTemp){
                    Function.addCommand(Commands.SbPlayerOperation(re,"=", (Int) a).toString());
                }else {
                    re = (Int) a;
                }
                Function.addCommand(Commands.SbPlayerAdd(re,this.value).toString());
            }else {
                if(!a.isTemp){
                    Function.addCommand(Commands.SbPlayerOperation(re,"=", (Int) a).toString());
                }else {
                    re = (Int) a;
                }
                Function.addCommand(Commands.SbPlayerOperation(re,"+=",this).toString());
            }
        }
        return re;
    }

    @Override
    public Number<Integer> minusCommand(Number<Integer> a) {
        //re = t - a
        Int re = new Int();
        if (a.isConcrete) {
            if (this.isConcrete) {
                re.value = this.value - a.value;
                re.isConcrete = true;
            } else {
                if(!this.isTemp){
                    Function.addCommand(Commands.SbPlayerOperation(re,"=",this).toString());
                }else {
                    re = this;
                }
                Function.addCommand(Commands.SbPlayerRemove(re, a.value).toString());
            }
        } else {
            if (this.isConcrete) {
                if(!a.isTemp){
                    Function.addCommand(Commands.SbPlayerOperation(re,"=", (Int) a).toString());
                }else {
                    re = (Int) a;
                }
                Function.addCommand(Commands.SbPlayerRemove(re, this.value).toString());
            } else {
                if(!a.isTemp){
                    Function.addCommand(Commands.SbPlayerOperation(re,"=", (Int) a).toString());
                }else {
                    re = (Int) a;
                }
                Function.addCommand(Commands.SbPlayerOperation(re, "-=", this).toString());
            }
        }
        return re;
    }

    @Override
    public Number<Integer> multipleCommand(Number<Integer> a){
        //re = t * a
        Int re = new Int();
        if (a.isConcrete && this.isConcrete) {
            re.value = this.value * a.value;
            re.isConcrete = true;
        } else {
            if(a.isConcrete){
                Function.addCommand(Commands.SbPlayerSet((Int) a,a.value).toString());
            }
            if(this.isConcrete){
                Function.addCommand(Commands.SbPlayerSet(this,this.value).toString());
            }
            if(!this.isTemp){
                Function.addCommand(Commands.SbPlayerOperation(re,"=",this).toString());
            }else {
                re = this;
            }
            Function.addCommand(Commands.SbPlayerOperation(re, "*=", (Int) a).toString());
        }
        return re;
    }

    @Override
    public Number<Integer> divideCommand(Number<Integer> a){
        //re = t / a
        Int re = new Int();
        if (a.isConcrete && this.isConcrete) {
            re.value = this.value / a.value;
            re.isConcrete = true;
        } else {
            if(a.isConcrete){
                Function.addCommand(Commands.SbPlayerSet((Int) a,a.value).toString());
            }
            if(this.isConcrete){
                Function.addCommand(Commands.SbPlayerSet(this,this.value).toString());
            }
            if(!this.isTemp){
                Function.addCommand(Commands.SbPlayerOperation(re,"=",this).toString());
            }else {
                re = this;
            }
            Function.addCommand(Commands.SbPlayerOperation(re, "/=", (Int) a).toString());
        }
        return re;
    }

    @Override
    public Number<Integer> modularCommand(Number<Integer> a){
        //re = t / a
        Int re = new Int();
        if (a.isConcrete && this.isConcrete) {
            re.value = this.value % a.value;
            re.isConcrete = true;
        } else {
            if(a.isConcrete){
                Function.addCommand(Commands.SbPlayerSet((Int) a,a.value).toString());
            }
            if(this.isConcrete){
                Function.addCommand(Commands.SbPlayerSet(this,this.value).toString());
            }
            if(!this.isTemp){
                Function.addCommand(Commands.SbPlayerOperation(re,"=",this).toString());
            }else {
                re = this;
            }
            Function.addCommand(Commands.SbPlayerOperation(re, "%=", (Int) a).toString());
        }
        return re;
    }
}

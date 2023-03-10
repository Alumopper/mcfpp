package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.command.Commands;
import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lib.CacheContainer;
import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.type.SbObject;

import java.util.Objects;
import java.util.UUID;

/**
 * 代表了mc中的一个整数。实质上是记分板中的一个记分项。
 */
public class Int extends Number<Integer> {
    /**
     * 创建一个匿名的动态int
     */
    public Int(){
        this(UUID.randomUUID().toString());
        this.isTemp = true;
    }

    /**
     * 创建一个固定的匿名int
     * @param value 值
     */
    public Int(int value){
        this(UUID.randomUUID().toString());
        this.isTemp = true;
        isConcrete = true;
        this.value = value;
    }

    /**
     * 创建一个固定的int
     * @param id 标识符
     * @param value 值
     */
    public Int(String id,int value){
        super(Function.currFunction.getNamespaceID() + "_" + id);
        this.key = id;
        this.isConcrete = true;
        this.value = value;
    }

    /**
     * 创建一个int
     * @param id 值
     */
    public Int(String id, CacheContainer curr){
        super( curr.getPrefix() + id);
        this.key = id;
    }

    public Int(String id){
        super(id);
        this.key = id;
    }

    /**
     * 复制一个int
     * @param b 被复制的int值
     */
    public Int(Int b){
        super(b.identifier);
        value = b.value;
        this.isConcrete = b.isConcrete;
        this.isTemp = b.isTemp;
        this.key = b.key;
    }

    @Override
    public String getType(){
        return "int";
    }

    @Override
    public void assign(Var b) throws VariableConverseException{
        if(b instanceof Int init1){
            this.assignCommand(init1);
        }else {
            throw new VariableConverseException();
        }
    }

    @Override
    public Var cast(String type) {
        if(type.equals(getType())){
            return this;
        }
        return null;
    }

    @Override
    public void assignCommand(Number<Integer> a){
        //t = a
        if(a.isConcrete){
            this.isConcrete = true;
            this.value = a.value;
        }else {
            this.isConcrete = false;
            //变量进栈
            Function.addCommand("execute store result storage mcfpp:system " + Project.name + ".stack_frame[" + stackIndex + "]." + this.identifier.replace(":","_") + " run "
                    + Commands.SbPlayerOperation(this,"=", (Int) a)
            );
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

    @Override
    public Bool greaterCommand(Number<Integer> a) {
        //re = t > a
        Bool re;
        if(this.isConcrete && a.isConcrete){
            re = new Bool(this.value > a.value);
        }else if(this.isConcrete){
            re = a.lessCommand(this);
        }else if(a.isConcrete){
            //execute store success score qwq qwq if score qwq qwq matches a+1..
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " matches " + (a.value + 1) + "..");
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " > " + a.identifier + " " + a.object);
        }
        return re;
    }

    @Override
    public Bool lessCommand(Number<Integer> a) {
        //re = t < a
        Bool re;
        if(this.isConcrete && a.isConcrete){
            re = new Bool(this.value < a.value);
        }else if(this.isConcrete){
            re = a.greaterCommand(this);
        }else if(a.isConcrete){
            //execute store success score qwq qwq if score qwq qwq matches a+1..
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " matches " + ".." + (a.value - 1));
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " < " + a.identifier + " " + a.object);
        }
        return re;
    }

    @Override
    public Bool lessOrEqualCommand(Number<Integer> a) {
        //re = t <= a
        Bool re;
        if(this.isConcrete && a.isConcrete){
            re = new Bool(this.value <= a.value);
        }else if(this.isConcrete){
            re = a.greaterCommand(this);
        }else if(a.isConcrete){
            //execute store success score qwq qwq if score qwq qwq matches a+1..
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " matches " + ".." + a.value);
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " <= " + a.identifier + " " + a.object);
        }
        return re;
    }

    @Override
    public Bool greaterOrEqualCommand(Number<Integer> a) {
        //re = t <= a
        Bool re;
        if(this.isConcrete && a.isConcrete){
            re = new Bool(this.value >= a.value);
        }else if(this.isConcrete){
            re = a.greaterCommand(this);
        }else if(a.isConcrete){
            //execute store success score qwq qwq if score qwq qwq matches a+1..
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " matches " + a.value + "..");
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " >= " + a.identifier + " " + a.object);
        }
        return re;
    }

    @Override
    public Bool equalCommand(Number<Integer> a) {
        //re = t == a
        Bool re;
        if(this.isConcrete && a.isConcrete){
            re = new Bool(Objects.equals(this.value, a.value));
        }else if(this.isConcrete){
            re = a.equalCommand(this);
        }else if(a.isConcrete){
            //execute store success score qwq qwq if score qwq qwq = owo owo
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " matches " + a.value);
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + this.object + " = " + a.identifier + " " + a.object);
        }
        return re;
    }

    @Override
    public Bool notEqualCommand(Number<Integer> a) {
        //re = t != a
        Bool re;
        if(this.isConcrete && a.isConcrete){
            re = new Bool(!Objects.equals(this.value, a.value));
        }else if(this.isConcrete){
            re = a.equalCommand(this);
        }else if(a.isConcrete){
            //execute store success score qwq qwq if score qwq qwq = owo owo
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " unless score " + this.identifier + " " + this.object + " matches " + a.value);
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " unless score " + this.identifier + " " + this.object + " = " + a.identifier + " " + a.object);
        }
        return re;
    }

    @Override
    public Int clone(){
        return new Int(this);
    }
}

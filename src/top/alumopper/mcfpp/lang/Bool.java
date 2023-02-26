package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lib.CacheContainer;
import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.type.SbObject;

import java.util.Objects;
import java.util.UUID;

public class Bool extends Var {

    public boolean value;

    public Bool(String id, CacheContainer curr){
        this.key = id;
        identifier = curr.getPrefix() + "_" + id;
    }

    public Bool(boolean b, String id, CacheContainer curr){
        this(id,curr);
        value = b;
        this.isConcrete = true;
    }

    public Bool(String id){
        this.key = id;
        identifier = id;
    }

    public Bool(){
        this(UUID.randomUUID().toString());
        this.isTemp = true;
    }

    public Bool(boolean b){
        this(UUID.randomUUID().toString());
        this.isTemp = true;
        isConcrete = true;
        this.value = b;
    }

    public Bool(Bool b){
        this.identifier = b.identifier;
        value = b.value;
        isTemp = b.isTemp;
        isConcrete = b.isConcrete;
        this.key = b.key;
    }

    @Override
    public String getType(){
        return "bool";
    }

    @Override
    public void assign(Var b){
        if(b instanceof Bool init1){
            this.assignCommand(init1);
        }else {
            throw new VariableConverseException();
        }
    }

    public Bool equalCommand(Bool a) {
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
                    + " if score " + this.identifier + " " + SbObject.MCS_boolean + " matches " + (a.value?1:0));
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + SbObject.MCS_boolean + " = " + a.identifier + " " + SbObject.MCS_boolean);
        }
        return re;
    }

    public Bool notEqualCommand(Bool a) {
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
                    + " unless score " + this.identifier + " " + SbObject.MCS_boolean + " matches " + (a.value?1:0));
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " unless score " + this.identifier + " " + SbObject.MCS_boolean + " = " + a.identifier + " " + SbObject.MCS_boolean);
        }
        return re;
    }

    public Bool opposeCommand(){
        Bool re;
        if(this.isConcrete){
            if(this.isTemp){
                this.value = !this.value;
                re = this;
            }else {
                re = new Bool(!this.value);
            }
        }else {
            if(this.isTemp){
                Function.addCommand("execute store success score " + this.identifier + " " + SbObject.MCS_boolean
                        + " if score " + this.identifier + " " + SbObject.MCS_boolean + " matches " + 0);
                re = this;
            }else {
                re = new Bool();
                Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                        + " if score " + this.identifier + " " + SbObject.MCS_boolean + " matches " + 0);
            }
        }
        return re;
    }

    public Bool orCommand(Bool a){
        Bool re;
        if(this.isConcrete && a.isConcrete){
            re = new Bool(this.value || a.value);
        }else if(this.isConcrete){
            re = a.orCommand(this);
        }else if(a.isConcrete){
            if(a.value){
                re = new Bool(true);
            }else {
                re = new Bool();
                Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                        + " if score " + this.identifier + " " + SbObject.MCS_boolean + " matches " + 1);
            }
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + SbObject.MCS_boolean + " matches " + 1);
            Function.addCommand("execute" +
                    " if score " + re.identifier + " " + SbObject.MCS_boolean + " matches " + 0 +
                    " store success score " + re.identifier + " " + SbObject.MCS_boolean +
                    " if score " + a.identifier + " " + SbObject.MCS_boolean + " matches " + 1);
        }
        return re;
    }

    public Bool andCommand(Bool a){
        Bool re;
        if(this.isConcrete && a.isConcrete){
            re = new Bool(this.value && a.value);
        }else if(this.isConcrete){
            re = a.andCommand(this);
        }else if(a.isConcrete){
            if(!a.value){
                re = new Bool(false);
            }else {
                re = new Bool();
                Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                        + " if score " + this.identifier + " " + SbObject.MCS_boolean + " matches " + 1);
            }
        }else {
            re = new Bool();
            Function.addCommand("execute store success score " + re.identifier + " " + SbObject.MCS_boolean
                    + " if score " + this.identifier + " " + SbObject.MCS_boolean + " matches " + 1);
            Function.addCommand("execute" +
                    " if score " + re.identifier + " " + SbObject.MCS_boolean + " matches " + 1 +
                    " store success score " + re.identifier + " " + SbObject.MCS_boolean +
                    " if score " + a.identifier + " " + SbObject.MCS_boolean + " matches " + 1);
        }
        return re;
    }

    public void assignCommand(Bool a){
        if(a.isConcrete){
            this.isConcrete = true;
            this.value = true;
        }else {
            this.isConcrete = false;
            //变量进栈
            Function.addCommand("execute" +
                    " store result storage mcfpp:system " + Project.name + ".stack_frame[" + stackIndex + "]." + this.identifier.replace(":","_") +
                    " run scoreboard players operation " + this.identifier + " " + SbObject.MCS_boolean + " = " + a.identifier + " " + SbObject.MCS_boolean
            );
        }
    }
}

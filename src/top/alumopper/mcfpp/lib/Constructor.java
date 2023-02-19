package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;

/**
 * 一个构造函数
 */
public class Constructor extends Function {

    Class target;
    public Constructor(Class cls) {
        super("_init_" + cls.identifier.toLowerCase() + "_" + cls.structFunctions.size());
        this.target = cls;
    }

    @Override
    public String getPrefix(){
        return Project.name + "_class_" + target.identifier +  "_init_";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Constructor c){
            if(c.parentClass.equals(this.parentClass)){
                if(c.params.size() == this.params.size()){
                    for (int i = 0; i < c.params.size(); i++) {
                        if(!c.params.get(i).equals(this.params.get(i))){
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

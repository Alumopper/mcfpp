package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.FunctionDuplicationException;

/**
 * 一个构造函数
 */
public class Constructor extends Function {

    /**
     * 此构造函数对应的类。
     */
    Class target;

    public Constructor(Class cls) throws FunctionDuplicationException {
        super("_init_" + cls.identifier.toLowerCase() + "_" + cls.constructors.size(), cls);
        //检查此类中是否已经重复定义一个相同的构造函数
        this.target = cls;
        if(cls.constructors.contains(this)){
            throw new FunctionDuplicationException();
        }else {
            cls.constructors.add(this);
        }
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

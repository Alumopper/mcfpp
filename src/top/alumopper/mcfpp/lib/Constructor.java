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
}

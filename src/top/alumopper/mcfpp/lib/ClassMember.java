package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.type.Var;

/**
 * 一个类的成员
 */
public interface ClassMember {

    enum AccessModifier{
        PRIVATE,
        PROTECTED,
        PUBLIC
    }

    /**
     * 是否是一个静态的成员
     */
    public boolean isStatic = false;

    /**
     *
     */
    public AccessModifier accessModifier = AccessModifier.PRIVATE;

    /**
     * 所在的类
     */
    public Class parent = null;
}

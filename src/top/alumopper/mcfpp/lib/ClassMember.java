package top.alumopper.mcfpp.lib;

/**
 * 一个类的成员
 */
public interface ClassMember {

    enum AccessModifier{
        PRIVATE,
        PROTECTED,
        PUBLIC
    }

    void setAccessModifier(AccessModifier accessModifier);

    AccessModifier getAccessModifier();

    void setIsStatic(boolean isStatic);

    boolean getIsStatic();
}

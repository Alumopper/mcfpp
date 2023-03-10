package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lib.CacheContainer;
import top.alumopper.mcfpp.lib.Class;
import top.alumopper.mcfpp.lib.Function;

/**
 * 一个类的实例的指针.它指向了一个类的对象
 */
public class ClassPointer extends Var{

    /**
     * 指针的类型
     */
    Class cls;

    /**
     * 指针的类的标识符
     */
    String type;

    private ClassObject obj;

    public ClassPointer(Class type, CacheContainer container, String text) {
        this.cls = type;
        this.type = cls.identifier;
        this.key = identifier;
        this.identifier = container.getPrefix() + identifier;
    }

    /**
     * 将b中的值赋值给此变量。一个指针只能指向它的类型的类或者其子类的实例
     * @param b 变量的对象
     * @throws VariableConverseException 如果隐式转换失败
     */
    @Override
    public void assign(Var b) throws VariableConverseException {
        if(b instanceof ClassObject target){
            if(!target.cls.canCastTo(this.cls)){
                throw new VariableConverseException();
            }
            if(this.obj == null){
                this.obj = target;
                Function.addCommand("execute as @e[tag=" + obj.cls.namespace + "_class_" + obj.cls + "_pointer");
            }else {
                this.obj = target;
            }
        }
    }

    @Override
    public Var cast(String type) {
        return null;
    }

    @Override
    public Object clone() {
        return null;
    }
}

package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lib.CacheContainer;
import top.alumopper.mcfpp.lib.Class;
import top.alumopper.mcfpp.lib.Function;

import java.util.List;

/**
 * 一个类的实例的指针.它指向了一个类的对象
 */
public class ClassPointer extends Var implements CanSelectMember{

    /**
     * 指针的类型
     */
    Class cls;

    /**
     * 指针的类的标识符
     */
    String type;

    private ClassObject obj;

    /**
     * 指针的地址
     */
    public Int address;

    /**
     * 创建一个指针
     * @param type 指针的类型
     * @param container 容器，生成前缀用
     * @param identifier 标识符
     */
    public ClassPointer(Class type, CacheContainer container, String identifier) {
        this.cls = type;
        this.type = cls.identifier;
        this.key = identifier;
        this.identifier = container.getPrefix() + identifier;
        this.address = (Int) new Int( Function.currFunction.namespace + "_class_" + type.identifier + "_pointer_" + identifier).setObj(type.addressSbObject);
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
            if(this.obj != null){
                //原实体中的实例减少一个指针
                Function.addCommand("execute " +
                        "as @e[tag=" + obj.cls.namespace + "_class_" + obj.cls.identifier + "_pointer] " +
                        "if score @s " + obj.address.object.name + " = " + address.identifier + " " + address.object.name + " " +
                        "run data remove entity @s data.pointers[0]");
            }
            this.obj = target;
            //地址储存
            this.address.assign(target.address);
            //实例中的指针列表
            Function.addCommand("execute " +
                    "as @e[tag=" + obj.cls.namespace + "_class_" + obj.cls.identifier + "_pointer] " +
                    "if score @s " + target.address.object.name + " = " + address.identifier + " " + address.object.name + " " +
                    "run data modify entity @s data.pointers append value 0");
        }
        if(b instanceof ClassPointer pointer){
            if(!pointer.cls.canCastTo(this.cls)){
                throw new VariableConverseException();
            }
            if(this.obj != null){
                //原实体中的实例减少一个指针
                Function.addCommand("execute " +
                        "as @e[tag=" + obj.cls.namespace + "_class_" + obj.cls.identifier + "_pointer] " +
                        "if score @s " + obj.address.object.name + " = " + address.identifier + " " + address.object.name + " " +
                        "run data remove entity @s data.pointers[0]");
            }
            this.obj = pointer.obj;
            //地址储存
            this.address.assign(pointer.address);
            //实例中的指针列表
            Function.addCommand("execute " +
                    "as @e[tag=" + obj.cls.namespace + "_class_" + obj.cls.identifier + "_pointer] " +
                    "if score @s " + pointer.address.object.name + " = " + address.identifier + " " + address.object.name + " " +
                    "run data modify entity @s data.pointers append value 0");
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

    @Override
    public Var getVarMember(String key) {
        return null;
    }

    @Override
    public Function getFunctionMember(String key, List<String> params) {
        return null;
    }
}

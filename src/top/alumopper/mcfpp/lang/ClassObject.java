package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lib.Cache;
import top.alumopper.mcfpp.lib.CacheContainer;
import top.alumopper.mcfpp.lib.Class;
import top.alumopper.mcfpp.lib.Function;

import java.util.List;

/**
 * 一个类的实例
 */
public class ClassObject extends Var implements CanSelectMember {
    /**
     * 它的类型
     */
    public Class cls;

    /**
     * 类的字符串标识符
     */
    public String type;

    /**
     * 在模拟堆中的地址
     */
    public Int address;

    /**
     * 类中的成员
     */
    public Cache cache;

    public ClassObject(Class cls){
        super();
        this.cls = cls;
        this.type = cls.identifier;
    }

    public ClassObject(Class cls, CacheContainer container, String identifier){
        this.cls = cls;
        this.type = cls.identifier;
        this.key = identifier;
        this.identifier = container.getPrefix() + identifier;
    }

    /**
     * 获取这个类的实例的指针实体在mcfunction中拥有的tag
     * @return 返回它的tag
     */
    public String getTag(){
        return cls.namespace + "_class_" + cls.identifier + "_pointer";
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public void assign(Var b) throws VariableConverseException {

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

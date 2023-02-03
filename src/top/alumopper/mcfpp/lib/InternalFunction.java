package top.alumopper.mcfpp.lib;

import java.util.HashMap;
import java.util.UUID;

/**
 * 一个匿名的内部函数。继承父函数变量栈中的所有变量
 */
public class InternalFunction extends Function{
    public InternalFunction(String prefix,Function parent) {
        super(prefix + UUID.randomUUID().toString());
        setParentFunction(parent);
        this.isClassMember = false;
    }

    public InternalFunction(String prefix, String tag, Function parent) {
        super( prefix + UUID.randomUUID().toString(), tag);
        setParentFunction(parent);
        this.isClassMember = false;
    }

    public void setParentFunction(Function parent){
        this.parent.add(parent);
        parent.child.add(this);
        this.cache.vars = new HashMap<>(parent.cache.vars);
    }
}

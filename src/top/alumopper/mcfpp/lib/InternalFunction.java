package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.type.Var;

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
        this(prefix,parent);
    }

    public void setParentFunction(Function parent){
        this.parent.add(parent);
        parent.child.add(this);
    }

    @Override
    public Var getVar(String id){
        if(cache.vars.containsKey(id)){
            Var re = cache.vars.get(id);
            re.stackIndex = 0;
            return re;
        }
        Var re = parent.get(0).getVar(id);
        re.stackIndex ++;
        return re;
    }
}

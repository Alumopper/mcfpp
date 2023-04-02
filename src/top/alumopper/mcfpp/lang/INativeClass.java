package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.lib.Native;

/**
 * 一个native类需要实现这个接口，从而被mcfpp正确地实例化以及和mcfpp进行交互
 */
public abstract class INativeClass implements Native {

    public INativeClass(Var[] vars, ClassPointer cls) {}

    /**
     * 生成一个实例
     *
     * @param args mcfpp中构造实例用到的参数
     * @return 返回一个实例
     */
    static INativeClass getInstance(Object args) {
        return null;
    }
}

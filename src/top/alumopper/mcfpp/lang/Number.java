package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.type.SbObject;

/**
 * 代表了mcfpp中的一个数字类型。数字类型都是以记分板为基础的。
 * 泛型T代表了这个数字类型中包装的类型
 */
public abstract class Number<T> extends Var implements OnScoreboard {

    public T value;

    public SbObject object;

    /**
     * 创建一个匿名数字类型变量
     */
    public Number(){
        super();
        object = SbObject.MCS_default;
    }

    /**
     * 创建一个数字类型变量
     * @param i 标识符
     */
    public Number(String i){
        identifier = i;
        object = SbObject.MCS_default;
    }

    @Override
    public Number<T> setObj(SbObject sbObject){
        this.object = sbObject;
        return this;
    }

    /**
     * 赋值
     * @param a 值来源
     */
    public abstract void assignCommand(Number<T> a);

    /**
     * 加法
     * @param a 加数
     * @return 计算的结果
     */
    public abstract Number<T> addCommand(Number<T> a);

    /**
     * 减法
     * @param a 减数
     * @return 计算的结果
     */
    public abstract Number<T> minusCommand(Number<T> a);

    /**
     * 乘法
     * @param a 乘数
     * @return 计算的结果
     */
    public abstract Number<T> multipleCommand(Number<T> a);

    /**
     * 除法
     * @param a 除数
     * @return 计算的结果
     */
    public abstract Number<T> divideCommand(Number<T> a);

    /**
     * 取余
     * @param a 除数
     * @return 计算的结果
     */
    public abstract Number<T> modularCommand(Number<T> a);

    /**
     * 这个数是否大于a
     * @param a 右侧值
     * @return 计算结果
     */
    public abstract Bool greaterCommand(Number<T> a);

    /**
     * 这个数是否小于a
     * @param a 右侧值
     * @return 计算结果
     */
    public abstract Bool lessCommand(Number<T> a);

    /**
     * 这个数是否小于等于a
     * @param a 右侧值
     * @return 计算结果
     */
    public abstract Bool lessOrEqualCommand(Number<T> a);

    /**
     * 这个数是否大于等于a
     * @param a 右侧值
     * @return 计算结果
     */
    public abstract Bool greaterOrEqualCommand(Number<T> a);

    /**
     * 这个数是否等于a
     * @param a 右侧值
     * @return 计算结果
     */
    public abstract Bool equalCommand(Number<T> a);

    /**
     * 这个数是否不等于a
     * @param a 右侧值
     * @return 计算结果
     */
    public abstract Bool notEqualCommand(Number<T> a);
}

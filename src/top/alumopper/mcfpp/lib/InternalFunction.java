package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.lang.Var;

import java.util.UUID;

/**
 * 一个匿名的内部函数。
 * <p>
 *     由于minecraft没有直接允许单tick中的循环或者if-else，我们采用的是命令函数的方式
 *     模拟的循环语句或者条件语句中的代码块。而代码块对应的函数名字通常是随机的。
 * </p>
 * <p>
 *     匿名内部函数和普通的命令函数有一个细小的区别。为了方便起见，我们还是先看一小段代码
 * {@snippet :
 *      int i = 0;
 *      if(qwq){
 *         i ++;
 *      }
 * }
 *      如果我们仍然简单采用直接调用函数的方式，将if后面的{@code i++}单独放在一个函数中，
 *      我们便会发现编译器抛出了一个异常，表示这个匿名函数中没有定义变量i。但是显然，无论是
 *      在if语句还是其他的循环语句中，我们都可以直接调用函数之前已经声明好的变量。
 * </p>
 * <p>
 *     因此，这里就是匿名内部函数和普通的函数的主要差异点了。匿名函数类是允许访问它的父函数，
 *     即声明if、while语句的函数的栈的。
 * </p>
 */
public class InternalFunction extends Function{
    /**
     * 创建一个匿名内部函数，并指定这个函数的调用者。
     * 匿名内部函数的名字为_调用语句的类型_uuid，例如if对应的匿名函数名
     * 为_if_uuid
     * @param prefix 匿名内部函数的前缀。
     * @param parent 这个函数的调用者，即父函数
     */
    public InternalFunction(String prefix,Function parent) {
        super(prefix + UUID.randomUUID().toString());
        setParentFunction(parent);
        this.isClassMember = false;
    }

    /**
     * 设置它的父函数
     * @param parent 父函数对象
     */
    public void setParentFunction(Function parent){
        this.parent.add(parent);
        parent.child.add(this);
    }

    /**
     * 根据标识符从这个函数的变量声明缓存中取出一个变量对象。首先从它自己的
     * 栈中查找，如果没用再从父函数的栈中查找。
     * @param id 变量的标识符
     * @return 标识符对应的变量对象
     */
    @Override
    public Var getVar(String id){
        if(cache.vars.containsKey(id)){
            Var re = cache.vars.get(id);
            re.stackIndex = 0;
            return re;
        }
        Var re = parent.get(0).getVar(id);
        if(re != null){
            re.stackIndex ++;
        }
        return re;
    }
}

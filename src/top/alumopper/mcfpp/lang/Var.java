package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.lib.ClassMember;

import java.util.UUID;

/**
 * mcfpp所有类型的基类。在mcfpp中，一个变量可以是固定的，也就是mcfpp编译
 * 能知道确切值的变量。例如{@code int i = 0;}中，编译器可以明确i的值就是
 * 0。另外，还可能有编译器并不知道确切值的变量。例如{@code int i = e.pos[0]}，
 * 获取了一个实体的x坐标。编译器并不能知道这个实体的坐标会是什么。
 * <p>
 *     对于固定的值，编译器会尽可能计算出他们的值。例如{@code int i = 6 + 7 + p}，
 *     编译器会提前计算为{@code int i = 13 + p}，从而减少命令的使用量。
 * </p>
 * <p>
 *     除此之外，变量还有临时变量的区别，对于匿名的变量，编译器一般会默认它为临时
 *     的变量，从而在各种处理上进行优化。当然，匿名变量的声明往往在编译过程中声明。
 *     mcfpp本身的语法并不支持匿名变量。
 * </p>
 */
public class Var implements ClassMember {
    /**
     * 标识符
     */
    public String identifier;

    /**
     * 是否是已知的（固定的）
     */
    public boolean isConcrete = false;

    /**
     * 是否是临时变量
     */
    public boolean isTemp = false;

    /**
     * 变量在栈里面的位置
     */
    public int stackIndex;

    /**
     *
     */
    public boolean isStatic = false;

    /**
     * 访问修饰符
     */
    public AccessModifier accessModifier = AccessModifier.PRIVATE;

    public Var(){
        identifier = UUID.randomUUID().toString();
    }

    public String getType(){
        return "var";
    }
}

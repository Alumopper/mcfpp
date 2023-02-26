package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.exception.TODOException;
import top.alumopper.mcfpp.exception.VariableConverseException;
import top.alumopper.mcfpp.lib.CacheContainer;
import top.alumopper.mcfpp.lib.ClassMember;
import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.lib.mcfppParser;

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
     * 在缓存中的名字
     */
    public String key = null;

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

    /**
     * 获取变量的类型
     * @return 变量类型的字符串
     */
    public String getType(){
        return "var";
    }

    /**
     * 将b中的值赋值给此变量
     * @param b 变量的对象
     */
    public void assign(Var b) throws VariableConverseException {}

    @Override
    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    @Override
    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    @Override
    public void setIsStatic(boolean isStatic) {
        this.isStatic = isStatic;
    }

    @Override
    public boolean getIsStatic() {
        return isStatic;
    }

    public static Var varBuild(mcfppParser.FieldDeclarationContext ctx, CacheContainer container){
        Var var = null;
        if(ctx.type().className() == null){
            //普通类型
            switch (ctx.type().getText()){
                case "int" -> var = new Int(ctx.Identifier().getText(), container);
                case "bool" -> var = new Bool(ctx.Identifier().getText(),container);
            }
        }else if(ctx.type().className().InsideClass() != null){
            switch (ctx.type().className().InsideClass().getText()){
                case "selector" -> var = new Selector(ctx.Identifier().getText());
                case "entity" -> var = null;
                case "string" -> var = null;
            }
        }else {
            //TODO
            throw new TODOException("");
        }
        return var;
    }
}

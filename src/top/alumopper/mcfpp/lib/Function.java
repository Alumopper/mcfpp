package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Cache;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.io.McfppFileReader;
import top.alumopper.mcfpp.type.Bool;
import top.alumopper.mcfpp.type.Int;
import top.alumopper.mcfpp.type.Var;

import java.util.ArrayList;

/**
 * 一个minecraft中的命令函数。
 * <p>
 *     在mcfpp中，一个命令函数可能是单独存在的，也有可能是一个类的成员。
 * </p>
 * <p>
 *     在一般的数据包中，命令函数的调用通常只会是一个简单的{@code function xxx:xxx}
 *     这样的形式。这条命令本身的意义便确实是调用一个函数。然而我们需要注意的是，在mc中，
 *     一个命令函数并没有通常意义上的栈，换句话说，所有的变量都是全局变量，这显然是不符合
 *     一般的高级语言的规范的。在mcfpp中，我们通过{@code storage}的方法来模拟一个函数
 *     的栈。
 * </p>
 * <p>
 *     mcfpp栈的模拟参考了<a href="https://www.mcbbs.net/thread-1393132-1-1.html">https://www.mcbbs.net/thread-1393132-1-1.html</a>
 *     的方法。在下面的描述中，也是摘抄于此文。
 * </p>
 * <p>
 *     c语言底层是如何实现“局部变量”的？我们以 c 语言为例，看看函数底层的堆栈实现过程是什么样的？请看下面这段代码：
 * {@snippet :
 *      int test() {
 *              int a = 1;// 位置1
 *              funA(a);
 *              // 位置5
 *      }
 *      int funA(int a) {// 位置2
 *              a = a + 1;
 *              funB(a);
 *              // 位置4
 *      }
 *      int funB(int a) {// 位置3
 *              a = a + 1;
 *      }
 * }
 * 位置①：现在父函数还没调用 funA，堆栈情况是：<br>
 *                 low address [ [父函数栈帧] ... ] high address<br>
 *                 （执行 funA(?) ）<br>
 * 位置②：当父函数调用 funA 时，会从栈顶开一块新的空间来保存 funA 的栈帧，堆栈情况是：<br>
 *                 low address [ [funA栈帧] [父函数栈帧] ... ] high address<br>
 *                 （执行 a = a + 1）<br>
 *                 （执行 funB(a) ）<br>
 * 位置③：当 funA 调用 funB 时，会从栈顶开一块新的空间来保存 funB 的栈帧，堆栈情况是：<br>
 *                 low address [ [funB栈帧] [funA栈帧] [父函数栈帧] ... ] high address<br>
 *                 （执行 a = a + 2）<br>
 * 位置④：funB 调用结束，funB 的栈帧被销毁，程序回到 funA 继续执行，堆栈情况是：<br>
 *                 low address [ [funA栈帧] [父函数栈帧] ... ] high address<br>
 * 位置⑤：funA 调用结束，funA 的栈帧被销毁，程序回到 父函数 继续执行，堆栈情况是：<br>
 *                 low address [ [父函数栈帧] ... ] high address<br>
 * 我们会发现，funA 和 funB 使用的变量都叫 a，但它们的位置是不同的，此处当前函数只会在属于自己的栈帧的内存空间上
 * 操作，不同函数之间的变量之所以不会互相干扰，也是因为它们在栈中使用的位置不同，此 a 非彼 a
 * </p>
 * <p>
 * mcf 如何模拟这样的堆栈？<br>
 * 方法：将 storage 视为栈，将记分板视为寄存器<br>
 * 与汇编语言不同的是，一旦我们这么想，我们就拥有无限的寄存器，且每个寄存器都可以是专用的，所以在下面的叙述中，
 * 如果说“变量”，指的是寄存器，也就是记分板里的值；只有说“变量内存空间”，才是指 storage 中的值；变量内存空间类似函数栈帧<br>
 * 我们可以使用 storage 的一个列表，它专门用来存放函数的变量内存空间<br>
 * 列表的大致模样： stack_frame [{funB变量内存空间}, {funA变量内存空间}, {父函数变量内存空间}]<br>
 * 每次我们要调用一个函数，只需要在 stack_frame 列表中前插一个 {}，然后压入参数<br>
 * </p>
 * <p>
 *     思路有了，接下来就是命令了。虽然前面的思路看起来非常复杂，但是实际上转化为命令的时候就非常简单了。
 *     <pre>
 *     {@code
 *      #父函数为子函数创建变量内存空间
 *      data modify storage mny:program stack_frame prepend value {}
 *      #父函数处理子函数的参数，压栈
 *      execute store result storage mny:program stack_frame[0].xxx run ...
 *      #给子函数打电话（划去）调用子函数
 *      function xxx:xxx
 *      #父函数销毁子函数变量内存空间
 *      data remove storage mny:program stack_frame[0]
 *      #父函数恢复记分板值
 *      xxx（命令略去）
 *     }
 *     </pre>
 * </p>
 * <p>
 *     你可以在{@link McfppImListener}中的{@code exitFunctionCall}方法中看到mcfpp是如何实现的。
 * </p>
 * @see InternalFunction
 */
public class Function implements ClassMember,CacheContainer {

    /**
     * 包含的所有命令
     */
    public ArrayList<String> commands;

    /**
     * 函数的名字
     */
    public String name;

    /**
     * 函数的标签
     */
    public String tag;

    /**
     * 函数的路径
     */
    public String path;

    /**
     *  参数列表
     */
    public ArrayList<FunctionParam> params;

    /**
     *  是否是类的成员函数
     */
    public boolean isClassMember;

    /**
     * 函数编译时的缓存
     */
    public Cache cache = new Cache();

    /**
     * 这个函数调用的函数
     */
    public ArrayList<Function> child = new ArrayList<>();

    /**
     * 调用这个函数的函数
     */
    public ArrayList<Function> parent = new ArrayList<>();

    /**
     * 函数是否已经实际中止。用于break和continue语句。
     */
    public boolean isEnd = false;

    /**
     * 是不是break。用于break和continue语句。
     */
    public static boolean isBreak = false;

    /**
     * 当一个函数被break或continue截断的时候，使用此标记，表示此函数执行完毕后的函数应当重新建立一个匿名内部函数，
     * 从而实现break和continue的逻辑控制。
     * 即同时满足isEnd == false和isLastFunctionEnd = 2的时候进入新的匿名break/continue内部函数
     * 0    未截断
     * 1    被截断，需要进入匿名函数
     * 2    被截断，但是已经在匿名函数里面了
     */
    public static int isLastFunctionEnd = 0;

    /**
     * 目前编译器处在的函数。允许编译器在全局获取并访问当前正在编译的函数对象。默认为全局初始化函数
     */
    public static Function currFunction;

    /**
     * 一个空的函数，通常用于作为占位符
     */
    public static Function nullFunction = new Function("null");

    /**
     * 创建一个函数
     * @param name 函数的标识符
     */
    public Function(String name){
        this.path = McfppFileReader.currPath;
        this.name = name;
        this.commands = new ArrayList<>();
        this.params = new ArrayList<>();
    }

    /**
     * 创建一个函数，它有指定的标签
     * @param name 函数的标识符
     * @param tag 函数的标签
     */
    public Function(String name, String tag){
        this(name);
        this.tag = tag;
    }

    /**
     * 获取这个函数的id，它包含了这个函数的路径和函数的标识符。每一个函数的id都是唯一的
     * @return 函数id
     */
    public String GetID(){
        return path + "/" + name;
    }

    /**
     * 获取这个函数的命名空间id，即xxx:xxx形式。可以用于命令
     * @return 函数的命名空间id
     */
    public String getNamespaceID(){
        return Project.root.getName() + ":" + (path.equals("") ? "" : path + "/") + name;
    }

    /**
     * 向此函数的末尾添加一条命令。
     * @param str 要添加的命令。
     */
    public static void addCommand(String str){
        if(!currFunction.isEnd){
            currFunction.commands.add(str);
        }
    }

    /**
     * 从这个函数的变量声明缓存中获取一个变量。
     * @param id 这个变量的标识符
     * @return 如果这个变量存在缓存中，则返回这个变量，否则返回null
     */
    public Var getVar(String id){
        Var re = cache.vars.getOrDefault(id, null);
        if(re != null){
            re.stackIndex = 0;
        }
        return re;
    }

    public void addParams(mcfppParser.ParameterListContext ctx){
        //函数参数解析
        for (mcfppParser.ParameterContext param : ctx.parameter()) {
            FunctionParam param1 = new FunctionParam(
                    param.type().getText(),
                    param.Identifier().getText(),
                    param.STATIC() == null);
            params.add(param1);
            if(param1.type.equals("int")){
                cache.vars.put(param1.identifier,new Int(getNamespaceID()+ "_param_" + param1.identifier,this));
            }
            if(param1.type.equals("bool")){
                cache.vars.put(param1.identifier,new Bool(getNamespaceID()+ "_param_" + param1.identifier,this));
            }
        }
    }

    @Override
    public String getPrefix(){
        return Project.name + "_func_" + getNamespaceID() + "_";
    }
}

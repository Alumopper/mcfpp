package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.lang.ClassObject;
import top.alumopper.mcfpp.lang.Int;
import top.alumopper.mcfpp.lang.Var;
import top.alumopper.mcfpp.type.SbObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 一个类。
 * 类的理论部分参见：<a href="https://alumopper.top/%e5%9c%a8mcfunction%e4%b8%ad%e5%ae%9e%e7%8e%b0%e9%9d%a2%e5%90%91%e5%af%b9%e8%b1%a1/">在mcfunction中实现面向对象</a>和<a href="https://alumopper.top/mcfpp%e9%9d%a2%e5%90%91%e5%af%b9%e8%b1%a1-%e7%b1%bb%e7%9a%84%e5%88%9b%e5%bb%ba%e5%92%8c%e9%94%80%e6%af%81/">mcfpp面向对象——类的创建和销毁</a>
 */
public class Class implements CacheContainer {
    /**
     * 这个类的标识符
     */
    public String identifier;

    /**
     * 类的命名空间
     */
    public String namespace;

    /**
     * 这个类的父类
     */
    public Class parent;

    /**
     * 成员变量和成员函数
     */
    public Cache cache;

    /**
     * 记录这个类所有实例地址的记分板
     */
    public SbObject addressSbObject;

    /**
     * 成员变量对应的初始化计算表达式
     */
    public HashMap<Var, mcfppParser.ExpressionContext> varInitExpression;

    /**
     * 静态变量和静态函数
     */
    public Cache staticCache;

    /**
     * 静态变量对应的初始化计算表达式
     */
    public HashMap<Var, mcfppParser.ExpressionContext> staticVarInitExpression;

    /**
     * 构造函数
     */
    public ArrayList<Constructor> constructors = new ArrayList<>();

    /**
     * 是否是静态类。静态类将不会被垃圾处理器处理
     */
    public boolean isStaticClass;

    /**
     * 类的字段初始化函数
     */
    public Function classPreInit;

    /**
     * 类的静态字段的初始化函数
     */
    public Function classPreStaticInit;

    /**
     * 当前编译的类
     */
    public static Class currClass = null;

    public Class(String identifier){
        this(identifier, Project.currNamespace);
    }

    public Class(String identifier, String namespace){
        this.identifier = identifier;
        classPreInit = new Function("_class_preinit_" + identifier, this, false);
        staticCache = new Cache(Project.global.cache,this);
        cache = new Cache(staticCache,this);
        this.namespace = namespace;
        this.addressSbObject = new SbObject(namespace + "_class_" + identifier + "_index");
        //init函数的初始化置入，即地址分配，原preinit函数合并于此
        classPreInit.commands.add("scoreboard players operation @s " + addressSbObject.name + "= $index " + addressSbObject.name);
        classPreInit.commands.add("scoreboard players add $index " + addressSbObject.name + " 1");
    }

    /**
     * 类的初始化加载，进行静态成员变量的初始化
     */
    public void load(){

    }

    /**
     * 类创建时，对类成员的初始化计算
     */
    public void init(){

    }

    /**
     * 清除这个类占据的资源
     */
    public void depose(){

    }

    @Override
    public String getPrefix(){
        return Project.name + "_class_" + identifier + "_";
    }

    /**
     * 根据参数列表获取一个类的构造函数
     * @param params 构造函数的参数列表
     * @return 返回这个类的参数
     */
    public Constructor getConstructor(ArrayList<String> params){
        for (Constructor f : constructors) {
            if(f.params.size() == params.size()){
                if(f.params.size() == 0){
                    return f;
                }
                //参数比对
                for (int i = 0; i < params.size(); i++) {
                    if(params.get(i).equals(f.params.get(i).type)){
                        return f;
                    }
                }
            }
        }
        return null;
    }

    /**
     * 返回此类中的一个成员字段。优先获取成员变量中的字段
     * @param key 字段名
     * @return 如果字段存在，则返回此字段，否则返回null
     */
    public Var getMemberVar(String key){
        Var re = cache.getVar(key);
        if(re == null){
            return staticCache.getVar(key);
        }
        return re;
    }

    /**
     * 向这个类中添加一个成员
     * @param classMember 要添加的成员
     */
    public void addMember(ClassMember classMember){
        if(classMember instanceof Function f){
            Class.currClass.staticCache.functions.add(f);
        }else if(classMember instanceof Var v) {
            Class.currClass.staticCache.putVar(v.key,v);
        }
    }

    /**
     * 创建这个类的一个实例
     * @return 创建的实例
     */
    public ClassObject newInstance(){
        //创建实例
        ClassObject obj = new ClassObject(this,this,"temp");
        //给这个类添加成员
        obj.cache = new Cache(cache);
        obj.address = (Int) new Int("@s").setObj(addressSbObject);
        return obj;
    }

    /**
     * 这个类是否可以被强制转换为目标类型
     * @param target 目标类型
     * @return 如果可以,返回true,反之返回false
     */
    public boolean canCastTo(Class target){
        if(this.identifier.equals(target.identifier)){
            return true;
        }
        if(this.parent != null){
            return this.parent.canCastTo(target);
        }
        return false;
    }
}

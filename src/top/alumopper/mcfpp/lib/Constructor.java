package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.command.Commands;
import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.exception.FunctionDuplicationException;
import top.alumopper.mcfpp.lang.ClassObject;
import top.alumopper.mcfpp.lang.Int;
import top.alumopper.mcfpp.lang.Var;

import java.util.ArrayList;

/**
 * 一个构造函数
 */
public class Constructor extends Function {

    /**
     * 此构造函数对应的类。
     */
    Class target;

    public Constructor(Class cls) throws FunctionDuplicationException {
        super("_init_" + cls.identifier.toLowerCase() + "_" + cls.constructors.size(), cls, false);
        //检查此类中是否已经重复定义一个相同的构造函数
        this.target = cls;
    }

    /**
     * 调用构造函数
     * @param args 函数的参数
     * @param lineNo 调用此函数的上下文的行数，用于错误日志
     * @param obj 调用函数的实例
     */
    @Override
    public void invoke(ArrayList<Var> args, int lineNo, ClassObject obj){
        //对象创建
        Function.addCommand("execute in minecraft:overworld " +
                "run summon marker 0 0 0 {Tags:[" + obj.getTag() + "]}"
        );
        //给函数开栈
        Function.addCommand("data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
        //参数传递
        for (int i = 0; i < params.size(); i++) {
            switch (params.get(i).type){
                case "int" ->{
                    Int tg = (Int) args.get(i).cast(params.get(i).type);
                    if(tg == null){
                        Project.logger.error("Can't convert int to " + params.get(i).type + ":" + args.get(i).identifier +
                                " at " + Project.currFile.getName() + " line: " + lineNo);
                        Project.errorCount ++;
                        throw new ArgumentNotMatchException("");
                    }
                    //参数传递和子函数的参数压栈
                    Function.addCommand("execute store result storage mcfpp:system " + Project.name + ".stack_frame[0]." + params.get(i).identifier + " run "
                            + Commands.SbPlayerOperation(new Int("_param_" + params.get(i).identifier, this),"=",tg)
                    );
                }
            }
        }
        //函数调用的命令
        //不应当立即调用它自己的函数，应当先调用init，再调用constructor
        Function.addCommand("execute as @e[tag=" + obj.getTag() + ",limit=1] at @s run " +
                Commands.Function(this.parentClass.classPreInit));
        Function.addCommand("execute as @e[tag=" + obj.getTag() + ",limit=1] at @s run " +
                Commands.Function(this));
        //调用完毕，将子函数的栈销毁
        Function.addCommand("data remove storage mcfpp:system " + Project.name + ".stack_frame[0]");
        //取出栈内的值到记分板
        for (Var var : Function.currFunction.cache.getAllVars()) {
            if(var instanceof Int int1){
                //如果是int取出到记分板
                Function.addCommand("execute store result score " + int1.identifier + " " + int1.object + " run "
                        + "data get storage mcfpp:system " + Project.name + ".stack_frame[0]." + var.key
                );
            }
        }
    }

    @Override
    public String getPrefix(){
        return namespace + "_class_" + target.identifier +  "_init_";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Constructor c){
            if(c.parentClass.equals(this.parentClass)){
                if(c.params.size() == this.params.size()){
                    for (int i = 0; i < c.params.size(); i++) {
                        if(!c.params.get(i).equals(this.params.get(i))){
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

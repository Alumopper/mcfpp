package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.lang.Int;
import top.alumopper.mcfpp.type.*;

import java.util.*;


/**
 * 命令总类，提供了大量用于生成命令的方法，避免频繁的新建类（调用命令类的各种极度抽象的构造方法（x
 * 尽量不要打开或编辑这个文件，不然会感受痛苦。
 * 尽量少地使用这个文件中的内容
 */
@Deprecated
public class Commands {
    public static String Function(top.alumopper.mcfpp.lib.Function function)
    {

        return "function " + function.getNamespaceID().toLowerCase();
    }

    public static String SbPlayerAdd(Int target, int value) {

        return "scoreboard players add " + target.identifier + " " + target.object + " " + value;
    }

    public static String SbPlayerOperation(Int a, String operation, Int b) {
        return "scoreboard players operation " + a.identifier + " " + a.object + " " + operation + " " + b.identifier + " " + b.object;
    }

    public static String SbPlayerRemove(Int target, int value) {

        return "scoreboard players remove " + target.identifier + " " + target.object + " " + value;
    }

    public static String SbPlayerSet(Int a, int value) {
        return "scoreboard players set " + a.identifier + " " + a.object + " " + value;
    }
}
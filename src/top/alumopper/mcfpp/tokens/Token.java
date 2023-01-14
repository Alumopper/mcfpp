package top.alumopper.mcfpp.tokens;

import top.alumopper.mcfpp.reader.McfppReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 一个语句。
 * mcfpp中的语句有很多种。主要的分类有声明语句，赋值语句，命令，空语句和复合语句。<br>
 * 声明语句即声明变量的语句，例如int i;<br>
 * 赋值语句就是给变量赋值的语句，例如i = 2<br>
 * 命令则是一个纯命令，原版的原生命令，例如/say hi<br>
 * 空语句什么都没有，即;<br>
 * 复合语句是一个大括号构成的，即{...}<br>
 */
public class Token{
    public enum Type{
        DECLEAR,    //声明语句
        ASSIG,      //赋值语句
        COMMAND,     //命令
        NULL,        //空语句
        FUNCTION,    //函数
        CLASS,      //类
        IF,         //if语句
        ELSE_IF,    //else if
        ELSE        //else
    }

    public static ArrayList<String> varTypes = new ArrayList<>();

    public static ArrayList<String> sysTypes = new ArrayList<>();

    static{
        varTypes.add("int");
        varTypes.add("decimal");
        varTypes.add("boolean");

        sysTypes.add("func");
    }

    /**
     * 原始文本内容
     */
    protected String code;

    /**
     * 初步切割的语句内容，不包括分号
     */
    public ArrayList<String> tokenStrings;

    /**
     * 语句种类
     */
    public Type type;

    /**
     *  语句所属的文件名
     */
    public String file;

    /**
     * 这个语句所在的文件的行数
     */
    public int line;

    /**
     * 从一个字符串中解析一个语句
     * @param code 需要解析的字符串
     */
    public Token(String code,int line, String file){
        this.code = code;
        this.line = line;
        this.file = file;
        this.type = getTokenType(code); //解析token
    }

    /**
     * 复制一个token
     * @param token
     */
    public Token(Token token){
        this.code = token.code;
        this.line = token.line;
        this.file = token.file;
        this.tokenStrings = new ArrayList<>(token.tokenStrings);
        this.type = token.type;
    }

    public Token(){}

    public String getCode(){return code;}
    public ArrayList<String> getTokenStrings(){return tokenStrings;}
    public Type getType() {return type;}

    public void setType(Type t){type = t;}

    public Type getTokenType(String l){
        //判断并返回语句类型
        if(l.equals("")) return Type.NULL;
        if(varTypes.contains(tokenStrings.get(0))){
            return Type.ASSIG;
        }else if(tokenStrings.get(0).equals("/")){
            return Type.COMMAND;
        }else if(tokenStrings.get(0).equals("func")){
            return Type.FUNCTION;
        }
        return Type.NULL;
    }
}
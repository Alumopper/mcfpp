package top.alumopper.mcfpp.tokens;

import top.alumopper.mcfpp.lib.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

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

    protected String code;            //原始文本内容

    /**
     * 语句内容，不包括分号
     */
    public ArrayList<String> tokenStrings;
    protected Type type;      //语句种类

    /**
     * 从一个字符串中解析一个语句
     * @param code 需要解析的字符串
     */
    public Token(String code){
        this.code = code;
        type = getTokenType(code); //解析token
    }

    public String getCode(){return code;}
    public ArrayList<String> getTokenStrings(){return tokenStrings;}
    public Type getType() {return type;}

    public void setType(Type t){type = t;}

    public Type getTokenType(String l){
        //判断并返回语句类型
        if(l.equals("")) return Type.NULL;
        ArrayList<String> ls = analysis(l);
        assert ls != null;
        if(varTypes.contains(ls.get(0))){
            tokenStrings = ls;
            return Type.ASSIG;
        }else if(ls.get(0).equals("/")){
            tokenStrings = ls;
            return Type.COMMAND;
        }else if(sysTypes.contains(ls.get(0))){
            tokenStrings = ls;
            return Type.FUNCTION;
        }
        return null;
    }

    public ArrayList<String> trans(){return null;}

    public static ArrayList<String> analysis(String l){
        //解析语句，拆分为字符串
        StringBuilder head = new StringBuilder();
        //获取第一个关键词
        for(char i : l.toCharArray()){
            if(i == ' '){
                break;
            }
            head.append(i);
        }
        //如果为声明语句
        if(varTypes.contains(head.toString())){
            //声明变量
            //int i = <表达式>;
            //int i=<表达式>;
            //int i;
            String sing = l.substring(head.length());//截取除了开头外的字符串
            String[] exps = sing.replace(" ","").split("=",2);    //去除空格，并分离常数和exps
            ArrayList<String> re = new ArrayList<>();
            re.add(head.toString());re.add(exps[0]);re.add(exps[1]);
            return re;
        }else if(l.startsWith("/")){
            //是原始命令语句
            ArrayList<String> re = new ArrayList<>();
            re.add("/");re.add(l.substring(1));
            return re;
        }else if(head.toString().equals("func")){
            //是函数
            /*
            func <函数名>(<参数>){
                <语句>
                }
             */
            ArrayList<String> re = new ArrayList<>();
            re.add("func");
            String[] a = l.substring(5).split("[(]",2);
            re.add(a[0]);
            String[] b = a[1].split("[{]",2);
            re.add(b[0].substring(0,b[0].length()-1));
            re.add(b[1].substring(0,b[1].length()-1));
            return re;
        }else if(head.toString().equals("namespace")){
            Function.currNamespace = l.split(" ",2)[1];
        }
        return null;
    }

    /**
     * 从一个流中读取语句
     * @param reader 用于读取语句的流
     * @return 返回一个语句。若到达流的末尾，则返回null
     */
    public static Token readToken(BufferedReader reader) throws IOException {
        String text = "";
        short isMulti = 0; //是否是复合语句
        while(true){
            int q = reader.read();   //读取一个字符
            if(q == -1){
                return null;
            }
            char c = (char) q;
            if(c == '/'){                   //判断是不是注释
                char c2 = (char)reader.read();
                if(c2 == '/'){
                    reader.readLine();
                    continue;
                }
            }
            if(c == '\n') continue;
            if(c == '{') isMulti++;
            if(c == '}') {
                isMulti--;
                if(isMulti == 0){
                    //复合语句读取完毕
                    text += c;
                    break;
                }
            }
            if(c == ';' && isMulti == 0) break;
            text += c;
        }
        return new Token(text);
    }
}
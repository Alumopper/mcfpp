package top.alumopper.mcfpp;

import java.util.ArrayList;

public class Token{
    public static enum Type{
        DECLEAR,    //声明语句
        ASSIG,      //赋值语句
        COMMAND,     //命令
        NULL,        //空语句
        MUTI,       //复合语句
    }
    public static ArrayList<String> varTypes = new ArrayList<String>();

    static{
        varTypes.add("int");
        varTypes.add("decimal");
        varTypes.add("bool");
    }

    protected String code;            //原始文本内容
    protected ArrayList<String> text;  //语句内容，不包括分号
    protected Type type;      //语句种类

    public Token(String code){
        this.code = code;
    }

    public String getCode(){return code;}
    public ArrayList<String> gettext(){return text;}
    public Type gettype() {return type;}

    public void settype(Type t){type = t;}

    public Type gettokentype(String l){
        //判断并返回语句类型
        if(l.equals("")) return Type.NULL;
        ArrayList<String> ls = analysis(l);
        if(varTypes.contains(ls.get(0))){
            text = ls;
            return Type.ASSIG;
        }
        return null;
    }

    public ArrayList<String> trans(){return null;}

    public static ArrayList<String> analysis(String l){
        //解析语句，拆分为字符串
        String head = "";
        //获取第一个关键词
        for(char i : l.toCharArray()){
            if(i == ' '){
                break;
            }
            head += i;
        }
        if(varTypes.contains(head)){
            //声明变量
            //int i = <表达式>;
            //int i=<表达式>;
            String sing = l.substring(head.length());//截取除了开头外的
            String[] exps = sing.split("=");
            ArrayList<String> re = new ArrayList<>();
            re.add(head);re.add(exps[0]);re.add(exps[1]);
            return re;
        }

        return null;
    }
}
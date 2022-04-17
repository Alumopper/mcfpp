package top.alumopper.mcfpp;

import java.util.ArrayList;

/**
 * 声明语句
 * 形如
 * int i = <表达式>;
 * 这样的语句
 * text的文本依次是，变量类型，变量名，表达式
 */
public class DeclearToken extends Token {

    public DeclearToken(String code){
        super(code);
        text = analysis(code);
        type = Type.DECLEAR;
        order();
    }

    public DeclearToken(Token token){
        super(token.getCode());
        text = analysis(code);
        type = Type.DECLEAR;
        order();
    }
    /*
    public ArrayList<String> trans(String projectname){
        //翻译
        //scoreboard players set i mcfpp_var_<projectname_funcname> 0
        //计算表达式
    }
    */

    public void order(){
        //整理表达式和变量名
        while(text.get(1).endsWith(" ")){
            text.set(1, 
                text.get(1).substring(0,text.get(1).length() - 2)
            );
        }
        while(text.get(2).endsWith(" ")){
            text.set(2, 
                text.get(2).substring(0,text.get(2).length() - 2)
            );
        }
        while(text.get(1).startsWith(" ")){
            text.set(1, 
                text.get(1).substring(1)
            );
        }
        while(text.get(2).startsWith(" ")){
            text.set(2, 
                text.get(2).substring(1)
            );
        }
    }
}

package top.alumopper.mcfpp;

import top.alumopper.mcfpp.tokens.Token;

/**
 * 声明语句
 * 形如
 * int i = <表达式>;
 * 这样的语句
 * text的文本依次是，变量类型，变量名，表达式
 */
public class DeclearToken extends Token {

    /*
    public ArrayList<String> trans(String projectname){
        //翻译
        //scoreboard players set i mcfpp_var_<projectname_funcname> 0
        //计算表达式
    }
    */

    public void order(){
        //整理表达式和变量名
        while(tokenStrings.get(1).endsWith(" ")){
            tokenStrings.set(1,
                tokenStrings.get(1).substring(0, tokenStrings.get(1).length() - 2)
            );
        }
        while(tokenStrings.get(2).endsWith(" ")){
            tokenStrings.set(2,
                tokenStrings.get(2).substring(0, tokenStrings.get(2).length() - 2)
            );
        }
        while(tokenStrings.get(1).startsWith(" ")){
            tokenStrings.set(1,
                tokenStrings.get(1).substring(1)
            );
        }
        while(tokenStrings.get(2).startsWith(" ")){
            tokenStrings.set(2,
                tokenStrings.get(2).substring(1)
            );
        }
    }
}

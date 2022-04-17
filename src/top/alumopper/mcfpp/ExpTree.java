package top.alumopper.mcfpp;

import java.util.ArrayList;

//表达式
public class ExpTree extends Tree {
    private final static ArrayList<Character> CALSIGN_1 = new ArrayList<>();
    private final static ArrayList<Character> CALSIGN_2 = new ArrayList<>();
    
    static{
        CALSIGN_1.add('+');
        CALSIGN_1.add('-');
        CALSIGN_2.add('*');
        CALSIGN_2.add('/');
    }

    private char caltype;    //两个子节点的运算方式

    public ExpTree(){
        childTrees = new ArrayList<Tree>();
        thisObject = new Object();
    }

    //7*(1+1*mc(5))
    // + - * /
    public void anlyse(String exp){
        //System.out.println(exp);
        String a = "";
        for(char i : exp.toCharArray()){
            if(i != ' ') a+=i;
        }
        //去除头尾括号
        if(a.startsWith("(")){
            int p = 0;  //括号匹配
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i) == '(') p++;
                if(a.charAt(i) == ')') p--;
                if(p == 0){
                    if(i == a.length()-1){
                        //括号首尾配对
                        a = a.substring(1,a.length()-1);
                    }else{
                        break;
                    }
                }
            }
        }
        //System.out.println("after:"+a);
        if(!isExp(a)){
            //若已经不是表达式，不需要解析
            childTrees = null;
            thisObject = a;
            return;
        }
        String temp = "";
        int p = 0;  //括号
        //一级运算符
        for(char i : a.toCharArray()){
            if(CALSIGN_1.contains(i) && childTrees.isEmpty() && p==0){
                childTrees.add(new ExpTree());
                ((ExpTree)childTrees.get(0)).anlyse(temp);
                caltype = i;
                temp = "";
                continue;
            }
            if(i=='(') p++;
            if(i==')') p--;
            temp += i;
        }
        if(childTrees.isEmpty()){
            //没有一级运算符
            temp = "";
            for(char i : a.toCharArray()){
                if(CALSIGN_2.contains(i)&&childTrees.isEmpty() && p==0){
                    childTrees.add(new ExpTree());
                    ((ExpTree)childTrees.get(0)).anlyse(temp);
                    caltype = i;
                    temp = "";
                    continue;
                }
                if(i=='(') p++;
                if(i==')') p--;
                temp += i;
            }
            childTrees.add(new ExpTree());
            ((ExpTree)childTrees.get(1)).anlyse(temp);
        }else{
            childTrees.add(new ExpTree());
            ((ExpTree)childTrees.get(1)).anlyse(temp);
        }
    }

    public static boolean isExp(String text){
        for(int i = 0;i < text.length(); i++){
            if(CALSIGN_1.contains(text.charAt(i))||CALSIGN_2.contains(text.charAt(i))){
                return true;
            }
            if(text.charAt(i)=='(' && !CALSIGN_1.contains(text.charAt(i)) && !CALSIGN_2.contains(text.charAt(i)) && i !=0){
                //为函数
                return false;
            }
        }
        return false;
    }
}

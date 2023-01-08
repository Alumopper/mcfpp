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

    /**
     * 这个函数通过读取表达式的树来从底部逐步生成一个计分板命令，能够计算所给的表达式
     * 例如对于表达式1+1而言，在树中被储存为1(+)1
     * 转换的时候读取两个变量，并判断其是否为变量。
     * 变量的命名规则是，首先从缓存中读取是否有此变量，若有，则根据此变量的类型进行命名：
     * <p>  变量:mcfpp_var_<工程名字>_<变量名>
     * <p>  常变量:mcfpp_constvar_<工程>_<变量名>
     * <p>  常量数字:mcfpp_constnum_C<值>
     * <p>若缓存中没有这样的变量，则默认为变量。若单独编译文件且文件中未告知工程附属信息，则默认为default工程
     * <p>例如对于表达式1+a
     * 两个变量的名字分别为mcfpp_constnum_C1和mcfpp_var_default_a
     * 然而由于mc计分板只能进行自加等运算，为了保证不影响原数据，需要另外使用一个计分板来临时储存结果等。这个计分板的命名格式为
     * mcfpp_tempvar_<arraylist中的元素个数。
     * 因此这个表达式就是这样的：<p>
     * 首先将第一个值赋给临时变量mcfpp_tempvar_0，即<p>
     * scoreboard players operation mcfpp_tempvar_0 mcfpp_tempvar = mcfpp_constnum_C1 mcfpp_constnum
     * <p>然后进行运算<p>
     * scoreboard players operation mcfpp_tempvar_0 mcfpp_tempvar += mcfpp_var_default_a mcfpp_var
     * <p>最后把"!mcfpp_tempvar_0"放在ArrayList的末尾，以此告诉上一层此处运算得到的结果是什么。
     * @param depth 
     * 树的深度
     * @param projname
     * 工程的名字，用于计分板变量命名
     * @return
     * 返回一个字符串列表，里面包含的是计算所需的计分板命令，第一个值中储存的是临时变量的名字。
     */
    public ArrayList<String> transToSboard(int depth,String projname){
        //生成计分板计算命令
        //计算结果储存在mcfpp_tempvar中
        //mcfpp_tempvar的计分板变量
        //scoreboard players operation i mcfpp_var/mcfpp_constnum <opt> k mcfpp_var/mcfpp_constnum
        if(childTrees.get(0).childTrees == null){
            //为根的父节点，进行运算
        }
        return null;
    }

    public boolean isNumber(String s){
        try{
            Double.parseDouble(s);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}

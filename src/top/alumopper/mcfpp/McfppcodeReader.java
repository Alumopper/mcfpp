package top.alumopper.mcfpp;

import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.lib.FunctionParam;
import top.alumopper.mcfpp.tokens.Token;

import java.io.*;

/**
 * 用于读取mcfpp代码
 */
public class McfppCodeReader {
    
    private BufferedReader reader;  //读取文件

    /**
     * 从指定路径读取mcfpp文件
     * @param path mcfpp文件的路径
     * @throws IOException
     */
    public McfppCodeReader(String path) throws IOException{
        reader = new BufferedReader(new FileReader(path));
    }

    /**
     * 从指定的Reader读取mcfpp文件
     * @param r 读取mcfpp文件的Reader
     */
    public McfppCodeReader(Reader r){
        reader = new BufferedReader(r);
    }

    /**
     * 从这个文件中解析类或者函数
     * @throws IOException
     */
    public void analyze() throws IOException{
        Token temp;
        while ((temp = Token.readToken(reader)) != null){
            //处理token
            if(temp.tokenStrings.get(0).equals("func")){
                //函数
                Function f = new Function(temp.tokenStrings.get(1));
                for (String p : temp.tokenStrings.get(2).split(" ")) {
                    //参数解析
                    String[] pinfo = p.split(" ");
                    if(pinfo.length == 3 && pinfo[0].equals("static")){
                        f.params.add(new FunctionParam(pinfo[1],pinfo[2], true));
                    }else {
                        f.params.add(new FunctionParam(pinfo[0],pinfo[1], false));
                    }
                    //函数体
                    f.funcs = temp.tokenStrings.get(2);
                }
                Cache.functions.put(f.name,f);
            }
        }
    }
}

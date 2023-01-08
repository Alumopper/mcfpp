package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.tokens.Token;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * mcfpp中的一个函数
 */
public class Function {
    public static String currNamespace;
    /**
     * 这个function中的所有语句(方法体)
     */
    public ArrayList<Token> tokens = new ArrayList<>();

    public String funcs;

    /**
     * 这个函数的名字
     */
    public String name;

    /**
     *  这个函数的参数
     */
    public ArrayList<FunctionParam> params = new ArrayList<>();

    /**
     * 这个函数的命名空间
     */
    public String namespace;

    /**
     * 创建一个函数
     * @param name 这个函数的名字
     */
    public Function(String name){
        this.name = name;
        this.namespace = currNamespace;
    }

    /**
     * 解析这个函数中的语句
     */
    public void analyse() throws IOException {
        ByteArrayInputStream inputStream = null;
        if (funcs != null && !"".equals(funcs.trim())) {
            try {
                inputStream = new ByteArrayInputStream(funcs.getBytes(StandardCharsets.UTF_8));
            } catch (Exception e) {
                e.printStackTrace();
            }
            BufferedReader tokenReader = new BufferedReader(new InputStreamReader(inputStream));
            //开始读取
            Token temp;
            while ((temp = Token.readToken(tokenReader)) != null){
                //处理token

            }
        }
    }
}

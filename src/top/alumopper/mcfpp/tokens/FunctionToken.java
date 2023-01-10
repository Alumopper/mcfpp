package top.alumopper.mcfpp.tokens;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.lib.FunctionParam;
import top.alumopper.mcfpp.reader.McfppFunctionReader;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class FunctionToken extends Token{
    /**
     * 从一个字符串中解析一个语句
     */
    public FunctionToken(Token token) {
        super(token);
        this.reader = new McfppFunctionReader(this);
        this.reader.line = line;
    }


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
     * 读取此函数用的reader
     */
    public McfppFunctionReader reader;

    /**
     * 解析这个函数中的语句
     */
    public void analyse() throws IOException {
        ByteArrayInputStream inputStream = null;
        if (funcs != null && !"".equals(funcs.trim())) {
            try {
                inputStream = new ByteArrayInputStream(funcs.getBytes(StandardCharsets.UTF_8));
            } catch (Exception e) {
                Project.logger.error("Error while analyse function \"" + name + "\"");
                e.printStackTrace();
                return;
            }
            this.reader.reader = new BufferedReader(new InputStreamReader(inputStream));
            reader.analyze();
        }
    }
}

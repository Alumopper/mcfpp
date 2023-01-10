package top.alumopper.mcfpp.reader;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.tokens.FunctionToken;
import top.alumopper.mcfpp.tokens.Token;

import java.io.IOException;

public class McfppFunctionReader extends McfppReader{

    FunctionToken token;

    public McfppFunctionReader(FunctionToken token){
        this.token = token;
    }

    /**
     * 解析这个函数中的语句
     */
    @Override
    public void analyze() throws IOException {
        //开始读取
        Token temp;
        while ((temp = Token.readToken(this)) != null){
            //处理token
            if(temp.type == Token.Type.CLASS || temp.type == Token.Type.FUNCTION){
                Project.logger.error("Cannot define function in function:" + temp.tokenStrings.get(1) + "\n" + temp.getTokenInfo());
            }
            this.token.tokens.add(temp);
        }
    }
}

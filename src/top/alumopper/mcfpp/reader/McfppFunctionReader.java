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
}

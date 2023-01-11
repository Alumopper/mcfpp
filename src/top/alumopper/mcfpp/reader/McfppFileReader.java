package top.alumopper.mcfpp.reader;

import top.alumopper.mcfpp.Cache;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.lib.FunctionParam;
import top.alumopper.mcfpp.tokens.FunctionToken;
import top.alumopper.mcfpp.tokens.Token;

import java.io.*;

/**
 * 用于读取mcfpp代码
 */
public class McfppFileReader extends McfppReader {
    /**
     * 从指定路径读取mcfpp文件
     * @param path mcfpp文件的路径
     */
    public McfppFileReader(String path) throws IOException{
        this.path = path;
        this.rpath = getRelativePath(Project.root)
        reader = new BufferedReader(new FileReader(path));
    }

    /**
     * 从这个文件中解析类或者函数
     */
    @Override
    public void analyze() throws IOException{
        int line = 0;
        Token temp;
        while ((temp = Token.readToken(this)) != null){
            //处理token
            if(temp.tokenStrings.get(0).equals("func")){
                //函数
                FunctionToken f = new FunctionToken(temp);
                f.name = temp.tokenStrings.get(1);
                for (String p : temp.tokenStrings.get(2).split(" ")) {
                    //参数解析
                    if(p.equals("")){
                        continue;
                    }
                    String[] pinfo = p.split(" ");
                    if(pinfo.length == 3 && pinfo[0].equals("static")){
                        f.params.add(new FunctionParam(pinfo[1],pinfo[2], true));
                    }else {
                        f.params.add(new FunctionParam(pinfo[0],pinfo[1], false));
                    }
                }
                //函数体
                f.funcs = temp.tokenStrings.get(2);
                f.namespace = FunctionToken.currNamespace;
                Cache.functions.put(f.name,f);
            }
        }
    }

    /**
     * 获得targetPath相对于sourcePath的相对路径
     * @param sourcePath	: 原文件路径
     * @param targetPath	: 目标文件路径
     * @return
     */
    private static String getRelativePath(String sourcePath, String targetPath) {
        StringBuilder pathSB = new StringBuilder();
        if (targetPath.indexOf(sourcePath) == 0){
            pathSB.append(targetPath.replace(sourcePath, ""));
        }else {
            String[] sourcePathArray = sourcePath.split("/");
            String[] targetPathArray = targetPath.split("/");
            if (targetPathArray.length >= sourcePathArray.length){
                for (int i = 0; i < targetPathArray.length; i++){
                    if (!(sourcePathArray.length > i && targetPathArray[i].equals(sourcePathArray[i]))){
                        pathSB.append("../".repeat(Math.max(0, sourcePathArray.length - i)));
                        for (;i < targetPathArray.length; i++){
                            pathSB.append(targetPathArray[i]).append("/");
                        }
                        break;
                    }
                }
            }else {
                for (int i = 0; i < sourcePathArray.length; i++){
                    if (!(targetPathArray.length > i && targetPathArray[i].equals(sourcePathArray[i]))){
                        pathSB.append("../".repeat(sourcePathArray.length - i));
                        break;
                    }
                }
            }
        }
        return pathSB.toString();
    }
}

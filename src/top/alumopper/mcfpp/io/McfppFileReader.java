package top.alumopper.mcfpp.io;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.lib.*;
import java.io.*;

/**
 * 用于读取mcfpp代码。
 */
public class McfppFileReader extends McfppReader {

    public static String currPath;

    /**
     * 从指定路径读取mcfpp文件
     * @param path mcfpp文件的路径
     */
    public McfppFileReader(String path) throws IOException{
        this.path = path;
        this.rpath = getRelativePath(Project.root.getAbsolutePath(),new File(path).getParentFile().getAbsolutePath());
        currPath = this.rpath;
        input = new FileInputStream(path);
    }

    /**
     * 解析这个文件
     */
    public void analyse() throws IOException{
        Project.currNamespace = Project.root.getName();
        Project.currFile = new File(path);
        CharStream charStream = CharStreams.fromStream(input);
        CommonTokenStream tokens = new CommonTokenStream(new mcfppLexer(charStream));
        new McfppFileVisitor().visit(new mcfppParser(tokens).compilationUnit());
    }

    /**
     * 编译这个文件
     */
    public void compile() throws IOException {
        Project.currNamespace = Project.root.getName();
        Project.currFile = new File(path);
        CharStream charStream = CharStreams.fromStream(input);
        mcfppLexer lexer = new mcfppLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mcfppParser parser = new mcfppParser(tokens);
        parser.addParseListener(new McfppImListener());
        parser.compilationUnit();
    }

    /**
     * 获得targetPath相对于sourcePath的相对路径
     * @param sourcePath	: 原文件路径
     * @param targetPath	: 目标文件路径
     * @return 返回相对路径
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

package top.alumopper.mcfpp.reader;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class McfppReader {
    /**
     * 用于读取用的流
     */
    public BufferedReader reader;

    /**
     * 行数定位
     */
    public int line;

    /**
     * 对应的文件绝对路径
     */
    public String path;

    /**
     * 文件相对根目录的路径
     */
    public String rpath;

    /**
     * 解析
     */
    public abstract void analyze() throws IOException;
}

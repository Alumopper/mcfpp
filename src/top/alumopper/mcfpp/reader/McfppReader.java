package top.alumopper.mcfpp.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class McfppReader {
    /**
     * 用于读取用的流
     */
    public InputStream input;

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
}

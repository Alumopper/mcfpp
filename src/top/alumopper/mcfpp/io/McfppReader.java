package top.alumopper.mcfpp.io;

import java.io.InputStream;

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

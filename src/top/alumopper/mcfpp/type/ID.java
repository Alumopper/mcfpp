package top.alumopper.mcfpp.type;

import top.alumopper.mcfpp.exception.IllegalFunctionNameException;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ID {

    /**
     * 命名空间id全称。不包含标签符"#"
     */
    public String id;

    /**
     * 名字
     */
    public String name;


    /**
     * 命名空间
     */
    public String namespace;

    /**
     * 是否是命令标签
     */
    public boolean isTag;


    /**
     * 创建一个命名空间id
     * @param namespace 命名空间
     * @param name 名字
     */
    public ID(String namespace, String name)
    {
        this.namespace = namespace;
        this.name = name;
        this.id = namespace + ":" + name;
    }

    /**
     * 创建一个命名空间id
     */
    public ID(String id)
    {
        this.namespace = namespace;
        this.name = name;
        this.id = namespace + ":" + name;
    }

    /**
     * 创建一个命名空间id
     * @param namespace 命名空间
     * @param name 名字
     * @param isTag 是否是标签
     */
    public ID(String namespace, String name, boolean isTag)
    {
        this.namespace = namespace;
        this.name = name;
        this.id = namespace + ":" + name;
        this.isTag = isTag;
    }

    public static boolean IsLegal(String arg) {
        return true;
    }

    @Override
    public String toString()
    {
        return (isTag ? "#" : "") + id;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof ID) {
            return Objects.equals(((ID) obj).id, id) && isTag == ((ID)obj).isTag;
        } else {
            return false;
        }
    }
}

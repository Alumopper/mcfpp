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

    /// <summary>
    /// 命名空间id的id部分
    /// </summary>
    public String name;

    /// <summary>
    /// 命名空间id的命名空间部分
    /// </summary>
    public String namespace;

    /// <summary>
    /// 是否是标签。如果是标签，在调用toString方法时会在前面加上"#"
    /// </summary>
    public boolean isTag;

    /// <summary>
    /// 根据一个命名空间的字符串创建一个命名空间id。字符串的标准格式为xxx:xxx或#xxx:xxx。若未执行命名空间，则默认命名空间为minecraft
    /// </summary>
    /// <param name="id"></param>
    /// <exception cref="IllegalFunctionNameException"></exception>
    public ID(String id) throws IllegalFunctionNameException {
        if (IsLegal(id))
        {
            if (id.startsWith("#"))
            {
                isTag = true;
                id.substring(1);
            }
            if (id.contains(":"))
            {
                this.id = id;
                this.namespace = id.split(":")[0];
                this.name = id.split(":")[1];
            }
            else
            {
                this.namespace = "minecraft";
                this.name = id;
                this.id = namespace + ":" + name;
            }
        }
        else
        {
            throw new IllegalFunctionNameException("错误的函数命名空间id:" + id);
        }
    }

    /// <summary>
    /// 根据指定的命名空间和名称创建新的命名空间id
    /// </summary>
    /// <param name="namespace"></param>
    /// <param name="name"></param>
    public ID(String namespace, String name)
    {
        this.namespace = namespace;
        this.name = name;
        this.id = namespace + ":" + name;
    }

    public static boolean IsLegal(String str)
    {
        return Pattern.matches("(^#?[a-z0-9_]+:[a-z0-9_]+(/[a-z0-p_]+)*$)|(^[a-z0-9_]+$)",str);
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

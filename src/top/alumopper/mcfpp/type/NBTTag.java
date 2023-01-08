package top.alumopper.mcfpp.type;

import java.util.*;

public class NBTTag
{
    //此NBTTag的父节点
    public NBTTag parentRoot;

    public String name;

    public final String getName()
    {
        return name;
    }

    private Object value;

    public Object getValue()
    {
        return value;
    }
    public void setValue(Object value)
    {
        this.value = value;
    }

    public String getValueString()
    {
        throw new UnsupportedOperationException();
    }

    public boolean getIsDynamic()
    {
        return value == null;
    }

    /**
     列表正在被访问的元素索引
     */
    public int getIndexOf()
    {
        throw new UnsupportedOperationException();
    }

    /**
     是否已经序列化
     */
    protected boolean hasSerialized = false;

    private IDataArg container;

    public final IDataArg getContainer()
    {
        return container;
    }

    private static int count = 0;

    protected int index;

    /**
     此NBTTag在存储mcsharp:temp中的路径
     */
    public final String getPath()
    {
        String re = name + (parentRoot != null ? "" : String.valueOf(index));
        if (parentRoot instanceof NBTCompound)
        {
            re = parentRoot.getPath() + "." + re;
        }
        else if (parentRoot != null && (parentRoot.getClass().IsGenericType ? parentRoot.getClass().GetGenericTypeDefinition() : parentRoot.getClass()) == NBTList<>.class)
        {
            re = parentRoot.getPath() + "[" + parentRoot.getIndexOf() + "]" + re;
        }
        return re;
    }

    protected boolean isList = false;

    public NBTTag(IDataArg container)
    {
        index = count++;
        this.container = container;
    }

    public NBTTag(String name, IDataArg container)
    {
        index = count++;
        this.name = name;
        this.container = container;
    }

    public NBTTag getItem(Object index)
    {
        throw new UnsupportedOperationException();
    }
    public void setItem(Object index, NBTTag value)
    {
        throw new UnsupportedOperationException();
    }

    /**
     获取这个NBTCompound的字符串形式
     */
    @Override
    public String toString()
    {
        String tempVar = getName();
        return ((tempVar != null) ? tempVar : "?") + ":" + getValueString();
    }

    //C# TO JAVA CONVERTER TODO TASK: The following operator overload is not converted by C# to Java Converter:
    public static implicit operator NBTTag(SbValue sbValue)
{
    //todo
    return null;
}

    /**
     属性的穷尽字符串数组
     */
    public static String[] attributes = new String[] {"generic.max_health", "generic.follow_range", "generic.knockback_resistance", "generic.movement_speed", "generic.attack_damage", "generic.attack_knockback", "generic.armor", "generic.armor_toughness"};

    /**
     检查一个nbt路径是否合法

     @param path 一个nbt路径
     */
    public static boolean IsLegalPath(String path)
    {
        String[] paths = path.split("[.]", -1);
        for (String i : paths)
        {
            if (!Regex.IsMatch(i, "^[a-zA-Z0-9_]+([\\[](([0-9]+)|([\"][a-zA-Z_]+[\"]))[\\]])*$") || i == null)
            {
                return false;
            }
        }
        return true;
    }

    /**
     反序列化一段nbt字符串，从字符串中解析nbt列表

     <typeparam name="T"></typeparam>
     @param name
     @param nbt
     @return
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Forbid] public static NBTList<T> PraseList<T>(string name, string nbt) where T : NBTTag
    public static <T extends NBTTag> NBTList<T> PraseList(String name, String nbt)
    {
        try
        {
            NBTList<T> re;
            int brackets = 0;
            ArrayList<T> tags = new ArrayList<T>();
            nbt = nbt.substring(1, 1 + nbt.length() - 2); //掐头去尾
            String t = "";
            //列表
            //一级拆解
            for (int i = 0; i < nbt.length(); i++)
            {
                if (brackets == 0 && nbt.charAt(i) == ',')
                {
                    //一个值
                    T value = (T)Prase(null, t);
                    tags.add(value);
                    t = "";
                }
                else if (nbt.charAt(i) == '{' || nbt.charAt(i) == '[')
                {
                    brackets++;
                }
                else if (nbt.charAt(i) == '}' || nbt.charAt(i) == ']')
                {
                    brackets--;
                }
                else
                {
                    t += nbt.charAt(i);
                    continue;
                }
            }
            //一个值
            T value1 = (T)Prase(null, t);
            tags.add(value1);
            if (brackets != 0)
            {
                throw new IllegalFormatException("括号不匹配: " + nbt);
            }
            if (name == null)
            {
                re = new NBTList<T>() {tags.toArray(new T[0])};
            }
            else
            {
                re = new NBTList<T>(name) {tags.toArray(new T[0])};
            }
            return re;
        }
        catch (IllegalFormatException e)
        {
            throw e;
        }
        catch (RuntimeException e)
        {
            throw new IllegalFormatException("无法解析nbt: " + nbt);
        }
    }

    /**
     反序列化一段nbt字符串，从字符串中解析nbt

     @param nbt
     @return 反序列化出的nbt字符串
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Forbid] public static NBTTag Prase(string name,string nbt)
    public static NBTTag Prase(String name, String nbt)
    {
        /*
         * 需要解析的字符串一般是这样的{xxx1:yyy1,xxx2:yyy2}，或者是{xxx:yyy}
         * 当然也可能是单个值或者一个列表，数组等
         * 有列表的时候会复杂一些。{xxx:[a:b,e:{v:c}]}
         * 应当返回一个匿名的NBTCompound，当然这个时候的name也是null。
         * 在解析时，还是先用逗号切割这种传统异能来把每个键值对分开
         * 得到xxx:yyy这样的。
         * 这个时候我们就继续递归调用Parse()，第一个参数是xxx，第二个参数是yyy
         * 然后是区分我们要返回什么类型的NBT
         * 显然，如果字符串是{}开头结尾，这是一个NBTCompound
         * 否则则是数组或者单值，列表。
         * 列表的解析需要单独说一说。
         * 列表的键值对是这样的：xxx:[a,b,c,d,e]
         * 这时我们传入Prase的参数就是[a,b,c,d,e]的，开头和结尾都是中括号，非常有辨识度。
         * 然后我们就可以接着用逗号分割，把里面的键值对取出来
         * 由于NBTList是一个List类型的，因此只能有一种类型。这种类型就由第一个元素决定啦。
         * 因为NBTList是泛型类型，所以需要使用上面那个有泛型的方法 =w=
         */
        try
        {
            NBTTag re = null;
            int brackets = 0;
            if (nbt.startsWith("{"))
            {
                ArrayList<NBTTag> tags = new ArrayList<NBTTag>();
                nbt = nbt.substring(1, 1 + nbt.length() - 2); //掐头去尾
                String t = "";
                //复合
                //一级拆解
                for (int i = 0; i < nbt.length(); i++)
                {
                    if (brackets == 0 && nbt.charAt(i) == ',')
                    {
                        //一个键值对
                        String[] kv = t.split("[:]", 2);
                        tags.add(Prase(kv[0], kv[1]));
                        t = "";
                    }
                    else if (nbt.charAt(i) == '{' || nbt.charAt(i) == '[')
                    {
                        t += nbt.charAt(i);
                        brackets++;
                    }
                    else if (nbt.charAt(i) == '}' || nbt.charAt(i) == ']')
                    {
                        t += nbt.charAt(i);
                        brackets--;
                    }
                    else
                    {
                        t += nbt.charAt(i);
                    }
                }
                //最后一个键值对
                String[] kv1 = t.split("[:]", 2);
                if (kv1.length == 2)
                {
                    tags.add(Prase(kv1[0], kv1[1]));
                }
                if (brackets != 0)
                {
                    throw new IllegalFormatException("括号不匹配: " + nbt);
                }
                if (name == null)
                {
                    re = new NBTCompound() {tags.toArray(new NBTTag[0])};
                }
                else
                {
                    re = new NBTCompound(name) {tags.toArray(new NBTTag[0])};
                }
            }
            else if (nbt.startsWith("[") && nbt.length() > 3 && nbt.charAt(2) == ';')
            {
                //[T;1,1,1,1,1,1,1,1,1,1]
                String[] values = nbt.substring(1, 1 + nbt.length() - 2).split("[,;]");
                if (values[0].equals("B"))
                {
                    //byte
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: byte[] bytes = new byte[values.Length - 1];
                    byte[] bytes = new byte[values.length - 1];
                    for (int i = 0; i < bytes.length; i++)
                    {
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: bytes[i] = byte.Parse(values[i + 1]);
                        bytes[i] = Byte.parseByte(values[i + 1]);
                    }
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: return name == null ? new NBTByteArray() { bytes} : new NBTArray<byte>(name) { bytes };
                    return name == null ? new NBTByteArray() {bytes} : new NBTArray<Byte>(name) {bytes};
                }
                if (values[0].equals("I"))
                {
                    //int
                    int[] ints = new int[values.length - 1];
                    for (int i = 0; i < ints.length; i++)
                    {
                        ints[i] = Integer.parseInt(values[i + 1]);
                    }
                    return name == null ? new NBTIntArray() {ints} : new NBTIntArray(name) {ints};
                }
                if (values[0].equals("L"))
                {
                    //long
                    long[] longs = new long[values.length - 1];
                    for (int i = 0; i < longs.length; i++)
                    {
                        longs[i] = Long.parseLong(values[i + 1]);
                    }
                    return name == null ? new NBTLongArray() {longs} : new NBTLongArray(name) {longs};
                }
                else
                {
                    throw new RuntimeException();
                }
            }
            else if (nbt.startsWith("["))
            {
                //事列表
                //获取列表的第一个值
                String nbt1 = nbt.substring(1, 1 + nbt.length() - 2); //掐头去尾
                String t = "";
                //复合
                //一级拆解
                for (int i = 0; i < nbt1.length(); i++)
                {
                    if (brackets == 0 && nbt1.charAt(i) == ',')
                    {
                        //一个值
                        java.lang.Class type = Prase(null, t).getClass();
                        re = (NBTTag)NBTTag.class.GetMethod("PraseList").MakeGenericMethod(type).Invoke(null,new Object[] {name, nbt});
                        break;
                    }
                    else if (nbt1.charAt(i) == '{' || nbt1.charAt(i) == '[')
                    {
                        brackets++;
                    }
                    else if (nbt1.charAt(i) == '}' || nbt1.charAt(i) == ']')
                    {
                        brackets--;
                    }
                    else
                    {
                        t += nbt1.charAt(i);
                        continue;
                    }
                }
            }
            else
            {
                //单值
                boolean value;
                tangible.RefObject<Boolean> tempRef_value = new tangible.RefObject<Boolean>(value);
                if (Boolean.TryParse(nbt, tempRef_value))
                {
                    value = tempRef_value.argValue;
                    re = name == null ? new NBTBool(value) : new NBTBool(name, value);
                    return re;
                }
                else
                {
                    value = tempRef_value.argValue;
                }
                int value1;
                tangible.RefObject<Integer> tempRef_value1 = new tangible.RefObject<Integer>(value1);
                if (tangible.TryParseHelper.tryParseInt(nbt, tempRef_value1))
                {
                    value1 = tempRef_value1.argValue;
                    re = name == null ? new NBTInt(value1) : new NBTInt(name, value1);
                    return re;
                }
                else
                {
                    value1 = tempRef_value1.argValue;
                }
                double value2;
                tangible.RefObject<Double> tempRef_value2 = new tangible.RefObject<Double>(value2);
                if (tangible.TryParseHelper.tryParseDouble(nbt, tempRef_value2))
                {
                    value2 = tempRef_value2.argValue;
                    re = name == null ? new NBTDouble(value2) : new NBTDouble(name, value2);
                    return re;
                }
                else
                {
                    value2 = tempRef_value2.argValue;
                }
                short value3;
                tangible.RefObject<Short> tempRef_value3 = new tangible.RefObject<Short>(value3);
                if (nbt.endsWith("s") && tangible.TryParseHelper.tryParseShort(nbt.substring(0, nbt.length() - 1), tempRef_value3))
                {
                    value3 = tempRef_value3.argValue;
                    re = name == null ? new NBTShort(value3) : new NBTShort(name, value3);
                    return re;
                }
                else
                {
                    value3 = tempRef_value3.argValue;
                }
                long value4;
                tangible.RefObject<Long> tempRef_value4 = new tangible.RefObject<Long>(value4);
                if (nbt.endsWith("l") && tangible.TryParseHelper.tryParseLong(nbt.substring(0, nbt.length() - 1), tempRef_value4))
                {
                    value4 = tempRef_value4.argValue;
                    re = name == null ? new NBTLong(value4) : new NBTLong(name, value4);
                    return re;
                }
                else
                {
                    value4 = tempRef_value4.argValue;
                }
                float value5;
                tangible.RefObject<Float> tempRef_value5 = new tangible.RefObject<Float>(value5);
                if (nbt.endsWith("f") && tangible.TryParseHelper.tryParseFloat(nbt.substring(0, nbt.length() - 1), tempRef_value5))
                {
                    value5 = tempRef_value5.argValue;
                    re = name == null ? new NBTFloat(value5) : new NBTFloat(name, value5);
                    return re;
                }
                else
                {
                    value5 = tempRef_value5.argValue;
                }
                tangible.RefObject<Double> tempRef_value22 = new tangible.RefObject<Double>(value2);
                if (nbt.endsWith("d") && tangible.TryParseHelper.tryParseDouble(nbt.substring(0, nbt.length() - 1), tempRef_value22))
                {
                    value2 = tempRef_value22.argValue;
                    re = name == null ? new NBTDouble(value2) : new NBTDouble(name, value2);
                    return re;
                }
                else
                {
                    value2 = tempRef_value22.argValue;
                }
                if (nbt.startsWith("\"") && nbt.endsWith("\""))
                {
                    nbt = nbt.substring(1, 1 + nbt.length() - 2);
                }
                re = name == null ? new NBTString(nbt) : new NBTString(name, nbt);
                return re;
            }
            return re;
        }
        catch (IllegalFormatException e)
        {
            throw e;
        }
        catch (RuntimeException e)
        {
            throw new IllegalFormatException("无法解析nbt: " + nbt);
        }
    }
}

package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2007 - 2017 Tangible Software Solutions Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class is used to replicate the ability to pass arguments by reference in Java.
//----------------------------------------------------------------------------------------
public final class RefObject<T>
{
    public T argValue;
    public RefObject(T refArg)
    {
        argValue = refArg;
    }
}

package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2007 - 2017 Tangible Software Solutions Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class is used to convert some of the C# TryParse methods to Java.
//----------------------------------------------------------------------------------------
public final class TryParseHelper
{
    public static boolean tryParseInt(String s, tangible.RefObject<Integer> result)
    {
        try
        {
            result.argValue = Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static boolean tryParseShort(String s, tangible.RefObject<Short> result)
    {
        try
        {
            result.argValue = Short.parseShort(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static boolean tryParseLong(String s, tangible.RefObject<Long> result)
    {
        try
        {
            result.argValue = Long.parseLong(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static boolean tryParseByte(String s, tangible.RefObject<Byte> result)
    {
        try
        {
            result.argValue = Byte.parseByte(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static boolean tryParseDouble(String s, tangible.RefObject<Double> result)
    {
        try
        {
            result.argValue = Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static boolean tryParseFloat(String s, tangible.RefObject<Float> result)
    {
        try
        {
            result.argValue = Float.parseFloat(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static boolean tryParseBoolean(String s, tangible.RefObject<Boolean> result)
    {
        try
        {
            result.argValue = Boolean.parseBoolean(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
}

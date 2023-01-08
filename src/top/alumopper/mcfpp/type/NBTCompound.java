package top.alumopper.mcfpp.type;

import java.util.*;

import MCSharp.Attribute.*;
import MCSharp.Cmds.*;
import MCSharp.Cmds.Commands.*;
import top.alumopper.mcfpp.command.Data;

//C# TO JAVA CONVERTER TODO TASK: The interface type was changed to the closest equivalent Java type, but the methods implemented will need adjustment:
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Inline] public class NBTCompound : NBTTag, IEnumerable<NBTTag>
public class NBTCompound extends NBTTag implements List<NBTTag>
{
	private ArrayList<NBTTag> value;
	private Data data;

	/**
	 获取这个NBTCompound的值
	*/
	@Override
	public Object getValue()
	{
		return value;
	}
	@Override
	public void setValue(Object value)
	{
//C# TO JAVA CONVERTER TODO TASK: Java has no equivalent to C# pattern variables in 'is' expressions:
//ORIGINAL LINE: if (value is List<NBTTag> value1)
		if (value instanceof ArrayList<NBTTag> value1)
		{
				//一有动静我就序列化.jpg
			if (!hasSerialized)
			{
					//将命令序列化到函数中
				Serialize(data);
			}
			hasSerialized = true; //对Compound中的元素进行了添加操作。必然完成了new的过程
			this.value = value1;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型List<NBTPath>:" + value);
		}
	}

	/**
	 获取这个NBTCompound的值的字符串形式
	*/
	@Override
	public String getValueString()
	{
		if (getIsDynamic())
		{
			return "?";
		}
		String s = "{";
		for (NBTTag nbt : value)
		{
			s += nbt.toString() + ",";
		}
		s = tangible.DotNetToJavaStringHelper.trimEnd(s, ',');
		s += "}";
		return s;
	}

	/**
	 这个NBTCompound是否是动态的
	*/
	@Override
	public boolean getIsDynamic()
	{
		return value == null;
	}

	/**
	 创建一个空的NBTCompound，NBT容器默认为ID.tempNBT

	 @param name
	*/
	public NBTCompound(String name)
	{
		super(name, ID.tempNBT);
		value = new ArrayList<NBTTag>();
		//添加未序列化的命令，从而在new语句中后续调用add方法改变字典时也会让命令中的元素发生变化
		data = DataModifySet(this, this,false);
	}

	/**
	 创建一个空的NBTCompound，指定了它所属的NBT容器

	 @param name
	 @param container
	*/
	public NBTCompound(String name, IDataArg container)
	{
		super(name, container);
		value = new ArrayList<NBTTag>();
		//添加未序列化的命令，从而在new语句中后续调用add方法改变字典时也会让命令中的元素发生变化
		data = DataModifySet(this, this, false);
	}

	/**
	 创建一个匿名NBTCompound，指定它所属的NBT容器
	*/
	public NBTCompound(IDataArg container)
	{
		super(container);
		value = new ArrayList<NBTTag>();
		hasSerialized = true;
	}

	/**
	 创建一个匿名NBTCompound
	*/
	public NBTCompound()
	{
		super(ID.tempNBT);
		value = new ArrayList<NBTTag>();
		hasSerialized = true;
	}

	/**
	 通过字符串获取这个NBTCompound中的NBTTag

	 @param index
	 @return
	*/
	@Override
	public NBTTag getItem(Object index)
	{
//C# TO JAVA CONVERTER TODO TASK: Java has no equivalent to C# pattern variables in 'is' expressions:
//ORIGINAL LINE: if(index is string strindex)
		if (index instanceof String strindex)
		{
				//一有动静我就序列化.jpg
			if (!hasSerialized)
			{
					//将命令序列化到函数中
				Serialize(data);
			}
			hasSerialized = true; //对Compound中的元素进行了访问操作。必然完成了new的过程
			for (NBTTag tag : value)
			{
				if (tag.Name == strindex)
				{
					return tag;
				}
			}
			return null;
		}
		else
		{
			throw new IllegalArgumentException("只允许string类型的索引" + value);
		}
	}

	public final void Add(NBTTag tag)
	{
//C# TO JAVA CONVERTER TODO TASK: Java has no equivalent to C# pattern variables in 'is' expressions:
//ORIGINAL LINE: if(tag is NBTCompound qwq)
		if (tag instanceof NBTCompound qwq)
		{
			qwq.hasSerialized = true; //用于new的NBTTag是没有命令哒，不用考虑序列化问题
		}
		if (tag.Name != null)
		{
			RemoveCommand();
		}
		tag.parentRoot = this; //父元素设置
		value.add(tag);
	}

	public final void Add(NBTTag[] tags)
	{
		for (NBTTag tag : tags)
		{
//C# TO JAVA CONVERTER TODO TASK: Java has no equivalent to C# pattern variables in 'is' expressions:
//ORIGINAL LINE: if (tag is NBTCompound qwq)
			if (tag instanceof NBTCompound qwq)
			{
				qwq.hasSerialized = true; //用于new的NBTTag是没有命令哒，不用考虑序列化问题
			}
			if (tag.Name != null)
			{
				RemoveCommand();
			}
			tag.parentRoot = this; //父元素设置
			value.add(tag);
		}
	}

	/**
	 向此NBTCompound中添加一个NBTTag

	 @param tag
	*/
	public final void Merge(NBTTag tag)
	{
		//一有动静我就序列化.jpg
		if (!hasSerialized)
		{
			//将命令序列化到函数中
			Serialize(data);
		}
		hasSerialized = true; //对Compound中的元素进行了添加操作。必然完成了new的过程
		tag.parentRoot = this; //父元素设置
		value.add(tag);
		DataModifyMerge(this, tag);
	}

	/**
	 将此NBTCompound中的指定项删除

	 @param path
	*/
	public final void Remove(String path)
	{
		//因为索引中有序列化，这里虽然也有动静但是不会专门去序列化啦
		this.get(path).parentRoot = null;
		value.remove(this.get(path));
		DataRemove(ID.tempNBT, Path + "." + path);
	}

//C# TO JAVA CONVERTER TODO TASK: The C# 'new()' constraint has no equivalent in Java:
//ORIGINAL LINE: public T GetDynamicNBT<T>(string key) where T : NBTTag, new()
	public final <T extends NBTTag> T GetDynamicNBT(String key)
	{
		T re = new T();
		re.name = key;
		value.add(re);
		return re;
	}

	public final Iterator<NBTTag> iterator()
	{
		return value.iterator();
	}

	public final Iterator GetEnumerator()
	{
		return value.iterator();
	}
}

package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2007 - 2017 Tangible Software Solutions Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class is used to replicate some .NET string methods in Java.
//----------------------------------------------------------------------------------------
public final class DotNetToJavaStringHelper
{
	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'Substring' when 'start' is a method
	//	call or calculated value to ensure that 'start' is obtained just once.
	//------------------------------------------------------------------------------------
	public static String substring(String string, int start, int length)
	{
		if (length < 0)
			throw new IndexOutOfBoundsException("Parameter length cannot be negative.");

		return string.substring(start, start + length);
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET static string method 'IsNullOrEmpty'.
	//------------------------------------------------------------------------------------
	public static boolean isNullOrEmpty(String string)
	{
		return string == null || string.length() == 0;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET static string method 'IsNullOrWhiteSpace'.
	//------------------------------------------------------------------------------------
	public static boolean isNullOrWhiteSpace(String string)
	{
		if (string == null)
			return true;

		for (int index = 0; index < string.length(); index++)
		{
			if (!Character.isWhitespace(string.charAt(index)))
				return false;
		}

		return true;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET static string method 'Join' (2 parameter version).
	//------------------------------------------------------------------------------------
	public static String join(String separator, String[] stringArray)
	{
		if (stringArray == null)
			return null;
		else
			return join(separator, stringArray, 0, stringArray.length);
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET static string method 'Join' (4 parameter version).
	//------------------------------------------------------------------------------------
	public static String join(String separator, String[] stringArray, int startIndex, int count)
	{
		String result = "";

		if (stringArray == null)
			return null;

		for (int index = startIndex; index < stringArray.length && index - startIndex < count; index++)
		{
			if (separator != null && index > startIndex)
				result += separator;

			if (stringArray[index] != null)
				result += stringArray[index];
		}

		return result;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'Remove' (1 parameter version).
	//------------------------------------------------------------------------------------
	public static String remove(String string, int start)
	{
		return string.substring(0, start);
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'Remove' (2 parameter version).
	//------------------------------------------------------------------------------------
	public static String remove(String string, int start, int count)
	{
		return string.substring(0, start) + string.substring(start + count);
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'TrimEnd'.
	//------------------------------------------------------------------------------------
	public static String trimEnd(String string, Character... charsToTrim)
	{
		if (string == null || charsToTrim == null)
			return string;

		int lengthToKeep = string.length();
		for (int index = string.length() - 1; index >= 0; index--)
		{
			boolean removeChar = false;
			if (charsToTrim.length == 0)
			{
				if (Character.isWhitespace(string.charAt(index)))
				{
					lengthToKeep = index;
					removeChar = true;
				}
			}
			else
			{
				for (int trimCharIndex = 0; trimCharIndex < charsToTrim.length; trimCharIndex++)
				{
					if (string.charAt(index) == charsToTrim[trimCharIndex])
					{
						lengthToKeep = index;
						removeChar = true;
						break;
					}
				}
			}
			if (!removeChar)
				break;
		}
		return string.substring(0, lengthToKeep);
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'TrimStart'.
	//------------------------------------------------------------------------------------
	public static String trimStart(String string, Character... charsToTrim)
	{
		if (string == null || charsToTrim == null)
			return string;

		int startingIndex = 0;
		for (int index = 0; index < string.length(); index++)
		{
			boolean removeChar = false;
			if (charsToTrim.length == 0)
			{
				if (Character.isWhitespace(string.charAt(index)))
				{
					startingIndex = index + 1;
					removeChar = true;
				}
			}
			else
			{
				for (int trimCharIndex = 0; trimCharIndex < charsToTrim.length; trimCharIndex++)
				{
					if (string.charAt(index) == charsToTrim[trimCharIndex])
					{
						startingIndex = index + 1;
						removeChar = true;
						break;
					}
				}
			}
			if (!removeChar)
				break;
		}
		return string.substring(startingIndex);
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'Trim' when arguments are used.
	//------------------------------------------------------------------------------------
	public static String trim(String string, Character... charsToTrim)
	{
		return trimEnd(trimStart(string, charsToTrim), charsToTrim);
	}

	//------------------------------------------------------------------------------------
	//	This method is used for string equality comparisons when the option
	//	'Use helper 'stringsEqual' method to handle null strings' is selected
	//	(The Java String 'equals' method can't be called on a null instance).
	//------------------------------------------------------------------------------------
	public static boolean stringsEqual(String s1, String s2)
	{
		if (s1 == null && s2 == null)
			return true;
		else
			return s1 != null && s1.equals(s2);
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'PadRight' (1 parameter version).
	//------------------------------------------------------------------------------------
	public static String padRight(String string, int totalWidth)
	{
		return padRight(string, totalWidth, ' ');
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'PadRight' (2 parameter version).
	//------------------------------------------------------------------------------------
	public static String padRight(String string, int totalWidth, char paddingChar)
	{
		StringBuilder sb = new StringBuilder(string);

		while (sb.length() < totalWidth)
		{
			sb.append(paddingChar);
		}

		return sb.toString();
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'PadLeft' (1 parameter version).
	//------------------------------------------------------------------------------------
	public static String padLeft(String string, int totalWidth)
	{
		return padLeft(string, totalWidth, ' ');
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'PadLeft' (2 parameter version).
	//------------------------------------------------------------------------------------
	public static String padLeft(String string, int totalWidth, char paddingChar)
	{
		StringBuilder sb = new StringBuilder("");

		while (sb.length() + string.length() < totalWidth)
		{
			sb.append(paddingChar);
		}

		sb.append(string);
		return sb.toString();
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'LastIndexOf' (char version).
	//------------------------------------------------------------------------------------
	public static int lastIndexOf(String string, char value, int startIndex, int count)
	{
		int leftMost = startIndex + 1 - count;
		int rightMost = startIndex + 1;
		String substring = string.substring(leftMost, rightMost);
		int lastIndexInSubstring = substring.lastIndexOf(value);
		if (lastIndexInSubstring < 0)
			return -1;
		else
			return lastIndexInSubstring + leftMost;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'LastIndexOf' (string version).
	//------------------------------------------------------------------------------------
	public static int lastIndexOf(String string, String value, int startIndex, int count)
	{
		int leftMost = startIndex + 1 - count;
		int rightMost = startIndex + 1;
		String substring = string.substring(leftMost, rightMost);
		int lastIndexInSubstring = substring.lastIndexOf(value);
		if (lastIndexInSubstring < 0)
			return -1;
		else
			return lastIndexInSubstring + leftMost;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'IndexOfAny' (1 parameter version).
	//------------------------------------------------------------------------------------
	public static int indexOfAny(String string, char[] anyOf)
	{
		int lowestIndex = -1;
		for (char c : anyOf)
		{
			int index = string.indexOf(c);
			if (index > -1)
			{
				if (lowestIndex == -1 || index < lowestIndex)
				{
					lowestIndex = index;

					if (index == 0)
						break;
				}
			}
		}

		return lowestIndex;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'IndexOfAny' (2 parameter version).
	//------------------------------------------------------------------------------------
	public static int indexOfAny(String string, char[] anyOf, int startIndex)
	{
		int indexInSubstring = indexOfAny(string.substring(startIndex), anyOf);
		if (indexInSubstring == -1)
			return -1;
		else
			return indexInSubstring + startIndex;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'IndexOfAny' (3 parameter version).
	//------------------------------------------------------------------------------------
	public static int indexOfAny(String string, char[] anyOf, int startIndex, int count)
	{
		int endIndex = startIndex + count;
		int indexInSubstring = indexOfAny(string.substring(startIndex, endIndex), anyOf);
		if (indexInSubstring == -1)
			return -1;
		else
			return indexInSubstring + startIndex;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'LastIndexOfAny' (1 parameter version).
	//------------------------------------------------------------------------------------
	public static int lastIndexOfAny(String string, char[] anyOf)
	{
		int highestIndex = -1;
		for (char c : anyOf)
		{
			int index = string.lastIndexOf(c);
			if (index > highestIndex)
			{
				highestIndex = index;

				if (index == string.length() - 1)
					break;
			}
		}

		return highestIndex;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'LastIndexOfAny' (2 parameter version).
	//------------------------------------------------------------------------------------
	public static int lastIndexOfAny(String string, char[] anyOf, int startIndex)
	{
		String substring = string.substring(0, startIndex + 1);
		int lastIndexInSubstring = lastIndexOfAny(substring, anyOf);
		if (lastIndexInSubstring < 0)
			return -1;
		else
			return lastIndexInSubstring;
	}

	//------------------------------------------------------------------------------------
	//	This method replaces the .NET string method 'LastIndexOfAny' (3 parameter version).
	//------------------------------------------------------------------------------------
	public static int lastIndexOfAny(String string, char[] anyOf, int startIndex, int count)
	{
		int leftMost = startIndex + 1 - count;
		int rightMost = startIndex + 1;
		String substring = string.substring(leftMost, rightMost);
		int lastIndexInSubstring = lastIndexOfAny(substring, anyOf);
		if (lastIndexInSubstring < 0)
			return -1;
		else
			return lastIndexInSubstring + leftMost;
	}

}

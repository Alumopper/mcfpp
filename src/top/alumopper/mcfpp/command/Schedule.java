package top.alumopper.mcfpp.command;

import mcsharp.exception.*;
import top.alumopper.mcfpp.type.*;
import mcsharp.util.*;
import mcsharp.*;

/** 
 在Java版中，在经过指定的时间后执行函数。
 <code>
 schedule function <function> <time> [append|replace]
 schedule clear <function>
 </code>
*/
public class Schedule extends Command
{

	private ID function;
	private String time;
	private ar append_replace = ar.values()[0];

	public enum ar
	{
		append,
		replace;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static ar forValue(int value)
		{
			return values()[value];
		}
	}

	/** 
	 schedule function <function> <time> [append|replace]
	 
	 @param function 有效的函数名称或有效的标签名称
	 @param time 指定等待的时间。时间可以是Minecraft天、现实秒或刻（默认为刻）。格式是非负整数加上可选的字符d、s或t。
	 @param append_replace 指定是否取代还在等待执行的函数或指定标签里的函数。
	 @exception ArgumentNotMatchException
	*/
	public Schedule(ID function, String time, ar append_replace)
	{
		this.function = function;
		if (!Pattern.matches(time, "^[0-9]+[dst]?$"))
		{
			throw new ArgumentNotMatchException("非法的时间参数: " + time);
		}
		this.time = time;
		this.append_replace = append_replace;
	}

	/** 
	 schedule clear <function>
	 
	 @param function 有效的函数名称或有效的标签名称
	*/
	public Schedule(ID function)
	{
		this.function = function;
	}

	@Override
	public String toString()
	{
		if (time == null)
		{
			return "schedule clear " + function;
		}
		else
		{
			return "schedule function " + function + " " + time + " " + Tools.GetEnumString(append_replace);
		}
	}
}

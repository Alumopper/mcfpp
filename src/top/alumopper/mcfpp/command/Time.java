package top.alumopper.mcfpp.command;

import mcsharp.exception.*;
import mcsharp.util.*;
import mcsharp.*;

/** 
 更改或查询世界的游戏时间。
 <code>
 time (add|query|set) <时间>
 </code>
*/
public class Time extends Command
{
	private int time;
	private String time2;
	private TimeSpec spec = null;
	private TimeType timeType = null;

	public enum TimeType
	{
		daytime,
		gametime,
		day;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static TimeType forValue(int value)
		{
			return values()[value];
		}
	}

	public enum TimeSpec
	{
		day,
		night,
		noon,
		midnight;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static TimeSpec forValue(int value)
		{
			return values()[value];
		}
	}

	/** 
	 time add <time[t/s/d]>
	 
	 @param time
	 @param type
	*/
	public Time(String time)
	{
		if (!Pattern.matches(time, "^[1-9]+[0-9]*[tsd]?$"))
		{
			throw new ArgumentNotMatchException("参数错误: " + time + "。非法的时间值");
		}
		time2 = time;
	}

	/** 
	 time set <time>
	 
	 @param time
	*/
	public Time(int time)
	{
		this.time = time;
	}

	/** 
	 time set <timeSpec>
	 
	 @param timeSpec day, night, noon, midnight
	*/
	public Time(TimeSpec timeSpec)
	{
		this.spec = timeSpec;
	}

	/** 
	 time query <timeType>
	 
	 @param timeType daytime,gametime,day
	*/
	public Time(TimeType timeType)
	{
		this.timeType = timeType;
	}

	@Override
	public String toString()
	{
		if (time2 != null)
		{
			return "time add " + time2;
		}
		else if (timeType != null)
		{
			return "time query " + Tools.GetEnumString(timeType);
		}
		else if (spec != null)
		{
			return "time set " + Tools.GetEnumString(spec);
		}
		else
		{
			return "time set " + time;
		}
	}
}

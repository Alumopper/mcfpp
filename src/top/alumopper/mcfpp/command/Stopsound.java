package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.util.*;
import mcsharp.*;

/** 
 停止声音播放。
 <code>
 stopsound <targets> [<source>] [<sound>]
 </code>
*/
public class Stopsound extends Command
{
	private Selector targets;
	private Source source = null;
	private ID sound;

	/** 
	 声音来源的枚举。用于命令参数
	*/
	public enum Source
	{
		master,
		music,
		record,
		weather,
		block,
		hostile,
		neutral,
		player,
		ambient,
		voice,
		all;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static Source forValue(int value)
		{
			return values()[value];
		}
	}

	/** 
	 stopsound <targets> [<source>] [<sound>]]]
	 
	 @param targets 指定目标。
	 @param source 指定声音来源。
	 @param sound 指定声音。
	*/

	public Stopsound(Selector targets, Source source)
	{
		this(targets, source, null);
	}

	public Stopsound(Selector targets)
	{
		this(targets, null, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Stopsound(Selector targets, System.Nullable<Source> source = null, ID sound = null)
	public Stopsound(Selector targets, Source source, ID sound)
	{
		this.targets = targets;
		this.source = source;
		this.sound = sound;
	}

	@Override
	public String toString()
	{
		return "stopsound " + targets.toString() + " " + (Tools.GetEnumString(source).equals("all") ? "*" : Tools.GetEnumString(source)) + " " + (sound == null ? "" : sound.toString());
	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.util.*;
import mcsharp.*;

/** 
 此命令用于管理服务器中白名单。
 服务器的管理员永远能够登录开启白名单验证的服务器，无论他们的名字是不是在白名单上。
 <code>
 whitelist (add|remove) <targets>
 whitelist (list|off|on|reload)
 </code>
*/
public class Whitelist extends Command
{
	private Selector targets;
	private ar add_remove = ar.values()[0];
	private loor list_on_off_reload = loor.values()[0];

	public enum ar
	{
		add,
		remove;

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

	public enum loor
	{
		list,
		off,
		on,
		reload;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static loor forValue(int value)
		{
			return values()[value];
		}
	}

	/** 
	 whitelist (add|remove) <targets>
	 
	 @param targets
	 @param add_remove
	*/
	public Whitelist(Selector targets, ar add_remove)
	{
		this.targets = targets;
		this.add_remove = add_remove;
	}

	/** 
	 whitelist (list|off|on|reload)
	 
	 @param list_on_off_reload
	*/
	public Whitelist(loor list_on_off_reload)
	{
		this.list_on_off_reload = list_on_off_reload;
	}

	@Override
	public String toString()
	{
		if (targets != null)
		{
			return "whitelist " + Tools.GetEnumString(add_remove) + " " + targets;
		}
		else
		{
			return "whitelist " + Tools.GetEnumString(list_on_off_reload);
		}
	}
}

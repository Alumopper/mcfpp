package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.*;

/** 
 修改一个准则为"触发器”的记分板目标。一般配合原始JSON文本使用，使无命令执行权限的玩家能够激活管理员或地图制作者设计的系统。
 <code>
 trigger <objective> [(add|set)] [<value>]
 </code>
*/
public class Trigger extends Command
{
	private SbObject objective;
	private As add_set = As.values()[0];
	private int value;

	public enum As
	{
		add,
		set;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static As forValue(int value)
		{
			return values()[value];
		}
	}

	/** 
	 trigger <objective> [(add|set)] [<value>]
	 
	 @param objective
	 @param add_set
	 @param value
	*/

	public Trigger(SbObject objective, As add_set)
	{
		this(objective, add_set, 1);
	}

	public Trigger(SbObject objective)
	{
		this(objective, As.add, 1);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Trigger(SbObject objective, As add_set = As.add, int value = 1)
	public Trigger(SbObject objective, As add_set, int value)
	{
		this.objective = objective;
		this.add_set = add_set;
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "trigger " + objective + (add_set == As.add ? " add " : " set ") + value;
	}
}

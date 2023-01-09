package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 管理单个实体的记分板标签
 <code>
 tag <targets> add <name>
 tag <targets> list
 tag <targets> remove <name>
 </code>
*/
public class Tag extends Command
{
	private Selector targets;
	private ar add_remove = ar.values()[0];
	private String name;

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

	/** 
	 tag <targets> (add|remove) <name>
	 
	 @param targets
	 @param add_remove
	 @param name
	*/
	public Tag(Selector targets, ar add_remove, String name)
	{
		this.targets = targets;
		this.add_remove = add_remove;
		this.name = name;
	}

	/** 
	 tag <targets> list
	 
	 @param targets
	*/
	public Tag(Selector targets)
	{
		this.targets = targets;
	}

	@Override
	public String toString()
	{
		if (name != null)
		{
			return "tag " + targets + " " + add_remove.name() + " " + name;
		}
		else
		{
			return "tag " + targets + " list";
		}
	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 将指定的战利品放入物品栏或世界。
 <code>
 loot <目标> <来源>
 目标：
	 spawn <位置>
	 replace entity <目标> <起始槽位> [<数量>]
	 replace block <位置> <起始槽位> [<数量>]
	 give <玩家>
	 insert <位置>
 来源：
	 fish <loot_table> <位置> [<工具>|mainhand|offhand]
	 loot <loot_table>
	 kill <目标>
	 mine <位置> [<工具>|mainhand|offhand]
 </code>
*/
public class Loot
{
	private Target target;
	private Source source;

	public static class Target
	{
		private Pos pos;
		private op1 spawn_insert = null;
		private Selector target;
		private Slot slot;
		private Integer count = null;

		public enum op1
		{
			spawn,
			insert;

			public static final int SIZE = java.lang.Integer.SIZE;

			public int getValue()
			{
				return this.ordinal();
			}

			public static op1 forValue(int value)
			{
				return values()[value];
			}
		}

		/** 
		 spawn <位置>
		 
		 @param spawn_insert
		 @param pos
		*/
		public Target(op1 spawn_insert, Pos pos)
		{
			this.spawn_insert = spawn_insert;
			this.pos = pos;
		}

		/** 
		 give <玩家>
		 
		 @param target
		*/
		public Target(Selector target)
		{
			this.target = target;
		}


		public Target(Selector target, Slot slot)
		{
			this(target, slot, null);
		}

		/**
		 replace entity <目标> <起始槽位> [<数量>]

		 @param target
		 @param slot
		 @param count
		 */
		public Target(Selector target, Slot slot, Integer count)
		{
			this.target = target;
			this.slot = slot;
			this.count = count;
		}

		/** 
		 replace block <位置> <起始槽位> [<数量>]
		 
		 @param pos
		 @param 
		*/

		public Target(Pos pos, Slot slot)
		{
			this(pos, slot, null);
		}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Target(Pos pos, Slot slot, System.Nullable<int> count = null)
		public Target(Pos pos, Slot slot, Integer count)
		{
			this.pos = pos;
			this.slot = slot;
			this.count = count;
		}

		@Override
		public String toString()
		{
			if (spawn_insert != null)
			{
				return spawn_insert.name() + " " + pos;
			}
			else if (slot != null)
			{
				if (pos != null)
				{
//C# TO JAVA CONVERTER TASK: Arithmetic operations involving nullable type instances are not converted to null-value logic:
					return "replace block " + pos + " " + slot + " " + (count == null ? "" : count + "");
				}
				else
				{
//C# TO JAVA CONVERTER TASK: Arithmetic operations involving nullable type instances are not converted to null-value logic:
					return "replace entity " + target + " " + slot + " " + (count == null ? "" : count + "");
				}
			}
			else
			{
				return "give " + target;
			}
		}
	}

	public static class Source
	{
		private ID loot_table;
		private Pos pos;
		private String tool;
		private Selector target;

		/** 
		 fish <loot_table> <位置> [<工具>|mainhand|offhand]
		 
		 @param loot_table
		 @param pos
		 @param tool
		*/
		public Source(ID loot_table, Pos pos, String tool)
		{
			this.loot_table = loot_table;
			this.pos = pos;
			this.tool = tool;
		}

		/** 
		 loot <loot_table>
		 
		 @param loot_table
		*/
		public Source(ID loot_table)
		{
			this.loot_table = loot_table;
		}

		/** 
		 kill <目标>
		 
		 @param target
		*/
		public Source(Selector target)
		{
			this.target = target;
		}

		/** 
		 mine <位置> [<工具>|mainhand|offhand]
		 
		 @param pos
		 @param tool
		*/
		public Source(Pos pos, String tool)
		{
			this.pos = pos;
			this.tool = tool;
		}

		@Override
		public String toString()
		{
			if (target != null)
			{
				return "kill " + target;
			}
			else if (loot_table != null)
			{
				if (pos != null)
				{
					return "fish " + loot_table + " " + pos + " " + tool;
				}
				else
				{
					return "loot " + loot_table;
				}
			}
			else
			{
				return "mine " + pos + " " + tool;
			}
		}
	}

	public Loot(Target target, Source source)
	{
		this.target = target;
		this.source = source;
	}

	@Override
	public String toString()
	{
		return "loot " + target + " " + source;
	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

/** 
 给予或剥夺（解锁或锁定）玩家的合成配方。
 <code>
 recipe (give|take) <targets> (<recipe>|*)
 </code>
*/
public class Recipe extends Command
{
	private gt give_take = gt.values()[0];
	private Selector targets;
	private ID recipe;

	public enum gt
	{
		give,
		take;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static gt forValue(int value)
		{
			return values()[value];
		}
	}

	public Recipe(gt give_take, Selector targets)
	{
		this(give_take, targets, null);
	}


	/**
	 recipe (give|take) <targets> (<recipe>|*)

	 @param give_take 若为give，则对玩家给予（解锁）指定的合成配方；若为take，则对玩家剥夺（锁定）指定的合成配方。
	 @param targets 指定给予或剥夺合成配方的对象。
	 @param recipe 合成配方的物品ID。若指定为null，则表示*，玩家会被给予或剥夺全部合成配方。
	 @exception ArgumentNotMatchException
	 */
	public Recipe(gt give_take, Selector targets, ID recipe)
	{
		this.give_take = give_take;
		this.targets = targets;
		if (recipe != null && recipe.isTag)
		{
			throw new ArgumentNotMatchException("参数错误: " + recipe + "。不应当为标签");
		}
		this.recipe = recipe;
	}

	@Override
	public String toString()
	{
		return "recipe " + give_take.name() + " " + targets + " " + (recipe == null ? "*" : recipe.toString());
	}
}

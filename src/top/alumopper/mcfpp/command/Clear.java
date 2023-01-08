package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.type.*;

import java.util.logging.Level;

/** 
 清除玩家物品栏的物品。
 <code>
 clear [<targets>] [<item>] [<maxCount>]
 </code>
*/
public class Clear extends Command
{
	private Selector targets;
	private ItemStack item;
	private int maxCount = -1;

	public Clear(Selector targets)
	{
		this.targets = targets;
	}

	public Clear(Selector targets, ItemStack item)
	{
		this.targets = targets;
		this.item = item;
	}

	public Clear(Selector targets, ItemStack item, int maxCount)
	{
		this.targets = targets;
		this.item = item;
		if (maxCount < 0)
		{
			Project.logger.log(Level.SEVERE, "maxCount(" + maxCount + ")必须为非负数");
			this.maxCount = 0;
		}
		else
		{
			this.maxCount = maxCount;
		}
	}

	@Override
	public String toString()
	{
		String re = "clear " + targets;
		if (item != null)
		{
			re += " " + item;
			if (maxCount != -1)
			{
				re += " " + maxCount;
			}
		}
		return re;
	}
}

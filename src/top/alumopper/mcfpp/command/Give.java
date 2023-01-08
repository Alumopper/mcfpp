package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 给予实体一种指定数量的物品。
 <code>
 give <target> <item> [<count>]
 </code>
*/
public class Give extends Command
{
	private Selector target;
	private ItemStack item;

	/** 
	 give <target> <item> [<count>]
	 
	 @param item 一个物品堆。物品堆中已经包含count有关信息
	*/
	public Give(Selector target, ItemStack item)
	{
		this.target = target;
		this.item = item;
	}

	@Override
	public String toString()
	{
		return "give " + target + " " + item;
	}


}

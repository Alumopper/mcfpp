package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;

/** 
 <code>
 xp add <targets> <amount> [levels|points]
 xp set <targets> <amount> [levels|points]
 xp query <targets> (levels|points)
 </code>
*/
public class Xp extends Command
{
	private String add_set;
	private Selector targets;
	private int amount;
	private String levels_points;
	private boolean qwq;

	public static List<String> lp = Arrays.asList("levels", "points");
	public static List<String> as = Arrays.asList("add", "set");

	/** 
	 xp (add|set) <targets> <amount> [levels|points]
	 
	 @exception ArgumentNotMatchException
	*/
	public Xp(String add_set, Selector targets, int amount, String levels_points)
	{
		if (!as.contains(add_set))
		{
			throw new ArgumentNotMatchException("参数错误:" + add_set + "。应当为\"add\"或\"set\"");
		}
		this.add_set = add_set;
		qwq = true;
		this.targets = targets;
		this.amount = amount;
		if (!lp.contains(levels_points))
		{
			throw new ArgumentNotMatchException("参数错误:" + levels_points + "。应当为\"levels\"或\"points\"");
		}
		this.levels_points = levels_points;
	}

	/** 
	 xp query <targets> (levels|points)
	 
	 @exception ArgumentNotMatchException
	*/
	public Xp(Selector targets, String levels_points)
	{
		qwq = false;
		this.targets = targets;
		if (!lp.contains(levels_points))
		{
			throw new ArgumentNotMatchException("参数错误:" + levels_points + "。应当为\"levels\"或\"points\"");
		}
		this.levels_points = levels_points;
	}

	@Override
	public String toString()
	{
		if (qwq)
		{
			return "xp " + add_set + " " + targets + " " + amount + " " + levels_points;
		}
		else
		{
			return "xp query " + targets + " " + levels_points;
		}
	}
}

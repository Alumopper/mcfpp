package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;

/** 
 <code>
 experience add <targets> <amount> [levels|points]
 experience set <targets> <amount> [levels|points]
 experience query <targets> (levels|points)
 </code>
*/
public class Experience extends Command
{
	private String add_set;
	private Selector targets;
	private int amount;
	private String levels_points;
	private boolean qwq;

	public static List<String> lp =  Arrays.asList("levels", "points");
	public static List<String> as = Arrays.asList("add", "set");

	/** 
	 experience (add|set) <targets> <amount> [levels|points]
	 
	 @exception ArgumentNotMatchException
	*/
	public Experience(String add_set, Selector targets, int amount, String levels_points) throws ArgumentNotMatchException {
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
	 experience query <targets> (levels|points)
	 
	 @exception ArgumentNotMatchException
	*/
	public Experience(Selector targets, String levels_points) throws ArgumentNotMatchException {
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
			return "experience " + add_set + " " + targets + " " + amount + " " + levels_points;
		}
		else
		{
			return "experience query " + targets + " " + levels_points;
		}
	}
}

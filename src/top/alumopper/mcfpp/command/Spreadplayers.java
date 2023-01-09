package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 把实体（如玩家、生物、物品等）随机传送到区域内地表的某个位置。
 <code>
 spreadplayers <pos2> <distance> <maxrange> [under maxheight] <considerteam> <target>
 </code>
*/
public class Spreadplayers extends Command
{
	private Pos2D pos2;
	private float distance;
	private float maxrange;
	private Float maxheight = null;
	private boolean considerteam;
	private Selector target;

	/** 
	 spreadplayers <pos2> <distance> <maxrange> under <maxheight> <considerteam> <target>
	 
	 @param pos2
	 @param distance
	 @param maxrange
	 @param maxheight
	 @param considerteam
	 @param target
	*/
	public Spreadplayers(Pos2D pos2, float distance, float maxrange, float maxheight, boolean considerteam, Selector target)
	{
		this.pos2 = pos2;
		this.distance = distance;
		this.maxrange = maxrange;
		this.maxheight = maxheight;
		this.considerteam = considerteam;
		this.target = target;
	}

	/** 
	 spreadplayers <pos2> <distance> <maxrange> <considerteam> <target>
	 
	 @param pos2
	 @param distance
	 @param maxrange
	 @param respectTeams
	 @param target
	*/
	public Spreadplayers(Pos2D pos2, float distance, float maxrange, boolean respectTeams, Selector target)
	{
		this.pos2 = pos2;
		this.distance = distance;
		this.maxrange = maxrange;
		this.considerteam = respectTeams;
		this.target = target;
	}

	@Override
	public String toString()
	{
		if (maxheight == null)
		{
			return "spreadplayers " + pos2.toString() + " " + String.valueOf(distance) + " " + String.valueOf(maxrange) + " " + String.valueOf(considerteam) + " " + target.toString();
		}
		else
		{
			return "spreadplayers " + pos2.toString() + " " + String.valueOf(distance) + " " + String.valueOf(maxrange) + " under " + maxheight.toString() + " " + String.valueOf(considerteam) + " " + target.toString();
		}
	}
}

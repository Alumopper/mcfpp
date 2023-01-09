package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
/** 
 此命令控制世界边界。
 <code>
 worldborder (add|set) <distance> [<time>]
 worldborder center <pos>
 worldborder get
 worldborder damage amount <float:damagePerBlock>
 worldborder damage buffer <double:distance>
 worldborder warning distance <int:distance>
 worldborder warning time <int:time>
 </code>
*/
public class Worldborder extends Command
{
	private As add_set = As.values()[0];
	private double distance;
	private int time;
	private Pos2D pos;
	private float damagePerBlock;
	private int type = 0;

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
	public enum dt
	{
		distance,
		time;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static dt forValue(int value)
		{
			return values()[value];
		}
	}


	public Worldborder(As add_set, double distance)
	{
		this(add_set, distance, 0);
	}

	/**
	 worldborder (add|set) <distance> [<time>]

	 @param add_set
	 @param distance
	 @param time
	 */
	public Worldborder(As add_set, double distance, int time)
	{
		this.add_set = add_set;
		this.distance = distance;
		this.time = time;
		type = 0;
	}

	/** 
	 worldborder center <pos>
	 
	 @param pos
	*/
	public Worldborder(Pos2D pos)
	{
		this.pos = pos;
		type = 1;
	}

	/** 
	 worldborder get
	*/
	public Worldborder()
	{
		type = 2;
	}

	/** 
	 worldborder damage amount <float:damagePerBlock>
	 
	 @param damagePerBlock
	*/
	public Worldborder(float damagePerBlock)
	{
		this.damagePerBlock = damagePerBlock;
		type = 3;
	}

	/** 
	 worldborder damage buffer <double:distance>
	 
	 @param distance
	*/
	public Worldborder(double distance)
	{
		this.distance = distance;
		type = 4;
	}

	/** 
	 worldborder warning distance <int:distance>
	 <p></p>
	 worldborder warning time <int:time>
	 
	 @param dt
	 @param value
	*/
	public Worldborder(dt dt, int value)
	{
		if (dt == dt.distance)
		{
			distance = value;
		}
		else
		{
			time = value;
		}
		type = 5;
	}

	@Override
	public String toString()
	{
		String re = "#worldborder qwq";
		switch (type)
		{
			case 0:
				re = "worldborder " + (add_set == As.add ? "add " : "set ") + distance + (time == 0 ? "" : " " + time);
				break;
			case 1:
				re = "worldborder center " + pos;
				break;
			case 2:
				re = "worldborder get";
				break;
			case 3:
				re = "worldborder damage amount " + damagePerBlock;
				break;
			case 4:
				re = "worldborder damage buffer " + distance;
				break;
			case 5:
				re = "worldborder warning " + (time == 0 ? "distance " : "time ") + (time == 0 ? distance : time);
				break;
		}
		return re;
	}
}

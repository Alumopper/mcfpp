package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.util.*;
import mcsharp.*;

/** 
 传送实体（玩家、生物等）到指定的地点，并修改其旋转角度。
 不像大多数只能影响已经生成的区块的命令，/tp。若被传送的目标是玩家，则传送后玩家所在的区块及附近的区块会自动开始生成。
 <code>
 tp <destination>
 tp <targets> <destination>
 tp <location>
 tp <targets> <location>
 tp <targets> <location> <rotation>
 tp <targets> <location> facing <facingLocation>
 tp <targets> <location> facing entity <facingEntity> [<facingAnchor>]
 </code>
*/
public class Tp extends Command
{
	private Selector targets;
	private Pos location;
	private Selector destination;
	private Rotation rotation;
	private Pos facingLocation;
	private Selector facingEntity;
	private ef facingAnchor = ef.values()[0];

	public enum ef
	{
		eyes,
		feet;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static ef forValue(int value)
		{
			return values()[value];
		}
	}

	/** 
	 tp <destination>
	 
	 @param destination
	*/
	public Tp(Selector destination)
	{
		this.destination = destination;
	}

	/** 
	 tp <targets> <destination>
	*/
	public Tp(Selector targets, Selector destination)
	{
		this.targets = targets;
		this.destination = destination;
	}

	/** 
	 tp <location>
	*/
	public Tp(Pos location)
	{
		this.location = location;
	}

	/** 
	 tp <targets> <location>
	 tp <targets> <location> <rotation>
	*/

	public Tp(Selector targets, Pos location)
	{
		this(targets, location, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Tp(Selector targets, Pos location, Rotation rotation = null)
	public Tp(Selector targets, Pos location, Rotation rotation)
	{
		this.targets = targets;
		this.location = location;
		this.rotation = rotation;
	}

	/** 
	 tp <targets> <location> facing <facingLocation>
	*/
	public Tp(Selector targets, Pos location, Pos facingLocation)
	{
		this.targets = targets;
		this.location = location;
		this.facingLocation = facingLocation;
	}

	/** 
	 tp <targets> <location> facing entity <facingEntity> [<facingAnchor>]
	*/

	public Tp(Selector targets, Pos location, Selector facingEntity)
	{
		this(targets, location, facingEntity, ef.eyes);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Tp(Selector targets, Pos location, Selector facingEntity, ef eyes_feet = ef.eyes)
	public Tp(Selector targets, Pos location, Selector facingEntity, ef eyes_feet)
	{
		this.targets = targets;
		this.location = location;
		this.facingEntity = facingEntity;
		this.facingAnchor = eyes_feet;
	}

	@Override
	public String toString()
	{
		if (targets == null)
		{
			if (destination != null)
			{
				return "tp " + destination;
			}
			else
			{
				return "tp " + location;
			}
		}
		else
		{
			if (destination != null)
			{
				return "tp " + targets + " " + destination;
			}
			else
			{
				if (rotation != null)
				{
					return "tp " + targets + " " + location + " " + rotation;
				}
				else if (facingLocation != null)
				{
					return "tp " + targets + " " + location + " facing " + facingLocation;
				}
				else if (facingEntity != null)
				{
					return "tp " + targets + " " + location + " facing entity " + facingEntity + " " + Tools.GetEnumString(facingAnchor);
				}
				else
				{
					return "tp " + targets + " " + location;
				}
			}
		}
	}
}

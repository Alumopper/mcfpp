package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 设置世界出生点。
 <code>
 setworldspawn [<pos>] [<angle>]
 </code>
*/
public class Setworldspawn extends Command
{
	private Pos pos;
	private Rotation angle;

	public Setworldspawn(Pos pos)
	{
		this(pos, null);
	}

	public Setworldspawn()
	{
		this(null, null);
	}

	/**
	 setworldspawn [<pos>] [<angle>]

	 @param pos 指定出生点的位置。
	 @param angle 指定出生点的朝向。
	 */

	public Setworldspawn(Pos pos, Rotation angle)
	{
		this.pos = pos;
		this.angle = angle;
	}

	@Override
	public String toString()
	{
		return "setworldspawn " + (pos == null ? "" : pos.toString()) + " " + (angle == null ? "" : angle.toString());
	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
/** 
 为特定玩家设置出生点，可在任意维度使用。
 <code>
 spawnpoint [<player>] [<pos>] [<angle>]
 </code>
*/
public class Spawnpoint extends Command
{
	private Selector player;
	private Pos pos;
	private Rotation angle;


	public Spawnpoint(Selector player, Pos pos)
	{
		this(player, pos, null);
	}

	public Spawnpoint(Selector player)
	{
		this(player, null, null);
	}

	public Spawnpoint()
	{
		this(null, null, null);
	}

	/**
	 spawnpoint [<player>] [<pos>] [<angle>]

	 @param player 指定玩家的名称。
	 @param pos 指定出生点的位置。
	 @param angle 指定出生点的朝向。
	 */
	public Spawnpoint(Selector player, Pos pos, Rotation angle)
	{
		this.player = player;
		this.pos = pos;
		this.angle = angle;
	}

	@Override
	public String toString()
	{
		return "spawnpoint " + (player == null ? "" : player.toString()) + " " + (pos == null ? "" : pos.toString()) + " " + (angle == null ? "" : angle.toString());
	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 使用此命令可以使得处于旁观模式的玩家进入另一个实体的视角。
 <code>
 spectate <target> [<player>]
 spectate
 </code>
*/
public class Spectate extends Command
{
	private Selector target;
	private Selector player;

	public Spectate(Selector target)
	{
		this(target, null);
	}

	/**
	 spectate <target> [<player>]
	 <p>
	 让一位玩家旁观另一个目标。
	 </p>

	 @param target 令玩家进入的旁观视角所属的目标。必须为单个实体或玩家。
	 @param player 必须为单个处于旁观模式的玩家。
	 */

	public Spectate(Selector target, Selector player)
	{
		this.target = target;
		this.player = player;
	}

	/** 
	 spectate
	 <p>
	 停止旁观实体。
	 </p>
	*/
	public Spectate()
	{
	}

	@Override
	public String toString()
	{
		if (target == null)
		{
			return "spectate";
		}
		else
		{
			return "spectate " + target.toString() + " " + (player == null ? "" : player.toString());
		}
	}
}

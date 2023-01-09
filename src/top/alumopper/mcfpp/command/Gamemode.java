package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;
/** 
 设置玩家的游戏模式
 gamemode (adventure|creative|spectator|survival) [<target>]
*/
public class Gamemode extends Command
{
	private Gamemodes mode = Gamemodes.values()[0];
	private Selector target;

	/** 
	 gamemode (adventure|creative|spectator|survival) [<target>]
	 
	 @exception ArgumentNotMatchException
	*/

	public Gamemode(Gamemodes gamemode)
	{
		this(gamemode, null);
	}

	public Gamemode(Gamemodes gamemode, Selector target)
	{
		mode = gamemode;
		this.target = target;
	}

	@Override
	public String toString()
	{
		return "gamemode " + mode.name() + (target == null ? "" : " " + target);
	}
}

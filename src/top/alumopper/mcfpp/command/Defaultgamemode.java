package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.Gamemodes;

/**
 设置新玩家进入服务器时默认的游戏模式（生存、创造等）。
 <code>
 defaultgamemode <mode>
 </code>
*/
public class Defaultgamemode extends Command
{
	private Gamemodes mode = Gamemodes.values()[0];

	/** 
	 defaultgamemode <mode>
	 
	 @param gamemode
	 */
	public Defaultgamemode(Gamemodes gamemode)
	{
		mode = gamemode;
	}

	@Override
	public String toString()
	{
		return "defaultgamemode " + mode.name();
	}
}

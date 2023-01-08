package top.alumopper.mcfpp.command;

import mcsharp.exception.*;
import top.alumopper.mcfpp.type.*;
import top.alumopper.mcfpp.type.commandarg.*;
import mcsharp.util.*;
import mcsharp.*;

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

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Gamemode(Gamemodes gamemode, Selector target = null)
	public Gamemode(Gamemodes gamemode, Selector target)
	{
		mode = gamemode;
		this.target = target;
	}

	@Override
	public String toString()
	{
		return "gamemode " + Tools.GetEnumString(mode) + (target == null ? "" : " " + target);
	}
}

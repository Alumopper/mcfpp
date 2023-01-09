package top.alumopper.mcfpp.command;


import top.alumopper.mcfpp.Project;

import java.util.logging.Level;
import java.util.regex.Pattern;

/**
 撤销玩家的管理员身份。
 <code>
 deop <player>
 </code>
*/
public class Deop extends Command
{
	private final String player;

	/** 
	 deop <player>
	 
	 @param player
	*/
	public Deop(String player)
	{
		if (!Pattern.matches( "^[a-zA-Z0-9_]+$", player))
		{
			Project.logger.warn( "非法的玩家名:" + player);
		}
		this.player = player;
	}

	@Override
	public String toString()
	{
		return "deop " + player;
	}
}

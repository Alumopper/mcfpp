package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.*;

/** 
 将一位玩家踢出服务器。
 kick <player> [reason]
*/
public class Kick extends Command
{
	private Selector player;
	private String reason;
	/** 
	 <code>
	 kick <player> [reason]
	 </code>
	*/

	public Kick(Selector player)
	{
		this(player, "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Kick(Selector player, String reason = "")
	public Kick(Selector player, String reason)
	{
		this.player = player;
		this.reason = reason;
	}

	@Override
	public String toString()
	{
		return "kick " + player + " " + reason;
	}
}

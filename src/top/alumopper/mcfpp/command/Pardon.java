package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.type.*;

import java.util.UUID;
import java.util.logging.Level;
import java.util.regex.Pattern;

/** 
 从黑名单上移除对象
 <code>
 pardon <player>
 </code>
*/
public class Pardon extends Command
{
	private String player;
	private UUID uuid;

	/** 
	 pardon <player>
	*/
	public Pardon(String player)
	{
		if (!Pattern.matches("^[a-zA-Z0-9_]+$",player))
		{
			Project.logger.error( "玩家名称只能包含数字字母或下划线");
		}
		this.player = player;
	}

	/** 
	 pardon <player>
	*/
	public Pardon(UUID uuid)
	{
		this.uuid = uuid;
	}

	@Override
	public String toString()
	{
		if (uuid == null)
		{
			return "pardon " + player;
		}
		else
		{
			return "pardon " + uuid;
		}
	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.type.*;

import java.util.UUID;
import java.util.logging.Level;
import java.util.regex.Pattern;

/** 
 将玩家列入黑名单
 <pre>
 {@code
 ban <playerid or uuid> [<reason…>]
 }
*/
public class Ban extends Command
{
	private String id;
	private UUID uuid = null;
	private String reason = null;

	/** 
	 ban <playerid> [<reason…>]
	*/
	public Ban(String id, String... reason)
	{
		this.id = id;
		if (!Pattern.matches("[a-zA-Z0-9_]*",id))
		{
			Project.logger.log(Level.WARNING, "玩家名称应该只包含数字或下划线:" + id);
		}
		if (reason.length != 0)
		{
			this.reason = reason[0];
			if (reason.length > 1)
			{
				Project.logger.log(Level.WARNING, "过多的参数:" + reason[1] + "等");
			}
		}
	}

	/** 
	 ban <uuid> [<reason…>]
	*/
	public Ban(UUID uuid, String... reason)
	{
		this.uuid = uuid;
		if (reason.length != 0)
		{
			this.reason = reason[0];
			if (reason.length > 1)
			{
				Project.logger.log(Level.WARNING, "过多的参数:" + reason[1] + "等");
			}
		}
	}

	@Override
	public String toString()
	{
		String re;
		if (uuid == null)
		{
			re = "ban " + id;
		}
		else
		{
			re = "ban " + uuid;
		}
		if (reason != null)
		{
			re += " " + reason;
		}
		return re;
	}
}

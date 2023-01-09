package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.type.*;

import java.util.logging.Level;

/** 
 向局域网开放单人游戏世界。
 <code>
 publish [<allowCommands>] [<gamemode>] [<port>]
 </code>
*/
public class Publish extends Command
{
	private boolean allowCommands;
	private Gamemodes gamemode = Gamemodes.values()[0];
	private Integer port = null;

	public Publish(boolean allowCommands, Gamemodes gamemode)
	{
		this(allowCommands, gamemode, null);
	}

	public Publish(boolean allowCommands)
	{
		this(allowCommands, Gamemodes.survival, null);
	}

	public Publish()
	{
		this(false, Gamemodes.survival, null);
	}

	/**
	 publish [<allowCommands>] [<gamemode>] [<port>]

	 @param allowCommands 是否允许作弊。
	 @param gamemode 新玩家进入世界后的默认游戏模式。
	 @param port 主机所在的端口，介于1024到65535。
	 */
	public Publish(boolean allowCommands, Gamemodes gamemode, Integer port)
	{
		this.allowCommands = allowCommands;
		this.gamemode = gamemode;
		if (port < 1024)
		{
			Project.logger.warn( "端口应介于1024和65535之间，实际为:" + port);
		}
		if (port > 65535)
		{
			Project.logger.warn( "端口应介于1024和65535之间，实际为:" + port);
		}
		this.port = port;
	}

	@Override
	public String toString()
	{
//C# TO JAVA CONVERTER TASK: Arithmetic operations involving nullable type instances are not converted to null-value logic:
		return "publish " + allowCommands + " " + gamemode.name() + " " + (port == null ? "" : (" " + port));
	}
}

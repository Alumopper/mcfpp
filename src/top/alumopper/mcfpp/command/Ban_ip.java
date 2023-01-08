package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;

import java.util.logging.Level;
import java.util.regex.Pattern;

/** 
 把一个IP地址加入黑名单
 <pre>
 {@code
 banip <playerid or ip> [<reason…>]
 }
*/
public class Ban_ip extends Command
{
	private String id = null;
	private String ip = null;
	private String reason = null;

	/** 
	 banip <playerid or ip> [<reason…>]
	*/
	public Ban_ip(String id_ip, String... reason)
	{
		if (Pattern.matches( "((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}",id_ip))
		{
			ip = id_ip;
		}
		else
		{
			this.id = id_ip;
			if (!Pattern.matches(id_ip, "[a-zA-Z0-9_]*"))
			{
				Project.logger.log(Level.WARNING, "玩家名称应该只包含数字或下划线:" + id);
			}
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

	@Override
	public String toString()
	{
		String re;
		if (ip == null)
		{
			re = "ban " + id;
		}
		else
		{
			re = "ban " + ip;
		}
		if (reason != null)
		{
			re += " " + reason;
		}
		return re;
	}
}

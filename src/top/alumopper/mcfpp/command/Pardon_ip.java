package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;

import java.util.regex.Pattern;

/**
 从黑名单上移除对象
 <code>
 pardon-ip <player>
 </code>
*/
public class Pardon_ip extends Command
{
	private String ip;

	/** 
	 pardon-ip <player>
	 
	 @exception ArgumentNotMatchException
	*/
	public Pardon_ip(String ip) throws ArgumentNotMatchException {
		if (!Pattern.matches("((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}",ip))
		{
			throw new ArgumentNotMatchException("无效的ip地址:" + ip);
		}
		this.ip = ip;
	}

	@Override
	public String toString()
	{
		return "pardon-ip " + ip;
	}
}

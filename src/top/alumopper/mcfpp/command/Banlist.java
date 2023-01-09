package top.alumopper.mcfpp.command;


import top.alumopper.mcfpp.exception.ArgumentNotMatchException;

import java.util.Arrays;
import java.util.List;

/**
 显示服务器的黑名单
 <pre>
 {@code
 banlist ips
 banlist players
 }
*/
public class Banlist extends Command
{
	private String a;

	private static List<String> ip = Arrays.asList("ips", "players");

	/** 
	 banlist (ips|players)
	*/
	public Banlist(String ips_players) throws ArgumentNotMatchException {
		if (!ip.contains(ips_players))
		{
			throw new ArgumentNotMatchException("参数错误:" + ips_players + "应当为\"ips\"或\"players\"");
		}
		a = ips_players;
	}

	@Override
	public String toString()
	{
		return "banlist " + a;
	}
}

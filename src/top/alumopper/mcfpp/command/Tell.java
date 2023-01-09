package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 将一条私聊消息发送给一个或多个玩家。
 <code>
 tell <target> <message>
 </code>
*/
public class Tell extends Command
{
	private Selector targets;
	private String message;

	/** 
	 tell <target> <message>
	*/
	public Tell(Selector targets, String message)
	{
		this.targets = targets;
		this.message = message;
	}

	@Override
	public String toString()
	{
		return "tell " + targets + " " + message;

	}
}

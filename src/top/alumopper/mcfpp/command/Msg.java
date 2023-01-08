package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 将一条私聊消息发送给一个或多个玩家。
 <code>
 msg <target> <message>
 </code>
*/
public class Msg extends Command
{
	private Selector targets;
	private String message;

	/** 
	 msg <target> <message>
	*/
	public Msg(Selector targets, String message)
	{
		this.targets = targets;
		this.message = message;
	}

	@Override
	public String toString()
	{
		return "msg " + targets + " " + message;

	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.*;

/** 
 将一条私聊消息发送给一个或多个玩家。
 <code>
 w <target> <message>
 </code>
*/
public class W extends Command
{
	private Selector targets;
	private String message;

	/** 
	 w <target> <message>
	*/
	public W(Selector targets, String message)
	{
		this.targets = targets;
		this.message = message;
	}

	@Override
	public String toString()
	{
		return "w " + targets + " " + message;

	}
}

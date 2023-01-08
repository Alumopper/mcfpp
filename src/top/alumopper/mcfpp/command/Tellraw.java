package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.*;

/** 
 向一个或多个玩家发送一条JSON文本消息。
*/
public class Tellraw extends Command
{
	private Selector targets;
	private JsonText message;

	/** 
	 tellraw <target> <message>
	*/
	public Tellraw(Selector targets, JsonText message)
	{
		this.targets = targets;
		this.message = message;
	}

	@Override
	public String toString()
	{
		return "tellraw " + targets + " " + message;
	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.*;

/** 
 给予一位玩家管理员身份。
 <code>
 op <player>
 </code>
*/
public class Op extends Command
{
	private Selector player;

	/** 
	 op <player>
	*/
	public Op(Selector player)
	{
		this.player = player;
	}

	@Override
	public String toString()
	{
		return "op " + player;
	}
}

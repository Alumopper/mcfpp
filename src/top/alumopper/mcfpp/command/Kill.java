package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 杀死/清除实体（玩家、生物等）
 <code>
 kill [<targets>]
 </code>
*/
public class Kill extends Command
{
	private Selector targets;


	public Kill()
	{
		this(null);
	}

	/**
	 kill [<targets>]

	 @param targets
	 */
	public Kill(Selector targets)
	{
		this.targets = targets;
	}

	@Override
	public String toString()
	{
		return "kill" + (targets == null ? "" : (" " + targets));
	}
}

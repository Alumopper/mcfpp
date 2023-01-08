package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.*;

/** 
 杀死/清除实体（玩家、生物等）
 <code>
 kill [<targets>]
 </code>
*/
public class Kill extends Command
{
	private Selector targets;

	/** 
	 kill [<targets>]
	 
	 @param targets
	*/

	public Kill()
	{
		this(null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Kill(Selector targets = null)
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

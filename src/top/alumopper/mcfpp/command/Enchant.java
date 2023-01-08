package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.type.*;

import java.util.logging.Level;

/**
 为一个实体手持的物品添加魔咒。受限于铁砧机制。
 <code>
 enchant <target> <id> [<level>]
 </code>
*/
public class Enchant extends Command
{
	private Selector target;
	private ID id;
	private int level = 1;

	/** 
	 enchant <target> <id> [<level>]
	*/

	public Enchant(Selector target, ID id)
	{
		this(target, id, 1);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Enchant(Selector target, ID id,int level = 1)
	public Enchant(Selector target, ID id, int level)
	{
		this.target = target;
		this.id = id;
		if (level < 1)
		{
			level = 1;
			Project.logger.log(Level.WARNING, "level应当至少为1，但是传入了" + level);
		}
		this.level = level;
	}

	@Override
	public String toString()
	{
		return "enchant " + target + " " + id + " " + level;
	}
}

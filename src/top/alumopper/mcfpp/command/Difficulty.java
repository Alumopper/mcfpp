package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.Difficulties;

/** 
 设定难度等级（和平、简单等）。
 <code>
 difficulty [easy|hard|normal|peaceful]
 </code>
*/
public class Difficulty extends Command
{
	private Difficulties difficulties = null;

	/** 
	 difficulty [easy|hard|normal|peaceful]
	*/

	public Difficulty()
	{
		this(null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Difficulty(System.Nullable<Difficulties> difficulties = null)
	public Difficulty(Difficulties difficulties)
	{
		this.difficulties = difficulties;
	}

	@Override
	public String toString()
	{
		return "difficulty" + (difficulties == null ? "" : (" " + difficulties.name()));
	}
}

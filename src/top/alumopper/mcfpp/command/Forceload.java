package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;

/** 
 强制使区块不断加载
 <code>
 forceload add <from> [<to>]
 forceload remove <from> [<to>]
 forceload remove all
 forceload query [<pos>]
 </code>
*/
public class Forceload extends Command
{
	private String add_remove;
	private Pos from;
	private Pos to;
	private Pos pos;
	private boolean qwq;

	private static List<String> ar = Arrays.asList("add", "remove");

	/** 
	 forceload （add|remove) <from> [<to>]
	 
	 @exception ArgumentNotMatchException
	*/
	public Forceload(String add_remove, Pos from, Pos to) throws ArgumentNotMatchException {
		if (!ar.contains(add_remove))
		{
			throw new ArgumentNotMatchException("参数错误:" + add_remove + "。应当为\"add\"或\"remove\"");
		}
		this.add_remove = add_remove;
		this.from = from;
		this.to = to;
	}

	/** 
	 forceload query [<pos>]
	*/

	public Forceload(String query)
	{
		this(query, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Forceload(String query, Pos pos = null)
	public Forceload(String query, Pos pos)
	{
		this.pos = pos;
	}

	/** 
	 forceload remove all
	*/
	public Forceload()
	{
		qwq = true;
	}

	@Override
	public String toString()
	{
		if (from != null)
		{
			return "forceload " + add_remove + " " + from + (to == null ? "" : (" " + to));
		}
		else if (qwq)
		{
			return "forceload remove all";
		}
		else
		{
			return "forceload query" + (pos == null ? "" : " " + pos);
		}
	}
}

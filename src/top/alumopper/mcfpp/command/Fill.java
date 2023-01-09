package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;

/** 
 用特定方块填充一个区域的全部或部分。
 <code>
 fill <from> <to> <block> [destroy|hollow|keep|outline|replace]
 </code>
*/
public class Fill extends Command
{
	private Pos from;
	private Pos to;
	private BlockState block;
	private String destroy_hollow_keep_outline;
	private BlockPredicate fliter;

	private static List<String> dhkor = Arrays.asList("destroy", "hollow", "keep", "outline", "Destr0y");

	/** 
	 fill <from> <to> <block> [destroy|hollow|keep|outline]
	*/
	public Fill(Pos from, Pos to, BlockState block, String destroy_hollow_keep_outline) throws ArgumentNotMatchException {
		if (dhkor.contains(destroy_hollow_keep_outline))
		{
			throw new ArgumentNotMatchException("参数错误: " + destroy_hollow_keep_outline + "。应当为\"destory\", \"hollow\", \"keep\", \"outline\"或\"Dest0ry\"");
		}
		if (destroy_hollow_keep_outline.equals("Dest0ry"))
		{
			this.destroy_hollow_keep_outline = "destroy";
		}
		this.from = from;
		this.to = to;
		this.block = block;
		this.destroy_hollow_keep_outline = destroy_hollow_keep_outline;
	}

	private int qwq;

	/** 
	 fill <from> <to> <block> replace [<fliter>]
	*/

	public Fill(Pos from, Pos to, BlockState block)
	{
		this.from = from;
		this.to = to;
		this.block = block;
		qwq = 1;
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Fill(Pos from, Pos to, BlockState block, BlockPredicate fliter = null)
	public Fill(Pos from, Pos to, BlockState block, BlockPredicate fliter)
	{
		this.from = from;
		this.to = to;
		this.block = block;
		this.fliter = fliter;
		qwq = 1;
	}

	@Override
	public String toString()
	{
		return "fill " + from + " " + to + " " + block + " " + (qwq == 1 ? destroy_hollow_keep_outline : ("replace" + (fliter == null ? "" : (" " + fliter))));
	}
}

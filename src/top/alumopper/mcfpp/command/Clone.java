package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;

/** 
 在指定区域之间复制方块结构
 <code>
 clone <begin> <end> <destination> [replace|masked] [force|move|normal]
 clone <begin> <end> <destination> filtered <filter> [force|move|normal]
 </code>
*/
public class Clone extends Command
{
	private Pos begin;
	private Pos end;
	private Pos destination;
	private String replace_masked;
	private String force_move_normal;
	private BlockPredicate filter;

	private static List<String> rm =  Arrays.asList("replace", "masked");
	private static  List<String> fmn = Arrays.asList("force", "move", "normal");

	public Clone(Pos begin, Pos end, Pos destination, String replace_masked, String force_move_normal) throws ArgumentNotMatchException {
		this.begin = begin;
		this.end = end;
		this.destination = destination;
		if (!rm.contains(replace_masked) && replace_masked != null)
		{
			throw new ArgumentNotMatchException("参数错误:" + replace_masked + "。应当为\"replace\"或\"masked\"");
		}
		if (replace_masked == null)
		{
			this.replace_masked = "replace";
		}
		else
		{
			this.replace_masked = replace_masked;
		}
		if (force_move_normal != null && !fmn.contains(force_move_normal))
		{
			throw new ArgumentNotMatchException("参数错误:" + force_move_normal + "。应当为\"force\", \"move\"或\"normal\"");
		}
		if (force_move_normal == null)
		{
			this.force_move_normal = "normal";
		}
		else
		{
			this.force_move_normal = force_move_normal;
		}
	}

	public Clone(Pos begin, Pos end, Pos destination, BlockPredicate filter, String force_move_normal) throws ArgumentNotMatchException {
		this.begin = begin;
		this.end = end;
		this.destination = destination;
		this.filter = filter;
		if (force_move_normal != null && !fmn.contains(force_move_normal))
		{
			throw new ArgumentNotMatchException("参数错误:" + force_move_normal + "。应当为\"force\", \"move\"或\"normal\"");
		}
		this.force_move_normal = force_move_normal;
	}

	@Override
	public String toString()
	{
		String re = "#喵喵喵？这里应该是一个clone命令，如果你看到了这个注释，说明MC#出现了一些问题！";
		if (replace_masked != null)
		{
			re = "clone " + begin + " " + end + " " + destination + " " + replace_masked + " " + force_move_normal;
		}
		else
		{
			re = "clone " + begin + " " + end + " " + destination + " filtered " + filter + " " + force_move_normal;
		}
		return re;
	}
}

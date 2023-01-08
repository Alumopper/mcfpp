package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.logging.Level;

/** 
 控制数据包的加载/卸载。
 <pre>
 {@code
 datapack disable <name>
 datapack enable <name>
 datapack enable <name> (first|last)
 datapack enable <name> (before|after) <existing>
 datapack list [available | enabled]
 }
*/
public class Datapack extends Command
{
	private String arg1;
	private String arg2;
	private String arg3;
	private String arg4;
	private int count = 0;
	/** 
	 <code>
	 datapack disable <name>
	 datapack enable <name>
	 datapack enable <name> (first|last)
	 datapack enable <name> (before|after) <existing>
	 datapack list [available | enabled]
	 </code>
	*/
	public Datapack(String... args) throws ArgumentNotMatchException {

		if (args.length >= 2)
		{
			if (args[0].equals("disable"))
			{
				if (!ID.IsLegal(args[1]))
				{
					throw new ArgumentNotMatchException("非法的命名空间:" + args[1]);
				}
				arg1 = args[0];
				arg2 = args[1];
				count = 2;
				if (args.length > 2)
				{
					Project.logger.log(Level.WARNING, "过多的参数:" + args[2] + "等");
				}
			}
			else if (args[0].equals("enable"))
			{
				if (!ID.IsLegal(args[1]))
				{
					throw new ArgumentNotMatchException("非法的命名空间:" + args[1]);
				}
				arg1 = args[0];
				arg2 = args[1];
				if (args.length == 3)
				{
					if (args[2].equals("first") || args[2].equals("last"))
					{
						arg3 = args[2];
					}
					else
					{
						throw new ArgumentNotMatchException("参数错误:" + args[2] + "。应为\"first\"或\"last\"");
					}
					count = 3;
				}
				else if (args.length == 4)
				{
					if (args[2].equals("before") || args[2].equals("after"))
					{
						arg3 = args[2];
					}
					else
					{
						throw new ArgumentNotMatchException("参数错误:" + args[2] + "。应为\"before\"或\"after\"");
					}
					if (!ID.IsLegal(args[3]))
					{
						throw new ArgumentNotMatchException("非法的命名空间:" + args[3]);
					}
					arg4 = args[3];
					count = 4;
				}
			}
			else if (args[0].equals("list"))
			{
				arg1 = args[0];
				if (args[1].equals("available") || args[1].equals("enabled"))
				{
					arg2 = args[1];
				}
				else
				{
					throw new ArgumentNotMatchException("参数错误:" + args[1] + "。应为\"available\"或\"enabled\"");
				}
				count = 2;
			}
			else
			{
				throw new ArgumentNotMatchException("参数错误:" + args[0] + "。应为\"disable\", \"enable\"或\"list\"");
			}
		}
		else if (args.length == 1)
		{
			if (args[0].equals("list"))
			{
				arg1 = args[0];
				count = 1;
			}
			else
			{
				throw new ArgumentNotMatchException("参数错误:" + args[0] + "。应为\"disable\", \"enable\"或\"list\"");
			}
		}
		else
		{
			throw new ArgumentNotMatchException("参数错误: 至少需要1个参数, 实际得到" + args.length + "个");
		}
	}

	@Override
	public String toString()
	{
		String re = "#喵喵喵？这里应该是一个datapack命令，如果你看到了这个注释，说明MC#出现了一些问题！";
		switch (count) {
			case 1 -> re = "datapack " + arg1;
			case 2 -> re = "datapack " + arg1 + " " + arg2;
			case 3 -> re = "datapack " + arg1 + " " + arg2 + " " + arg3;
			case 4 -> re = "datapack " + arg1 + " " + arg2 + " " + arg3 + " " + arg4;
		}
		return re;
	}
}

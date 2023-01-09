package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * {@code data}命令允许执行者获取、合并、修改或是移除方块、实体或命令存储的NBT数据。
 * <br>
 * /data有四个子命令（get，merge，modify，remove）。
 * <pre>
 * {@code
 * data ...
 * ... get (block <targetPos>|entity <target>|storage <target>) [<path>] [<scale>]
 * 获取指定NBT的值。
 * ... merge (block <targetPos>|entity <target>|storage <target>) <nbt>
 * 将指定NBT与<nbt> 合并。
 * ... modify (block <targetPos>|entity <target>|storage <target>) <targetPath> ...
 * 修改指定NBT...
 * ...append...
 * ...在列表最后插入一个值...
 * ...insert <index>...
 * ...在列表指定位置插入一个值...
 * ...merge...
 * ...将指定的复合NBT与另一个值合并...
 * ...prepend...
 * ...在列表最前面插入一个值...
 * ...set...
 * ...将NBT覆盖为新的值...
 * ...from(block <sourcePos>|entity <source>|storage <source>) [<sourcePath>]
 * ...使用指定的方块、实体、或存储的指定NBT。
 * ... value <value>
 * ...使用 <value>。
 * ... remove(block <targetPos>|entity <target>|storage <target>) <path>
 * 删除指定NBT。
 * }
 * </pre>
*/
public class Data extends Command
{
	private final IDataArg target;
	private String path;
	private Double scale = null;
	private NBTTag nbt;
	private String targetPath;
	private String append_prepend_merge_set;
	private NBTTag value;
	private String sourcePath;
	private IDataArg source;
	private int index;
	private final int type;

	private static List<String> amps =  Arrays.asList("append", "prepend", "merge", "set");

	public Data(IDataArg target, String path, Double scale)
	{
		this.target = target;
		this.path = path;
		this.scale = scale;
		this.type = 0;
	}

	/** 
	 data merge <block:targetPos> <nbt>
	 
	 type - 3
	*/
	public Data(IDataArg target, NBTTag nbt)
	{
		this.target = target;
		this.nbt = nbt;
		type = 3;
	}

	/** 
	 data modify block <targetPos> <targetPath> (append|prepend|merge|set) from block <sourcePos> [<sourcepath>]
	 
	 type - 6
	 */
	public Data(IDataArg target, String targetPath, String append_prepend_merge_set, IDataArg source, String sourcePath) throws ArgumentNotMatchException {
		this.target = target;
		this.targetPath = targetPath;
		if (!amps.contains(append_prepend_merge_set))
		{
			throw new ArgumentNotMatchException("参数错误:" + append_prepend_merge_set + "。应当为\"append\", \"merge\", \"prepend\"或\"set\"");
		}
		this.append_prepend_merge_set = append_prepend_merge_set;
		this.source = source;
		this.sourcePath = sourcePath;
		type = 6;
	}

	/** 
	 data modify block <targetPos> <targetPath> (append|prepend|merge|set) value <value>
	 
	 type - 15
	*/
	public Data(IDataArg target, String targetPath, String append_prepend_merge_set, NBTTag value) throws ArgumentNotMatchException {
		this.target = target;
		this.targetPath = targetPath;
		if (!amps.contains(append_prepend_merge_set))
		{
			throw new ArgumentNotMatchException("参数错误:" + append_prepend_merge_set + "。应当为\"append\", \"merge\", \"prepend\"或\"set\"");
		}
		this.append_prepend_merge_set = append_prepend_merge_set;
		this.value = value;
		type = 15;
	}

	/** 
	 data modify block <targetPos> <targetPath> insert <index> from block <sourcePos> [<sourcepath>]
	 
	 type - 18
	*/
	public Data(IDataArg target, String targetPath, int index, IDataArg source, String sourcePath)
	{
		this.target = target;
		this.targetPath = targetPath;
		this.index = index;
		this.source = source;
		this.sourcePath = sourcePath;
		type = 18;
	}

	/** 
	 data modify block <targetPos> <targetPath> insert <index> value <value>
	 
	 type - 27
	*/
	public Data(IDataArg target, String targetPath, int index, NBTTag value)
	{
		this.target = target;
		this.targetPath = targetPath;
		this.index = index;
		this.value = value;
		type = 27;
	}
	/** 
	 data remove block <targetPos> <path>
	 
	 type - 30
	*/
	public Data(IDataArg target, String path)
	{
		this.target = target;
		this.path = path;
		type = 30;
	}

	@Override
	public String toString()
	{
		String re = "#喵喵喵？这里应该是一个data命令，如果你看到了这个注释，说明MC#出现了一些问题！";
		switch (type) {
			case 0 -> {
				//data get block <:targetPos> [<path>] [<scale>]
				re = "data get " + getTypeString(target) + " " + target.DataCmdStr() + " " + (path == null ? "" : (path + " ")) + (scale == null ? "" : (scale + " "));
				break;
			}

			case 3 -> {
				//data merge <block:targetPos> <nbt>
				re = "data merge " + getTypeString(target) + " " + target.DataCmdStr() + " " + nbt.getValueString();
				break;
			}

			case 6 -> {
				//data modify block <targetPos> <targetPath> (append|merge|prepend|set) from block <sourcePos> [<sourcepath>]
				re = "data modify " + getTypeString(target) + " " + target.DataCmdStr() + " " + targetPath + " " + append_prepend_merge_set + " from " + getTypeString(source) + " " + source.DataCmdStr() + " " + sourcePath;
				break;
			}
			case 15 -> {
				//data modify block <targetPos> <targetPath> (append|merge|prepend|set) value <value>
				re = "data modify " + getTypeString(target) + " " + target.DataCmdStr() + " " + targetPath + " " + append_prepend_merge_set + " value " + value.getValueString();
				break;
			}
			case 18 -> {
				//data modify block <targetPos> <targetPath> insert <index> value <value> from block <sourcePos> [<sourcepath>]
				re = "data modify " + getTypeString(target) + " " + target.DataCmdStr() + " " + targetPath + " insert " + index + " from " + getTypeString(source) + " " + source.DataCmdStr() + " " + sourcePath;
				break;
			}
			case 27 -> {
				//data modify entity <target> <targetPath> insert <index> value <value>
				re = "data modify " + getTypeString(target) + " " + target.DataCmdStr() + " " + targetPath + " insert " + index + " value " + value.getValueString();
				break;
			}

			case 30 -> {
				//data remove block <targetPos> <path>
				re = "data remove " + getTypeString(target) + " " + target.DataCmdStr() + " " + path;
				break;
			}
		}
		return re;
	}

	private static String getTypeString(Object o)
	{
		if (o instanceof Pos)
		{
			return "block";
		}
		else if (o instanceof Selector)
		{
			return "entity";
		}
		else if (o instanceof Objects)
		{
			return "storage";
		}
		else
		{
			return null;
		}
	}
}

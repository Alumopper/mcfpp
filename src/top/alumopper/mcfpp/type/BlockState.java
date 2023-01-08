package top.alumopper.mcfpp.type;

import mcsharp.exception.*;
import mcsharp.*;
import mcsharp.type.*;

/** 
 代表某类方块状态的判据。
 精确匹配某种方块状态，或者包含指定NBT的方块实体NBT。不能使用标签。
 <p>一些例子</p>
 <list type="bullet">
 <item>stone</item>
 <item>minecraft:stone</item>
 <item>stone[foo=bar]</item>
 <item>foo{bar:baz}</item>
 </list>
 注意，例子中使用的方块状态，方块id或者方块nbt并不一定是游戏中实际存在的，仅用于格式参考。
*/
public class BlockState
{
	/** 
	 能直接被Minecraft解析的方块状态。
	*/
	public String pre;

	//todo
	public NBTTag nbt;

	public BlockState(String pre, NBTTag nbt)
	{
		if (!Regex.IsMatch(pre, "^([a-z0-9_]+|([a-z0-9_]+[:][a-z0-9_]+))+([\\[][a-z0-9_]+[=][a-z0-9_]+[\\]])*$"))
		{
			throw new IllegalFormatException("无法解析字符串" + pre + "为方块状态");
		}
		this.pre = pre;
		this.nbt = nbt;
	}

	@Override
	public String toString()
	{
		return pre + "{" + nbt + "}";
	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import top.alumopper.mcfpp.type.commandarg.*;
import mcsharp.util.*;
import mcsharp.*;

/** 
 将指定位置的方块更改为另一个方块。
 <code>
 setblock <pos> <block> [destroy|keep|replace]
 </code>
*/
public class Setblock extends Command
{
	private Pos pos;
	private BlockState block;
	private dkr destroy_keep_replace = dkr.values()[0];

	public enum dkr
	{
		destory,
		keep,
		replace;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static dkr forValue(int value)
		{
			return values()[value];
		}
	}

	/** 
	 setblock <pos> <block> [destroy|keep|replace]
	 
	 @param pos 指定要被更改方块的位置。
	 @param block 指定更改后的新方块。
	 @param destroy_keep_replace 指定方块更改的处理方式，必须为以下其中之一：destroy — 原方块正常掉落物品（类似于被一个玩家破坏），并播放方块被破坏的音效。keep — 仅当原方块是空气方块时才进行更改。replace — 原方块不掉落物品，且不播放方块被破坏的音效。
	*/

	public Setblock(Pos pos, BlockState block)
	{
		this(pos, block, dkr.replace);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Setblock(Pos pos, BlockState block, dkr destroy_keep_replace = dkr.replace)
	public Setblock(Pos pos, BlockState block, dkr destroy_keep_replace)
	{
		this.pos = pos;
		this.block = block;
		this.destroy_keep_replace = destroy_keep_replace;
	}

	@Override
	public String toString()
	{
		return "setblock " + pos + " " + block + " " + Tools.GetEnumString(destroy_keep_replace);
	}

}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 召唤一个实体（生物、弹射物、物品、载具等）。
 <code>
 summon <entity> [<pos>] [<nbt>]
 </code>
*/
public class Summon extends Command
{
	private ID entity;
	private Pos pos;
	private NBTTag nbt;

	public Summon(ID entity, Pos pos)
	{
		this(entity, pos, null);
	}

	public Summon(ID entity)
	{
		this(entity, null, null);
	}


	/**
	 summon <entity> [<pos>] [<nbt>]

	 @param entity 指定实体的名称。
	 @param pos 指定实体的位置。
	 @param nbt 指定实体的NBT数据。
	 */
	public Summon(ID entity, Pos pos, NBTTag nbt)
	{
		this.entity = entity;
		this.pos = pos;
		this.nbt = nbt;
	}

	@Override
	public String toString()
	{
		return "summon " + entity.toString() + " " + (pos == null ? "" : pos.toString()) + " " + (nbt == null ? "" : nbt.toString());
	}
}

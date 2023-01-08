package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTLongArray extends NBTArray<Long>
{
	public NBTLongArray(String name)
	{
		super(name);
	}

	public NBTLongArray()
	{
		super();
	}

	@Override
	public void setValue(Object value)
	{
		boolean tempVar = value instanceof List<NBTSingle<Long>>;
		List<NBTSingle<Long>> value1 = tempVar ? (List<NBTSingle<Long>>)value : null;
		if (tempVar)
		{
			this.value = value1;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型List<long>:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		String s = "[L;";
		for (long nbt : value)
		{
			s += nbt + ",";
		}
		s = tangible.StringHelper.trimEnd(s, ',');
		s += "]";
		return s;
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTLongArray tempVar = new NBTLongArray(funcname + "temp");
		tempVar.setValue(this);
		return tempVar;
	}
}

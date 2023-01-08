package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTIntArray extends NBTArray<Integer>
{
	public NBTIntArray(String name)
	{
		super(name);
	}

	public NBTIntArray()
	{
		super();
	}

	@Override
	public void setValue(Object value)
	{
		boolean tempVar = value instanceof List<NBTSingle<Integer>>;
		List<NBTSingle<Integer>> value1 = tempVar ? (List<NBTSingle<Integer>>)value : null;
		if (tempVar)
		{
			this.value = value1;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型List<int>:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		String s = "[I;";
		for (int nbt : value)
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
		NBTIntArray tempVar = new NBTIntArray(funcname + "temp");
		tempVar.setValue(this);
		return tempVar;
	}
}

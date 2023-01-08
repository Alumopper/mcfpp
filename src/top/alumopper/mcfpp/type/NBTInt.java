package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTInt extends NBTSingle<Integer>
{
	public NBTInt(int value)
	{
		super(value);
	}

	public NBTInt(String name, int value)
	{
		super(name, value);
	}

	public NBTInt(String name, int value, IDataArg container)
	{
		super(name, value, container);
	}

	@Override
	public Object getValue()
	{
		return value;
	}
	@Override
	public void setValue(Object value)
	{
		boolean tempVar = value instanceof Integer;
		Integer value2 = tempVar ? (Integer)value : null;
		if (tempVar)
		{
			this.value = value2;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型int:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		return String.valueOf(value);
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTInt tempVar = new NBTInt(funcname + "temp", 0);
		tempVar.setValue(this);
		return tempVar;
	}
}

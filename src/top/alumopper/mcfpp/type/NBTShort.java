package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTShort extends NBTSingle<Short>
{
	public NBTShort(short value)
	{
		super(value);
	}

	public NBTShort(String name, short value)
	{
		super(name, value);
	}

	public NBTShort(String name, short value, IDataArg container)
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
		boolean tempVar = value instanceof Short;
		Short value2 = tempVar ? (Short)value : null;
		if (tempVar)
		{
			this.value = value2;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型short:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		return value + "s";
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTShort tempVar = new NBTShort(funcname + "temp", (short)0);
		tempVar.setValue(this);
		return tempVar;
	}
}

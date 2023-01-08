package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTLong extends NBTSingle<Long>
{
	public NBTLong(long value)
	{
		super(value);
	}

	public NBTLong(String name, long value)
	{
		super(name, value);
	}

	public NBTLong(String name, long value, IDataArg container)
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
		boolean tempVar = value instanceof Long;
		Long value2 = tempVar ? (Long)value : null;
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
		return value + "L";
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTLong tempVar = new NBTLong(funcname + "temp", 0);
		tempVar.setValue(this);
		return tempVar;
	}
}

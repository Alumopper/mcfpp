package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTFloat extends NBTSingle<Float>
{
	public NBTFloat(float value)
	{
		super(value);
	}

	public NBTFloat(String name, float value)
	{
		super(name, value);
	}

	public NBTFloat(String name, float value, IDataArg container)
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
		boolean tempVar = value instanceof Float;
		Float value2 = tempVar ? (Float)value : null;
		if (tempVar)
		{
			this.value = value2;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型float:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		return value + "f";
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTFloat tempVar = new NBTFloat(funcname + "temp", 0);
		tempVar.setValue(this);
		return tempVar;
	}
}

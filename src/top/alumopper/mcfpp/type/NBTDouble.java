package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTDouble extends NBTSingle<Double>
{
	public NBTDouble(double value)
	{
		super(value);
	}

	public NBTDouble(String name, double value)
	{
		super(name, value);
	}

	public NBTDouble(String name, double value, IDataArg container)
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
		boolean tempVar = value instanceof Double;
		double value2 = tempVar ? (Double)value : null;
		if (tempVar)
		{
			this.value = value2;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型double:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		return value + "d";
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTDouble tempVar = new NBTDouble(funcname + "temp", 0);
		tempVar.setValue(this);
		return tempVar;
	}
}

package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTBool extends NBTSingle<Boolean>
{
	public NBTBool(boolean value)
	{
		super(value);
	}

	public NBTBool(String name, boolean value)
	{
		super(name, value);
	}

	public NBTBool(String name, boolean value, IDataArg container)
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
		boolean tempVar = value instanceof Boolean;
		boolean value2 = tempVar ? (Boolean)value : null;
		if (tempVar)
		{
			this.value = value2;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型bool:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		return value ? "true" : "false";
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTBool tempVar = new NBTBool(funcname + "temp", false);
		tempVar.setValue(this);
		return tempVar;
	}
}

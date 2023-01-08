package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTString extends NBTSingle<String>
{
	public NBTString(String value)
	{
		super(value);
	}

	public NBTString(String name, String value)
	{
		super(name, value);
	}

	public NBTString(String name, String value, IDataArg container)
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
		boolean tempVar = value instanceof String;
		String value2 = tempVar ? (String)value : null;
		if (tempVar)
		{
			this.value = value2;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型string:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		return "\"" + value + "\"";
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTString tempVar = new NBTString(funcname + "temp", "");
		tempVar.setValue(this);
		return tempVar;
	}

	@Override
	public NBTTag CreateDynamic(String name)
	{
		return new NBTString(name);
	}
}

package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public class NBTByte : NBTSingle<byte>
public class NBTByte extends NBTSingle<Byte>
{
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public NBTByte(byte value)
	public NBTByte(byte value)
	{
		super(value);
	}

//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public NBTByte(String name, byte value)
	public NBTByte(String name, byte value)
	{
		super(name, value);
	}

//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public NBTByte(String name, byte value, IDataArg container)
	public NBTByte(String name, byte value, IDataArg container)
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
		boolean tempVar = value instanceof Byte;
		byte value2 = tempVar ? (Byte)value : null;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: if (value is byte value2)
		if (tempVar)
		{
			this.value = value2;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型byte:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		return value + "b";
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTByte tempVar = new NBTByte(funcname + "temp", (byte)0);
		tempVar.setValue(this);
		return tempVar;
	}
}

package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public class NBTByteArray : NBTArray<byte>
public class NBTByteArray extends NBTArray<Byte>
{
	public NBTByteArray(String name)
	{
		super(name);
	}

	public NBTByteArray()
	{
		super();
	}

	@Override
	public void setValue(Object value)
	{
		boolean tempVar = value instanceof List<NBTSingle<Byte>>;
		List<NBTSingle<Byte>> value1 = tempVar ? (List<NBTSingle<Byte>>)value : null;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: if (value is List<NBTSingle<byte>> value1)
		if (tempVar)
		{
			this.value = value1;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型List<byte>:" + value);
		}
	}

	@Override
	public String getValueString()
	{
		String s = "[B;";
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: foreach (byte nbt in value)
		for (byte nbt : value)
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
		NBTByteArray tempVar = new NBTByteArray(funcname + "temp");
		tempVar.setValue(this);
		return tempVar;
	}
}

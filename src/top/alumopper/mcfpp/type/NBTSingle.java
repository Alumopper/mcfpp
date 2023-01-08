package top.alumopper.mcfpp.type;

import static mcsharp.cmds.Commands;
import mcsharp.*;

public class NBTSingle<T> extends NBTTag
{
	protected T value;

	/** 
	 这个NBTSingle的值
	*/
	@Override
	public Object getValue()
	{
		return value;
	}
	@Override
	public void setValue(Object value)
	{
		boolean tempVar = value instanceof T;
		T value2 = tempVar ? (T)value : null;
		if (tempVar)
		{
			this.value = value2;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型T:" + value);
		}
	}

	/** 
	 此NBTSingle是否是动态的。始终返回false
	*/
	@Override
	public boolean isDynamic()
	{
		return false;
	}

//C# TO JAVA CONVERTER TASK: The following operator overload is not converted by C# to Java Converter:
//	public static implicit operator T(NBTSingle<T> nbt)
//		{
//			return nbt.value;
//		}

//C# TO JAVA CONVERTER TASK: The following operator overload is not converted by C# to Java Converter:
//	public static implicit operator NBTSingle<T>(T value)
//		{
//			return new NBTSingle<T>(value);
//		}

	/** 
	 创建一个动态匿名NBTSingle
	 
	 @param value
	*/
	public NBTSingle()
	{
		super(Storage.tempNBT);
		this.value = null;
		//匿名NBT标签不会有命令
	}

	/** 
	 创建一个只有值的匿名NBTSingle
	 
	 @param value
	*/
	public NBTSingle(T value)
	{
		super(Storage.tempNBT);
		this.value = value;
		//匿名NBT标签不会有命令
	}

	/** 
	 创建一个只有名字的NBTSingle，值为默认值
	 
	 @param value
	*/
	public NBTSingle(String name)
	{
		super(name, Storage.tempNBT);
		this.name = name;
		//匿名NBT标签不会有命令
	}

	/** 
	 创建一个有值和名字的NBTSingle
	 
	 @param name
	 @param value
	*/
	public NBTSingle(String name, T value)
	{
		super(name, Storage.tempNBT);
		this.value = value;
		DataModifySet(this, this);
	}

	/** 
	 创建一个有值和名字的NBTSingle，并指定它的NBT容器
	 
	 @param name
	 @param value
	 @param container
	*/
	public NBTSingle(String name, T value, IDataArg container)
	{
		super(name, container);
		this.value = value;
		DataModifySet(this, this);
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTSingle<T> tempVar = new NBTSingle<T>(funcname + "temp");
		tempVar.setValue(this);
		return tempVar;
	}
}

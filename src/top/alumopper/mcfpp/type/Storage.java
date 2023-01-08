package top.alumopper.mcfpp.type;

import mcsharp.attribute.*;
import static mcsharp.cmds.Commands;
import mcsharp.*;

//C# TO JAVA CONVERTER TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Inline] public class Storage : IDataArg
public class Storage implements IDataArg
{

	public ID name;
	public static final Storage tempNBT = new Storage("mcsharp:temp");

	private NBTCompound nbt;

	/** 
	 此存储中储存的NBT数据
	*/
	public final NBTCompound getNBT()
	{
		return nbt;
	}

	/** 
	 创建一个空的存储
	 
	 @param name 存储的名字。不可为空
	*/
	public Storage(ID name)
	{
//C# TO JAVA CONVERTER TASK: Throw expressions are not converted by C# to Java Converter:
//ORIGINAL LINE: this.name = name ?? throw new ArgumentNullException("存储ID不能为空");
		if(name!=null){
			this.name = name;
		}else {
			throw new NullPointerException("存储ID不能为空");
		}
		this.nbt = new NBTCompound(this);
	}

	/** 
	 根据一个nbt标签创建一个存储。此存储将会包含这个NBT标签。
	 
	 @param tag
	*/
	public Storage(ID name, NBTCompound nbt)
	{
		this.name = name;
		this.nbt = nbt;
	}

	public final void Merge(NBTTag nbt)
	{
		DataMerge(this, nbt);
	}

	public String DataCmdStr()
	{
		return name.toString();
	}
}

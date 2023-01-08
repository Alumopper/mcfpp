package top.alumopper.mcfpp.type;

import mcsharp.cmds.*;
import mcsharp.exception.*;
import static mcsharp.cmds.Commands;
import mcsharp.*;
import java.util.*;

//C# TO JAVA CONVERTER TASK: The interface type was changed to the closest equivalent Java type, but the methods implemented will need adjustment:
public class NBTArray<T> extends NBTTag implements java.lang.Iterable<NBTSingle<T>>
{
	protected List<NBTSingle<T>> value = new List<NBTSingle<T>>();
	private Data data; //未序列化的命令

	@Override
	public void setValue(Object value)
	{
		boolean tempVar = value instanceof List<NBTSingle<T>>;
		List<NBTSingle<T>> value1 = tempVar ? (List<NBTSingle<T>>)value : null;
		if (tempVar)
		{
			this.value = value1;
			DataModifySet(this, this);
		}
		else
		{
			throw new IllegalArgumentException("需要为类型List<NBTSingle<T>>:" + value);
		}
	}

	/** 
	 这个NBTArray是不是动态的
	*/
	@Override
	public boolean isDynamic()
	{
		return value == null;
	}

	public NBTArray()
	{
		super(Storage.tempNBT);
		value = new List<NBTSingle<T>>();
		data = DataModifySet(this, this, false);
	}

	public NBTArray(IDataArg container)
	{
		super(container);
		value = new List<NBTSingle<T>>();
		data = DataModifySet(this, this, false);
	}

	public NBTArray(String name)
	{
		super(name, Storage.tempNBT);
		value = new List<NBTSingle<T>>();
		data = DataModifySet(this, this, false);
	}

	public NBTArray(String name, IDataArg container)
	{
		super(name, container);
		value = new List<NBTSingle<T>>();
		data = DataModifySet(this, this, false);
	}

	@Override
	public NBTTag get(Object index)
	{
		boolean tempVar = index instanceof Integer;
		Integer index1 = tempVar ? (Integer)index : null;
		if (tempVar)
		{
			return value.get(index1);
		}
		else
		{
			throw new IllegalArgumentException("只允许int类型的索引:" + index);
		}
	}
	@Override
	public void set(Object index, NBTTag value)
	{
		boolean tempVar = index instanceof Integer;
		Integer index1 = tempVar ? (Integer)index : null;
		if (tempVar)
		{
			//一有动静我就序列化.jpg
			if (!hasSerialized)
			{
				//将命令序列化到函数中
				Serialize(data);
			}
			hasSerialized = true; //对Compound中的元素进行了添加操作。必然完成了new的过程
			this.value.set(index1, (NBTSingle<T>)value);
			DataModifySet(this.get(index1), this.get(index1));
		}
		else
		{
			throw new IllegalArgumentException("只允许int类型的索引:" + index);
		}
	}

	public final void Add(NBTSingle<T> item)
	{
		value.Add(item);
		item.parentRoot = this;
	}

	public final void Add(NBTSingle<T>[] items)
	{
		for (NBTSingle<T> item : items)
		{
			value.Add(item);
			item.parentRoot = this;
		}
	}

	public final void Add(T[] items)
	{
		for (NBTSingle<T> item : items)
		{
			value.Add(item);
			item.parentRoot = this;
		}
	}

	/** 
	 向此NBTArray末尾添加一个值
	 
	 @param tag
	*/
	public final void Append(T tag)
	{
		//一有动静我就序列化.jpg
		if (!hasSerialized)
		{
			//将命令序列化到函数中
			Serialize(data);
		}
		hasSerialized = true; //对Compound中的元素进行了添加操作。必然完成了new的过程
		value.Add(tag);
		DataModifyAppend(this, (NBTSingle<T>)tag);
	}

	/** 
	 在此NBTArray的指定位置插入一个值
	 
	 @param index 索引
	 @param tag 要插入的值
	*/
	public final void Insert(int index, T tag)
	{
		//一有动静我就序列化.jpg
		if (!hasSerialized)
		{
			//将命令序列化到函数中
			Serialize(data);
		}
		hasSerialized = true; //对Compound中的元素进行了添加操作。必然完成了new的过程
		value.Insert(index, tag);
		DataModifyInsert(this, (NBTSingle<T>)tag, index);
	}

	/** 
	 在此NBTArray开头插入一个值
	 
	 @param item
	*/
	public final void Prepend(T item)
	{
		//一有动静我就序列化.jpg
		if (!hasSerialized)
		{
			//将命令序列化到函数中
			Serialize(data);
		}
		hasSerialized = true; //对Compound中的元素进行了访问操作。必然完成了new的过程
		value.<NBTSingle<T>>Prepend(item);
		DataModifyPrepend(this, (NBTSingle<T>)item);
	}

	/** 
	 将此NBTList中的指定项删除
	 
	 @param path
	*/
	public final void Remove(int index)
	{
		//因为索引中有序列化，这里虽然也有动静但是不会专门去序列化啦
		this.get(index).parentRoot = null;
		value.Remove((NBTSingle<T>)this.get(index));
		DataRemove(Storage.tempNBT, getPath() + "[" + index + "]");
	}

	public final Iterator<NBTSingle<T>> iterator()
	{
		return value.iterator();
	}

	public final Iterator GetEnumerator()
	{
		return value.iterator();
	}

	@Override
	public IMCType Copy(String funcname)
	{
		NBTArray<T> tempVar = new NBTArray<T>(funcname + "temp");
		tempVar.setValue(this);
		return tempVar;
	}
}

package top.alumopper.mcfpp.type;

import top.alumopper.mcfpp.exception.IllegalFormatException;

import java.util.regex.Pattern;

/**
 一个物品堆，包含了一个物品的id，nbt标签以及这个物品的数量
*/
public class ItemStack
{
	/** 
	 物品堆
	*/
	public String item_stack;
	/** 
	 物品id
	*/
	public String id;

	/** 
	 物品nbt标签
	*/
	public NBTTag nbt;

	/** 
	 物品的数量
	*/
	public int count;

	/** 
	 通过一个物品堆创建一个物品对象
	 @param item_stack
	*/
	public ItemStack(String item_stack)
	{
		this(item_stack, 1);
	}

	public ItemStack(String item_stack, int count)
	{
		if (item_stack.contains("{"))
		{
			String[] qwq = item_stack.split("[{]", -1);
			String a = qwq[0]; //非nbt
			String b = qwq[1]; //nbt部分
			if (!Pattern.matches("^([a-z0-9_]+|([a-z0-9_]+[:][a-z0-9_]+))+$", a))
			{
				throw new IllegalFormatException("无法解析字符串" + item_stack + "为item_stack");
			}
			this.id = a;
			this.nbt = NBTTag.Prase(null); //尝试
		}
		else
		{
			if (!Pattern.matches("^([a-z0-9_]+|([a-z0-9_]+[:][a-z0-9_]+))+$", item_stack))
			{
				throw new IllegalFormatException("无法解析字符串" + item_stack + "为item_stack");
			}
			this.id = item_stack;
		}
		this.item_stack = item_stack;
		this.count = count;
	}


	public ItemStack(String id, NBTTag nbt)
	{
		this(id, nbt, 1);
	}

	/**
	 根据物品id和nbt创建一个参数
	 @param id
	 @param nbt
	 @param count
	 @exception IllegalFormatException
	 */
	public ItemStack(String id, NBTTag nbt, int count)
	{

		if (!Pattern.matches("^([a-z0-9_]+|([a-z0-9_]+:[a-z0-9_]+))+$",id))
		{
			throw new IllegalFormatException("无法解析字符串" + id + "为标签");
		}
		this.id = id;
		this.nbt = nbt;
		this.count = count;
	}

	@Override
	public String toString()
	{
		return item_stack + " " + count;
	}
}

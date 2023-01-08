package top.alumopper.mcfpp.type;

import java.util.Objects;

/**
 整数范围，用于判断计分板或者nbt中的数值是否在范围内
*/
public class IntRange
{
	private Integer max = null;
	private Integer min = null;

	/** 
	 根据最大值和最小值创建一个整数范围。注意最大值和最小值都是可选的，如果不需要某个值，可以传入null，但是不能同时为null
	 
	 @param min
	 @param max
	 @exception IllegalArgumentException 若最大值和最小值同时为null或者最大值小于最小值的时候抛出
	*/
	public IntRange(Integer min, Integer max)
	{
		this.min = min;
		this.max = max;
		if (min == null && max == null) {
			throw new IllegalArgumentException("最大值和最小值不能同时为空。");
		}
		if (min != null && max != null && min > max) {
			throw new IllegalArgumentException("最大值不能小于最小值。");
		}
	}

	public IntRange(String range)
	{
		//2..   ..2     2..3
		String[] min_max = range.split("[.]", -1);
		this.max = Objects.equals(min_max[2], "") ? null : (Integer)Integer.parseInt(min_max[2]);
		this.min = Objects.equals(min_max[0], "") ? null : (Integer)Integer.parseInt(min_max[0]);
		if (max == null && min == null)
		{
			throw new IllegalArgumentException("最大值和最小值不能同时为空。");
		}
	}

	@Override
	public String toString()
	{
		if (min == null) {
			return ".." + max;
		}
		else if (max == null) {
			return min + "..";
		}
		else {
			return min + ".." + max;
		}
	}

}

package top.alumopper.mcfpp.type;

public class Vector3<T>
{
	public T x;
	public T y;
	public T z;

	public Vector3(T x, T y, T z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public final T get(int i)
	{
		if (i > 2)
		{
			throw new IndexOutOfBoundsException("索引过大: " + i + "。只含有三个元素");
		}
		if (i < 0)
		{
			throw new IndexOutOfBoundsException("索引应当为非负数: " + i);
		}
		switch (i)
		{
			case 0:
				return x;
			case 1:
				return y;
			case 2:
				return z;
		}
		return null;
	}
	public final void set(int i, T value)
	{
		if (i > 2)
		{
			throw new IndexOutOfBoundsException("索引过大: " + i + "。只含有三个元素");
		}
		if (i < 0)
		{
			throw new IndexOutOfBoundsException("索引应当为非负数: " + i);
		}
		switch (i)
		{
			case 0:
				x = value;
				break;
			case 1:
				y = value;
				break;
			case 2:
				z = value;
				break;
		}
	}

	@Override
	public String toString()
	{
		return x + " " + y + " " + z;
	}
}

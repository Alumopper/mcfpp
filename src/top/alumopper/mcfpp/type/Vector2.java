package top.alumopper.mcfpp.type;
public class Vector2<T>
{
	public T x;
	public T y;

	public Vector2(T x, T y)
	{
		this.x = x;
		this.y = y;
	}

	public final T get(int i)
	{
		if (i > 1)
		{
			throw new IndexOutOfBoundsException("索引过大: " + i + "。只含有两个元素");
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
		}
		return null;
	}
	public final void set(int i, T value)
	{
		if (i > 1)
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
		}
	}

	@Override
	public String toString()
	{
		return x + " " + y;
	}
}

package top.alumopper.mcfpp.type;

public class Pos extends Vector3<Double>
{
	private boolean related;


	public Pos(double x, double y, double z)
	{
		this(x, y, z, false);
	}

	public Pos(double x, double y)
	{
		this(x, y, 0, false);
	}

	public Pos(double x)
	{
		this(x, 0, 0, false);
	}

	public Pos()
	{
		this(0, 0, 0, false);
	}

	public Pos(double x, double y, double z, boolean related)
	{
		super(x, y, z);
		this.related = related;
	}
}

package top.alumopper.mcfpp.type;

public enum Difficulties
{
	peaceful,
	easy,
	normal,
	hard;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static Difficulties forValue(int value)
	{
		return values()[value];
	}
}

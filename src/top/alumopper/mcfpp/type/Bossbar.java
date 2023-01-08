package top.alumopper.mcfpp.type;

public class Bossbar
{
	public enum Color
	{
		blue,
		green,
		pink,
		purple,
		red,
		white,
		yellow;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static Color forValue(int value)
		{
			return values()[value];
		}
	}

	public enum Style
	{
		notched_6,
		notched_10,
		notched_12,
		notched_20,
		progress;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static Style forValue(int value)
		{
			return values()[value];
		}
	}
}

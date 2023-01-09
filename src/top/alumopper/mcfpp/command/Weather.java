package top.alumopper.mcfpp.command;


/** 
 更改游戏中的天气。
 <code>
 weather (clear|rain|thunder) [<duration>]
 </code>
*/
public class Weather extends Command
{
	private WeatherType type = WeatherType.values()[0];
	private int duration;


	public enum WeatherType
	{
		clear,
		rain,
		thunder;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static WeatherType forValue(int value)
		{
			return values()[value];
		}
	}

	public Weather(WeatherType type)
	{
		this(type, 300);
	}

	/**
	 weather (clear|rain|thunder) [<duration>]

	 @param type 指定要更改的天气类型
	 @param duration 指定天气持续的时间，单位为秒，可选
	 */
	public Weather(WeatherType type, int duration)
	{
		this.type = type;
		this.duration = duration;
	}

	@Override
	public String toString()
	{
		return "weather " + type.name() + " " + duration;
	}
}

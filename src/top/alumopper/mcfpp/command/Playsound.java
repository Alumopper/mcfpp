package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
/** 
 播放一段声音。
 <code>
 playsound <sound> <source> <targets> [<pos>] [<volume>] [<pitch>] [<minVolume>]
 </code>
*/
public class Playsound extends Command
{
	private ID sound;
	private Source source = Source.values()[0];
	private Selector targets;
	private Pos pos;
	private float volume;
	private float pitch;
	private float minVolume;

	public enum Source
	{
		master,
		music,
		record,
		weather,
		block,
		hostile,
		neutral,
		player,
		ambient,
		voice;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static Source forValue(int value)
		{
			return values()[value];
		}
	}


	public Playsound(ID sound, Source source, Selector targets, Pos pos, float volume, float pitch)
	{
		this(sound, source, targets, pos, volume, pitch, 0.0f);
	}

	public Playsound(ID sound, Source source, Selector targets, Pos pos, float volume)
	{
		this(sound, source, targets, pos, volume, 1.0f, 0.0f);
	}

	public Playsound(ID sound, Source source, Selector targets, Pos pos)
	{
		this(sound, source, targets, pos, 1.0f, 1.0f, 0.0f);
	}

	public Playsound(ID sound, Source source, Selector targets)
	{
		this(sound, source, targets, null, 1.0f, 1.0f, 0.0f);
	}

	/**
	 playsound <sound> <source> <targets> [<pos>] [<volume>] [<pitch>] [<minVolume>]

	 @param sound 指定要播放的声音。必须为在sounds.json中被定义的一个声音项目（例如，entity.pig.ambient）。
	 @param source 指定播放声音所属的类别，对应于游戏选项中"音乐和声音”设置的分类。必须为以下之一：master、music、record、weather、block、hostile、neutral、player、ambient或voice。</param>
	 @param targets 指定播放声音的目标。必须是一个玩家名、目标选择器或UUID。且目标选择器只允许玩家
	 @param pos 指定声音发出的方位。
	 @param volume 指定声音能被听见的距离。
	 @param pitch 指定声音的音调。
	 @param minVolume 指定在声音可闻范围外的目标能听到的音量。
	 */
	public Playsound(ID sound, Source source, Selector targets, Pos pos, float volume, float pitch, float minVolume)
	{
		this.sound = sound;
		this.source = source;
		this.targets = targets;
		this.pos = pos;
		this.volume = volume;
		this.pitch = pitch;
		this.minVolume = minVolume;
	}

	@Override
	public String toString()
	{
		return "playsound " + source + " " + source.name() + " " + targets + " " + pos + " " + volume + " " + pitch + " " + minVolume;
	}
}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.type.*;

import java.util.logging.Level;

/** 
 以指定位置为生成原点，放置地物、拼图、结构或结构模板。
 <code>
 place feature <feature> [<pos>]
 place jigsaw <pool> <target> <max_depth> [<position>]
 place structure <structure> [<pos>]
 place template <template> [<pos>] [<rotation>] [<mirror>] [<integrity>] [<seed>]
 </code>
*/
public class Place extends Command
{
	private ID res;
	private Pos pos;
	private ID target;
	private int max_depth;
	private Rot rot = Rot.values()[0];
	private Mirror mirror = Mirror.values()[0];
	private float integrity;
	private Long seed = null;
	private int type;

	public enum Rot
	{
		_none,
		_clockwise_90,
		_180,
		_counterclockwise_90;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static Rot forValue(int value)
		{
			return values()[value];
		}
	}

	public enum Mirror
	{
		none,
		front_back,
		left_right;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static Mirror forValue(int value)
		{
			return values()[value];
		}
	}

	public Place(ID feature)
	{
		this(feature, null);
	}


	/**
	 place feature <feature> [<pos>]

	 @param feature 指定要放置的可用地物（包含数据包内的自定义地物）的命名空间ID。
	 @param pos 指定要尝试放置的原点位置。
	 */
	public Place(ID feature, Pos pos)
	{
		this.res = feature;
		this.pos = pos;
		type = 0;
	}


	public Place(ID pool, ID target, int max_depth)
	{
		this(pool, target, max_depth, null);
	}

	/**
	 place jigsaw <pool> <target> <max_depth> [<position>]

	 @param pool 指定要开始生成结构的模板池。
	 @param target 指定结构从目标池中生成时要对接的拼图方块。
	 @param max_depth 指定放置期间要遍历的拼图对接数最大值。必须为32位整型数值。且必须在1和7（含）之间。
	 @param pos 指定要尝试放置的原点位置。
	 */
	public Place(ID pool, ID target, int max_depth, Pos pos)
	{
		this.res = pool;
		this.target = target;
		this.max_depth = max_depth;
		if (max_depth < 1)
		{
			max_depth = 1;
			Project.logger.log(Level.SEVERE, max_depth + "必须在1和7（含）之间");
		}
		if (max_depth > 7)
		{
			max_depth = 7;
			Project.logger.log(Level.SEVERE, max_depth + "必须在1和7（含）之间");
		}
		this.pos = pos;
		type = 1;
	}

	/** 
	 place structure <structure> [<pos>]
	 
	 @param structure 指定要生成的结构。
	 @param pos 指定要尝试放置的原点位置。
	 @param o 随便填什么，用于区分structure和feature的命令格式
	*/
	public Place(ID structure, Pos pos, Object o)
	{
		this.res = structure;
		this.pos = pos;
		type = 2;
	}


	public Place(ID template, Pos pos, Rot rot, Mirror mirror, float integrity)
	{
		this(template, pos, rot, mirror, integrity, null);
	}

	/**
	 place template <template> [<pos>] [<rotation>] [<mirror>] [<integrity>] [<seed>]

	 @param template 指定要放置的模板（结构文件）。
	 @param pos 指定要尝试放置的原点位置。
	 @param rot 指定放置模板时应当旋转的角度，旋转方向以Y轴俯视角为基准。可用值如下：none（默认值）：不旋转。clockwise_90：顺时针旋转90°。180：旋转180°。counterclockwise_90：逆时针旋转90°。
	 @param mirror 指定放置模板时应当采取的镜像方式。可用值如下：none（默认值）：不镜像。front_back：前后翻转。left_right：左右翻转。
	 @param integrity 指定被放置结构的完整度。必须为单精度浮点数。且必须在0和1（含）之间。默认值为1。
	 @param seed 指定要被用于结构完整度的种子。如不指定，则使用随机种子。
	 */
	public Place(ID template, Pos pos, Rot rot, Mirror mirror, float integrity, Long seed)
	{
		this.res = template;
		if (pos == null)
		{
			pos = new Pos();
		}
		else
		{
			this.pos = pos;
		}
		this.rot = rot;
		this.mirror = mirror;
		this.integrity = integrity;
		this.seed = seed;
		type = 3;
	}

	@Override
	public String toString()
	{
		String re = "#place喵";
		switch (type) {
			case 0 -> {
				re = "place feature " + res + (pos == null ? "" : (" " + pos));
				break;
			}
			case 1 -> {
				re = "place jigsaw " + res + " " + target + " " + max_depth + (pos == null ? "" : (" " + pos));
				break;
			}
			case 2 -> {
				re = "place structure " + res + (pos == null ? "" : (" " + pos));
				break;
			}
			case 3 -> {
				re = "place template " + res + " " + pos + " " + rot.name() + " " + mirror.name() + " " + integrity + (seed == null ? "" : (" " + seed.longValue()));
				break;
			}
		}
		return re;
	}
}

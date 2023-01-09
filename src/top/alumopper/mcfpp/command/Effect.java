package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.logging.Level;

/** 
 管理玩家及其他实体上的状态效果
 <code>
 effect clear [<targets>] [<effect>]
 effect give <targets> <effect> [<seconds>] [<amplifier>] [<hideParticles>]
 </code>
*/
public class Effect extends Command
{
	private String clear_give;
	private final Selector targets;
	private final ID effect;
	private int seconds = -1;
	private int amplifier = -1;
	private boolean hideParticles = false;

	private static String[] cg = new String[] {"clear", "give"};

	/** 
	 effect clear [<targets>] [<effect>]
	 effect give <targets> <effect>
	 
	 @exception ArgumentNotMatchException
	*/

	public Effect(String clear_give, Selector targets) throws ArgumentNotMatchException {
		this(clear_give, targets, null);
	}

	public Effect(String clear_give) throws ArgumentNotMatchException {
		this(clear_give, null, null);
	}

	public Effect(String clear_give, Selector targets, ID effect) throws ArgumentNotMatchException {
		this.clear_give = clear_give;
		if (clear_give.equals("give") && (targets == null || effect == null))
		{
			throw new ArgumentNotMatchException("参数错误: effect give中target和effect不能为null");
		}
		if (targets == null && effect != null)
		{
			throw new ArgumentNotMatchException("参数错误: 不能在没有targets的情况下指定effect");
		}
		this.targets = targets;
		this.effect = effect;
	}

	/** 
	 effect give <targets> <effect> [<seconds>] [<amplifier>] [<hideParticles>]
	*/

	public Effect(Selector targets, ID effect, int seconds, int amplifier)
	{
		this(targets, effect, seconds, amplifier, false);
	}

	public Effect(Selector targets, ID effect, int seconds)
	{
		this(targets, effect, seconds, 0, false);
	}

	public Effect(Selector targets, ID effect)
	{
		this(targets, effect, 30, 0, false);
	}

	public Effect(Selector targets, ID effect, int seconds, int amplifier, boolean hideParticles)
	{
		this.targets = targets;
		this.effect = effect;
		if (seconds < 0)
		{
			seconds = 0;
			Project.logger.warn( "参数需在0~1000000之间，却传入了" + seconds);
		}
		if (seconds > 1000000)
		{
			seconds = 1000000;
			Project.logger.warn( "参数需在0~1000000之间，却传入了" + seconds);
		}
		this.seconds = seconds;
		if (amplifier < 0)
		{
			amplifier = 0;
			Project.logger.warn( "参数需在0~255之间，却传入了" + amplifier);
		}
		if (amplifier > 255)
		{
			amplifier = 255;
			Project.logger.warn( "参数需在0~255，却传入了" + amplifier);
		}
		this.seconds = amplifier;
		this.hideParticles = hideParticles;
	}

	@Override
	public String toString()
	{
		String re = "#喵喵喵？这里应该是一个effect命令，如果你看到了这个注释，说明MC#出现了一些问题！";
		if (clear_give.equals("clear"))
		{
			re = "effect clear" + (targets == null ? "" : (" " + targets)) + (effect == null ? "" : (" " + effect));
		}
		else
		{
			re = "effect give " + targets + " " + effect + " " + seconds + " " + amplifier + " " + hideParticles;
		}
		return re;
	}

}

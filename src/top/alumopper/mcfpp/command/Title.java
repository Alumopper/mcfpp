package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.*;

/** 
 控制屏幕标题。屏幕标题会以一行粗体大号文字的形式出现在玩家屏幕的中央，并且可以附加第二行作为副标题。标题和副标题均可使用原始JSON文本组件。屏幕标题可以设置为淡入淡出过渡，而显示持续时间同样可以设定。屏幕标题的大小取决于界面尺寸设置，而过长的标题不会自动换行（只会溢出屏幕之外）。
 <code>
 title <player> (clear|reset)
 title <player> (title|subtitle|actionbar) <JSON>
 title <player> times <渐入> <保持> <渐出>
 </code>
*/
public class Title extends Command
{
	private Selector player;
	private Option clear_reset = null;
	private TitleType title_subtitle_actionbar = null;
	private JsonText jsonText;
	private int fadeIn;
	private int stay;
	private int fadeOut;

	public enum Option
	{
		clear,
		reset;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static Option forValue(int value)
		{
			return values()[value];
		}
	}

	public enum TitleType
	{
		title,
		subtitle,
		actionbar;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static TitleType forValue(int value)
		{
			return values()[value];
		}
	}

	/** 
	 title <player> (clear|reset)
	 
	 @param player
	 @param clear_reset
	*/
	public Title(Selector player, Option clear_reset)
	{
		this.player = player;
		this.clear_reset = clear_reset;
	}

	/** 
	 title <player> (title|subtitle|actionbar) <JSON>
	 
	 @param player
	 @param title_subtitle_actionbar
	 @param jsonText
	*/
	public Title(Selector player, TitleType title_subtitle_actionbar, JsonText jsonText)
	{
		this.player = player;
		this.title_subtitle_actionbar = title_subtitle_actionbar;
		this.jsonText = jsonText;
	}

	/** 
	 title <player> times <渐入> <保持> <渐出>
	 
	 @param player
	 @param fadeIn
	 @param stay
	 @param fadeOut
	*/
	public Title(Selector player, int fadeIn, int stay, int fadeOut)
	{
		this.player = player;
		this.fadeIn = fadeIn;
		this.stay = stay;
		this.fadeOut = fadeOut;
	}

	@Override
	public String toString()
	{
		if (clear_reset != null)
		{
			return "title " + player + " " + clear_reset;
		}
		else if (title_subtitle_actionbar != null)
		{
			return "title " + player + " " + title_subtitle_actionbar + " " + jsonText;
		}
		else
		{
			return "title " + player + " times " + fadeIn + " " + stay + " " + fadeOut;
		}
	}
}

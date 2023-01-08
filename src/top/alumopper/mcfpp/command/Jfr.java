package top.alumopper.mcfpp.command;

import mcsharp.exception.*;
import mcsharp.*;

/** 
 使用Java FlightRecorder分析数据和某些自定义事件。
 <code>
 jfr (start|stop)
 </code>
*/
public class Jfr extends Command
{
	private String start_stop;

	private static String[] ss = new String[] {"start", "stop"};

	/** 
	 jfr (start|stop)
	 
	 @exception ArgumentNotMatchException
	*/
	public Jfr(String start_stop)
	{
		if (!ss.contains(start_stop))
		{
			throw new ArgumentNotMatchException("参数错误:" + start_stop + "。应当为\"start\"和\"stop\"");
		}
		this.start_stop = start_stop;
	}

	@Override
	public String toString()
	{
		return "jfr " + start_stop;
	}
}

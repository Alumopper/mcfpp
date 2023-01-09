package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;

import java.util.Arrays;
import java.util.List;

/** 
 使用Java FlightRecorder分析数据和某些自定义事件。
 <code>
 jfr (start|stop)
 </code>
*/
public class Jfr extends Command
{
	private String start_stop;

	private static List<String> ss = Arrays.asList("start", "stop");

	/** 
	 jfr (start|stop)
	 
	 @exception ArgumentNotMatchException
	*/
	public Jfr(String start_stop) throws ArgumentNotMatchException {
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

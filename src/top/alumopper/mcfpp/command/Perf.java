package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;

import java.util.Arrays;
import java.util.List;

/**
 记录并保存性能分析数据。
 <code>
 perf (start|stop)
 </code>
*/
public class Perf extends Command
{
	private String start_stop;

	private static List<String> ss = Arrays.asList("start", "stop");

	/** 
	 perf (start|stop)
	 
	 @exception ArgumentNotMatchException
	*/
	public Perf(String start_stop)
	{
		if (!ss.contains(start_stop))
		{
			throw new ArgumentNotMatchException("参数错误:" + start_stop + "。应当为\"start\"或\"stop\"");
		}
		this.start_stop = start_stop;
	}

	@Override
	public String toString()
	{
		return "perf " + start_stop;
	}
}

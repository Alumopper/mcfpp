package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;

import java.util.Arrays;
import java.util.List;

/**
 开始或结束调试会话。
 <code>
 debug (start|stop|function)
 </code>
*/
public class Debug extends Command
{
	private String arg;
	private static List<String> ssf =  Arrays.asList("start", "stop", "function");

	/** 
	 debug (start|stop|function)
	 
	 @exception ArgumentNotMatchException
	*/
	public Debug(String start_stop_function) throws ArgumentNotMatchException {
		if (!ssf.contains(start_stop_function))
		{
			throw new ArgumentNotMatchException("参数错误:" + start_stop_function + "。应当为\"start\", \"stop\"或\"function\"");
		}
		arg = start_stop_function;
	}

	@Override
	public String toString()
	{
		return "debug " + arg;
	}
}

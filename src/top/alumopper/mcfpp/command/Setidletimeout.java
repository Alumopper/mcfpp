package top.alumopper.mcfpp.command;

/** 
 设置踢出空闲不动玩家的时间。
 <code>
 setidletimeout <空闲分钟数>
 </code>
*/
public class Setidletimeout extends Command
{
	private int timeout;

	/** 
	 setidletimeout <空闲分钟数>
	 
	 @param timeout
	*/
	public Setidletimeout(int timeout)
	{
		this.timeout = timeout;
	}

	@Override
	public String toString()
	{
		return "setidletimeout " + timeout;
	}
}

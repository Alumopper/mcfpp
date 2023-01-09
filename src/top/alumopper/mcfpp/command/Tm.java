package top.alumopper.mcfpp.command;

/** 
 给使用命令的实体所在的队伍全体成员发送消息，不在命令方块上执行。
 <code>
 tm <message>
 </code>
*/
public class Tm extends Command
{
	private String message;

	/** 
	 tm <message>
	 
	 @param message 指定要发送的消息
	*/
	public Tm(String message)
	{
		this.message = message;
	}

	@Override
	public String toString()
	{
		return "tm " + message;
	}
}

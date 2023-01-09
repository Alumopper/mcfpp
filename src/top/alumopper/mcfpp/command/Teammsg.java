package top.alumopper.mcfpp.command;

/** 
 给使用命令的实体所在的队伍全体成员发送消息，不在命令方块上执行。
 <code>
 teammsg <message>
 </code>
*/
public class Teammsg extends Command
{
	private String message;

	/** 
	 teammsg <message>
	 
	 @param message 指定要发送的消息
	*/
	public Teammsg(String message)
	{
		this.message = message;
	}

	@Override
	public String toString()
	{
		return "teammsg " + message;
	}
}

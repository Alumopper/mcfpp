package top.alumopper.mcfpp.command;


/** 
 显示一条关于你自己的信息。
 <code>
 me <action>
 </code>
*/
public class Me extends Command
{
	private String msg;

	/** 
	 me <action>
	 
	 @param msg
	*/
	public Me(String msg)
	{
		this.msg = msg;
	}

	@Override
	public String toString()
	{
		return "me " + msg;
	}
}

package top.alumopper.mcfpp.command;

/**
 获取可用命令列表或单个命令的帮助信息。
 <code>
 help
 help <command>
 </code>
*/
public class Help extends Command
{
	private String command;

	/** 
	 help [<command>]
	*/

	public Help()
	{
		this("");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Help(String command = "")
	public Help(String command)
	{
		this.command = command;
	}

	@Override
	public String toString()
	{
		return "help" + (command == null ? "" : " " + command);
	}
}

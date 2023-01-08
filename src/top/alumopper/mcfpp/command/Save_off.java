package top.alumopper.mcfpp.command;


/** 
 禁用服务器的自动保存。所有的更改将会暂时进入队列。
 <code>
 save-off
 </code>
*/
public class Save_off extends Command
{
	public Save_off()
	{
	}

	@Override
	public String toString()
	{
		return "save-off";
	}
}

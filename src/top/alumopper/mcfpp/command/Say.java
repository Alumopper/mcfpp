package top.alumopper.mcfpp.command;

import mcsharp.*;

/** 
 通过聊天框向多个玩家发送消息。
 <code>
 say <message>
 </code>
*/
public class Say extends Command
{
	private String text;

	/** 
	 say <message>
	 
	 @param text
	*/
	public Say(String text)
	{
		this.text = text;
	}

	@Override
	public String toString()
	{
		return "say " + text;
	}
}

package top.alumopper.mcfpp.command;


/** 
 列出在服务器上的玩家。
 <code>
 list
 list uuids
 </code>
*/
public class List extends Command
{
	private Object o;


	public List()
	{
		this(null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public List(object o = null)

	/**
	 <p> list </p>
	 list uuids

	 @param o 随便填啥。只要不是null就是list uuids
	 */
	public List(Object o)
	{
		this.o = o;
	}

	@Override
	public String toString()
	{
		return "list" + (o == null ? "" : (" uuid"));
	}
}

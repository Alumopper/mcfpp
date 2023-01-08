package top.alumopper.mcfpp.command;
/** 
 mcfunction特有的注释
*/
public class Comment extends Command
{
	private final String comment;

	public Comment(String comment)
	{
		this.comment = comment;
	}

	@Override
	public String toString()
	{
		return "#" + comment;
	}
}

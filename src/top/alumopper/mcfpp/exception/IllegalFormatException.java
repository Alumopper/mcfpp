package top.alumopper.mcfpp.exception;

/** 
 当出现非法的格式时抛出此异常
*/
public class IllegalFormatException extends RuntimeException
{
	public IllegalFormatException(String msg)
	{
		super(msg);
	}
}

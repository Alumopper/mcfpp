package top.alumopper.mcfpp.exception;

/** 
 当execute命令已经结束时（最后一个子命令为run），仍然尝试添加子命令时抛出异常
*/
public class ExecuteCommandListEndException extends RuntimeException
{
	public ExecuteCommandListEndException(String message)
	{
		super(message);
	}
}

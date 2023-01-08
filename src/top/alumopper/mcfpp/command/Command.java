package top.alumopper.mcfpp.command;
/** 
 所有命令类的基类
*/
public class Command
{
	/** 
	 返回此命令对象的命令函数文本形式，可以直接被minecraft读取。每个命令类都应当重写此方法
	*/
	@Override
	public String toString()
	{
		return super.toString();
	}
}

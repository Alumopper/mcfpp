package top.alumopper.mcfpp.command;

public class Function extends Command
{
	/** 
	 函数命名空间id
	*/
	private final String functionID;

	public Function(top.alumopper.mcfpp.lib.Function functionID)
	{
		this.functionID = functionID.getNamespaceID();
	}

	@Override
	public String toString()
	{
		return "function " + functionID;
	}
}

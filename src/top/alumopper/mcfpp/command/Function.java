package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

public class Function extends Command
{
	/** 
	 函数命名空间id
	*/
	private final String functionID;

	public Function(top.alumopper.mcfpp.lib.Function functionID)
	{
		this.functionID = functionID.GetNamespaceID();
	}

	@Override
	public String toString()
	{
		return "function " + functionID;
	}
}

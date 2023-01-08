package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import mcsharp.*;

public class Function extends Command
{
	/** 
	 函数命名空间id
	*/
	private ID functionID;

	public Function(ID functionID)
	{
		this.functionID = functionID;
	}

	@Override
	public String toString()
	{
		return "function " + functionID;
	}
}

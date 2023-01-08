package top.alumopper.mcfpp.type;

/** 
 所有mc类型的接口
*/
public interface IMCType
{
	/** 
	 复制这个MC变量
	 
	 @return 
	*/
	IMCType Copy(IMCType mctype);
	IMCType Create(String name);
}

package top.alumopper.mcfpp.type;
/** 
 啥用没用，表示这个东西可以被塞到data里面去
*/
public interface IDataArg
{
	void Merge(NBTTag nbt);

	String DataCmdStr();
}

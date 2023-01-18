package top.alumopper.mcfpp.command;


/** 
 将服务器保存至硬盘。使服务器将所有区块和玩家数据标记为待保存。这些数据会随时间陆续保存进硬盘。
 <code>
 save-all [flush]
 </code>
*/
public class Save_all extends Command
{
	private boolean flush;

	public Save_all()
	{
		this(false);
	}


	/**
	 save-all [flush]

	 @param flush 若为true，则服务器会立即保存所有的区块数据，并造成服务器临时冻结。
	 */
	public Save_all(boolean flush)
	{
		this.flush = flush;
	}

	@Override
	public String toString()
	{
		return "save-all" + (flush ? " flush" : "");
	}
}
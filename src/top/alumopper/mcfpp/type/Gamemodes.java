package top.alumopper.mcfpp.type;

/** 
 游戏模式，作为命令中设置玩家游戏模式或者判断游戏模式的参数
*/
public enum Gamemodes
{
	survival,
	creative,
	adventure,
	specture;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static Gamemodes forValue(int value)
	{
		return values()[value];
	}
}

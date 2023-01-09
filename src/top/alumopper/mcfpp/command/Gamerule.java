package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;

import java.util.Arrays;
import java.util.List;

/**
 设置或查询游戏规则
*/
public class Gamerule extends Command
{
	/** 
	 是否在聊天框中公告玩家进度的达成
	*/
	public static String announceAdvancements = "announceAdvancements";
	/** 
	 命令方块执行命令时是否在聊天框中向管理员显示
	*/
	public static String commandBlockOutput = "commandBlockOutput";
	/** 
	 是否让服务器停止检查使用鞘翅玩家的移动速度。有助于减轻因服务器延迟而导致的飞行卡顿，但有可能导致生存模式下玩家飞行过快（作弊）
	*/
	public static String disableElytraMovementCheck = "disableElytraMovementCheck";
	/** 
	 是否禁用袭击
	*/
	public static String disableRaids = "disableRaids";
	/** 
	 是否进行昼夜更替和月相变化
	*/
	public static String doDaylightCycle = "doDaylightCycle";
	/** 
	 非生物实体是否掉落物品
	*/
	public static String doEntityDrops = "doEntityDrops";
	/** 
	 火是否蔓延及自然熄灭
	*/
	public static String doFireTick = "doFireTick";
	/** 
	 玩家死亡时是否不显示死亡界面直接重生
	*/
	public static String doImmediateRespawn = "doImmediateRespawn";
	/** 
	 幻翼是否在夜晚生成
	*/
	public static String doInsomnia = "doInsomnia";
	/** 
	 玩家的合成配方是否需要解锁才能使用
	*/
	public static String doLimitedCrafting = "doLimitedCrafting";
	/** 
	 生物在死亡时是否掉落物品
	*/
	public static String doMobLoot = "doMobLoot";
	/** 
	 生物是否自然生成。不影响刷怪笼
	*/
	public static String doMobSpawning = "doMobSpawning";
	/** 
	 控制灾厄巡逻队的生成
	*/
	public static String doPatrolSpawning = "doPatrolSpawning";
	/** 
	 方块被破坏时是否掉落物品
	*/
	public static String doTileDrops = "doTileDrops";
	/** 
	 控制流浪商人的生成
	*/
	public static String doTraderSpawning = "doTraderSpawning";
	/** 
	 监守者是否生成
	*/
	public static String doWardenSpawning = "doWardenSpawning";
	/** 
	 天气是否变化
	*/
	public static String doWeatherCycle = "doWeatherCycle";
	/** 
	 玩家是否承受窒息伤害
	*/
	public static String drowningDamage = "drowningDamage";
	/** 
	 玩家是否承受跌落伤害
	*/
	public static String fallDamage = "fallDamage";
	/** 
	 玩家是否承受火焰伤害
	*/
	public static String fireDamage = "fireDamage";
	/** 
	 当被激怒的条件敌对生物的目标玩家死亡时，该生物是否恢复未激怒状态
	*/
	public static String forgiveDeadPlayers = "forgiveDeadPlayers";
	/** 
	 玩家是否承受冰冻伤害
	*/
	public static String freezeDamage = "freezeDamage";
	/** 
	 玩家死亡后是否保留物品栏物品、经验（死亡时物品不掉落、经验不清空）
	*/
	public static String keepInventory = "keepInventory";
	/** 
	 是否在服务器日志中记录管理员使用过的命令
	*/
	public static String logAdminCommands = "logAdminCommands";
	/** 
	 决定了连锁型命令方块能连锁执行的总数量
	*/
	public static String maxCommandChainLength = "maxCommandChainLength";
	/** 
	 玩家或生物能同时推动其他可推动实体的数量，超过此数量时将承受每半秒3的窒息伤害。设置成0可以停用这个规则。此规则影响生存模式和冒险模式的玩家，以及除蝙蝠外的所有生物。可推动实体包括非旁观模式玩家、除蝙蝠外的所有生物、船和矿车
	*/
	public static String maxEntityCramming = "maxEntityCramming";
	/** 
	 生物是否能够进行破坏性行为，包括苦力怕、僵尸、末影人、恶魂、凋灵、末影龙、兔子、绵羊、村民和雪傀儡是否能放置、修改或破坏方块，生物是否能捡拾物品，以及唤魔者是否能将蓝色的绵羊变为红色[仅Java版]。这个规则也会影响生物（如僵尸猪灵和溺尸）寻找海龟蛋的能力。这还将会阻止村民的繁殖。这一游戏规则不会影响非生物实体，包括TNT和末地水晶。
	*/
	public static String mobGriefing = "mobGriefing";
	/** 
	 玩家是否能在饥饿值足够时自然恢复生命值（不影响外部治疗效果，如金苹果、生命恢复状态效果等）。
	*/
	public static String naturalRegeneration = "naturalRegeneration";
	/** 
	 设置跳过夜晚所需的入睡玩家所占百分比。设置为0时，1个玩家入睡即可跳过夜晚。设置为大于100的值会使玩家无法通过入睡跳过夜晚。
	*/
	public static String playersSleepingPercentage = "playersSleepingPercentage";
	/** 
	 每游戏刻每区段中随机的方块刻发生的频率（例如植物生长，树叶腐烂等）。为0时禁用随机刻，较高的数字将增大随机刻频率。
	*/
	public static String randomTickSpeed = "randomTickSpeed";
	/** 
	 调试屏幕是否简化而非显示详细信息；同时影响实体碰撞箱（通过F3 + B查看）和区块边界（通过F3 + G查看）效果的显示。
	*/
	public static String reducedDebugInfo = "reducedDebugInfo";
	/** 
	 玩家执行命令的返回信息是否在聊天框中显示。同时影响命令方块是否保存命令输出文本。
	*/
	public static String sendCommandFeedback = "sendCommandFeedback";
	/** 
	 是否在聊天框中显示玩家的死亡信息。同样影响是否在宠物（狼、猫和鹦鹉）死亡时通知它的主人。
	*/
	public static String showDeathMessages = "showDeathMessages";
	/** 
	 首次进入服务器的玩家和没有重生点的死亡玩家在重生时与世界重生点坐标的距离。
	*/
	public static String spawnRadius = "spawnRadius";
	/** 
	 是否允许旁观模式的玩家生成区块
	*/
	public static String spectatorsGenerateChunks = "spectatorsGenerateChunks";
	/** 
	 被激怒的条件敌对生物是否攻击附近任何玩家（而非只攻击激怒它们的玩家）。当forgiveDeadPlayers关闭时会有更好的效果。
	*/
	public static String universalAnger = "universalAnger";
	/** 
	 由方块源（除TNT）爆炸炸毁的方块是否会有概率不掉落。
	*/
	public static String blockExplosionDropDecay = "blockExplosionDropDecay";
	/** 
	 玩家是否能听到可无视距离播放给全部玩家的特定游戏事件音效。
	*/
	public static String globalSoundEvents = "globalSoundEvents";
	/** 
	 流动的熔岩是否可产生熔岩源。
	*/
	public static String lavaSourceConversion = "lavaSourceConversion";
	/** 
	 由生物源爆炸炸毁的方块是否会有概率不掉落。
	*/
	public static String mobExplosionDropDecay = "mobExplosionDropDecay";
	/** 
	 下雪时可在一格方块空间内堆积的雪的最高层数。
	*/
	public static String snowAccumulationHeight = "snowAccumulationHeight";
	/** 
	 由TNT爆炸炸毁的方块是否会有概率不掉落。
	*/
	public static String tntExplosionDropDecay = "tntExplosionDropDecay";
	/** 
	 流动的水是否可产生水源。
	*/
	public static String waterSourceConversion = "waterSourceConversion";
//C# TO JAVA CONVERTER TASK: There is no preprocessor in Java:
		///#endregion

	private List<String> rules = Arrays.asList("announceAdvancements", "commandBlockOutput", "disableElytraMovementCheck", "disableRaids", "doDaylightCycle", "doEntityDrops", "doFireTick", "doLimitedCrafting", "doMobLoot", "doMobSpawning", "doPatrolSpawning", "doTileDrops", "doTraderSpawning", "doWeatherCycle", "drowningDamage", "fallDamage", "fireDamage", "forgiveDeadPlayers", "keepInventory", "logAdminCommands", "maxCommandChainLength", "maxEntityCramming", "mobGriefing", "naturalRegeneration", "randomTickSpeed", "reducedDebugInfo", "sendCommandFeedback", "showDeathMessages", "spectatorsGenerateChunks", "universalAnger", "blockExplosionDropDecay", "globalSoundEvents", "lavaSourceConversion", "mobExplosionDropDecay", "snowAccumulationHeight", "tntExplosionDropDecay", "waterSourceConversion");

	private String gamerule;
	private Object value;

	/** 
	 gamerule <gamerule> [value]
	*/
	public Gamerule(String gamerule, Object value) throws ArgumentNotMatchException {
		if (!rules.contains(gamerule))
		{
			throw new ArgumentNotMatchException("参数错误: " + gamerule + "不存在的游戏规则");
		}
		this.gamerule = gamerule;
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "gamerule " + gamerule + (value == null ? "" : (" " + value));
	}
}

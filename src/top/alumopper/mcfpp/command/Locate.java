package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;

/** 
 在聊天框中为命令执行者显示给定类型结构、生物群系或兴趣点的最近坐标和距离。返回的坐标可以点击以自动在聊天框中输入/tp @s 坐标。
 <code>
 locate (biome|poi|structure) <id>
 </code>
*/
public class Locate extends Command
{
	private String biome_poi_structure;
	private ID id;

	private static List<String> bps = Arrays.asList("biome", "poi", "structure");

	/** 
	 locate (biome|poi|structure) <id>
	*/
	public Locate(String biome_poi_structure, ID id) throws ArgumentNotMatchException {
		if (!bps.contains(biome_poi_structure))
		{
			throw new ArgumentNotMatchException("参数错误:" + biome_poi_structure + "。应当为\"biome\", \"poi\"或\"structure\"");
		}
		this.biome_poi_structure = biome_poi_structure;
		this.id = id;
	}

	@Override
	public String toString()
	{
		return "locate " + biome_poi_structure + " " + id;
	}
}

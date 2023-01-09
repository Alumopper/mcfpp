package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/** 
 设置指定区域的生物群系。
 <code>
 fillbiome [<from>] [<to>] [<biome>]
 /fillbiome [<from>] [<to>] [<biome>] replace [<filter>]
 </code>
*/
public class Fillbiome extends Command
{
	private Pos from;
	private Pos to;
	private ID biome;
	private ID fliter;

	/** 
	 fillbiome [<from>] [<to>] [<biome>]
	*/

	public Fillbiome(Pos from, Pos to)
	{
		this(from, to, null);
	}

	public Fillbiome(Pos from)
	{
		this(from, null, null);
	}

	public Fillbiome()
	{
		this((Pos) null, null, null);
	}

	public Fillbiome(Pos from, Pos to, ID biome)
	{
		this.from = from;
		this.to = to;
		this.biome = biome;
	}


	public Fillbiome(String replace, Pos from, Pos to, ID biome)
	{
		this(replace, from, to, biome, null);
	}

	public Fillbiome(String replace, Pos from, Pos to)
	{
		this(replace, from, to, null, null);
	}

	public Fillbiome(String replace, Pos from)
	{
		this(replace, from, null, null, null);
	}

	public Fillbiome(String replace)
	{
		this(replace, null, null, null, null);
	}

	public Fillbiome(String replace, Pos from, Pos to, ID biome, ID fliter)
	{
		this.from = from;
		this.to = to;
		this.biome = biome;
		this.fliter = fliter;
	}

	@Override
	public String toString()
	{
		if (from == null)
		{
			return "fillbiome";
		}
		else if (to == null)
		{
			return "fillbiome " + from;
		}
		else if (biome == null)
		{
			return "fillbiome " + from + " " + to;
		}
		else
		{
			return "fillbiome " + from + " " + to + " " + biome;
		}
	}
}

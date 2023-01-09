package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.*;
import top.alumopper.mcfpp.type.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

/** 
 用于更改或读取属性
 <pre>
 {@code
 attribute <target> <attribute> base get <scale>
 attribute <target> <attribute> base set <value>
 attribute <target> <attribute> modifier add <uuid> <name> <value> (add|multiply|multiply_base)
 attribute <target> <attribute> modifier remove <uuid>
 attribute <target> <attribute> modifier value get <uuid> <scale>
 }
 </pre>
*/
public class Attribute extends Command
{
//C# TO JAVA CONVERTER TASK: There is no preprocessor in Java:
		///
	private Selector target;
	private String attribute;
	private double scale;
	private int type;
	private double value;
	private UUID uuid;
	private String name;
	private String add_multiply_multiply_base;

	private static List<String> amb = Arrays.asList("add","multiply", "multiply_base");
	private static List<String> gs = Arrays.asList("get", "set");

	/** 
	 attribute <target> <attribute> base get [<scale];
	 @param target
	 @param attribute
	*/
	public Attribute(Selector target, String attribute)
	{
		this(target, attribute, 1.0);
	}

	public Attribute(Selector target, String attribute, double scale)
	{
		this.target = target;
		this.attribute = attribute;
		this.scale = scale;
		type = -1;
	}

	/** 
	 attribute <target> <attribute> base (get|set) <scale/value>
	 
	 type - 0
	 @exception ArgumentNotMatchException
	*/
	public Attribute(Selector target, String attribute, String get_set, double scale_value) throws ArgumentNotMatchException {
		this.target = target;
		if (NBTTag.attributes.contains(attribute))
		{
			this.attribute = attribute;
		}
		else
		{
			Project.logger.warn( "未知属性" + attribute);
		}
		if (!gs.contains(get_set))
		{
			throw new ArgumentNotMatchException("参数错误:" + get_set + "。应当为\"get\", \"set\"。");
		}
		if (get_set.equals("get"))
		{
			this.scale = scale_value;
			this.type = 0;
		}
		else
		{
			this.value = scale_value;
			this.type = 1;
		}
	}

	/** 
	 attribute <target> <attribute> modifier add <uuid> <name> <value> (add|multiply|multiply_base)
	 
	 type - 4
	 @exception ArgumentNotMatchException
	*/
	public Attribute(Selector target, String attribute, UUID uuid, String name, double value, String add_multiply_multiply_base) throws ArgumentNotMatchException {
		this.target = target;
		if (NBTTag.attributes.contains(attribute))
		{
			this.attribute = attribute;
		}
		else
		{
			Project.logger.warn( "未知属性" + attribute);
		}
		this.uuid = uuid;
		if (!ID.IsLegal(name))
		{
			Project.logger.warn( "不是合法的命名空间id:" + name);
		}
		this.name = name;
		this.value = value;
		if (!amb.contains(add_multiply_multiply_base))
		{
			throw new ArgumentNotMatchException("参数错误:" + uuid + "。应当为\"add\", \"multiply\"或\"multiply_base\"");
		}
		this.add_multiply_multiply_base = add_multiply_multiply_base;
		this.type = 4;
	}

	/** 
	 attribute <target> <attribute> modifier remove <uuid>
	 
	 type - 5
	 @exception ArgumentNotMatchException
	*/
	public Attribute(Selector target, String attribute, UUID uuid)
	{
		this.target = target;
		if (NBTTag.attributes.contains(attribute))
		{
			this.attribute = attribute;
		}
		else
		{
			Project.logger.warn( "未知属性" + attribute);
		}
		this.uuid = uuid;
		this.type = 5;
	}

	/** 
	 attribute <target> <attribute> modifier value get <uuid> <scale>
	 
	 type - 6
	 @exception ArgumentNotMatchException
	*/
	public Attribute(Selector target, String attribute, UUID uuid, double scale)
	{
		this.target = target;
		if (NBTTag.attributes.contains(attribute))
		{
			this.attribute = attribute;
		}
		else
		{
			Project.logger.warn( "未知属性" + attribute);
		}
		this.uuid = uuid;
		this.scale = scale;
		this.type = 6;
	}

//C# TO JAVA CONVERTER TASK: There is no preprocessor in Java:
		///#endregion

	@Override
	public String toString()
	{
		String re = "#喵喵喵？这里应该是一个attribute命令，如果你看到了这个注释，说明MC#出现了一些问题！";
		switch (type)
		{
			case -1:
			{
					//attribute <target> <attribute> get [<scale>]
					re = "attribute " + target + " " + attribute + " get " + scale;
					break;
			}
			case 0:
			{
					//attribute <target> <attribute> [base] get [<scale>]
					re = "attribute " + target + " " + attribute + " base get " + scale;
					break;
			}
			case 1:
			{
					//attribute <target> <attribute> base set <value>
					re = "attribute " + target + " " + attribute + " base set " + value;
					break;
			}
			case 4:
			{
					//attribute <target> <attribute> modifier add <uuid> <name> <value> (add|multiply|multiply_base)
					re = "attribute " + target + " " + attribute + " modifier add " + uuid + " " + name + " " + value + " " + add_multiply_multiply_base;
					break;
			}
			case 5:
			{
					//attribute <target> <attribute> modifier remove <uuid>
					re = "attribute " + target + " " + attribute + " modifier remove " + uuid;
					break;
			}
			case 6:
			{
					//attribute <target> <attribute> modifier value get <uuid> <scale>
					re = "attribute " + target + " " + attribute + " modifier value get " + uuid + " " + scale;
					break;
			}
		}
		return re;
	}
}

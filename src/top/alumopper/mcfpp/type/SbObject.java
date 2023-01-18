package top.alumopper.mcfpp.type;

/**
 一个计分板对象。
 */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Inline] public class SbObject
public class SbObject
{
    public String name;
    public String rule;
    public JsonText display;

    /**
     mcfpp数学计算使用的计分板对象。
     */
    public static SbObject MCS_intvar = new SbObject("mcs_intvar", "dummy");

    /**
     mcfpp默认的计分板变量
     */
    public static SbObject MCS_default = new SbObject("mcs_default","dummy");

    public static SbObject MCS_params = new SbObject("mcs_params","dummy");


    public SbObject(String name, String rule)
    {
        this(name, rule, null);
    }

    public SbObject(String name)
    {
        this(name, "dummy", null);
    }

    public SbObject(String name, String rule, JsonText display)
    {
        this.name = name.toLowerCase();
        this.rule = rule.toLowerCase();
        this.display = display;
    }

    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof SbObject object && name.equals(object.name);
    }

}

package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.exception.IllegalFunctionNameException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;

/**
 在指定位置显示粒子效果。
 <code>
 particle &lt;name> [&lt;pos>]
 particle &lt;name> &lt;pos> &lt;delta> &lt;speed> &lt;count> [force|normal] [&lt;viewers>]
 </code>
 */
public class Particle extends Command
{
    private ID name;
    private Pos pos;
    private Vector3<Float> delta;
    private float speed;
    private int count;
    private String force_normal;
    private Selector viewers;

    private Color dust = new Color();
    private float size;
    private Color trans = new Color();
    private BlockState block;
    private int second;
    private ItemStack item;

    //C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: byte type;
    private byte type;

    private static List<String> fn = Arrays.asList("normal", "force");

    /**
     particle &lt;name> [&lt;pos>]

     type 0
     */

    public Particle(ID name)
    {
        this(name, (Pos) null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(ID name, Pos pos = null)
    public Particle(ID name, Pos pos)
    {
        this.name = name;
        this.pos = pos;
        type = 0;
    }

    /**
     particle &lt;name> &lt;pos> &lt;delta> &lt;speed> &lt;count> [force|normal] [&lt;viewers>]

     type 1
     @exception ArgumentNotMatchException
     */

    public Particle(ID name, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal) throws ArgumentNotMatchException {
        this(name, pos, delta, speed, count, force_normal, null);
    }

    public Particle(ID name, Pos pos, Vector3<Float> delta, float speed, int count) throws ArgumentNotMatchException {
        this(name, pos, delta, speed, count, "normal", null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(ID name, Pos pos, Vector3<float> delta, float speed, int count, string force_normal = "normal", Selector viewers = null)
    public Particle(ID name, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal, Selector viewers) throws ArgumentNotMatchException {
        this.name = name;
        this.pos = pos;
        this.delta = delta;
        this.speed = speed;
        this.count = count;
        if (!fn.contains(force_normal))
        {
            throw new ArgumentNotMatchException("参数错误:" + force_normal + "应当为\"normal\"或\"force\"");
        }
        this.force_normal = force_normal;
        this.viewers = viewers;
        type = 1;
    }

    /**
     particle &lt;name> &lt;vec3:color> &lt;size> [&lt;pos>]

     type 2
     */

    public Particle(Color dust, float size) throws IllegalFunctionNameException {
        this(dust, size, (Pos) null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(Color dust, float size, Pos pos = null)
    public Particle(Color dust, float size, Pos pos) throws IllegalFunctionNameException {
        this.name = new ID("minecraft:dust");
        this.pos = pos;
        this.size = size;
        this.dust = dust;
        type = 2;
    }

    /**
     particle &lt;name> &lt;size> &lt;vec3:color> &lt;pos> &lt;delta> &lt;speed> &lt;count> [force|normal] [&lt;viewers>]

     type 3
     @exception ArgumentNotMatchException
     */

    public Particle(Color dust, float size, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal) throws ArgumentNotMatchException, IllegalFunctionNameException {
        this(dust, size, pos, delta, speed, count, force_normal, null);
    }

    public Particle(Color dust, float size, Pos pos, Vector3<Float> delta, float speed, int count) throws ArgumentNotMatchException, IllegalFunctionNameException {
        this(dust, size, pos, delta, speed, count, "normal", null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(Color dust, float size, Pos pos, Vector3<float> delta, float speed, int count, string force_normal = "normal", Selector viewers = null)
    public Particle(Color dust, float size, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal, Selector viewers) throws IllegalFunctionNameException, ArgumentNotMatchException {
        this.name = new ID("minecraft:dust");
        this.dust = dust;
        this.size = size;
        this.pos = pos;
        this.delta = delta;
        this.speed = speed;
        this.count = count;
        if (!fn.contains(force_normal))
        {
            throw new ArgumentNotMatchException("参数错误:" + force_normal + "应当为\"normal\"或\"force\"");
        }
        this.force_normal = force_normal;
        this.viewers = viewers;
        type = 3;
    }

    /**
     particle &lt;name> &lt;vec3:color> &lt;size> &lt;transcolor> [&lt;pos>]

     type 4
     */

    public Particle(Color dust, float size, Color trans) throws IllegalFunctionNameException {
        this(dust, size, trans, null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(Color dust, float size, Color trans, Pos pos = null)
    public Particle(Color dust, float size, Color trans, Pos pos) throws IllegalFunctionNameException {
        this.name = new ID("minecraft:dust_color_transition");
        this.pos = pos;
        this.dust = dust;
        this.size = size;
        this.trans = trans;
        type = 4;
    }

    /**
     particle &lt;name> &lt;vec3:color> &lt;size> &lt;transcolor> &lt;pos> &lt;delta> &lt;speed> &lt;count> [force|normal] [&lt;viewers>]

     type 5
     @exception ArgumentNotMatchException
     */

    public Particle(Color dust, float size, Color trans, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal)
    {
        this(dust, size, trans, pos, delta, speed, count, force_normal, null);
    }

    public Particle(Color dust, float size, Color trans, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        this(dust, size, trans, pos, delta, speed, count, "normal", null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(Color dust, float size, Color trans, Pos pos, Vector3<float> delta, float speed, int count, string force_normal = "normal", Selector viewers = null)
    public Particle(Color dust, float size, Color trans, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal, Selector viewers) throws IllegalFunctionNameException, ArgumentNotMatchException {
        this.name = new ID("minecraft:dust_color_transition");
        this.dust = dust;
        this.size = size;
        this.trans = trans;
        this.pos = pos;
        this.delta = delta;
        this.speed = speed;
        this.count = count;
        if (!fn.contains(force_normal))
        {
            throw new ArgumentNotMatchException("参数错误:" + force_normal + "应当为\"normal\"或\"force\"");
        }
        this.force_normal = force_normal;
        this.viewers = viewers;
        type = 5;
    }

    /**
     particle &lt;name:(block|falling_dust)> &lt;block> [&lt;pos>]

     type 6
     @exception ArgumentNotMatchException
     */

    public Particle(ID name, BlockState block) throws ArgumentNotMatchException {
        this(name, block, null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(ID name,BlockState block, Pos pos = null)
    public Particle(ID name, BlockState block, Pos pos) throws ArgumentNotMatchException {
        this.name = name;
        if (!(name.id.equals("minecraft:block") || name.id.equals("minecraft:falling_dust")))
        {
            throw new ArgumentNotMatchException("参数错误:" + force_normal + "应当为\"minecraft:block\"或\"minecraft:falling_dust\"");
        }
        this.block = block;
        this.pos = pos;
        type = 6;
    }

    /**
     particle &lt;name> &lt;name:(block|falling_dust)> &lt;block> &lt;pos> &lt;delta> &lt;speed> &lt;count> [force|normal] [&lt;viewers>]

     type 7
     @exception ArgumentNotMatchException
     */

    public Particle(ID name, BlockState block, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal)
    {
        this(name, block, pos, delta, speed, count, force_normal, null);
    }

    public Particle(ID name, BlockState block, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        this(name, block, pos, delta, speed, count, "normal", null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(ID name, BlockState block, Pos pos, Vector3<float> delta, float speed, int count, string force_normal = "normal", Selector viewers = null)
    public Particle(ID name, BlockState block, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal, Selector viewers)
    {
        this.name = name;
        if (!(name.id.equals("minecraft:block") || name.id.equals("minecraft:falling_dust")))
        {
            throw new ArgumentNotMatchException("参数错误:" + force_normal + "应当为\"minecraft:block\"或\"minecraft:falling_dust\"");
        }
        this.block = block;
        this.pos = pos;
        this.delta = delta;
        this.speed = speed;
        this.count = count;
        if (!fn.contains(force_normal))
        {
            throw new ArgumentNotMatchException("参数错误:" + force_normal + "应当为\"normal\"或\"force\"");
        }
        this.force_normal = force_normal;
        this.viewers = viewers;
        type = 7;
    }

    /**
     particle &lt;name> &lt;itme> [&lt;pos>]

     type 8
     */

    public Particle(ItemStack item)
    {
        this(item, null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(ItemStack item, Pos pos = null)
    public Particle(ItemStack item, Pos pos)
    {
        this.name = new ID("minecraft:item");
        this.item = item;
        this.pos = pos;
        type = 8;
    }

    /**
     particle &lt;name> &lt;itme> &lt;pos> &lt;delta> &lt;speed> &lt;count> [force|normal] [&lt;viewers>]

     type 9
     @exception ArgumentNotMatchException
     */

    public Particle(ItemStack item, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal)
    {
        this(item, pos, delta, speed, count, force_normal, null);
    }

    public Particle(ItemStack item, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        this(item, pos, delta, speed, count, "normal", null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(ItemStack item, Pos pos, Vector3<float> delta, float speed, int count, string force_normal = "normal", Selector viewers = null)
    public Particle(ItemStack item, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal, Selector viewers)
    {
        this.name = new ID("minecraft:item");
        this.item = item;
        this.pos = pos;
        this.delta = delta;
        this.speed = speed;
        this.count = count;
        if (!fn.contains(force_normal))
        {
            throw new ArgumentNotMatchException("参数错误:" + force_normal + "应当为\"normal\"或\"force\"");
        }
        this.force_normal = force_normal;
        this.viewers = viewers;
        type = 9;
    }

    /**
     particle &lt;name> &lt;second> [&lt;pos>]

     @param second
     */

    public Particle(int second)
    {
        this(second, null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(int second, Pos pos = null)
    public Particle(int second, Pos pos)
    {
        this.name = new ID("minecraft:shriek");
        this.second = second;
        this.pos = pos;
        type = 10;
    }


    public Particle(int second, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal)
    {
        this(second, pos, delta, speed, count, force_normal, null);
    }

    public Particle(int second, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        this(second, pos, delta, speed, count, "normal", null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Particle(int second, Pos pos, Vector3<float> delta, float speed, int count, string force_normal = "normal", Selector viewers = null)
    public Particle(int second, Pos pos, Vector3<Float> delta, float speed, int count, String force_normal, Selector viewers)
    {
        this.name = new ID("minecraft:shriek");
        this.second = second;
        this.pos = pos;
        this.delta = delta;
        this.speed = speed;
        this.count = count;
        if (!fn.contains(force_normal))
        {
            throw new ArgumentNotMatchException("参数错误:" + force_normal + "应当为\"normal\"或\"force\"");
        }
        this.force_normal = force_normal;
        this.viewers = viewers;
        type = 11;
        {
        }
    }

    @Override
    public String toString()
    {
        String re = "#这里是particle喵";
        switch (type) {
            case 0 -> {
                re = "particle " + name + (pos == null ? "" : (" " + pos));
                break;
            }
            case 1 -> {
                re = "particle " + name + " " + pos + " " + delta + " " + speed + " " + count + " " + force_normal + (viewers == null ? "" : " " + viewers);
                break;
            }
            case 2 -> {
                re = "particle " + name + " " + dust.ToParticleRGBString() + " " + size + (pos == null ? "" : (" " + pos));
                break;
            }
            case 3 -> {
                re = "particle " + name + " " + dust.ToParticleRGBString() + " " + size + " " + pos + " " + delta + " " + speed + " " + count + " " + force_normal + (viewers == null ? "" : " " + viewers);
                break;
            }
            case 4 -> {
                re = "particle " + name + " " + dust.ToParticleRGBString() + " " + size + " " + trans.ToParticleRGBString() + (pos == null ? "" : (" " + pos));
                break;
            }
            case 5 -> {
                re = "particle " + name + " " + dust.ToParticleRGBString() + " " + size + " " + trans.ToParticleRGBString() + " " + pos + " " + delta + " " + speed + " " + count + " " + force_normal + (viewers == null ? "" : " " + viewers);
                break;
            }
            case 6 -> {
                re = "particle " + name + " " + block + " " + (pos == null ? "" : (" " + pos));
                break;
            }
            case 7 -> {
                re = "particle " + name + " " + block + " " + pos + " " + delta + " " + speed + " " + count + " " + force_normal + (viewers == null ? "" : " " + viewers);
                break;
            }
            case 8 -> {
                re = "particle " + name + " " + item + (pos == null ? "" : (" " + pos));
                break;
            }
            case 9 -> {
                re = "particle " + name + " " + item + " " + pos + " " + delta + " " + speed + " " + count + " " + force_normal + (viewers == null ? "" : " " + viewers);
                break;
            }
            case 10 -> {
                re = "particle " + name + " " + second + (pos == null ? "" : (" " + pos));
                break;
            }
            case 11 -> {
                re = "particle " + name + " " + second + " " + pos + " " + delta + " " + speed + " " + count + " " + force_normal + (viewers == null ? "" : " " + viewers);
                break;
            }
        }
        return re;
    }
}

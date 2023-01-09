package top.alumopper.mcfpp.command;

/// <summary>
    /// 用于创建或修改Boss栏。
    /// <code>
    /// bossbar add <id> >name>
    /// bossbar get <id> (max|players|value|visible)
    /// bossbar list
    /// bossbar remove <id>
    /// bossbar set <id> (color|max|name|players|style|value|visible)
    /// ... color (blue|green|pink|purple|red|white|yellow)
    /// ... max <max>
    /// ... name <name>
    /// ... players [<targets>]
    /// ... style (notched_6|notched_10|notched_12|notched_20|progress)
    /// ... value <value>
    /// ... visible <visible>
    /// </code>
    /// </summary>

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;

/**
 * 用于创建或修改Boss栏。
 * <pre>
 *     {@code
 *     bossbar add <id> >name>
 *     bossbar get <id> (max|players|value|visible)
 *     bossbar list
 *     bossbar remove <id>
 *     bossbar set <id> (color|max|name|players|style|value|visible)
 *     ... color (blue|green|pink|purple|red|white|yellow)
 *     ... max <max>
 *     ... name <name>
 *     ... players [<targets>]
 *     ... style (notched_6|notched_10|notched_12|notched_20|progress)
 *     ... value <value>
 *     ... visible <visible>
 *     }
 * </pre>
 */
public class Bossbar extends Command
{
    int type;
    ID id;
    JsonText name;
    String max_players_value_visible;
    String color;
    String max_value;
    int x;
    Selector targets;
    String style;
    boolean visible;

    private static List<String> mpvv = Arrays.asList("max", "players", "value", "visible");
    private static List<String> mv =  Arrays.asList("max", "value");

    /// <summary>
    /// bossbar add <id> >name>
    /// </summary>
    /// type - 0
    public Bossbar(ID id, JsonText name)
    {
        this.id = id;
        this.name = name;
        type = 0;
    }

    /// <summary>
    /// bossbar get <id> (max|players|value|visible)
    /// </summary>
    /// type - 1
    /// <exception cref="ArgumentNotMatchException"></exception>
    public Bossbar(ID id, String max_players_value_visible) throws ArgumentNotMatchException {
        this.id = id;
        if (!mpvv.contains(max_players_value_visible))
        {
            throw new ArgumentNotMatchException("参数错误:" + max_players_value_visible + "。应当为\"max\", \"players\", \"value\"或\"visible\"");
        }
        this.max_players_value_visible = max_players_value_visible;
        type = 1;
    }

    /// <summary>
    /// bossbar list
    /// </summary>
    /// type - 2
    public Bossbar()
    {
        this.type = 2;
    }

    /// <summary>
    /// bossbar set <id> color (blue|green|pink|purple|red|white|yellow)
    /// </summary>
    /// <param name="set">任意字符串，反正没有用，只是用于区分方法用的</param>
    /// type - 3
    public Bossbar(ID id, top.alumopper.mcfpp.type.Bossbar.Color color)
    {
        this.id = id;
        switch (color)
        {
            case blue:
                this.color = "blue";
                break;
            case green:
                this.color = "green";
                break;
            case pink:
                this.color = "pink";
                break;
            case purple:
                this.color = "purple";
                break;
            case red:
                this.color = "red";
                break;
            case white:
                this.color = "white";
                break;
            case yellow:
                this.color = "yellow";
                break;
        }
        this.type = 3;
    }

    /// <summary>
    /// bossbar set <id> (max|value) <x>
    /// </summary>
    /// <param name="set">任意字符串，反正没有用，只是用于区分方法用的</param>
    /// type - 4
    public Bossbar(ID id, String max_value, int x) throws ArgumentNotMatchException {
        this.id = id;
        if (!mv.contains(max_value))
        {
            throw new ArgumentNotMatchException("参数错误:" + max_value + "。应当为\"max\"或\"value\"");
        }
        this.max_value = max_value;
        this.x = x;
        this.type = 4;
    }

    /// <summary>
    /// bossbar set <id> name <name>
    /// </summary>
    /// <param name="set">任意字符串，反正没有用，只是用于区分方法用的</param>
    /// type - 5
    public Bossbar(ID id, String set, JsonText name)
    {
        this.id = id;
        this.name = name;
        this.type = 5;
    }

    /// <summary>
    /// bossbar set <id> players [<targets>]
    /// </summary>
    /// type - 6
    /// <param name="targets">若为null，即此参数为无</param>
    public Bossbar(ID id, String set, Selector targets)
    {
        this.id = id;
        this.targets = targets;
        this.type = 6;
    }

    /// <summary>
    /// bossbar set <id> style (notched_6|notched_10|notched_12|notched_20|progress)
    /// </summary>
    /// type - 7
    public Bossbar(ID id, top.alumopper.mcfpp.type.Bossbar.Style style)
    {
        this.id = id;
        switch (style) {
            case notched_6 -> this.style = "notched_6";
            case notched_10 -> this.style = "notched_10";
            case notched_12 -> this.style = "notched_12";
            case notched_20 -> this.style = "notched_20";
            case progress -> this.style = "progress";
        }
        this.type = 7;
    }

    /// <summary>
    /// bossbar set <id> visible <visible>
    /// </summary>
    /// type - 8
    public Bossbar(ID id, boolean visible)
    {
        this.id = id;
        this.visible = visible;
        this.type = 8;
    }

    /// <summary>
    /// bossbar remove <id>
    /// </summary>
    /// <param name="id"></param>
    public Bossbar(ID id)
    {
        this.id = id;
        type = 9;
    }

    @Override
    public String toString()
    {
        String re = "#喵喵喵？这里应该是一个bossbar命令，如果你看到了这个注释，说明MC#出现了一些问题！";
        switch (type) {
            case 0 -> {
                //bossbar add <id> <name>
                re = "bossbar add " + id + " " + name;
                break;
            }
            case 1 -> {
                //bossbar get <id> (max|players|value|visible)
                re = "bossbar get " + id + " " + max_players_value_visible;
                break;
            }
            case 2 -> {
                //bossbar list
                re = "bossbar list";
                break;
            }
            case 3 -> {
                //bossbar set <id> color (blue|green|pink|purple|red|white|yellow)
                re = "bossbar set " + id + " color " + color;
                break;
            }
            case 4 -> {
                //bossbar set <id> (max|value) <x>
                re = "bossbar set <id> " + max_value + " " + x;
                break;
            }
            case 5 -> {
                //bossbar set <id> name <name>
                re = "bossbar set " + id + " name " + name;
                break;
            }
            case 6 -> {
                //bossbar set <id> players [<targets>]
                re = "bossbar set " + id + " players" + (targets == null ? "" : " " + targets);
                break;
            }
            case 7 -> {
                //bossbar set <id> style (notched_6|notched_10|notched_12|notched_20|progress)
                re = "bossbar set " + id + " style " + style;
                break;
            }
            case 8 -> {
                //bossbar set <id> visible <visible>
                re = "bossbar set " + id + " visible " + (visible ? "true" : "false");
                break;
            }
            case 9 -> {
                //bossbar remove <id>
                re = "bossbar remove " + id;
                break;
            }
        }
        return re;
    }
}

package top.alumopper.mcfpp.command;


import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.*;

import java.util.Arrays;
import java.util.List;

/**
 这些命令管理记分板的目标、玩家和队伍。
 <code>
 scoreboard objectives (add|list|modify|remove|setdisplay)
 add &lt;objective> &lt;rule> [&lt;display>]
 list
 modify &lt;rule> displayname &lt;display>
 modify &lt;objective> rendertype (hearts|integer)
 remove &lt;objective>
 setdisplay &lt;displaySlot> [&lt;objective>]
 scoreboard players(add|enable|get|list|operation|remove|reset|set)
 add &lt;target> &lt;objective> &lt;value>
 enable &lt;target> &lt;objective(trigger)>
 get &lt;target> &lt;objective>
 list [&lt;target>]
 operation &lt;target> &lt;objective> &lt;operation> &lt;source> &lt;sourceObject>
 remove &lt;target> &lt;objective> &lt;value>
 reset &lt;target> [&lt;objective>]
 set &lt;target> &lt;objective> &lt;value>
 </code>
 */
public class Scoreboard extends Command
{
    private almrs add_list_modify_remove_setdisplay = almrs.values()[0];
    private SbObject objective;
    private String rule;
    private JsonText display;
    private hi hearts_integer = hi.values()[0];
    private DisplaySlot displaySlot;
    private String target;
    private int value;
    private eg enable_get = eg.values()[0];
    private String source;
    private SbObject sourceObject;
    private String operation;
    private ars add_remove_set = ars.values()[0];

    private int type;
    public enum almrs
    {
        add,
        list,
        modify,
        remove,
        setdisplay;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static almrs forValue(int value)
        {
            return values()[value];
        }
    }
    public enum hi
    {
        hearts,
        integer;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static hi forValue(int value)
        {
            return values()[value];
        }
    }
    public enum eg
    {
        get,
        enable;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static eg forValue(int value)
        {
            return values()[value];
        }
    }
    public enum ars
    {
        add,
        remove,
        set;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static ars forValue(int value)
        {
            return values()[value];
        }
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

    public static class Operation
    {
        public static String PLUS = "+=";
        public static String MINUS = "-=";
        public static String TIME = "*=";
        public static String DIVIDE = "/=";
        public static String REMAINDER = "%=";
        public static String ASSIGN = "=";
        public static String BIGGER = ">";
        public static String SMALLER = "<";
        public static String EXCHANGE = "><";

        public static List<String> ALL = Arrays.asList(PLUS, MINUS, TIME, DIVIDE, REMAINDER, ASSIGN, BIGGER, SMALLER, EXCHANGE);
    }

    /**
     合法的显示位置
     */
    public static class DisplaySlot
    {
        public static DisplaySlot list = new DisplaySlot(Slot.list);
        public static DisplaySlot sidebar = new DisplaySlot(Slot.sidebar);
        public static DisplaySlot belowName = new DisplaySlot(Slot.belowName);

        private String slot;

        /**
         合法的显示位置列表
         */
        public enum Slot
        {
            list,
            sidebar,
            sidebar_team,
            belowName;

            public static final int SIZE = java.lang.Integer.SIZE;

            public int getValue()
            {
                return this.ordinal();
            }

            public static Slot forValue(int value)
            {
                return values()[value];
            }
        }
        public DisplaySlot(Slot slot)
        {
            this(slot, null);
        }

        /**
         生成一个合法的显示位置

         @param slot
         @param color 用于slot为sidebar_team时。其余时候即使设定也不会有效果
         */
        public DisplaySlot(Slot slot, Color.Colors color)
        {
            if (slot.equals(Slot.sidebar_team) && color == null)
            {
                throw new ArgumentNotMatchException("需要一个颜色");
            }
            this.slot = slot.name().replace("_",".") + (slot.name().replace("_",".").equals("sidebar.team") ? ("." + color.name()) : "");
        }

        @Override
        public String toString()
        {
            return slot;
        }
    }


    public Scoreboard(SbObject objective, String rule)
    {
        this(objective, rule, null);
    }

    /**
     scoreboard objectives add &lt;objective> &lt;rule> [&lt;display>]

     @param objective
     @param rule
     @param display
     */
    public Scoreboard(SbObject objective, String rule, JsonText display)
    {
        this.objective = objective;
        this.rule = rule;
        this.display = display;
        this.type = 0;
    }

    /**
     scoreboard list
     */
    public Scoreboard()
    {
        this.type = 1;
    }

    /**
     scoreboard objectives modify &lt;rule> displayname &lt;display>

     @param rule
     @param display
     */
    public Scoreboard(String rule, JsonText display)
    {
        this.rule = rule;
        this.display = display;
        this.type = 2;
    }

    /**
     scoreboard objectives modify &lt;objective> rendertype (hearts|integer)

     @param objective
     @param hearts_integer
     */
    public Scoreboard(SbObject objective, hi hearts_integer)
    {
        this.objective = objective;
        this.hearts_integer = hearts_integer;
        this.type = 3;
    }

    /**
     scoreboard objectives remove &lt;objective>

     @param objective
     */
    public Scoreboard(SbObject objective)
    {
        this.objective = objective;
        this.type = 4;
    }

    /**
     scoreboard objectives setdisplay &lt;displaySlot> [&lt;objective>]

     @param displaySlot
     @param objective
     */
    public Scoreboard(DisplaySlot displaySlot, SbObject objective)
    {
        this.displaySlot = displaySlot;
        this.objective = objective;
        this.type = 5;
    }

    /**
     scoreboard players (add|remove|set) &lt;target> &lt;objective> &lt;value>

     @param add_remove_set
     @param target
     @param objective
     @param value
     */
    public Scoreboard(ars add_remove_set, String target, SbObject objective, int value)
    {
        this.add_remove_set = add_remove_set;
        this.target = target;
        this.objective = objective;
        this.value = value;
        this.type = 6;
    }

    /**
     scoreboard players (enable|get) &lt;target> &lt;objective(trigger)>

     @param enable_get
     @param target
     @param objective
     */
    public Scoreboard(eg enable_get, String target, SbObject objective)
    {
        this.enable_get = enable_get;
        this.target = target;
        this.objective = objective;
        this.type = 7;
    }

    /**
     scoreboard players list [&lt;target>]

     @param target
     */
    public Scoreboard(String target)
    {
        this.target = target;
        this.type = 8;
    }

    /**
     scoreboard players operation &lt;target> &lt;objective> &lt;operation> &lt;source> &lt;sourceObject>

     @param target
     @param objective
     @param operation
     @param source
     @param sourceObject
     @exception ArgumentNotMatchException
     */
    public Scoreboard(String target, SbObject objective, String operation, String source, SbObject sourceObject)
    {
        this.target = target;
        this.objective = objective;
        if (!Operation.ALL.contains(operation))
        {
            throw new ArgumentNotMatchException("参数错误: " + operation + "。非法的运算符");
        }
        this.operation = operation;
        this.source = source;
        this.sourceObject = sourceObject;
        this.type = 9;
    }

    /**
     scoreboard players reset &lt;target> [&lt;objective>]

     @param target
     @param objective
     */
    public Scoreboard(String target, SbObject objective)
    {
        this.target = target;
        this.objective = objective;
        this.type = 10;
    }

    @Override
    public String toString()
    {
        String re = "#scoreboard qwq";
        switch (type)
        {
            case 0:
            {
                re = "scoreboard objectives add " + objective + " " + rule + " " + display;
                break;
            }
            case 1:
            {
                re = "scoreboard objectives list";
                break;
            }
            case 2:
            {
                re = "scoreboard objectives modify " + rule + " displayname " + display;
                break;
            }
            case 3:
            {
                re = "scoreboard objectives modify " + objective + " rendertype " + hearts_integer.name();
                break;
            }
            case 4:
            {
                re = "scoreboard objectives remove " + objective;
                break;
            }
            case 5:
            {
                re = "scoreboard objectives setdisplay " + displaySlot + " " + objective;
                break;
            }
            case 6:
            {
                re = "scoreboard players " + add_remove_set.name() + " " + target + " " + objective + " " + value;
                break;
            }
            case 7:
            {
                re = "scoreboard players " + enable_get.name() + " " + target + " " + objective;
                break;
            }
            case 8:
            {
                re = "scoreboard players list " + target;
                break;
            }
            case 9:
            {
                re = "scoreboard players operation " + target + " " + objective + " " + operation + " " + source + " " + sourceObject;
                break;
            }
            case 10:
            {
                re = "scoreboard players reset " + target + " " + objective;
                break;
            }
        }
        return re;
    }
}

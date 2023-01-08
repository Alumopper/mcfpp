using MCSharp.Exception;
using top.alumopper.mcfpp.type;
using MCSharp.Util;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static MCSharp.Cmds.Scoreboard;

namespace MCSharp.Cmds
{
    /// <summary>
    /// 这些命令管理记分板的目标、玩家和队伍。
    /// <code>
    /// scoreboard objectives (add|list|modify|remove|setdisplay)
    ///     add <objective> <rule> [<display>]
    ///     list
    ///     modify <rule> displayname <display>
    ///     modify <objective> rendertype (hearts|integer)
    ///     remove <objective>
    ///     setdisplay <displaySlot> [<objective>]
    /// scoreboard players(add|enable|get|list|operation|remove|reset|set)
    ///     add <target> <objective> <value>
    ///     enable <target> <objective(trigger)>
    ///     get <target> <objective>
    ///     list [<target>]
    ///     operation <target> <objective> <operation> <source> <sourceObject>
    ///     remove <target> <objective> <value>
    ///     reset <target> [<objective>]
    ///     set <target> <objective> <value>
    /// </code>
    /// </summary>
    public class Scoreboard : Command
    {
        
        almrs add_list_modify_remove_setdisplay;
        SbObject objective;
        String rule;
        JsonText display;
        hi hearts_integer;
        DisplaySlot displaySlot;
        String target;
        int value;
        eg enable_get;
        String source;
        SbObject sourceObject;
        String operation;
        ars add_remove_set;

        int type;
        #endregion

        
        public enum almrs
        {
            add,list,modify,remove,setdisplay
        }
        public enum hi
        {
            hearts,integer
        }
        public enum eg { 
            get,enable
        }
        public enum ars
        {
            add, remove, set
        }
        #endregion

        public class Operation
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

            public static String[] ALL = new String[] { PLUS, MINUS, TIME, DIVIDE, REMAINDER, ASSIGN, BIGGER, SMALLER, EXCHANGE };
        }

        /// <summary>
        /// 合法的显示位置
        /// </summary>
        public class DisplaySlot
        {
            public static DisplaySlot list = new DisplaySlot(Slot.list);
            public static DisplaySlot sidebar = new DisplaySlot(Slot.sidebar);
            public static DisplaySlot belowName = new DisplaySlot(Slot.belowName);

            String slot;

            /// <summary>
            /// 合法的显示位置列表
            /// </summary>
            public enum Slot
            {
                list, sidebar, sidebar_team, belowName
            }
            
            /// <summary>
            /// 生成一个合法的显示位置
            /// </summary>
            /// <param name="slot"></param>
            /// <param name="color">用于slot为sidebar_team时。其余时候即使设定也不会有效果</param>
            public DisplaySlot(Slot slot, Color.Colors? color = null)
            {
                if(slot.Equals(Slot.sidebar_team) && color == null)
                {
                    throw new ArgumentNotMatchException("需要一个颜色");
                }
                this.slot = Tools.GetEnumString(slot).Replace("_",".") + (slot.Equals("sidebar.team") ? ("." + Tools.GetEnumString(color)) : "");
            }

            public override String toString()
            {
                return slot;
            }
        }

        /// <summary>
        /// scoreboard objectives add <objective> <rule> [<display>]
        /// </summary>
        /// <param name="objective"></param>
        /// <param name="rule"></param>
        /// <param name="display"></param>
        public Scoreboard(SbObject objective, String rule, JsonText display = null)
        {
            this.objective = objective;
            this.rule = rule;
            this.display = display;
            this.type = 0;
        }

        /// <summary>
        /// scoreboard list
        /// </summary>
        public Scoreboard() {
            this.type = 1;
        }

        /// <summary>
        /// scoreboard objectives modify <rule> displayname <display>
        /// </summary>
        /// <param name="rule"></param>
        /// <param name="display"></param>
        public Scoreboard(String rule, JsonText display)
        {
            this.rule = rule;
            this.display = display;
            this.type = 2;
        }

        /// <summary>
        /// scoreboard objectives modify <objective> rendertype (hearts|integer)
        /// </summary>
        /// <param name="objective"></param>
        /// <param name="hearts_integer"></param>
        public Scoreboard(SbObject objective, hi hearts_integer)
        {
            this.objective = objective;
            this.hearts_integer = hearts_integer;
            this.type = 3;
        }

        /// <summary>
        /// scoreboard objectives remove <objective>
        /// </summary>
        /// <param name="objective"></param>
        public Scoreboard(SbObject objective)
        {
            this.objective = objective;
            this.type = 4;
        }

        /// <summary>
        /// scoreboard objectives setdisplay <displaySlot> [<objective>]
        /// </summary>
        /// <param name="displaySlot"></param>
        /// <param name="objective"></param>
        public Scoreboard(DisplaySlot displaySlot, SbObject objective)
        {
            this.displaySlot = displaySlot;
            this.objective = objective;
            this.type = 5;
        }

        /// <summary>
        /// scoreboard players (add|remove|set) <target> <objective> <value>
        /// </summary>
        /// <param name="add_remove_set"></param>
        /// <param name="target"></param>
        /// <param name="objective"></param>
        /// <param name="value"></param>
        public Scoreboard(ars add_remove_set,String target, SbObject objective, int value)
        {
            this.add_remove_set = add_remove_set;
            this.target = target;
            this.objective = objective;
            this.value = value;
            this.type = 6;
        }

        /// <summary>
        /// scoreboard players (enable|get) <target> <objective(trigger)>
        /// </summary>
        /// <param name="enable_get"></param>
        /// <param name="target"></param>
        /// <param name="objective"></param>
        public Scoreboard(eg enable_get, String target, SbObject objective)
        {
            this.enable_get = enable_get;
            this.target = target;
            this.objective = objective;
            this.type = 7;
        }

        /// <summary>
        /// scoreboard players list [<target>]
        /// </summary>
        /// <param name="target"></param>
        public Scoreboard(String target = null)
        {
            this.target = target;
            this.type = 8;
        }

        /// <summary>
        /// scoreboard players operation <target> <objective> <operation> <source> <sourceObject>
        /// </summary>
        /// <param name="target"></param>
        /// <param name="objective"></param>
        /// <param name="operation"></param>
        /// <param name="source"></param>
        /// <param name="sourceObject"></param>
        /// <exception cref="ArgumentNotMatchException"></exception>
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

        /// <summary>
        /// scoreboard players reset <target> [<objective>]
        /// </summary>
        /// <param name="target"></param>
        /// <param name="objective"></param>
        public Scoreboard(String target, SbObject objective = null)
        {
            this.target = target;
            this.objective = objective;
            this.type = 10;
        }

        public override String toString()
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
                        re = "scoreboard objectives modify " + objective + " rendertype " + Tools.GetEnumString(hearts_integer);
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
                        re = "scoreboard players " + Tools.GetEnumString(add_remove_set) + " " + target + " " + objective + " " + value;
                        break;
                    }
                case 7:
                    {
                        re = "scoreboard players " + Tools.GetEnumString(enable_get) + " " + target + " " + objective;
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
}

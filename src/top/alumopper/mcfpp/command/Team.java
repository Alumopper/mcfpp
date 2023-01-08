using top.alumopper.mcfpp.type;
using MCSharp.Util;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace MCSharp.Cmds
{
    /// <summary>
    /// 管理队伍。
    /// <code>
    /// team list [<team>]
    /// team add <team> [<displayName>]
    /// team remove <team>
    /// team empty <team>
    /// team join <team> [<members>]
    /// team leave <members>
    /// team modify <team> <option> <value>
    /// </code>
    /// </summary>
    public class Team : Command{

        String team;
        JsonText displayName;
        re remove_empty;
        int type;
        Selector members;
        OptionBool optionBool;
        boolean valueBool;
        Color.Colors valueColor;
        OptionColor optionColor;
        OptionJSON optionJSON;
        OptionVisibility optionVisibility;
        OptionCollision optionCollision;
        ArgCollision argCollision;
        ArgVisibility argVisibility;
        JsonText jsonText;

        public enum re
        {
            remove,empty
        }

        public enum OptionBool
        {
            friendlyFire, seeFriendlyInvisibles, collisionRule
        }      
        public enum OptionJSON
        {
            displayName, prefix, suffix
        }        
        public enum OptionColor
        {
            color
        }
        public enum OptionVisibility
        {
            nametagVisibility, deathMessageVisibility
        }
        public enum OptionCollision
        {
            collisionRule         
        }
        public enum ArgVisibility
        {
            never, hideForOtherTeams, hideForOwnTeam, always
        }
        public enum ArgCollision
        {
            always, pushOtherTeams, pushOwnTeam, never
    }
        
        /// <summary>
        /// team list [<team>]
        /// </summary>
        /// <param name="team"></param>
        public Team(String team = null)
        {
            this.team = team;
            type = 0;
        }

        /// <summary>
        /// team add <team> [<displayName>]
        /// </summary>
        /// <param name="team"></param>
        /// <param name="displayName"></param>
        public Team(String team, JsonText displayName = null) : this(team)
        {
            this.displayName = displayName;
            type = 1;
        }

        /// <summary>
        /// team (remove|empty) <team>
        /// </summary>
        /// <param name="remove_empty"></param>
        /// <param name="team"></param>
        public Team(re remove_empty, String team)
        {
            this.remove_empty = remove_empty;
            this.team = team;
            type = 2;
        }

        /// <summary>
        /// team join <team> [<members>]
        /// </summary>
        /// <param name="team"></param>
        /// <param name="members"></param>
        public Team(String team, Selector members)
        {
            this.team = team;
            this.members = members;
            type = 3;
        }

        /// <summary>
        /// team leave <members>
        /// </summary>
        /// <param name="members"></param>
        public Team(Selector members)
        {
            this.members = members;
            type = 4;
        }

        /// <summary>
        /// team modify <team> <option> <value>
        /// </summary>
        /// <param name="team"></param>
        /// <param name="option"></param>
        /// <param name="value"></param>
        public Team(String team, OptionBool option, boolean value)
        {
            this.team = team;
            this.optionBool = option;
            this.valueBool = value;
            type = 5;
        }

        /// <summary>
        /// team modify <team> <option> <value>
        /// </summary>
        /// <param name="team"></param>
        /// <param name="option"></param>
        /// <param name="value"></param>
        public Team(String team, OptionColor option, Color.Colors value)
        {
            this.team = team;
            this.optionColor = option;
            this.valueColor = value;
            type = 6;
        }

        /// <summary>
        /// team modify <team> <option> <value>
        /// </summary>
        public Team(String team, OptionJSON option, JsonText jsonText)
        {
            this.team = team;
            this.optionJSON = option;
            this.jsonText = jsonText;
            type = 7;
        }

        /// <summary>
        /// team modify <team> <option> <value>
        /// </summary>
        public Team(String team, OptionVisibility option, ArgVisibility value)
        {
            this.team = team;
            this.optionVisibility = option;
            this.argVisibility = value;
            type = 8;
        }

        /// <summary>
        /// team modify <team> <option> <value>
        /// </summary>
        public Team(String name, OptionCollision option, ArgCollision value)
        {
            this.team = name;
            this.optionCollision = option;
            this.argCollision = value;
            type = 9;
        }
        
        public override String toString()
        {
            String re = "team ";
            switch (type)
            {
                case 0:
                    re += " list";
                    if (team != null)
                        re += " " + team;
                    break;
                case 1:
                    re += " add " + team;
                    if (displayName != null)
                        re += " " + displayName;
                    break;
                case 2:
                    re += " " + Tools.GetEnumString(remove_empty) + " " + team;
                    break;
                case 3:
                    re += " join " + team;
                    if (members != null)
                        re += " " + members;
                    break;
                case 4:
                    re += " leave " + members;
                    break;
                case 5:
                    re += " modify " + team + " " + Tools.GetEnumString(optionBool) + " " + valueBool;
                    break;
                case 6:
                    re += " modify " + team + " " + Tools.GetEnumString(optionColor) + " " + Tools.GetEnumString(valueColor);
                    break;
                case 7:
                    re += " modify " + team + " " + Tools.GetEnumString(optionJSON) + " " + jsonText;
                    break;
                case 8:
                    re += " modify " + team + " " + Tools.GetEnumString(optionCollision) + " " + Tools.GetEnumString(argCollision);
                    break;
                case 9:
                    re += " modify " + team + " " + Tools.GetEnumString(optionVisibility) + " " + Tools.GetEnumString(argVisibility);
                    break;
            }
            return re;
        }
    }
}

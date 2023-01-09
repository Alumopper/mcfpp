package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;

/**
 管理队伍。
 <code>
 team list [&lt;team>]
 team add &lt;team> [&lt;displayName>]
 team remove &lt;team>
 team empty &lt;team>
 team join &lt;team> [&lt;members>]
 team leave &lt;members>
 team modify &lt;team> &lt;option> &lt;value>
 </code>
 */
public class Team extends Command
{

    private String team;
    private JsonText displayName;
    private re remove_empty = re.values()[0];
    private int type;
    private Selector members;
    private OptionBool optionBool = OptionBool.values()[0];
    private boolean valueBool;
    private Color.Colors valueColor;
    private OptionColor optionColor = OptionColor.values()[0];
    private OptionJSON optionJSON = OptionJSON.values()[0];
    private OptionVisibility optionVisibility = OptionVisibility.values()[0];
    private OptionCollision optionCollision = OptionCollision.values()[0];
    private ArgCollision argCollision = ArgCollision.values()[0];
    private ArgVisibility argVisibility = ArgVisibility.values()[0];
    private JsonText jsonText;

    public enum re
    {
        remove,
        empty;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static re forValue(int value)
        {
            return values()[value];
        }
    }

    public enum OptionBool
    {
        friendlyFire,
        seeFriendlyInvisibles,
        collisionRule;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static OptionBool forValue(int value)
        {
            return values()[value];
        }
    }
    public enum OptionJSON
    {
        displayName,
        prefix,
        suffix;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static OptionJSON forValue(int value)
        {
            return values()[value];
        }
    }
    public enum OptionColor
    {
        color;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static OptionColor forValue(int value)
        {
            return values()[value];
        }
    }
    public enum OptionVisibility
    {
        nametagVisibility,
        deathMessageVisibility;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static OptionVisibility forValue(int value)
        {
            return values()[value];
        }
    }
    public enum OptionCollision
    {
        collisionRule;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static OptionCollision forValue(int value)
        {
            return values()[value];
        }
    }
    public enum ArgVisibility
    {
        never,
        hideForOtherTeams,
        hideForOwnTeam,
        always;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static ArgVisibility forValue(int value)
        {
            return values()[value];
        }
    }
    public enum ArgCollision
    {
        always,
        pushOtherTeams,
        pushOwnTeam,
        never;

        public static final int SIZE = java.lang.Integer.SIZE;

        public int getValue()
        {
            return this.ordinal();
        }

        public static ArgCollision forValue(int value)
        {
            return values()[value];
        }
    }

    /**
     team list [&lt;team>]

     @param team
     */
    public Team(String team)
    {
        this.team = team;
        type = 0;
    }

    /**
     team add &lt;team> [&lt;displayName>]

     @param team
     @param displayName
     */
    public Team(String team, JsonText displayName)
    {
        this(team);
        this.displayName = displayName;
        type = 1;
    }

    /**
     team (remove|empty) &lt;team>

     @param remove_empty
     @param team
     */
    public Team(re remove_empty, String team)
    {
        this.remove_empty = remove_empty;
        this.team = team;
        type = 2;
    }

    /**
     team join &lt;team> [&lt;members>]

     @param team
     @param members
     */
    public Team(String team, Selector members)
    {
        this.team = team;
        this.members = members;
        type = 3;
    }

    /**
     team leave &lt;members>

     @param members
     */
    public Team(Selector members)
    {
        this.members = members;
        type = 4;
    }

    /**
     team modify &lt;team> &lt;option> &lt;value>

     @param team
     @param option
     @param value
     */
    public Team(String team, OptionBool option, boolean value)
    {
        this.team = team;
        this.optionBool = option;
        this.valueBool = value;
        type = 5;
    }

    /**
     team modify &lt;team> &lt;option> &lt;value>

     @param team
     @param option
     @param value
     */
    public Team(String team, OptionColor option, Color.Colors value)
    {
        this.team = team;
        this.optionColor = option;
        this.valueColor = value;
        type = 6;
    }

    /**
     team modify &lt;team> &lt;option> &lt;value>
     */
    public Team(String team, OptionJSON option, JsonText jsonText)
    {
        this.team = team;
        this.optionJSON = option;
        this.jsonText = jsonText;
        type = 7;
    }

    /**
     team modify &lt;team> &lt;option> &lt;value>
     */
    public Team(String team, OptionVisibility option, ArgVisibility value)
    {
        this.team = team;
        this.optionVisibility = option;
        this.argVisibility = value;
        type = 8;
    }

    /**
     team modify &lt;team> &lt;option> &lt;value>
     */
    public Team(String name, OptionCollision option, ArgCollision value)
    {
        this.team = name;
        this.optionCollision = option;
        this.argCollision = value;
        type = 9;
    }

    @Override
    public String toString()
    {
        String re = "team ";
        switch (type)
        {
            case 0:
                re += " list";
                if (team != null)
                {
                    re += " " + team;
                }
                break;
            case 1:
                re += " add " + team;
                if (displayName != null)
                {
                    re += " " + displayName;
                }
                break;
            case 2:
                re += " " + remove_empty.name() + " " + team;
                break;
            case 3:
                re += " join " + team;
                if (members != null)
                {
                    re += " " + members;
                }
                break;
            case 4:
                re += " leave " + members;
                break;
            case 5:
                re += " modify " + team + " " + optionBool.name() + " " + valueBool;
                break;
            case 6:
                re += " modify " + team + " " + optionColor.name() + " " + valueColor.name();
                break;
            case 7:
                re += " modify " + team + " " + optionJSON.name() + " " + jsonText;
                break;
            case 8:
                re += " modify " + team + " " + optionCollision.name() + " " + argCollision.name();
                break;
            case 9:
                re += " modify " + team + " " + optionVisibility.name() + " " + argVisibility.name();
                break;
        }
        return re;
    }
}

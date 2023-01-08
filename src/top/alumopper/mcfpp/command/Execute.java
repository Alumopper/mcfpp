package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.exception.ExecuteCommandListEndException;
import top.alumopper.mcfpp.type.*;

import java.util.*;
import java.util.List;

public class Execute extends Command
{
    public abstract static class ExecuteChildCommand
    {
    }

    public static class Align extends ExecuteChildCommand
    {
        private final String axe;

        public Align(String axe) throws ArgumentNotMatchException {
            for (char c : axe.toCharArray())
            {
                if ('x' > c || c > 'z')
                {
                    throw new ArgumentNotMatchException("参数错误:" + axe + "。只能为xyz的组合");
                }
            }
            this.axe = axe;
        }

        @Override
        public String toString()
        {
            return "align " + axe;
        }
    }

    public static class Anchored extends ExecuteChildCommand
    {
        private final String anchor;

        private static final List<String> ef = Arrays.asList("eyes", "feet");

        public Anchored(String eyes_feet) throws ArgumentNotMatchException {
            if (!ef.contains(eyes_feet))
            {
                throw new ArgumentNotMatchException("参数错误:" + eyes_feet + "。应当为\"eyes\"或者\"feet\"");
            }
            this.anchor = eyes_feet;
        }

        @Override
        public String toString()
        {
            return "anchored " + anchor;
        }
    }

    public static class As extends ExecuteChildCommand
    {
        private final Selector targets;

        public As(Selector targets)
        {
            this.targets = targets;
        }

        @Override
        public String toString()
        {
            return "as " + targets;
        }
    }

    public static class At extends ExecuteChildCommand
    {
        private final Selector targets;

        public At(Selector targets)
        {
            this.targets = targets;
        }

        @Override
        public String toString()
        {
            return "at " + targets;
        }
    }

    public static class Facing extends ExecuteChildCommand
    {
        private Selector targets;
        private Pos pos;
        private String anchor;

        private static List<String> ef = Arrays.asList("eyes", "feet");

        public Facing(Selector targets, String eyes_feet) throws ArgumentNotMatchException {
            this.targets = targets;
            if (!ef.contains(eyes_feet))
            {
                throw new ArgumentNotMatchException("参数错误:" + eyes_feet + "。应当为\"eyes\"或者\"feet\"");
            }
            this.anchor = eyes_feet;
        }

        public Facing(Pos pos)
        {
            this.pos = pos;
        }

        @Override
        public String toString()
        {
            if (targets == null)
            {
                return "facing " + pos;
            }
            else
            {
                return "facing" + targets + " " + anchor;
            }
        }
    }

    public static class In extends ExecuteChildCommand
    {
        private ID dimension;

        public In(ID dimension)
        {
            this.dimension = dimension;
        }

        @Override
        public String toString()
        {
            return "in " + dimension;
        }
    }

    public static class Positioned extends ExecuteChildCommand
    {
        private Selector targets;
        private Pos pos;

        public Positioned(Selector targets)
        {
            this.targets = targets;
        }

        public Positioned(Pos pos)
        {
            this.pos = pos;
        }

        @Override
        public String toString()
        {
            return "positioned " + (targets == null ? pos.toString() : ("as " + targets));
        }
    }

    public static class Rotated extends ExecuteChildCommand
    {
        private Rotation rot;
        private Selector targets;

        public Rotated(Selector targets)
        {
            this.targets = targets;
        }

        public Rotated(Rotation rot)
        {
            this.rot = rot;
        }

        @Override
        public String toString()
        {
            return "rotated " + (targets == null ? rot.toString() : ("as " + targets));
        }
    }

    public static class Run extends ExecuteChildCommand
    {
        private Command cmd;

        public Run(Command cmd)
        {
            this.cmd = cmd;
        }

        @Override
        public String toString()
        {
            return cmd.toString();
        }
    }

    public static class Store extends ExecuteChildCommand
    {
        private rs result_success = rs.values()[0];
        private IDataArg target;
        private String path;
        private Type type = Type.values()[0];
        private double scale;
        private int qwq;
        private ID id;
        private vm value_max = vm.values()[0];
        private SbObject objective;

        public enum rs
        {
            result,
            success;

            public static final int SIZE = java.lang.Integer.SIZE;

            public int getValue()
            {
                return this.ordinal();
            }

            public static rs forValue(int value)
            {
                return values()[value];
            }
        }
        public enum Type
        {
            _byte,
            _short,
            _int,
            _long,
            _float,
            _double;

            public static final int SIZE = java.lang.Integer.SIZE;

            public int getValue()
            {
                return this.ordinal();
            }

            public static Type forValue(int value)
            {
                return values()[value];
            }
        }
        public enum vm
        {
            value,
            max;

            public static final int SIZE = java.lang.Integer.SIZE;

            public int getValue()
            {
                return this.ordinal();
            }

            public static vm forValue(int value)
            {
                return values()[value];
            }
        }

        /**
         store (result|success) [block|storage|entity] &lt;target> &lt;path> &lt;type> &lt;scale> -> execute

         @param result_success
         @param target 需要将数据存储到的目标方块的坐标。
         @param path 需要持有结果的NBTTag标签的位置。
         @param type 被存储的数据的类型。
         @param scale 存储值的倍率。
         @exception ArgumentNotMatchException
         */
        public Store(rs result_success, IDataArg target, String path, Type type, double scale)
        {
            this.result_success = result_success;
            this.target = target;
            this.path = path;
            this.type = type;
            this.scale = scale;
            this.qwq = 0;
        }

        /**
         store (result|success) bossbar &lt;id> (value|max) -> execute

         @param result_success
         @param id 需要储存在的boss栏的命名空间ID
         @param value_max 存储为boss栏的当前值（value）还是最大值（max）
         */
        public Store(rs result_success, ID id, vm value_max)
        {
            this.result_success = result_success;
            this.id = id;
            this.value_max = value_max;
            this.qwq = 1;
        }

        /**
         store (result|success) score &lt;targets> &lt;objective> -> execute

         @param result_success
         @param target 修改此分数持有者（可以是实体、选择器甚至不存在的玩家）的分数
         @param objective 记分项。
         */
        public Store(rs result_success, IDataArg target, SbObject objective)
        {
            this.result_success = result_success;
            this.target = target;
            this.objective = objective;
            this.qwq = 3;
        }

        @Override
        public String toString()
        {
            String re = "store " + result_success.name();
            switch (qwq)
            {
                case 0:
                    re += getTypeString(target) + " " + target + " " + path + " " + type.name() + " " + scale;
                    break;
                case 1:
                    re += " bossbar " + id + " " + value_max.name();
                    break;
                case 3:
                    re += " score " + target + " " + objective;
                    break;
            }
            return re;
        }

        private static String getTypeString(Object o)
        {
            if (o instanceof Pos)
            {
                return "block";
            }
            else if (o instanceof Selector)
            {
                return "entity";
            }
            else if (o instanceof ID)
            {
                return "storage";
            }
            else
            {
                return null;
            }
        }
    }

    public static class If extends ExecuteChildCommand
    {
        private Pos pos;
        private ID biome;
        private BlockPredicate block;
        private Pos start;
        private Pos end;
        private Pos destination;
        private Mode all_masked = Mode.values()[0];
        private String path;
        private Selector target;
        private ID source;
        private ID predicate;
        private SbObject targetObjective;
        private String operation;
        private Selector sourceScore;
        private SbObject sourceObjective;
        private IntRange range;
        private int type;

        public enum Mode
        {
            all,
            masked;

            public static final int SIZE = java.lang.Integer.SIZE;

            public int getValue()
            {
                return this.ordinal();
            }

            public static Mode forValue(int value)
            {
                return values()[value];
            }
        }

        /**
         (if|unless) biome &lt;pos> &lt;biome> -> [execute]

         @param pos
         @param biome
         */
        public If(Pos pos, ID biome)
        {
            this.pos = pos;
            this.biome = biome;
            type = 0;
        }

        /**
         (if|unless) block &lt;pos> &lt;block> -> [execute]

         @param pos
         @param block
         */
        public If(Pos pos, BlockPredicate block)
        {
            this.pos = pos;
            this.block = block;
            type = 1;
        }

        /**
         (if|unless) blocks &lt;start> &lt;end> &lt;destination> &lt;scan mode> -> [execute]

         @param start
         @param end
         @param destination
         @param all_masked
         */
        public If(Pos start, Pos end, Pos destination, Mode all_masked)
        {
            this.start = start;
            this.end = end;
            this.destination = destination;
            this.all_masked = all_masked;
            type = 2;
        }

        /**
         (if|unless) data block &lt;pos> &lt;path> -> [execute]

         @param pos
         @param path
         @exception ArgumentNotMatchException
         */
        public If(Pos pos, String path) throws ArgumentNotMatchException {
            this.pos = pos;
            if (!NBTTag.IsLegalPath(path))
            {
                throw new ArgumentNotMatchException("参数错误:" + path + "。不是合法的NBTTag路径");
            }
            this.path = path;
            type = 3;
        }

        /**
         (if|unless) data entity &lt;target> &lt;path> -> [execute]

         @param target
         @param path
         @exception ArgumentNotMatchException
         */
        public If(Selector target, String path) throws ArgumentNotMatchException {
            this.target = target;
            if (!NBTTag.IsLegalPath(path))
            {
                throw new ArgumentNotMatchException("参数错误:" + path + "。不是合法的NBTTag路径");
            }
            this.path = path;
            type = 4;
        }

        /**
         (if|unless) data storage &lt;source> &lt;path> -> [execute]

         @param source
         @param path
         @exception ArgumentNotMatchException
         */
        public If(ID source, String path) throws ArgumentNotMatchException {
            this.source = source;
            if (!NBTTag.IsLegalPath(path))
            {
                throw new ArgumentNotMatchException("参数错误:" + path + "。不是合法的NBTTag路径");
            }
            this.path = path;
            type = 5;
        }

        /**
         (if|unless) entity &lt;targets> -> [execute]

         @param target
         */
        public If(Selector target)
        {
            this.target = target;
            type = 6;
        }

        /**
         (if|unless) predicate &lt;predicate> -> [execute]

         @param predicate
         */
        public If(ID predicate)
        {
            this.predicate = predicate;
            type = 7;
        }

        /**
         (if|unless) score &lt;target> &lt;targetObjective> (&lt;|&lt;=|=|&gt;=|&gt;) &lt;source> &lt;sourceObjective> -> [execute]

         @param target
         @param targetObjective
         @param operation
         @param source
         @param sourceObjective
         */
        public If(Selector target, SbObject targetObjective, String operation, Selector source, SbObject sourceObjective)
        {
            this.target = target;
            this.targetObjective = targetObjective;
            this.operation = operation;
            this.sourceScore = source;
            this.sourceObjective = sourceObjective;
            type = 8;
        }

        /**
         (if|unless) score &lt;target> &lt;targetObjective> matches &lt;range> -> [execute]

         @param target
         @param targetObjective
         @param range
         */
        public If(Selector target, SbObject targetObjective, IntRange range)
        {
            this.target = target;
            this.targetObjective = targetObjective;
            this.range = range;
            type = 9;
        }

        @Override
        public String toString()
        {
            String re = "";
            switch (type)
            {
                case 0:
                    re = "if biome " + pos + " " + biome;
                    break;
                case 1:
                    re = "if block " + pos + block;
                    break;
                case 2:
                    re = "if blocks " + start + " " + end + " " + destination + " " + all_masked.name();
                    break;
                case 3:
                    re = "if data block " + pos + " " + path;
                    break;
                case 4:
                    re = "if data entity " + target + " " + path;
                    break;
                case 5:
                    re = "if data storage " + source + " " + path;
                    break;
                case 6:
                    re = "if entity " + target;
                    break;
                case 7:
                    re = "if predicate " + predicate;
                    break;
                case 8:
                    re = "if score " + target + " " + targetObjective + " " + operation + " " + sourceScore + " " + sourceObjective;
                    break;
                case 9:
                    re = "if score " + target + " " + targetObjective + " matches " + range;
                    break;
            }
            return re;
        }
    }

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

    private final ArrayList<ExecuteChildCommand> childcommands = new ArrayList<ExecuteChildCommand>();

    public final void Append(ExecuteChildCommand childCommand)
    {
        if (childcommands.get(childcommands.size() - 1) instanceof Run)
        {
            throw new ExecuteCommandListEndException("不可在execute的run子命令后添加更多子命令");
        }
        childcommands.add(childCommand);
    }

    @Override
    public String toString()
    {
        StringBuilder exe = new StringBuilder("execute ");
        for (ExecuteChildCommand childCommand : childcommands)
        {
            exe.append(childCommand).append(" ");
        }
        return exe.toString();
    }
}

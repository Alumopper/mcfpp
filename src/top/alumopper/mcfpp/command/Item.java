using top.alumopper.mcfpp.type;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace MCSharp.Cmds
{
    /// <summary>
    /// 修改方块（箱子、熔炉等）或实体（玩家或生物）物品栏内的物品。
    /// <code>
    /// item ...
    ///     ... modify (block <pos>|entity <targets>) <slot> vmodifier>
    ///     ... replace (block <pos>|entity <targets>) <slot> ...
    ///         ... with <item> [<count>]
    ///         ... from (block <pos>|entity <targets>) <slot> [<modifier>]
    /// </code>
    /// </summary>
    public class Item : Command
    {
        Pos pos;
        Slot slot;
        ID modifier;
        Selector targets;
        ItemStack item;
        int count;
        Pos pos2;
        Selector targets2;
        Slot slot2;

        int type;

        /// <summary>
        /// item modify block <pos> <slot> vmodifier>
        /// </summary>
        /// type - 0
        public Item(Pos pos, Slot slot, ID modifier)
        {
            this.pos = pos;
            this.slot = slot;
            this.modifier = modifier;
            type = 0;
        }

        /// <summary>
        /// item modify entity <targets> <slot> vmodifier>
        /// </summary>
        /// type - 1
        public Item(Selector targets, Slot slot, ID modifier)
        {
            this.targets = targets;
            this.slot = slot;
            this.modifier = modifier;
            type = 1;
        }

        /// <summary>
        /// item replace block <pos> <slot> with <item> [<count>]
        /// </summary>
        /// type - 2
        public Item(Pos pos, Slot slot, ItemStack item, int count = 1)
        {
            this.pos = pos;
            this.slot = slot;
            this.item = item;
            this.count = count;
            type = 2;
        }

        /// <summary>
        /// item replace entity <targets> <slot> with <item> [<count>]
        /// </summary>
        /// type - 3
        public Item(Selector targets, Slot slot, ItemStack item, int count = 1)
        {
            this.targets = targets;
            this.slot = slot;
            this.item = item;
            this.count = count;
            type = 3;
        }

        /// <summary>
        /// item replace block <pos> <slot> from block <pos> <slot> [<modifier>]
        /// </summary>
        /// type - 4
        public Item(Pos pos, Slot slot, Pos pos2, Slot slot2, ID modifier = null)
        {
            this.pos = pos;
            this.slot = slot;
            this.pos2 = pos2;
            this.slot2 = slot2;
            this.modifier = modifier;
            type = 4;
        }

        /// <summary>
        /// item replace entity <targets> <slot> from block <pos> <slot> [<modifier>]
        /// </summary>
        /// type - 5
        public Item(Selector targets, Slot slot, Pos pos2, Slot slot2, ID modifier = null)
        {
            this.targets = targets;
            this.slot = slot;
            this.pos2 = pos2;
            this.slot2 = slot2;
            this.modifier = modifier;
            type = 5;
        }

        /// <summary>
        /// item replace entity <targets> <slot> from entity <targets> <slot> [<modifier>]
        /// </summary>
        /// type - 6
        public Item(Selector targets, Slot slot, Selector targets2, Slot slot2, ID modifier = null)
        {
            this.targets = targets;
            this.slot = slot;
            this.targets2 = targets2;
            this.slot2 = slot2;
            this.modifier = modifier;
            type = 6;
        }

        /// <summary>
        /// item replace block <pos> <slot> from entity <targets <slot> [<modifier>]
        /// </summary>
        /// type - 7
        public Item(Pos pos, Slot slot, Selector targets2, Slot slot2, ID modifier = null)
        {
            this.pos = pos;
            this.slot = slot;
            this.targets2 = targets2;
            this.slot2 = slot2;
            this.modifier = modifier;
            type = 7;
        }

        public override String toString()
        {
            String re = "#qwq，这里应该是一个item命令，如果你看到了这行字，说明MCSharp出现了一些问题";
            switch (type)
            {
                case 0:
                    {
                        re = "item modify block " + pos + " " + slot + " " + modifier;
                        break;
                    }
                case 1:
                    { 
                        re = "item modify entity " + targets + " " + slot + " " + modifier;
                        break;
                    }
                case 2:
                    {
                        re = "item replace block " + pos + " " + slot + " with " + item + " " + count;
                        break;
                    }
                case 3:
                    {
                        re = "item replace entity " + targets + " " + slot + " with " + item + " " + count;
                        break;
                    }
                case 4:
                    {
                        re = "item replace block " + pos + " " + slot + " from block " + pos2 + " " + slot2 + (modifier == null ? "" : (" " + modifier));
                        break;
                    }
                case 5:
                    {
                        re = "item replace entity " + targets + " " + slot + " from block " + pos2 + " " + slot2 + (modifier == null ? "" : (" " + modifier));
                        break;
                    }
                case 6:
                    {
                        re = "item replace entity " + targets + " " + slot + " from entity " + targets2 + " " + slot2 + (modifier == null ? "" : (" " + modifier));
                        break;
                    }
                case 7:
                    {
                        re = "item replace entity " + targets + " " + slot + " from block " + pos2 + " " + slot2 + (modifier == null ? "" : (" " + modifier));
                        break;
                    }
            }
            return re;
        }
    }
}

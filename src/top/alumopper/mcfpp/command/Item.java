package top.alumopper.mcfpp.command;


import top.alumopper.mcfpp.type.*;

/**
 修改方块（箱子、熔炉等）或实体（玩家或生物）物品栏内的物品。
 <code>
 item ...
 ... modify (block &lt;pos>|entity &lt;targets>) &lt;slot> vmodifier>
 ... replace (block &lt;pos>|entity &lt;targets>) &lt;slot> ...
 ... with &lt;item> [&lt;count>]
 ... from (block &lt;pos>|entity &lt;targets>) &lt;slot> [&lt;modifier>]
 </code>
 */
public class Item extends Command
{
    private Pos pos;
    private Slot slot;
    private ID modifier;
    private Selector targets;
    private ItemStack item;
    private int count;
    private Pos pos2;
    private Selector targets2;
    private Slot slot2;

    private int type;

    /**
     item modify block &lt;pos> &lt;slot> vmodifier>

     type - 0
     */
    public Item(Pos pos, Slot slot, ID modifier)
    {
        this.pos = pos;
        this.slot = slot;
        this.modifier = modifier;
        type = 0;
    }

    /**
     item modify entity &lt;targets> &lt;slot> vmodifier>

     type - 1
     */
    public Item(Selector targets, Slot slot, ID modifier)
    {
        this.targets = targets;
        this.slot = slot;
        this.modifier = modifier;
        type = 1;
    }

    /**
     item replace block &lt;pos> &lt;slot> with &lt;item> [&lt;count>]

     type - 2
     */

    public Item(Pos pos, Slot slot, ItemStack item)
    {
        this(pos, slot, item, 1);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Item(Pos pos, Slot slot, ItemStack item, int count = 1)
    public Item(Pos pos, Slot slot, ItemStack item, int count)
    {
        this.pos = pos;
        this.slot = slot;
        this.item = item;
        this.count = count;
        type = 2;
    }

    /**
     item replace entity &lt;targets> &lt;slot> with &lt;item> [&lt;count>]

     type - 3
     */

    public Item(Selector targets, Slot slot, ItemStack item)
    {
        this(targets, slot, item, 1);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Item(Selector targets, Slot slot, ItemStack item, int count = 1)
    public Item(Selector targets, Slot slot, ItemStack item, int count)
    {
        this.targets = targets;
        this.slot = slot;
        this.item = item;
        this.count = count;
        type = 3;
    }

    /**
     item replace block &lt;pos> &lt;slot> from block &lt;pos> &lt;slot> [&lt;modifier>]

     type - 4
     */

    public Item(Pos pos, Slot slot, Pos pos2, Slot slot2)
    {
        this(pos, slot, pos2, slot2, null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Item(Pos pos, Slot slot, Pos pos2, Slot slot2, ID modifier = null)
    public Item(Pos pos, Slot slot, Pos pos2, Slot slot2, ID modifier)
    {
        this.pos = pos;
        this.slot = slot;
        this.pos2 = pos2;
        this.slot2 = slot2;
        this.modifier = modifier;
        type = 4;
    }

    /**
     item replace entity &lt;targets> &lt;slot> from block &lt;pos> &lt;slot> [&lt;modifier>]

     type - 5
     */

    public Item(Selector targets, Slot slot, Pos pos2, Slot slot2)
    {
        this(targets, slot, pos2, slot2, null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Item(Selector targets, Slot slot, Pos pos2, Slot slot2, ID modifier = null)
    public Item(Selector targets, Slot slot, Pos pos2, Slot slot2, ID modifier)
    {
        this.targets = targets;
        this.slot = slot;
        this.pos2 = pos2;
        this.slot2 = slot2;
        this.modifier = modifier;
        type = 5;
    }

    /**
     item replace entity &lt;targets> &lt;slot> from entity &lt;targets> &lt;slot> [&lt;modifier>]

     type - 6
     */

    public Item(Selector targets, Slot slot, Selector targets2, Slot slot2)
    {
        this(targets, slot, targets2, slot2, null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Item(Selector targets, Slot slot, Selector targets2, Slot slot2, ID modifier = null)
    public Item(Selector targets, Slot slot, Selector targets2, Slot slot2, ID modifier)
    {
        this.targets = targets;
        this.slot = slot;
        this.targets2 = targets2;
        this.slot2 = slot2;
        this.modifier = modifier;
        type = 6;
    }

    /**
     item replace block &lt;pos> &lt;slot> from entity &lt;targets &lt;slot> [&lt;modifier>]

     type - 7
     */

    public Item(Pos pos, Slot slot, Selector targets2, Slot slot2)
    {
        this(pos, slot, targets2, slot2, null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public Item(Pos pos, Slot slot, Selector targets2, Slot slot2, ID modifier = null)
    public Item(Pos pos, Slot slot, Selector targets2, Slot slot2, ID modifier)
    {
        this.pos = pos;
        this.slot = slot;
        this.targets2 = targets2;
        this.slot2 = slot2;
        this.modifier = modifier;
        type = 7;
    }

    @Override
    public String toString()
    {
        String re = "#qwq，这里应该是一个item命令，如果你看到了这行字，说明MCSharp出现了一些问题";
        switch (type) {
            case 0 -> re = "item modify block " + pos + " " + slot + " " + modifier;
            case 1 -> re = "item modify entity " + targets + " " + slot + " " + modifier;
            case 2 -> re = "item replace block " + pos + " " + slot + " with " + item + " " + count;
            case 3 -> re = "item replace entity " + targets + " " + slot + " with " + item + " " + count;
            case 4 -> re = "item replace block " + pos + " " + slot + " from block " + pos2 + " " + slot2 + (modifier == null ? "" : (" " + modifier));
            case 5 -> re = "item replace entity " + targets + " " + slot + " from block " + pos2 + " " + slot2 + (modifier == null ? "" : (" " + modifier));
            case 6 -> re = "item replace entity " + targets + " " + slot + " from entity " + targets2 + " " + slot2 + (modifier == null ? "" : (" " + modifier));
            case 7 -> re = "item replace entity " + targets + " " + slot + " from block " + pos2 + " " + slot2 + (modifier == null ? "" : (" " + modifier));
        }
        return re;
    }
}

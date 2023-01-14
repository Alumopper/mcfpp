package top.alumopper.mcfpp.command;

import top.alumopper.mcfpp.type.*;
import top.alumopper.mcfpp.type.Number;

import java.util.*;

/**
 命令总类，提供了大量用于生成命令的方法，避免频繁的新建类（调用命令类的各种极度抽象的构造方法（x
 */
public class Commands
{
    public static Advancement AdvancementGrantEveryThing(Selector target) {
        return AdvancementGrantEveryThing(target, true);
    }

    public static Advancement AdvancementGrantEveryThing(Selector target, boolean serialize) {
        return new Advancement("grant", target, "everything");
    }


    public static Advancement AdvancementGrantOnly(Selector target, String advancement) {
        return AdvancementGrantOnly(target, advancement, true);
    }

    public static Advancement AdvancementGrantOnly(Selector target, String advancement, boolean serialize) {
        return new Advancement("grant", target, "only", advancement);
    }


    public static Advancement AdvancementGrantOnly(Selector target, String advancement, String criterion) {
        return AdvancementGrantOnly(target, advancement, criterion, true);
    }

    public static Advancement AdvancementGrantOnly(Selector target, String advancement, String criterion, boolean serialize) {
        return new Advancement("grant", target, "only", advancement, criterion);
    }


    public static Advancement AdvancementGrantFrom(Selector target, String advancement) {
        return AdvancementGrantFrom(target, advancement, true);
    }

    public static Advancement AdvancementGrantFrom(Selector target, String advancement, boolean serialize) {

        return new Advancement("grant", target, "from", advancement);
    }


    public static Advancement AdvancementGrantThrough(Selector target, String advancement) {
        return AdvancementGrantThrough(target, advancement, true);
    }

    public static Advancement AdvancementGrantThrough(Selector target, String advancement, boolean serialize) {

        return new Advancement("grant", target, "through", advancement);
    }


    public static Advancement AdvancementGrantUntil(Selector target, String advancement)
    {
        return AdvancementGrantUntil(target, advancement, true);
    }

    public static Advancement AdvancementGrantUntil(Selector target, String advancement, boolean serialize)
    {

        return new Advancement("grant", target, "until", advancement);
    }


    public static Advancement AdvancementRevokeEverything(Selector target)
    {
        return AdvancementRevokeEverything(target, true);
    }

    public static Advancement AdvancementRevokeEverything(Selector target, boolean serialize)
    {

        return new Advancement("revoke", target, "everything");
    }


    public static Advancement AdvancementRevokeOnly(Selector target, String advancement)
    {
        return AdvancementRevokeOnly(target, advancement, true);
    }

    public static Advancement AdvancementRevokeOnly(Selector target, String advancement, boolean serialize)
    {

        return new Advancement("revoke", target, "only", advancement);
    }

    public static Advancement AdvancementRevokeOnly(Selector target, String advancement, String criterion)
    {
        return AdvancementRevokeOnly(target, advancement, criterion, true);
    }

    public static Advancement AdvancementRevokeOnly(Selector target, String advancement, String criterion, boolean serialize)
    {

        return new Advancement("revoke", target, "only", advancement, criterion);
    }


    public static Advancement AdvancementRevokeFrom(Selector target, String advancement)
    {
        return AdvancementRevokeFrom(target, advancement, true);
    }

    public static Advancement AdvancementRevokeFrom(Selector target, String advancement, boolean serialize)
    {

        return new Advancement("revoke", target, "from", advancement);
    }


    public static Advancement AdvancementRevokeThrough(Selector target, String advancement)
    {
        return AdvancementRevokeThrough(target, advancement, true);
    }

    public static Advancement AdvancementRevokeThrough(Selector target, String advancement, boolean serialize)
    {

        return new Advancement("revoke", target, "through", advancement);
    }


    public static Advancement AdvancementRevokeUntil(Selector target, String advancement)
    {
        return AdvancementRevokeUntil(target, advancement, true);
    }

    public static Advancement AdvancementRevokeUntil(Selector target, String advancement, boolean serialize)
    {

        return new Advancement("revoke", target, "until", advancement);
    }

    public static Attribute AttributeGet(Selector entity, String attribute, double scale)
    {
        return AttributeGet(entity, attribute, scale, true);
    }

    public static Attribute AttributeGet(Selector entity, String attribute)
    {
        return AttributeGet(entity, attribute, 1.0, true);
    }

    public static Attribute AttributeGet(Selector entity, String attribute, double scale, boolean serialize)
    {

        return new Attribute(entity, attribute, scale);
    }

    public static Attribute AttributeGetBase(Selector entity, String attribute, double scale)
    {
        return AttributeGetBase(entity, attribute, scale, true);
    }

    public static Attribute AttributeGetBase(Selector entity, String attribute)
    {
        return AttributeGetBase(entity, attribute, 1.0, true);
    }

    public static Attribute AttributeGetBase(Selector entity, String attribute, double scale, boolean serialize)
    {

        return new Attribute(entity, attribute, "get", scale);
    }


    public static Attribute AttributeSetBase(Selector entity, String attribute, double value)
    {
        return AttributeSetBase(entity, attribute, value, true);
    }

    public static Attribute AttributeSetBase(Selector entity, String attribute, double value, boolean serialize)
    {

        return new Attribute(entity, attribute, "set", value);
    }


    public static Attribute AttributeAddModifier(Selector target, String attribute, UUID uuid, String name, double value, String add__multiply__multiply_base)
    {
        return AttributeAddModifier(target, attribute, uuid, name, value, add__multiply__multiply_base, true);
    }

    public static Attribute AttributeAddModifier(Selector target, String attribute, UUID uuid, String name, double value, String add__multiply__multiply_base, boolean serialize)
    {

        return new Attribute(target, attribute, uuid, name, value, add__multiply__multiply_base);
    }


    public static Attribute AttributeRemoveModifier(Selector target, String attribute, UUID uuid)
    {
        return AttributeRemoveModifier(target, attribute, uuid, true);
    }

    public static Attribute AttributeRemoveModifier(Selector target, String attribute, UUID uuid, boolean serialize)
    {

        return new Attribute(target, attribute, uuid);
    }


    public static Attribute AttributeGetModifier(Selector target, String attribute, UUID uuid, double scale)
    {
        return AttributeGetModifier(target, attribute, uuid, scale, true);
    }

    public static Attribute AttributeGetModifier(Selector target, String attribute, UUID uuid)
    {
        return AttributeGetModifier(target, attribute, uuid, 1.0, true);
    }

    public static Attribute AttributeGetModifier(Selector target, String attribute, UUID uuid, double scale, boolean serialize)
    {

        return new Attribute(target, attribute, uuid, scale);
    }
    public static Ban BanPlayer(String player, String reason)
    {
        return BanPlayer(player, reason, true);
    }

    public static Ban BanPlayer(String player)
    {
        return BanPlayer(player, null, true);
    }

    public static Ban BanPlayer(String player, String reason, boolean serialize)
    {
        return new Ban(player, reason);
    }

    public static Ban_ip BanIp(String ip, String reason)
    {
        return BanIp(ip, reason, true);
    }

    public static Ban_ip BanIp(String ip)
    {
        return BanIp(ip, null, true);
    }

    public static Ban_ip BanIp(String ip, String reason, boolean serialize)
    {
        return new Ban_ip(ip, reason);
    }

    public static Banlist BanlistPlayers()
    {
        return BanlistPlayers(true);
    }

    public static Banlist BanlistPlayers(boolean serialize)
    {
        return new Banlist("players");
    }


    public static Banlist BanlistIps()
    {
        return BanlistIps(true);
    }

    public static Banlist BanlistIps(boolean serialize)
    {

        return new Banlist("ips");
    }

    public static Bossbar BossbarAdd(ID id, String name)
    {
        return BossbarAdd(id, name, true);
    }

    public static Bossbar BossbarAdd(ID id, String name, boolean serialize)
    {

        return new Bossbar(id, name);
    }


    public static Bossbar BossbarRemove(ID id)
    {
        return BossbarRemove(id, true);
    }

    public static Bossbar BossbarRemove(ID id, boolean serialize)
    {
        return new Bossbar(id);
    }

    public static Bossbar BossbarGetValue(ID id, String value)
    {
        return BossbarGetValue(id, value, true);
    }

    public static Bossbar BossbarGetValue(ID id, String value, boolean serialize)
    {
        return new Bossbar(id, value);
    }


    public static Bossbar BossbarGetPlayers(ID id)
    {
        return BossbarGetPlayers(id, true);
    }

    public static Bossbar BossbarGetPlayers(ID id, boolean serialize)
    {
        return new Bossbar(id, "players");
    }


    public static Bossbar BossbarGetMax(ID id)
    {
        return BossbarGetMax(id, true);
    }

    public static Bossbar BossbarGetMax(ID id, boolean serialize)
    {
        return new Bossbar(id, "max");
    }


    public static Bossbar BossbarGetVisible(ID id)
    {
        return BossbarGetVisible(id, true);
    }

    public static Bossbar BossbarGetVisible(ID id, boolean serialize)
    {
        return new Bossbar(id, "visible");
    }


    public static Bossbar BossbarSetColor(ID id, top.alumopper.mcfpp.type.Bossbar.Color color)
    {
        return BossbarSetColor(id, color, true);
    }

    public static Bossbar BossbarSetColor(ID id, top.alumopper.mcfpp.type.Bossbar.Color color, boolean serialize)
    {
        return new Bossbar(id, color);
    }


    public static Bossbar BossbarSetMax(ID id, int max)
    {
        return BossbarSetMax(id, max, true);
    }

    public static Bossbar BossbarSetMax(ID id, int max, boolean serialize)
    {
        return new Bossbar(id, "max", max);
    }


    public static Bossbar BossbarSetValue(ID id, int value)
    {
        return BossbarSetValue(id, value, true);
    }

    public static Bossbar BossbarSetValue(ID id, int value, boolean serialize)
    {
        return new Bossbar(id, "value", value);
    }


    public static Bossbar BossbarSetName(ID id, JsonText name)
    {
        return BossbarSetName(id, name, true);
    }

    public static Bossbar BossbarSetName(ID id, JsonText name, boolean serialize)
    {
        return new Bossbar(id, name);
    }


    public static Bossbar BossbarSetStyle(ID id, top.alumopper.mcfpp.type.Bossbar.Style style)
    {
        return BossbarSetStyle(id, style, true);
    }

    public static Bossbar BossbarSetStyle(ID id, top.alumopper.mcfpp.type.Bossbar.Style style, boolean serialize)
    {
        return new Bossbar(id, style);
    }

    public static Bossbar BossbarSetVisible(ID id, boolean visible)
    {
        return BossbarSetVisible(id, visible, true);
    }

    public static Bossbar BossbarSetVisible(ID id, boolean visible, boolean serialize)
    {
        return new Bossbar(id, visible);
    }


    public static Bossbar BossbarAddPlayer(ID id, Selector selector)
    {
        return BossbarAddPlayer(id, selector, true);
    }

    public static Bossbar BossbarAddPlayer(ID id, Selector selector, boolean serialize)
    {
        return new Bossbar(id, "set", selector);
    }

    public static Clear Clear(Selector target, ItemStack itemStack, Integer count)
    {
        return Clear(target, itemStack, count, true);
    }

    public static Clear Clear(Selector target, ItemStack itemStack)
    {
        return Clear(target, itemStack, null, true);
    }

    public static Clear Clear(Selector target)
    {
        return Clear(target, null, null, true);
    }

    public static Clear Clear(Selector target, ItemStack itemStack, Integer count, boolean serialize)
    {
        
        Clear clear;
        if (count == null)
        {
            clear = new Clear(target, itemStack);
        }
        else
        {
            clear = new Clear(target, itemStack, count);
        }
        
        return clear;
    }

    public static Clone CloneReplaceForce(Pos begin, Pos end, Pos destination)
    {
        return CloneReplaceForce(begin, end, destination, true);
    }

    public static Clone CloneReplaceForce(Pos begin, Pos end, Pos destination, boolean serialize)
    {

        return new Clone(begin, end, destination, "replace", "force");
    }


    public static Clone CloneReplaceMove(Pos begin, Pos end, Pos destination)
    {
        return CloneReplaceMove(begin, end, destination, true);
    }

    public static Clone CloneReplaceMove(Pos begin, Pos end, Pos destination, boolean serialize)
    {
        return new Clone(begin, end, destination, "replace", "move");
    }


    public static Clone CloneReplaceNormal(Pos begin, Pos end, Pos destination)
    {
        return CloneReplaceNormal(begin, end, destination, true);
    }

    public static Clone CloneReplaceNormal(Pos begin, Pos end, Pos destination, boolean serialize)
    {
        return new Clone(begin, end, destination, "replace", "normal");
    }


    public static Clone CloneMaskedForce(Pos begin, Pos end, Pos destination)
    {
        return CloneMaskedForce(begin, end, destination, true);
    }

    public static Clone CloneMaskedForce(Pos begin, Pos end, Pos destination, boolean serialize)
    {
        return new Clone(begin, end, destination, "masked", "force");
    }


    public static Clone CloneMaskedMove(Pos begin, Pos end, Pos destination)
    {
        return CloneMaskedMove(begin, end, destination, true);
    }

    public static Clone CloneMaskedMove(Pos begin, Pos end, Pos destination, boolean serialize)
    {
        return new Clone(begin, end, destination, "masked", "move");
    }


    public static Clone CloneMaskedNormal(Pos begin, Pos end, Pos destination)
    {
        return CloneMaskedNormal(begin, end, destination, true);
    }

    public static Clone CloneMaskedNormal(Pos begin, Pos end, Pos destination, boolean serialize)
    {
        return new Clone(begin, end, destination, "masked", "normal");
    }


    public static Clone CloneFilteredForce(Pos begin, Pos end, Pos destination, BlockPredicate filter)
    {
        return CloneFilteredForce(begin, end, destination, filter, true);
    }

    public static Clone CloneFilteredForce(Pos begin, Pos end, Pos destination, BlockPredicate filter, boolean serialize)
    {
        return new Clone(begin, end, destination, filter, "force");
    }


    public static Clone CloneFilteredMove(Pos begin, Pos end, Pos destination, BlockPredicate filter)
    {
        return CloneFilteredMove(begin, end, destination, filter, true);
    }

    public static Clone CloneFilteredMove(Pos begin, Pos end, Pos destination, BlockPredicate filter, boolean serialize)
    {
        return new Clone(begin, end, destination, filter, "move");
    }



    public static Clone CloneFilteredNormal(Pos begin, Pos end, Pos destination, BlockPredicate filter)
    {
        return CloneFilteredNormal(begin, end, destination, filter, true);
    }

    public static Clone CloneFilteredNormal(Pos begin, Pos end, Pos destination, BlockPredicate filter, boolean serialize)
    {
        return new Clone(begin, end, destination, filter, "normal");
    }
    //TODO:DATA
/*
    public static Data DataGet(NBTTag target, Double scale)
    {
        return DataGet(target, scale, true);
    }

    public static Data DataGet(NBTTag target)
    {
        return DataGet(target, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataGet(NBTTag target, Nullable<double> scale = null, bool serialize = true)
    public static Data DataGet(NBTTag target, Double scale, boolean serialize)
    {
        
        Data data = new Data(target.Container, target.Path, scale);
        
        return data;
    }


    public static Data DataMerge(IDataArg targetPos, NBTTag nbt)
    {
        return DataMerge(targetPos, nbt, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataMerge(IDataArg targetPos, NBTTag nbt, bool serialize = true)
    public static Data DataMerge(IDataArg targetPos, NBTTag nbt, boolean serialize)
    {
        
        Data data = new Data(targetPos, nbt);
        
        return data;
    }


    public static Data DataModifySet(NBTTag target, NBTTag source)
    {
        return DataModifySet(target, source, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataModifySet(NBTTag target, NBTTag source, bool serialize = true)
    public static Data DataModifySet(NBTTag target, NBTTag source, boolean serialize)
    {
        
        Data data;
        if (source.IsDynamic)
        {
            data = new Data(target.Container, target.Path, "set", source.Container, source.Path);
        }
        else
        {
            data = new Data(target.Container, target.Path, "set", source);
        };
        
        return data;
    }


    public static <T extends NBTTag> Data DataModifyPrepend(NBTList<T> target, NBTTag source)
    {
        return DataModifyPrepend(target, source, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataModifyPrepend<T>(NBTList<T> target, NBTTag source, bool serialize = true) where T : NBTTag
    public static <T extends NBTTag> Data DataModifyPrepend(NBTList<T> target, NBTTag source, boolean serialize)
    {
        
        Data data;
        if (source.IsDynamic)
        {
            data = new Data(target.Container, target.Path, "prepend", source.Container, source.Path);
        }
        else
        {
            data = new Data(target.Container, target.Path, "prepend", source);
        }
        
        return data;
    }


    public static <T extends NBTTag> Data DataModifyAppend(NBTList<T> target, NBTTag source)
    {
        return DataModifyAppend(target, source, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataModifyAppend<T>(NBTList<T> target, NBTTag source, bool serialize = true) where T : NBTTag
    public static <T extends NBTTag> Data DataModifyAppend(NBTList<T> target, NBTTag source, boolean serialize)
    {
        
        Data data;
        if (source.IsDynamic)
        {
            data = new Data(target.Container, target.Path, "append", source.Container, source.Path);
        }
        else
        {
            data = new Data(target.Container, target.Path, "append", source);
        };
        
        return data;
    }


    public static <T> Data DataModifyPrepend(NBTArray<T> target, NBTTag source)
    {
        return DataModifyPrepend(target, source, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataModifyPrepend<T>(NBTArray<T> target, NBTTag source, bool serialize = true)
    public static <T> Data DataModifyPrepend(NBTArray<T> target, NBTTag source, boolean serialize)
    {
        
        Data data;
        if (source.IsDynamic)
        {
            data = new Data(target.Container, target.Path, "prepend", source.Container, source.Path);
        }
        else
        {
            data = new Data(target.Container, target.Path, "prepend", source);
        };
        
        return data;
    }


    public static <T> Data DataModifyAppend(NBTArray<T> target, NBTTag source)
    {
        return DataModifyAppend(target, source, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataModifyAppend<T>(NBTArray<T> target, NBTTag source, bool serialize = true)
    public static <T> Data DataModifyAppend(NBTArray<T> target, NBTTag source, boolean serialize)
    {
        
        Data data;
        if (source.IsDynamic)
        {
            data = new Data(target.Container, target.Path, "append", source.Container, source.Path);
        }
        else
        {
            data = new Data(target.Container, target.Path, "append", source);
        };
        
        return data;
    }


    public static Data DataModifyMerge(NBTCompound target, NBTTag source)
    {
        return DataModifyMerge(target, source, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataModifyMerge(NBTCompound.java target, NBTTag source, bool serialize = true)
    public static Data DataModifyMerge(NBTCompound target, NBTTag source, boolean serialize)
    {
        
        Data data;
        if (source.IsDynamic)
        {
            data = new Data(target.Container, target.Path, "merge", source.Container, source.Path);
        }
        else
        {
            data = new Data(target.Container, target.Path, "merge", source);
        };
        
        return data;
    }


    public static <T extends NBTTag> Data DataModifyInsert(NBTList<T> target, NBTTag source, int index)
    {
        return DataModifyInsert(target, source, index, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataModifyInsert<T>(NBTList<T> target, NBTTag source, int index, bool serialize = true) where T : NBTTag
    public static <T extends NBTTag> Data DataModifyInsert(NBTList<T> target, NBTTag source, int index, boolean serialize)
    {
        
        Data data;
        if (source.IsDynamic)
        {
            data = new Data(target.Container, target.Path, index, source.Container, source.Path);
        }
        else
        {
            data = new Data(target.Container, target.Path, index, source);
        };
        
        return data;
    }


    public static <T> Data DataModifyInsert(NBTArray<T> target, NBTTag source, int index)
    {
        return DataModifyInsert(target, source, index, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataModifyInsert<T>(NBTArray<T> target, NBTTag source, int index, bool serialize = true)
    public static <T> Data DataModifyInsert(NBTArray<T> target, NBTTag source, int index, boolean serialize)
    {
        
        Data data;
        if (source.IsDynamic)
        {
            data = new Data(target.Container, target.Path, index, source.Container, source.Path);
        }
        else
        {
            data = new Data(target.Container, target.Path, index, source);
        };
        
        return data;
    }


    public static Data DataRemove(NBTTag target)
    {
        return DataRemove(target, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataRemove(NBTTag target, bool serialize = true)
    public static Data DataRemove(NBTTag target, boolean serialize)
    {
        
        Data data = new Data(target.Container, target.Path);
        
        return data;
    }


    public static Data DataRemove(Selector target, String path)
    {
        return DataRemove(target, path, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataRemove(Selector target, string path, bool serialize = true)
    public static Data DataRemove(Selector target, String path, boolean serialize)
    {
        
        Data data = new Data(target, path);
        
        return data;
    }


    public static Data DataRemove(ID target, String path)
    {
        return DataRemove(target, path, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Data DataRemove(ID target, string path, bool serialize = true)
    public static Data DataRemove(ID target, String path, boolean serialize)
    {
        
        Data data = new Data(target, path);
        
        return data;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion
*/
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region datapack

    public static Datapack DatapackDisable(String name)
    {
        return DatapackDisable(name, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Datapack DatapackDisable(string name, bool serialize = true)
    public static Datapack DatapackDisable(String name, boolean serialize)
    {
        
        Datapack datapack = new Datapack("disable", name);
        
        return datapack;
    }


    public static Datapack DatapackEnable(String name)
    {
        return DatapackEnable(name, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Datapack DatapackEnable(string name, bool serialize = true)
    public static Datapack DatapackEnable(String name, boolean serialize)
    {
        
        Datapack datapack = new Datapack("enable", name);
        
        return datapack;
    }


    public static Datapack DatapackEnableAtFirst(String name)
    {
        return DatapackEnableAtFirst(name, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Datapack DatapackEnableAtFirst(string name, bool serialize = true)
    public static Datapack DatapackEnableAtFirst(String name, boolean serialize)
    {
        
        Datapack datapack = new Datapack("enable", name, "first");
        
        return datapack;
    }


    public static Datapack DatapackEnableAtLast(String name)
    {
        return DatapackEnableAtLast(name, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Datapack DatapackEnableAtLast(string name, bool serialize = true)
    public static Datapack DatapackEnableAtLast(String name, boolean serialize)
    {
        
        Datapack datapack = new Datapack("enable", name, "last");
        
        return datapack;
    }


    public static Datapack DatapackEnableBefore(String name, String exist)
    {
        return DatapackEnableBefore(name, exist, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Datapack DatapackEnableBefore(string name, string exist, bool serialize = true)
    public static Datapack DatapackEnableBefore(String name, String exist, boolean serialize)
    {
        
        Datapack datapack = new Datapack("enable", name, "before", exist);
        
        return datapack;
    }


    public static Datapack DatapackEnableAfter(String name, String exist)
    {
        return DatapackEnableAfter(name, exist, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Datapack DatapackEnableAfter(string name, string exist, bool serialize = true)
    public static Datapack DatapackEnableAfter(String name, String exist, boolean serialize)
    {
        
        Datapack datapack = new Datapack("enable", name, "after", exist);
        
        return datapack;
    }


    public static Datapack DatapackList()
    {
        return DatapackList(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Datapack DatapackList(bool serialize = true)
    public static Datapack DatapackList(boolean serialize)
    {
        
        Datapack datapack = new Datapack("list");
        
        return datapack;
    }


    public static Datapack DatapackListAvailable()
    {
        return DatapackListAvailable(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Datapack DatapackListAvailable(bool serialize = true)
    public static Datapack DatapackListAvailable(boolean serialize)
    {
        
        Datapack datapack = new Datapack("list", "available");
        
        return datapack;
    }


    public static Datapack DatapackListEnabled()
    {
        return DatapackListEnabled(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Datapack DatapackListEnabled(bool serialize = true)
    public static Datapack DatapackListEnabled(boolean serialize)
    {
        
        Datapack datapack = new Datapack("list", "enabled");
        
        return datapack;
    }

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region debug


    public static Debug DebugStart()
    {
        return DebugStart(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Debug DebugStart(bool serialize = true)
    public static Debug DebugStart(boolean serialize)
    {
        
        Debug debug = new Debug("start");
        
        return debug;
    }


    public static Debug DebugStop()
    {
        return DebugStop(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Debug DebugStop(bool serialize = true)
    public static Debug DebugStop(boolean serialize)
    {
        
        Debug debug = new Debug("stop");
        
        return debug;
    }


    public static Debug DebugFunction()
    {
        return DebugFunction(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Debug DebugFunction(bool serialize = true)
    public static Debug DebugFunction(boolean serialize)
    {
        
        Debug debug = new Debug("function");
        
        return debug;
    }

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region defaultgamemode


    public static Defaultgamemode DefaultgamemodeSet(Gamemodes gamemode)
    {
        return DefaultgamemodeSet(gamemode, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Defaultgamemode DefaultgamemodeSet(Gamemodes gamemode, bool serialize = true)
    public static Defaultgamemode DefaultgamemodeSet(Gamemodes gamemode, boolean serialize)
    {
        
        Defaultgamemode defaultgamemode = new Defaultgamemode(gamemode);
        
        return defaultgamemode;
    }

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region deop

    public static Deop Deop(String player)
    {
        return Deop(player, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Deop Deop(string player, bool serialize = true)
    public static Deop Deop(String player, boolean serialize)
    {
        
        Deop deop = new Deop(player);
        
        return deop;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region difficulty


    public static Difficulty DifficultySet(Difficulties difficulty)
    {
        return DifficultySet(difficulty, true);
    }

    public static Difficulty DifficultySet()
    {
        return DifficultySet(null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Difficulty DifficultySet(Nullable<Difficulties> difficulty = null, bool serialize = true)
    public static Difficulty DifficultySet(Difficulties difficulty, boolean serialize)
    {
        
        Difficulty difficulty1 = new Difficulty(difficulty);
        
        return difficulty1;
    }

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region effect

    public static Effect EffectGive(Selector player, ID effect, int seconds, int amplifier, boolean hideParticles)
    {
        return EffectGive(player, effect, seconds, amplifier, hideParticles, true);
    }

    public static Effect EffectGive(Selector player, ID effect, int seconds, int amplifier)
    {
        return EffectGive(player, effect, seconds, amplifier, false, true);
    }

    public static Effect EffectGive(Selector player, ID effect, int seconds)
    {
        return EffectGive(player, effect, seconds, 0, false, true);
    }

    public static Effect EffectGive(Selector player, ID effect)
    {
        return EffectGive(player, effect, 30, 0, false, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Effect EffectGive(Selector player, ID effect, int seconds = 30, int amplifier = 0, bool hideParticles = false, bool serialize = true)
    public static Effect EffectGive(Selector player, ID effect, int seconds, int amplifier, boolean hideParticles, boolean serialize)
    {
        
        Effect effect1 = new Effect(player, effect, seconds, amplifier, hideParticles);
        
        return effect1;
    }


    public static Effect EffectClear(Selector player, ID effect)
    {
        return EffectClear(player, effect, true);
    }

    public static Effect EffectClear(Selector player)
    {
        return EffectClear(player, null, true);
    }

    public static Effect EffectClear()
    {
        return EffectClear(null, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Effect EffectClear(Selector player = null, ID effect = null, bool serialize = true)
    public static Effect EffectClear(Selector player, ID effect, boolean serialize)
    {

        
        Effect effect1 = new Effect("clear", player, effect);
        
        return effect1;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region enchant

    public static Enchant Enchant(Selector player, ID enchantment, int level)
    {
        return Enchant(player, enchantment, level, true);
    }

    public static Enchant Enchant(Selector player, ID enchantment)
    {
        return Enchant(player, enchantment, 1, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Enchant Enchant(Selector player, ID enchantment, int level = 1, bool serialize = true)
    public static Enchant Enchant(Selector player, ID enchantment, int level, boolean serialize)
    {
        
        Enchant enchant = new Enchant(player, enchantment, level);
        
        return enchant;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region experience

    public static Experience ExperienceAdd(Selector player, int amount, boolean levels)
    {
        return ExperienceAdd(player, amount, levels, true);
    }

    public static Experience ExperienceAdd(Selector player, int amount)
    {
        return ExperienceAdd(player, amount, false, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Experience ExperienceAdd(Selector player, int amount, bool levels = false, bool serialize = true)
    public static Experience ExperienceAdd(Selector player, int amount, boolean levels, boolean serialize)
    {
        
        Experience experience = new Experience("add", player, amount, levels ? "levels" : "points");
        
        return experience;
    }


    public static Experience ExperienceSet(Selector player, int amount, boolean levels)
    {
        return ExperienceSet(player, amount, levels, true);
    }

    public static Experience ExperienceSet(Selector player, int amount)
    {
        return ExperienceSet(player, amount, false, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Experience ExperienceSet(Selector player, int amount, bool levels = false, bool serialize = true)
    public static Experience ExperienceSet(Selector player, int amount, boolean levels, boolean serialize)
    {
        
        Experience experience = new Experience("set", player, amount, levels ? "levels" : "points");
        
        return experience;
    }


    public static Experience ExperienceQuery(Selector player, boolean levels)
    {
        return ExperienceQuery(player, levels, true);
    }

    public static Experience ExperienceQuery(Selector player)
    {
        return ExperienceQuery(player, false, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Experience ExperienceQuery(Selector player, bool levels = false, bool serialize = true)
    public static Experience ExperienceQuery(Selector player, boolean levels, boolean serialize)
    {
        
        Experience experience = new Experience(player, levels ? "levels" : "points");
        
        return experience;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region fill

    public static Fill FillDestory(Pos from, Pos to, BlockState block)
    {
        return FillDestory(from, to, block, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Fill FillDestory(Pos from, Pos to, BlockState block, bool serialize = true)
    public static Fill FillDestory(Pos from, Pos to, BlockState block, boolean serialize)
    {
        
        Fill fill = new Fill(from, to, block, "destroy");
        
        return fill;
    }


    public static Fill FillHollow(Pos from, Pos to, BlockState block)
    {
        return FillHollow(from, to, block, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Fill FillHollow(Pos from, Pos to, BlockState block, bool serialize = true)
    public static Fill FillHollow(Pos from, Pos to, BlockState block, boolean serialize)
    {
        
        Fill fill = new Fill(from, to, block, "hollow");
        
        return fill;
    }


    public static Fill FillKeep(Pos from, Pos to, BlockState block)
    {
        return FillKeep(from, to, block, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Fill FillKeep(Pos from, Pos to, BlockState block, bool serialize = true)
    public static Fill FillKeep(Pos from, Pos to, BlockState block, boolean serialize)
    {
        
        Fill fill = new Fill(from, to, block, "keep");
        
        return fill;
    }


    public static Fill FillOutline(Pos from, Pos to, BlockState block)
    {
        return FillOutline(from, to, block, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Fill FillOutline(Pos from, Pos to, BlockState block, bool serialize = true)
    public static Fill FillOutline(Pos from, Pos to, BlockState block, boolean serialize)
    {
        
        Fill fill = new Fill(from, to, block, "outline");
        
        return fill;
    }


    public static Fill FillReplace(Pos from, Pos to, BlockState block, BlockPredicate filter)
    {
        return FillReplace(from, to, block, filter, true);
    }

    public static Fill FillReplace(Pos from, Pos to, BlockState block)
    {
        return FillReplace(from, to, block, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Fill FillReplace(Pos from, Pos to, BlockState block, BlockPredicate filter = null, bool serialize = true)
    public static Fill FillReplace(Pos from, Pos to, BlockState block, BlockPredicate filter, boolean serialize)
    {
        
        Fill fill = new Fill(from, to, block, filter);
        
        return fill;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region fillbiome

    public static Fillbiome Fillbiome(Pos from, Pos to, ID biome)
    {
        return Fillbiome(from, to, biome, true);
    }

    public static Fillbiome Fillbiome(Pos from, Pos to)
    {
        return Fillbiome(from, to, null, true);
    }

    public static Fillbiome Fillbiome(Pos from)
    {
        return Fillbiome(from, null, null, true);
    }

    public static Fillbiome Fillbiome()
    {
        return Fillbiome(null, null, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Fillbiome Fillbiome(Pos from = null, Pos to = null, ID biome = null, bool serialize = true)
    public static Fillbiome Fillbiome(Pos from, Pos to, ID biome, boolean serialize)
    {
        
        Fillbiome fillbiome = new Fillbiome(from, to, biome);
        
        return fillbiome;
    }


    public static Fillbiome ReplaceBiome(Pos from, Pos to, ID biome, ID filter)
    {
        return ReplaceBiome(from, to, biome, filter, true);
    }

    public static Fillbiome ReplaceBiome(Pos from, Pos to, ID biome)
    {
        return ReplaceBiome(from, to, biome, null, true);
    }

    public static Fillbiome ReplaceBiome(Pos from, Pos to)
    {
        return ReplaceBiome(from, to, null, null, true);
    }

    public static Fillbiome ReplaceBiome(Pos from)
    {
        return ReplaceBiome(from, null, null, null, true);
    }

    public static Fillbiome ReplaceBiome()
    {
        return ReplaceBiome(null, null, null, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Fillbiome ReplaceBiome(Pos from = null, Pos to = null, ID biome = null, ID filter = null, bool serialize = true)
    public static Fillbiome ReplaceBiome(Pos from, Pos to, ID biome, ID filter, boolean serialize)
    {
        
        Fillbiome fillbiome = new Fillbiome("", from, to, biome, filter);
        
        return fillbiome;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region forceload

    public static Forceload ForceloadAdd(Pos from, Pos to)
    {
        return ForceloadAdd(from, to, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Forceload ForceloadAdd(Pos from, Pos to, bool serialize = true)
    public static Forceload ForceloadAdd(Pos from, Pos to, boolean serialize)
    {
        
        Forceload forceload = new Forceload("add", from, to);
        
        return forceload;
    }


    public static Forceload ForceloadRemove(Pos from, Pos to)
    {
        return ForceloadRemove(from, to, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Forceload ForceloadRemove(Pos from, Pos to, bool serialize = true)
    public static Forceload ForceloadRemove(Pos from, Pos to, boolean serialize)
    {
        
        Forceload forceload = new Forceload("remove", from, to);
        
        return forceload;
    }


    public static Forceload ForceLoadRemoveAll()
    {
        return ForceLoadRemoveAll(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Forceload ForceLoadRemoveAll(bool serialize = true)
    public static Forceload ForceLoadRemoveAll(boolean serialize)
    {
        
        Forceload forceload = new Forceload();
        
        return forceload;
    }


    public static Forceload ForceLoadQuery(Pos pos)
    {
        return ForceLoadQuery(pos, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Forceload ForceLoadQuery(Pos pos, bool serialize = true)
    public static Forceload ForceLoadQuery(Pos pos, boolean serialize)
    {
        
        Forceload forceload = new Forceload("query", pos);
        
        return forceload;
    }

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region function

    public static Function Function(ID functionID)
    {
        return Function(functionID, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Function Function(ID functionID, bool serialize = true)
    public static Function Function(ID functionID, boolean serialize)
    {
        
        Function function = new Function(functionID);
        
        return function;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region gamemode

    public static Gamemode GamemodeSet(Gamemodes gamemode, Selector target)
    {
        return GamemodeSet(gamemode, target, true);
    }

    public static Gamemode GamemodeSet(Gamemodes gamemode)
    {
        return GamemodeSet(gamemode, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Gamemode GamemodeSet(Gamemodes gamemode, Selector target = null, bool serialize = true)
    public static Gamemode GamemodeSet(Gamemodes gamemode, Selector target, boolean serialize)
    {
        
        Gamemode gamemode1 = new Gamemode(gamemode, target);
        
        return gamemode1;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region gamerule

    public static Gamerule Gamerule(String rule, String value)
    {
        return Gamerule(rule, value, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Gamerule Gamerule(string rule, string value, bool serialize = true)
    public static Gamerule Gamerule(String rule, String value, boolean serialize)
    {
        
        Gamerule gamerule = new Gamerule(rule, value);
        
        return gamerule;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region give

    public static Give Give(Selector target, ItemStack item)
    {
        return Give(target, item, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Give Give(Selector target, ItemStack item, bool serialize = true)
    public static Give Give(Selector target, ItemStack item, boolean serialize)
    {
        
        Give give = new Give(target, item);
        
        return give;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region help

    public static Help Help(String command)
    {
        return Help(command, true);
    }

    public static Help Help()
    {
        return Help("", true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Help Help(string command = "", bool serialize = true)
    public static Help Help(String command, boolean serialize)
    {
        
        Help help = new Help(command);
        
        return help;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region item

    public static Item ItemModify(Pos pos, Slot slot, ID modifier)
    {
        return ItemModify(pos, slot, modifier, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Item ItemModify(Pos pos, Slot slot, ID modifier, bool serialize = true)
    public static Item ItemModify(Pos pos, Slot slot, ID modifier, boolean serialize)
    {
        
        Item item1 = new Item(pos, slot, modifier);
        
        return item1;
    }


    public static Item ItemModify(Selector target, Slot slot, ID modifier)
    {
        return ItemModify(target, slot, modifier, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Item ItemModify(Selector target, Slot slot, ID modifier, bool serialize = true)
    public static Item ItemModify(Selector target, Slot slot, ID modifier, boolean serialize)
    {
        
        Item item1 = new Item(target, slot, modifier);
        
        return item1;
    }


    public static Item ItemReplace(Pos pos, Slot slot, ItemStack item)
    {
        return ItemReplace(pos, slot, item, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Item ItemReplace(Pos pos, Slot slot, ItemStack item, bool serialize = true)
    public static Item ItemReplace(Pos pos, Slot slot, ItemStack item, boolean serialize)
    {
        
        Item item1 = new Item(pos, slot, item);
        
        return item1;
    }


    public static Item ItemReplace(Selector target, Slot slot, ItemStack item)
    {
        return ItemReplace(target, slot, item, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Item ItemReplace(Selector target, Slot slot, ItemStack item, bool serialize = true)
    public static Item ItemReplace(Selector target, Slot slot, ItemStack item, boolean serialize)
    {
        
        Item item1 = new Item(target, slot, item);
        
        return item1;
    }


    public static Item ItemReplaceFrom(Pos pos, Slot slot, Selector target, Slot slot2, ID modifier)
    {
        return ItemReplaceFrom(pos, slot, target, slot2, modifier, true);
    }

    public static Item ItemReplaceFrom(Pos pos, Slot slot, Selector target, Slot slot2)
    {
        return ItemReplaceFrom(pos, slot, target, slot2, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Item ItemReplaceFrom(Pos pos, Slot slot, Selector target, Slot slot2, ID modifier = null, bool serialize = true)
    public static Item ItemReplaceFrom(Pos pos, Slot slot, Selector target, Slot slot2, ID modifier, boolean serialize)
    {
        
        Item item1 = new Item(pos, slot, target, slot2, modifier);
        
        return item1;
    }


    public static Item ItemReplaceFrom(Selector target, Slot slot, Selector target2, Slot slot2, ID modifier)
    {
        return ItemReplaceFrom(target, slot, target2, slot2, modifier, true);
    }

    public static Item ItemReplaceFrom(Selector target, Slot slot, Selector target2, Slot slot2)
    {
        return ItemReplaceFrom(target, slot, target2, slot2, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Item ItemReplaceFrom(Selector target, Slot slot, Selector target2, Slot slot2, ID modifier = null, bool serialize = true)
    public static Item ItemReplaceFrom(Selector target, Slot slot, Selector target2, Slot slot2, ID modifier, boolean serialize)
    {
        
        Item item1 = new Item(target, slot, target2, slot2, modifier);
        
        return item1;
    }


    public static Item ItemReplaceFrom(Pos pos, Slot slot, Pos pos2, Slot slot2, ID modifier)
    {
        return ItemReplaceFrom(pos, slot, pos2, slot2, modifier, true);
    }

    public static Item ItemReplaceFrom(Pos pos, Slot slot, Pos pos2, Slot slot2)
    {
        return ItemReplaceFrom(pos, slot, pos2, slot2, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Item ItemReplaceFrom(Pos pos, Slot slot, Pos pos2, Slot slot2, ID modifier = null, bool serialize = true)
    public static Item ItemReplaceFrom(Pos pos, Slot slot, Pos pos2, Slot slot2, ID modifier, boolean serialize)
    {
        
        Item item1 = new Item(pos, slot, pos2, slot2, modifier);
        
        return item1;
    }


    public static Item ItemReplaceFrom(Selector target, Slot slot, Pos pos2, Slot slot2, ID modifier)
    {
        return ItemReplaceFrom(target, slot, pos2, slot2, modifier, true);
    }

    public static Item ItemReplaceFrom(Selector target, Slot slot, Pos pos2, Slot slot2)
    {
        return ItemReplaceFrom(target, slot, pos2, slot2, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Item ItemReplaceFrom(Selector target, Slot slot, Pos pos2, Slot slot2, ID modifier = null, bool serialize = true)
    public static Item ItemReplaceFrom(Selector target, Slot slot, Pos pos2, Slot slot2, ID modifier, boolean serialize)
    {
        
        Item item1 = new Item(target, slot, pos2, slot2, modifier);
        
        return item1;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region jfr

    public static Jfr JfrStart()
    {
        return JfrStart(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Jfr JfrStart(bool serialize = true)
    public static Jfr JfrStart(boolean serialize)
    {

        return new Jfr("start");
    }


    public static Jfr JfrStop()
    {
        return JfrStop(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Jfr JfrStop(bool serialize = true)
    public static Jfr JfrStop(boolean serialize)
    {

        return new Jfr("stop");
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region kick

    public static Kick Kick(Selector target, String reason)
    {
        return Kick(target, reason, true);
    }

    public static Kick Kick(Selector target)
    {
        return Kick(target, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Kick Kick(Selector target, string reason = null, bool serialize = true)
    public static Kick Kick(Selector target, String reason, boolean serialize)
    {

        return new Kick(target, reason);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region kill

    public static Kill Kill(Selector target)
    {
        return Kill(target, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Kill Kill(Selector target, bool serialize = true)
    public static Kill Kill(Selector target, boolean serialize)
    {

        return new Kill(target);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region list

    public static List List()
    {
        return List(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static List List(bool serialize = true)
    public static List List(boolean serialize)
    {

        return new List(null);
    }


    public static List ListUUID()
    {
        return ListUUID(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static List ListUUID(bool serialize = true)
    public static List ListUUID(boolean serialize)
    {

        return new List(114514);
    }

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region locate

    public static Locate LocateBiome(ID biome)
    {
        return LocateBiome(biome, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Locate LocateBiome(ID biome, bool serialize = true)
    public static Locate LocateBiome(ID biome, boolean serialize)
    {

        return new Locate("biome", biome);
    }


    public static Locate LocatePoi(ID poi)
    {
        return LocatePoi(poi, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Locate LocatePoi(ID poi, bool serialize = true)
    public static Locate LocatePoi(ID poi, boolean serialize)
    {

        return new Locate("poi", poi);
    }


    public static Locate LocateStructure(ID structure)
    {
        return LocateStructure(structure, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Locate LocateStructure(ID structure, bool serialize = true)
    public static Locate LocateStructure(ID structure, boolean serialize)
    {

        return new Locate("structure", structure);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region me

    public static Me Me(String action)
    {
        return Me(action, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Me Me(string action, bool serialize = true)
    public static Me Me(String action, boolean serialize)
    {

        return new Me(action);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region msg

    public static Msg Msg(Selector player, String message)
    {
        return Msg(player, message, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Msg Msg(Selector player, string message, bool serialize = true)
    public static Msg Msg(Selector player, String message, boolean serialize)
    {

        return new Msg(player, message);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region op

    public static Op Op(Selector player)
    {
        return Op(player, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Op Op(Selector player, bool serialize = true)
    public static Op Op(Selector player, boolean serialize)
    {

        return new Op(player);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region pardon

    public static Pardon Pardon(String name)
    {
        return Pardon(name, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Pardon Pardon(string name, bool serialize = true)
    public static Pardon Pardon(String name, boolean serialize)
    {

        return new Pardon(name);
    }


    public static Pardon PardonUUID(UUID uuid)
    {
        return PardonUUID(uuid, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Pardon PardonUUID(UUID uuid, bool serialize = true)
    public static Pardon PardonUUID(UUID uuid, boolean serialize)
    {

        return new Pardon(uuid);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region pardon-ip

    public static Pardon_ip Pardon_ip(String ip)
    {
        return Pardon_ip(ip, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Pardon_ip Pardon_ip(string ip, bool serialize = true)
    public static Pardon_ip Pardon_ip(String ip, boolean serialize)
    {

        return new Pardon_ip(ip);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region particle

    public static Particle Particle(ID particle, Pos pos)
    {
        return Particle(particle, pos, true);
    }

    public static Particle Particle(ID particle)
    {
        return Particle(particle, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle(ID particle, Pos pos = null, bool serialize = true)
    public static Particle Particle(ID particle, Pos pos, boolean serialize)
    {

        return new Particle(particle, pos);
    }


    public static Particle Particle(ID particle, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers)
    {
        return Particle(particle, pos, delta, speed, count, force, viewers, true);
    }

    public static Particle Particle(ID particle, Pos pos, Vector3<Float> delta, float speed, int count, boolean force)
    {
        return Particle(particle, pos, delta, speed, count, force, null, true);
    }

    public static Particle Particle(ID particle, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        return Particle(particle, pos, delta, speed, count, false, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle(ID particle, Pos pos, Vector3<float> delta, float speed, int count, bool force = false, Selector viewers = null, bool serialize = true)
    public static Particle Particle(ID particle, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers, boolean serialize)
    {

        return new Particle(particle, pos, delta, speed, count, force ? "force" : "normal", viewers);
    }


    public static Particle Particle_dust(Color color, float size, Pos pos)
    {
        return Particle_dust(color, size, pos, true);
    }

    public static Particle Particle_dust(Color color, float size)
    {
        return Particle_dust(color, size, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_dust(Type.Color color, float size, Pos pos = null, bool serialize = true)
    public static Particle Particle_dust(Color color, float size, Pos pos, boolean serialize)
    {

        return new Particle(color, size, pos);
    }


    public static Particle Particle_dust(Color color, float size, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers)
    {
        return Particle_dust(color, size, pos, delta, speed, count, force, viewers, true);
    }

    public static Particle Particle_dust(Color color, float size, Pos pos, Vector3<Float> delta, float speed, int count, boolean force)
    {
        return Particle_dust(color, size, pos, delta, speed, count, force, null, true);
    }

    public static Particle Particle_dust(Color color, float size, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        return Particle_dust(color, size, pos, delta, speed, count, false, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_dust(Type.Color color, float size, Pos pos, Vector3<float> delta, float speed, int count, bool force = false, Selector viewers = null, bool serialize = true)
    public static Particle Particle_dust(Color color, float size, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers, boolean serialize)
    {

        return new Particle(color, size, pos, delta, speed, count, force ? "force" : "normal", viewers);
    }


    public static Particle Particle_dust_color_transition(Color color1, float size, Color color2, Pos pos)
    {
        return Particle_dust_color_transition(color1, size, color2, pos, true);
    }

    public static Particle Particle_dust_color_transition(Color color1, float size, Color color2)
    {
        return Particle_dust_color_transition(color1, size, color2, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_dust_color_transition(Type.Color color1, float size, Type.Color color2, Pos pos = null, bool serialize = true)
    public static Particle Particle_dust_color_transition(Color color1, float size, Color color2, Pos pos, boolean serialize)
    {

        return new Particle(color1, size, color2, pos);
    }


    public static Particle Particle_dust_color_transition(Color color1, float size, Color color2, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers)
    {
        return Particle_dust_color_transition(color1, size, color2, pos, delta, speed, count, force, viewers, true);
    }

    public static Particle Particle_dust_color_transition(Color color1, float size, Color color2, Pos pos, Vector3<Float> delta, float speed, int count, boolean force)
    {
        return Particle_dust_color_transition(color1, size, color2, pos, delta, speed, count, force, null, true);
    }

    public static Particle Particle_dust_color_transition(Color color1, float size, Color color2, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        return Particle_dust_color_transition(color1, size, color2, pos, delta, speed, count, false, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_dust_color_transition(Type.Color color1, float size, Type.Color color2, Pos pos, Vector3<float> delta, float speed, int count, bool force = false, Selector viewers = null, bool serialize = true)
    public static Particle Particle_dust_color_transition(Color color1, float size, Color color2, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers, boolean serialize)
    {

        return new Particle(color1, size, color2, pos, delta, speed, count, force ? "force" : "normal", viewers);
    }


    public static Particle Particle_block(BlockState block, Pos pos)
    {
        return Particle_block(block, pos, true);
    }

    public static Particle Particle_block(BlockState block)
    {
        return Particle_block(block, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_block(BlockState block, Pos pos = null, bool serialize = true)
    public static Particle Particle_block(BlockState block, Pos pos, boolean serialize)
    {

        return new Particle(new ID("minecraft:block"), block, pos);
    }


    public static Particle Particle_block(BlockState block, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers)
    {
        return Particle_block(block, pos, delta, speed, count, force, viewers, true);
    }

    public static Particle Particle_block(BlockState block, Pos pos, Vector3<Float> delta, float speed, int count, boolean force)
    {
        return Particle_block(block, pos, delta, speed, count, force, null, true);
    }

    public static Particle Particle_block(BlockState block, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        return Particle_block(block, pos, delta, speed, count, false, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_block(BlockState block, Pos pos, Vector3<float> delta, float speed, int count, bool force = false, Selector viewers = null, bool serialize = true)
    public static Particle Particle_block(BlockState block, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers, boolean serialize)
    {

        return new Particle(new ID("minecraft:block"), block, pos, delta, speed, count, force ? "force" : "normal", viewers);
    }


    public static Particle Particle_falling_dust(BlockState block, Pos pos)
    {
        return Particle_falling_dust(block, pos, true);
    }

    public static Particle Particle_falling_dust(BlockState block)
    {
        return Particle_falling_dust(block, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_falling_dust(BlockState block, Pos pos = null, bool serialize = true)
    public static Particle Particle_falling_dust(BlockState block, Pos pos, boolean serialize)
    {

        return new Particle(new ID("minecraft:falling_dust"), block, pos);
    }


    public static Particle Particle_falling_dust(BlockState block, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers)
    {
        return Particle_falling_dust(block, pos, delta, speed, count, force, viewers, true);
    }

    public static Particle Particle_falling_dust(BlockState block, Pos pos, Vector3<Float> delta, float speed, int count, boolean force)
    {
        return Particle_falling_dust(block, pos, delta, speed, count, force, null, true);
    }

    public static Particle Particle_falling_dust(BlockState block, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        return Particle_falling_dust(block, pos, delta, speed, count, false, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_falling_dust(BlockState block, Pos pos, Vector3<float> delta, float speed, int count, bool force = false, Selector viewers = null, bool serialize = true)
    public static Particle Particle_falling_dust(BlockState block, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers, boolean serialize)
    {

        return new Particle(new ID("minecraft:falling_dust"), block, pos, delta, speed, count, force ? "force" : "normal", viewers);
    }


    public static Particle Particle_item(ItemStack item, Pos pos)
    {
        return Particle_item(item, pos, true);
    }

    public static Particle Particle_item(ItemStack item)
    {
        return Particle_item(item, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_item(ItemStack item, Pos pos = null, bool serialize = true)
    public static Particle Particle_item(ItemStack item, Pos pos, boolean serialize)
    {

        return new Particle(item, pos);
    }


    public static Particle Particle_item(ItemStack item, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers)
    {
        return Particle_item(item, pos, delta, speed, count, force, viewers, true);
    }

    public static Particle Particle_item(ItemStack item, Pos pos, Vector3<Float> delta, float speed, int count, boolean force)
    {
        return Particle_item(item, pos, delta, speed, count, force, null, true);
    }

    public static Particle Particle_item(ItemStack item, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        return Particle_item(item, pos, delta, speed, count, false, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_item(ItemStack item, Pos pos, Vector3<float> delta, float speed, int count, bool force = false, Selector viewers = null, bool serialize = true)
    public static Particle Particle_item(ItemStack item, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers, boolean serialize)
    {

        return new Particle(item, pos, delta, speed, count, force ? "force" : "normal", viewers);
    }


    public static Particle Particle_shriek(int second, Pos pos)
    {
        return Particle_shriek(second, pos, true);
    }

    public static Particle Particle_shriek(int second)
    {
        return Particle_shriek(second, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_shriek(int second, Pos pos = null, bool serialize = true)
    public static Particle Particle_shriek(int second, Pos pos, boolean serialize)
    {

        return new Particle(second, pos);
    }


    public static Particle Particle_shriek(int second, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers)
    {
        return Particle_shriek(second, pos, delta, speed, count, force, viewers, true);
    }

    public static Particle Particle_shriek(int second, Pos pos, Vector3<Float> delta, float speed, int count, boolean force)
    {
        return Particle_shriek(second, pos, delta, speed, count, force, null, true);
    }

    public static Particle Particle_shriek(int second, Pos pos, Vector3<Float> delta, float speed, int count)
    {
        return Particle_shriek(second, pos, delta, speed, count, false, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Particle Particle_shriek(int second, Pos pos, Vector3<float> delta, float speed, int count, bool force = false, Selector viewers = null, bool serialize = true)
    public static Particle Particle_shriek(int second, Pos pos, Vector3<Float> delta, float speed, int count, boolean force, Selector viewers, boolean serialize)
    {

        return new Particle(second, pos, delta, speed, count, force ? "force" : "normal", viewers);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region perf

    public static Perf PerfStart()
    {
        return PerfStart(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Perf PerfStart(bool serialize = true)
    public static Perf PerfStart(boolean serialize)
    {

        return new Perf("start");
    }


    public static Perf PerfStop()
    {
        return PerfStop(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Perf PerfStop(bool serialize = true)
    public static Perf PerfStop(boolean serialize)
    {
        
        Perf perfStart1 = new Perf("stop");
        
        return perfStart1;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region place

    public static Place PlaceFeature(ID feature, Pos pos)
    {
        return PlaceFeature(feature, pos, true);
    }

    public static Place PlaceFeature(ID feature)
    {
        return PlaceFeature(feature, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Place PlaceFeature(ID feature, Pos pos = null, bool serialize = true)
    public static Place PlaceFeature(ID feature, Pos pos, boolean serialize)
    {

        return new Place(feature, pos);
    }


    public static Place PlaceJigsaw(ID pool, ID target, int max_depth, Pos pos)
    {
        return PlaceJigsaw(pool, target, max_depth, pos, true);
    }

    public static Place PlaceJigsaw(ID pool, ID target, int max_depth)
    {
        return PlaceJigsaw(pool, target, max_depth, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Place PlaceJigsaw(ID pool, ID target, int max_depth, Pos pos = null, bool serialize = true)
    public static Place PlaceJigsaw(ID pool, ID target, int max_depth, Pos pos, boolean serialize)
    {

        return new Place(pool, target, max_depth, pos);
    }


    public static Place PlaceStructure(ID structure, Pos pos)
    {
        return PlaceStructure(structure, pos, true);
    }

    public static Place PlaceStructure(ID structure)
    {
        return PlaceStructure(structure, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Place PlaceStructure(ID structure, Pos pos = null, bool serialize = true)
    public static Place PlaceStructure(ID structure, Pos pos, boolean serialize)
    {

        return new Place(structure, pos, 114514);
    }


    public static Place PlaceTemplate(ID template, Pos pos, Place.Rot rot, Place.Mirror mirror, float integrity, Long seed)
    {
        return PlaceTemplate(template, pos, rot, mirror, integrity, seed, true);
    }

    public static Place PlaceTemplate(ID template, Pos pos, Place.Rot rot, Place.Mirror mirror, float integrity)
    {
        return PlaceTemplate(template, pos, rot, mirror, integrity, null, true);
    }

    public static Place PlaceTemplate(ID template, Pos pos, Place.Rot rot, Place.Mirror mirror)
    {
        return PlaceTemplate(template, pos, rot, mirror, 1.0f, null, true);
    }

    public static Place PlaceTemplate(ID template, Pos pos, Place.Rot rot)
    {
        return PlaceTemplate(template, pos, rot, Place.Mirror.none, 1.0f, null, true);
    }

    public static Place PlaceTemplate(ID template, Pos pos)
    {
        return PlaceTemplate(template, pos, Place.Rot._none, Place.Mirror.none, 1.0f, null, true);
    }

    public static Place PlaceTemplate(ID template)
    {
        return PlaceTemplate(template, null, Place.Rot._none, Place.Mirror.none, 1.0f, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Place PlaceTemplate(ID template, Pos pos = null, Rot rot = Rot._none, Mirror mirror = Mirror.none, float integrity = 1.0f, Nullable<long> seed = null, bool serialize = true)
    public static Place PlaceTemplate(ID template, Pos pos, Place.Rot rot, Place.Mirror mirror, float integrity, Long seed, boolean serialize)
    {

        return new Place(template, pos, rot, mirror, integrity, seed);
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region playsound

    public static Playsound Playsound(ID sound, Playsound.Source source, Selector targets, Pos pos, float volume, float pitch, float minvolumn)
    {
        return Playsound(sound, source, targets, pos, volume, pitch, minvolumn, true);
    }

    public static Playsound Playsound(ID sound, Playsound.Source source, Selector targets, Pos pos, float volume, float pitch)
    {
        return Playsound(sound, source, targets, pos, volume, pitch, 0, true);
    }

    public static Playsound Playsound(ID sound, Playsound.Source source, Selector targets, Pos pos, float volume)
    {
        return Playsound(sound, source, targets, pos, volume, 1.0f, 0, true);
    }

    public static Playsound Playsound(ID sound, Playsound.Source source, Selector targets, Pos pos)
    {
        return Playsound(sound, source, targets, pos, 1.0f, 1.0f, 0, true);
    }

    public static Playsound Playsound(ID sound, Playsound.Source source, Selector targets)
    {
        return Playsound(sound, source, targets, null, 1.0f, 1.0f, 0, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Playsound Playsound(ID sound, Playsound.Source source, Selector targets, Pos pos = null, float volume = 1.0f, float pitch = 1.0f, float minvolumn = 0, bool serialize = true)
    public static Playsound Playsound(ID sound, Playsound.Source source, Selector targets, Pos pos, float volume, float pitch, float minvolumn, boolean serialize)
    {
        
        Playsound playsound = new Playsound(sound, source, targets, pos, volume, pitch, minvolumn);
        
        return playsound;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region publish

    public static Publish Publish(boolean allowCommands, Gamemodes gamemode, Integer port)
    {
        return Publish(allowCommands, gamemode, port, true);
    }

    public static Publish Publish(boolean allowCommands, Gamemodes gamemode)
    {
        return Publish(allowCommands, gamemode, null, true);
    }

    public static Publish Publish(boolean allowCommands)
    {
        return Publish(allowCommands, Gamemodes.survival, null, true);
    }

    public static Publish Publish()
    {
        return Publish(false, Gamemodes.survival, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Publish Publish(bool allowCommands = false, Gamemodes gamemode = Gamemodes.survival, Nullable<int> port = null, bool serialize = true)
    public static Publish Publish(boolean allowCommands, Gamemodes gamemode, Integer port, boolean serialize)
    {
        
        Publish publish = new Publish(allowCommands, gamemode, port);
        
        return publish;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region recipe

    public static Recipe RecipeGive(Selector targets, ID recipe)
    {
        return RecipeGive(targets, recipe, true);
    }

    public static Recipe RecipeGive(Selector targets)
    {
        return RecipeGive(targets, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Recipe RecipeGive(Selector targets, ID recipe = null, bool serialize = true)
    public static Recipe RecipeGive(Selector targets, ID recipe, boolean serialize)
    {
        
        Recipe recipe1 = new Recipe(Recipe.gt.give, targets, recipe);
        
        return recipe1;
    }


    public static Recipe RecipeTake(Selector targets, ID recipe)
    {
        return RecipeTake(targets, recipe, true);
    }

    public static Recipe RecipeTake(Selector targets)
    {
        return RecipeTake(targets, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Recipe RecipeTake(Selector targets, ID recipe = null, bool serialize = true)
    public static Recipe RecipeTake(Selector targets, ID recipe, boolean serialize)
    {
        
        Recipe recipe1 = new Recipe(Recipe.gt.take, targets, recipe);
        
        return recipe1;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region reload

    public static Reload Reload()
    {
        return Reload(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Reload Reload(bool serialize = true)
    public static Reload Reload(boolean serialize)
    {
        
        Reload reload = new Reload();
        
        return reload;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region save-all

    public static Save_all Save_All(boolean flush)
    {
        return Save_All(flush, true);
    }

    public static Save_all Save_All()
    {
        return Save_All(false, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Save_all Save_All(bool flush = false, bool serialize = true)
    public static Save_all Save_All(boolean flush, boolean serialize)
    {
        
        Save_all save_All = new Save_all(flush);
        
        return save_All;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region save-off

    public static Save_off Save_Off()
    {
        return Save_Off(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Save_off Save_Off(bool serialize = true)
    public static Save_off Save_Off(boolean serialize)
    {
        
        Save_off save_Off = new Save_off();
        
        return save_Off;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region save-on

    public static Save_on Save_On()
    {
        return Save_On(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Save_on Save_On(bool serialize = true)
    public static Save_on Save_On(boolean serialize)
    {
        
        Save_on save_On = new Save_on();
        
        return save_On;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region say
    /**
     /say

     @param text 要发送的文本
     */

    public static Say Say(String text)
    {
        return Say(text, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Say Say(string text, bool serialize = true)
    public static Say Say(String text, boolean serialize)
    {
        
        Say say = new Say(text);
        
        return say;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region schedule

    public static Schedule ScheduleAppend(ID function, String time)
    {
        return ScheduleAppend(function, time, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Schedule ScheduleAppend(ID function, string time, bool serialize = true)
    public static Schedule ScheduleAppend(ID function, String time, boolean serialize)
    {
        
        Schedule schedule = new Schedule(function, time, Schedule.ar.append);
        
        return schedule;
    }


    public static Schedule ScheduleReplace(ID function, String time)
    {
        return ScheduleReplace(function, time, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Schedule ScheduleReplace(ID function, string time, bool serialize = true)
    public static Schedule ScheduleReplace(ID function, String time, boolean serialize)
    {
        
        Schedule schedule = new Schedule(function, time, Schedule.ar.replace);
        
        return schedule;
    }


    public static Schedule ScheduleClear(ID function)
    {
        return ScheduleClear(function, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Schedule ScheduleClear(ID function, bool serialize = true)
    public static Schedule ScheduleClear(ID function, boolean serialize)
    {

        
        Schedule schedule = new Schedule(function);
        
        return schedule;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region scoreboard

    public static Scoreboard SbObjectAdd(SbObject sbObject, String rule, JsonText display)
    {
        return SbObjectAdd(sbObject, rule, display, true);
    }

    public static Scoreboard SbObjectAdd(SbObject sbObject, String rule)
    {
        return SbObjectAdd(sbObject, rule, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Scoreboard SbObjectAdd(SbObject sbObject, string rule, JsonText display = null, bool serialize = true)
    public static Scoreboard SbObjectAdd(SbObject sbObject, String rule, JsonText display, boolean serialize)
    {
        
        Scoreboard scoreboard = new Scoreboard(sbObject, rule, display);
        
        return scoreboard;
    }


    public static Scoreboard SbObjectList()
    {
        return SbObjectList(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Scoreboard SbObjectList(bool serialize = true)
    public static Scoreboard SbObjectList(boolean serialize)
    {
        
        Scoreboard scoreboard = new Scoreboard();
        
        return scoreboard;
    }


    public static Scoreboard SbObjectModifyDisplayName(String rule, JsonText display)
    {
        return SbObjectModifyDisplayName(rule, display, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Scoreboard SbObjectModifyDisplayName(string rule, JsonText display, bool serialize = true)
    public static Scoreboard SbObjectModifyDisplayName(String rule, JsonText display, boolean serialize)
    {
        
        Scoreboard scoreboard = new Scoreboard(rule, display);
        
        return scoreboard;
    }


    public static Scoreboard SbObjectModifyRenderType(SbObject objective, Scoreboard.hi renderType)
    {
        return SbObjectModifyRenderType(objective, renderType, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Scoreboard SbObjectModifyRenderType(SbObject objective, Scoreboard.hi renderType, bool serialize = true)
    public static Scoreboard SbObjectModifyRenderType(SbObject objective, Scoreboard.hi renderType, boolean serialize)
    {
        
        Scoreboard scoreboard = new Scoreboard(objective, renderType);
        
        return scoreboard;
    }


    public static Scoreboard SbObjectRemove(SbObject objective)
    {
        return SbObjectRemove(objective, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Scoreboard SbObjectRemove(SbObject objective, bool serialize = true)
    public static Scoreboard SbObjectRemove(SbObject objective, boolean serialize)
    {
        
        Scoreboard scoreboard = new Scoreboard(objective);
        
        return scoreboard;
    }


    public static Scoreboard SbObjectSetdisplay(Scoreboard.DisplaySlot displaySlot, SbObject objective)
    {
        return SbObjectSetdisplay(displaySlot, objective, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Scoreboard SbObjectSetdisplay(Scoreboard.DisplaySlot displaySlot, SbObject objective, bool serialize = true)
    public static Scoreboard SbObjectSetdisplay(Scoreboard.DisplaySlot displaySlot, SbObject objective, boolean serialize)
    {

        return new Scoreboard(displaySlot, objective);
    }

    public static Scoreboard SbPlayerAdd(Int target, int value)
    {

        return new Scoreboard(Scoreboard.ars.add, target.identifier, target.object, value);
    }

    public static Scoreboard SbPlayerEnableTrigger(String target, SbObject trigger)
    {

        return new Scoreboard(target, trigger);
    }

    public static Scoreboard SbPlayerGet(String target, SbObject objective)
    {

        return new Scoreboard(Scoreboard.eg.get, target, objective);
    }


    public static Scoreboard SbPlayerList(String target)
    {

        return new Scoreboard(target);
    }

    public static Scoreboard SbPlayerOperation(Int a, String operation, Int b)
    {
        return new Scoreboard(a.identifier, a.object, operation, b.identifier, b.object);
    }

    public static Scoreboard SbPlayerRemove(Int target, int value)
    {

        return new Scoreboard(Scoreboard.ars.remove, target.identifier, target.object, value);
    }

    public static Scoreboard SbPlayerReset(String target)
    {
        return SbPlayerReset(target, null);
    }

    public static Scoreboard SbPlayerReset(String target, SbObject objective)
    {
        return new Scoreboard(target, objective);
    }

    public static Scoreboard SbPlayerSet(Int a, int value)
    {

        return new Scoreboard(Scoreboard.ars.set, a.identifier, a.object, value);
    }
    public static Seed Seed()
    {
        return Seed(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Seed Seed(bool serialize = true)
    public static Seed Seed(boolean serialize)
    {

        return new Seed();
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region setblock

    public static Setblock Setblock(Pos pos, BlockState state, Setblock.dkr mode)
    {
        return Setblock(pos, state, mode, true);
    }

    public static Setblock Setblock(Pos pos, BlockState state)
    {
        return Setblock(pos, state, Setblock.dkr.replace, true);
    }

    public static Setblock Setblock(Pos pos)
    {
        return Setblock(pos, null, Setblock.dkr.replace, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Setblock Setblock(Pos pos, BlockState state = null, Setblock.dkr mode = Setblock.dkr.replace, bool serialize = true)
    public static Setblock Setblock(Pos pos, BlockState state, Setblock.dkr mode, boolean serialize)
    {
        
        Setblock setblock = new Setblock(pos, state, mode);
        
        return setblock;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region setidletimeout

    public static Setidletimeout Setidletimeout(int time)
    {
        return Setidletimeout(time, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Setidletimeout Setidletimeout(int time, bool serialize = true)
    public static Setidletimeout Setidletimeout(int time, boolean serialize)
    {
        
        Setidletimeout setidletimeout = new Setidletimeout(time);
        
        return setidletimeout;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region setworldspawn

    public static Setworldspawn Setworldspawn(Pos pos, Rotation angle)
    {
        return Setworldspawn(pos, angle, true);
    }

    public static Setworldspawn Setworldspawn(Pos pos)
    {
        return Setworldspawn(pos, null, true);
    }

    public static Setworldspawn Setworldspawn()
    {
        return Setworldspawn(null, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Setworldspawn Setworldspawn(Pos pos = null, Rotation angle = null, bool serialize = true)
    public static Setworldspawn Setworldspawn(Pos pos, Rotation angle, boolean serialize)
    {
        
        Setworldspawn setworldspawn = new Setworldspawn(pos, angle);
        
        return setworldspawn;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region spawnpoint

    public static Spawnpoint Spawnpoint(Selector target, Pos pos, Rotation angle)
    {
        return Spawnpoint(target, pos, angle, true);
    }

    public static Spawnpoint Spawnpoint(Selector target, Pos pos)
    {
        return Spawnpoint(target, pos, null, true);
    }

    public static Spawnpoint Spawnpoint(Selector target)
    {
        return Spawnpoint(target, null, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Spawnpoint Spawnpoint(Selector target, Pos pos = null, Rotation angle = null, bool serialize = true)
    public static Spawnpoint Spawnpoint(Selector target, Pos pos, Rotation angle, boolean serialize)
    {
        
        Spawnpoint spawnpoint = new Spawnpoint(target, pos, angle);
        
        return spawnpoint;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region spectate

    public static Spectate Spectate(Selector target, Selector source)
    {
        return Spectate(target, source, true);
    }

    public static Spectate Spectate(Selector target)
    {
        return Spectate(target, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Spectate Spectate(Selector target, Selector source = null, bool serialize = true)
    public static Spectate Spectate(Selector target, Selector source, boolean serialize)
    {
        
        Spectate spectate = new Spectate(target, source);
        
        return spectate;
    }


    public static Spectate StopSpectate()
    {
        return StopSpectate(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Spectate StopSpectate(bool serialize = true)
    public static Spectate StopSpectate(boolean serialize)
    {
        
        Spectate spectate = new Spectate();
        
        return spectate;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region spreadplayers

    public static Spreadplayers SpreadPlayers(Pos2D pos, float spreadDistance, float maxRange, boolean respectTeams, Selector targets)
    {
        return SpreadPlayers(pos, spreadDistance, maxRange, respectTeams, targets, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Spreadplayers SpreadPlayers(Pos2D pos, float spreadDistance, float maxRange, bool respectTeams, Selector targets, bool serialize = true)
    public static Spreadplayers SpreadPlayers(Pos2D pos, float spreadDistance, float maxRange, boolean respectTeams, Selector targets, boolean serialize)
    {
        
        Spreadplayers spreadplayers = new Spreadplayers(pos, spreadDistance, maxRange, respectTeams, targets);
        
        return spreadplayers;
    }


    public static Spreadplayers SpreadPlayers(Pos2D pos, float spreadDistance, float maxRange, float maxheight, boolean respectTeams, Selector targets)
    {
        return SpreadPlayers(pos, spreadDistance, maxRange, maxheight, respectTeams, targets, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Spreadplayers SpreadPlayers(Pos2D pos, float spreadDistance, float maxRange, float maxheight, bool respectTeams, Selector targets, bool serialize = true)
    public static Spreadplayers SpreadPlayers(Pos2D pos, float spreadDistance, float maxRange, float maxheight, boolean respectTeams, Selector targets, boolean serialize)
    {
        
        Spreadplayers spreadplayers = new Spreadplayers(pos, spreadDistance, maxRange, maxheight, respectTeams, targets);
        
        return spreadplayers;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region stop

    public static Stop Stop()
    {
        return Stop(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Stop Stop(bool serialize = true)
    public static Stop Stop(boolean serialize)
    {
        
        Stop stop = new Stop();
        
        return stop;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region stopsound

    public static Stopsound Stopsound(Selector target, Stopsound.Source source, String sound)
    {
        return Stopsound(target, source, sound, true);
    }

    public static Stopsound Stopsound(Selector target, Stopsound.Source source)
    {
        return Stopsound(target, source, null, true);
    }

    public static Stopsound Stopsound(Selector target)
    {
        return Stopsound(target, Stopsound.Source.master, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Stopsound Stopsound(Selector target, Stopsound.Source source = Stopsound.Source.master, string sound = null, bool serialize = true)
    public static Stopsound Stopsound(Selector target, Stopsound.Source source, String sound, boolean serialize)
    {
        
        Stopsound stopsound = new Stopsound(target, source, new ID(sound));
        
        return stopsound;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region summon

    public static Summon Summon(ID entity, Pos pos, NBTTag nbt)
    {
        return Summon(entity, pos, nbt, true);
    }

    public static Summon Summon(ID entity, Pos pos)
    {
        return Summon(entity, pos, null, true);
    }

    public static Summon Summon(ID entity)
    {
        return Summon(entity, null, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Summon Summon(ID entity, Pos pos = null, NBTTag nbt = null, bool serialize = true)
    public static Summon Summon(ID entity, Pos pos, NBTTag nbt, boolean serialize)
    {
        
        Summon summon = new Summon(entity, pos, nbt);
        
        return summon;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region tag

    public static Tag TagAdd(Selector targets, String name)
    {
        return TagAdd(targets, name, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tag TagAdd(Selector targets, string name, bool serialize = true)
    public static Tag TagAdd(Selector targets, String name, boolean serialize)
    {
        
        Tag tag = new Tag(targets, Tag.ar.add, name);
        
        return tag;
    }


    public static Tag TagRemove(Selector targets, String name)
    {
        return TagRemove(targets, name, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tag TagRemove(Selector targets, string name, bool serialize = true)
    public static Tag TagRemove(Selector targets, String name, boolean serialize)
    {
        
        Tag tag = new Tag(targets, Tag.ar.remove, name);
        
        return tag;
    }


    public static Tag TagList(Selector targets)
    {
        return TagList(targets, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tag TagList(Selector targets, bool serialize = true)
    public static Tag TagList(Selector targets, boolean serialize)
    {
        
        Tag tag = new Tag(targets);
        
        return tag;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region team

    public static Team TeamList(String team)
    {
        return TeamList(team, true);
    }

    public static Team TeamList()
    {
        return TeamList(null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamList(string team = null, bool serialize = true)
    public static Team TeamList(String team, boolean serialize)
    {
        
        Team teamcmd = new Team(team);
        
        return teamcmd;
    }


    public static Team TeamAdd(String team, JsonText displayName)
    {
        return TeamAdd(team, displayName, true);
    }

    public static Team TeamAdd(String team)
    {
        return TeamAdd(team, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamAdd(string team, JsonText displayName = null, bool serialize = true)
    public static Team TeamAdd(String team, JsonText displayName, boolean serialize)
    {
        
        Team teamcmd = new Team(team, displayName);
        
        return teamcmd;
    }


    public static Team TeamRemove(String team)
    {
        return TeamRemove(team, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamRemove(string team, bool serialize = true)
    public static Team TeamRemove(String team, boolean serialize)
    {
        
        Team teamcmd = new Team(Team.re.remove, team);
        
        return teamcmd;
    }


    public static Team TeamEmpty(String team)
    {
        return TeamEmpty(team, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamEmpty(string team, bool serialize = true)
    public static Team TeamEmpty(String team, boolean serialize)
    {

        
        Team teamcmd = new Team(Team.re.empty, team);
        
        return teamcmd;
    }


    public static Team TeamJoin(String team, Selector members)
    {
        return TeamJoin(team, members, true);
    }

    public static Team TeamJoin(String team)
    {
        return TeamJoin(team, null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamJoin(string team, Selector members = null, bool serialize = true)
    public static Team TeamJoin(String team, Selector members, boolean serialize)
    {
        
        Team teamcmd = new Team(team, members);
        
        return teamcmd;
    }


    public static Team TeamLeave(Selector members)
    {
        return TeamLeave(members, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamLeave(Selector members, bool serialize = true)
    public static Team TeamLeave(Selector members, boolean serialize)
    {
        
        Team teamcmd = new Team(members);
        
        return teamcmd;
    }


    public static Team TeamModifyDisplayName(String team, JsonText displayName)
    {
        return TeamModifyDisplayName(team, displayName, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamModifyDisplayName(string team, JsonText displayName, bool serialize = true)
    public static Team TeamModifyDisplayName(String team, JsonText displayName, boolean serialize)
    {
        
        Team teamcmd = new Team(team, Team.OptionJSON.displayName, displayName);
        
        return teamcmd;
    }


    public static Team TeamModifyColor(String team, Color.Colors color)
    {
        return TeamModifyColor(team, color, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamModifyColor(string team, Type.Color.Colors color, bool serialize = true)
    public static Team TeamModifyColor(String team, Color.Colors color, boolean serialize)
    {
        
        Team teamcmd = new Team(team, Team.OptionColor.color, color);
        
        return teamcmd;
    }


    public static Team TeamModifyFriendlyFire(String team, boolean allowed)
    {
        return TeamModifyFriendlyFire(team, allowed, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamModifyFriendlyFire(string team, bool allowed, bool serialize = true)
    public static Team TeamModifyFriendlyFire(String team, boolean allowed, boolean serialize)
    {
        
        Team teamcmd = new Team(team, Team.OptionBool.friendlyFire, allowed);
        
        return teamcmd;
    }


    public static Team TeamModifySeeFriendlyInvisibles(String team, boolean allowed)
    {
        return TeamModifySeeFriendlyInvisibles(team, allowed, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamModifySeeFriendlyInvisibles(string team, bool allowed, bool serialize = true)
    public static Team TeamModifySeeFriendlyInvisibles(String team, boolean allowed, boolean serialize)
    {
        
        Team teamcmd = new Team(team, Team.OptionBool.seeFriendlyInvisibles, allowed);
        
        return teamcmd;
    }


    public static Team TeamModifyNametagVisibility(String team, Team.ArgVisibility visibility)
    {
        return TeamModifyNametagVisibility(team, visibility, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamModifyNametagVisibility(string team, Team.ArgVisibility visibility, bool serialize = true)
    public static Team TeamModifyNametagVisibility(String team, Team.ArgVisibility visibility, boolean serialize)
    {
        
        Team teamcmd = new Team(team, Team.OptionVisibility.nametagVisibility, visibility);
        
        return teamcmd;
    }


    public static Team TeamModifyDeathMessageVisibility(String team, Team.ArgVisibility visibility)
    {
        return TeamModifyDeathMessageVisibility(team, visibility, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamModifyDeathMessageVisibility(string team, Team.ArgVisibility visibility, bool serialize = true)
    public static Team TeamModifyDeathMessageVisibility(String team, Team.ArgVisibility visibility, boolean serialize)
    {
        
        Team teamcmd = new Team(team, Team.OptionVisibility.deathMessageVisibility, visibility);
        
        return teamcmd;
    }


    public static Team TeamModifyCollisionRule(String team, Team.ArgCollision rule)
    {
        return TeamModifyCollisionRule(team, rule, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamModifyCollisionRule(string team, Team.ArgCollision rule, bool serialize = true)
    public static Team TeamModifyCollisionRule(String team, Team.ArgCollision rule, boolean serialize)
    {
        
        Team teamcmd = new Team(team, Team.OptionCollision.collisionRule, rule);
        
        return teamcmd;
    }


    public static Team TeamModifyPrefix(String team, JsonText prefix)
    {
        return TeamModifyPrefix(team, prefix, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamModifyPrefix(string team, JsonText prefix, bool serialize = true)
    public static Team TeamModifyPrefix(String team, JsonText prefix, boolean serialize)
    {
        
        Team teamcmd = new Team(team, Team.OptionJSON.prefix, prefix);
        
        return teamcmd;
    }


    public static Team TeamModifySuffix(String team, JsonText suffix)
    {
        return TeamModifySuffix(team, suffix, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Team TeamModifySuffix(string team, JsonText suffix, bool serialize = true)
    public static Team TeamModifySuffix(String team, JsonText suffix, boolean serialize)
    {
        
        Team teamcmd = new Team(team, Team.OptionJSON.suffix, suffix);
        
        return teamcmd;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region teammsg

    public static Teammsg Teammsg(String msg)
    {
        return Teammsg(msg, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Teammsg Teammsg(string msg, bool serialize = true)
    public static Teammsg Teammsg(String msg, boolean serialize)
    {
        
        Teammsg teammsg = new Teammsg(msg);
        
        return teammsg;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region teleport

    public static Teleport Teleport(Selector destination)
    {
        return Teleport(destination, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Teleport Teleport(Selector destination, bool serialize = true)
    public static Teleport Teleport(Selector destination, boolean serialize)
    {
        
        Teleport teleport = new Teleport(destination);
        
        return teleport;
    }


    public static Teleport Teleport(Selector target, Selector destination)
    {
        return Teleport(target, destination, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Teleport Teleport(Selector target, Selector destination, bool serialize = true)
    public static Teleport Teleport(Selector target, Selector destination, boolean serialize)
    {
        
        Teleport teleport = new Teleport(target, destination);
        
        return teleport;
    }


    public static Teleport Teleport(Selector targets, Pos location, Rotation rotation)
    {
        return Teleport(targets, location, rotation, true);
    }

    public static Teleport Teleport(Selector targets, Pos location)
    {
        return Teleport(targets, location, (Rotation) null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Teleport Teleport(Selector targets, Pos location, Rotation rotation = null, bool serialize = true)
    public static Teleport Teleport(Selector targets, Pos location, Rotation rotation, boolean serialize)
    {
        
        Teleport teleport = new Teleport(targets, location, rotation);
        
        return teleport;
    }


    public static Teleport Teleport(Selector targets, Pos location, Pos facingLocation)
    {
        return Teleport(targets, location, facingLocation, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Teleport Teleport(Selector targets, Pos location, Pos facingLocation, bool serialize = true)
    public static Teleport Teleport(Selector targets, Pos location, Pos facingLocation, boolean serialize)
    {
        
        Teleport teleport = new Teleport(targets, location, facingLocation);
        
        return teleport;
    }


    public static Teleport Teleport(Selector targets, Pos location, Selector facingEntity, Teleport.ef facingEntityAnchor)
    {
        return Teleport(targets, location, facingEntity, facingEntityAnchor, true);
    }

    public static Teleport Teleport(Selector targets, Pos location, Selector facingEntity)
    {
        return Teleport(targets, location, facingEntity, Teleport.ef.feet, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Teleport Teleport(Selector targets, Pos location, Selector facingEntity, Teleport.ef facingEntityAnchor = Teleport.ef.feet, bool serialize = true)
    public static Teleport Teleport(Selector targets, Pos location, Selector facingEntity, Teleport.ef facingEntityAnchor, boolean serialize)
    {
        
        Teleport teleport = new Teleport(targets, location, facingEntity, facingEntityAnchor);
        
        return teleport;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region tell

    public static Tell Tell(Selector target, String msg)
    {
        return Tell(target, msg, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tell Tell(Selector target, string msg, bool serialize = true)
    public static Tell Tell(Selector target, String msg, boolean serialize)
    {
        
        Tell tell = new Tell(target, msg);
        
        return tell;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region tellraw

    public static Tellraw Tellraw(Selector target, JsonText message)
    {
        return Tellraw(target, message, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tellraw Tellraw(Selector target, JsonText message, bool serialize = true)
    public static Tellraw Tellraw(Selector target, JsonText message, boolean serialize)
    {
        
        Tellraw tellraw = new Tellraw(target, message);
        
        return tellraw;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region time

    public static Time TimeAddBySecond(int value)
    {
        return TimeAddBySecond(value, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Time TimeAddBySecond(int value, bool serialize = true)
    public static Time TimeAddBySecond(int value, boolean serialize)
    {
        
        Time time = new Time(value + "s");
        
        return time;
    }


    public static Time TimeAddByDay(int value)
    {
        return TimeAddByDay(value, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Time TimeAddByDay(int value, bool serialize = true)
    public static Time TimeAddByDay(int value, boolean serialize)
    {
        
        Time time = new Time(value + "d");
        
        return time;
    }


    public static Time TimeAddByTick(int value)
    {
        return TimeAddByTick(value, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Time TimeAddByTick(int value, bool serialize = true)
    public static Time TimeAddByTick(int value, boolean serialize)
    {
        
        Time time = new Time(value + "t");
        
        return time;
    }


    public static Time TimeSet(int value)
    {
        return TimeSet(value, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Time TimeSet(int value, bool serialize = true)
    public static Time TimeSet(int value, boolean serialize)
    {
        
        Time time = new Time(value);
        
        return time;
    }


    public static Time TimeSet(Time.TimeSpec value)
    {
        return TimeSet(value, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Time TimeSet(Time.TimeSpec value, bool serialize = true)
    public static Time TimeSet(Time.TimeSpec value, boolean serialize)
    {
        
        Time time = new Time(value);
        
        return time;
    }


    public static Time TimeQuery(Time.TimeType timeType)
    {
        return TimeQuery(timeType, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Time TimeQuery(Time.TimeType timeType, bool serialize = true)
    public static Time TimeQuery(Time.TimeType timeType, boolean serialize)
    {
        
        Time time = new Time(timeType);
        
        return time;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region title

    public static Title TitleClear(Selector player)
    {
        return TitleClear(player, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Title TitleClear(Selector player, bool serialize = true)
    public static Title TitleClear(Selector player, boolean serialize)
    {
        
        Title title = new Title(player, Title.Option.clear);
        
        return title;
    }


    public static Title TitleReset(Selector player)
    {
        return TitleReset(player, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Title TitleReset(Selector player, bool serialize = true)
    public static Title TitleReset(Selector player, boolean serialize)
    {
        
        Title title = new Title(player, Title.Option.reset);
        
        return title;
    }


    public static Title TitleAtTitle(Selector player, JsonText title)
    {
        return TitleAtTitle(player, title, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Title TitleAtTitle(Selector player, JsonText title, bool serialize = true)
    public static Title TitleAtTitle(Selector player, JsonText title, boolean serialize)
    {
        
        Title titleCmd = new Title(player, Title.TitleType.title, title);
        
        return titleCmd;
    }


    public static Title TitleAtSubtitle(Selector player, JsonText subtitle)
    {
        return TitleAtSubtitle(player, subtitle, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Title TitleAtSubtitle(Selector player, JsonText subtitle, bool serialize = true)
    public static Title TitleAtSubtitle(Selector player, JsonText subtitle, boolean serialize)
    {
        
        Title title = new Title(player, Title.TitleType.subtitle, subtitle);
        
        return title;
    }


    public static Title TitleAtActionbar(Selector player, JsonText actionbar)
    {
        return TitleAtActionbar(player, actionbar, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Title TitleAtActionbar(Selector player, JsonText actionbar, bool serialize = true)
    public static Title TitleAtActionbar(Selector player, JsonText actionbar, boolean serialize)
    {
        
        Title title = new Title(player, Title.TitleType.actionbar, actionbar);
        
        return title;
    }


    public static Title TitleWithFade(Selector player, int fadeIn, int stay, int fadeOut)
    {
        return TitleWithFade(player, fadeIn, stay, fadeOut, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Title TitleWithFade(Selector player, int fadeIn, int stay, int fadeOut, bool serialize = true)
    public static Title TitleWithFade(Selector player, int fadeIn, int stay, int fadeOut, boolean serialize)
    {
        
        Title title = new Title(player, fadeIn, stay, fadeOut);
        
        return title;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region tm

    public static Tm Tm(String msg)
    {
        return Tm(msg, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tm Tm(string msg, bool serialize = true)
    public static Tm Tm(String msg, boolean serialize)
    {
        
        Tm tm = new Tm(msg);
        
        return tm;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region tp

    public static Tp Tp(Selector destination)
    {
        return Tp(destination, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tp Tp(Selector destination, bool serialize = true)
    public static Tp Tp(Selector destination, boolean serialize)
    {
        
        Tp tp = new Tp(destination);
        
        return tp;
    }


    public static Tp Tp(Selector target, Selector destination)
    {
        return Tp(target, destination, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tp Tp(Selector target, Selector destination, bool serialize = true)
    public static Tp Tp(Selector target, Selector destination, boolean serialize)
    {
        
        Tp tp = new Tp(target, destination);
        
        return tp;
    }


    public static Tp Tp(Selector targets, Pos location, Rotation rotation)
    {
        return Tp(targets, location, rotation, true);
    }

    public static Tp Tp(Selector targets, Pos location)
    {
        return Tp(targets, location, (Rotation) null, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tp Tp(Selector targets, Pos location, Rotation rotation = null, bool serialize = true)
    public static Tp Tp(Selector targets, Pos location, Rotation rotation, boolean serialize)
    {
        
        Tp tp = new Tp(targets, location, rotation);
        
        return tp;
    }


    public static Tp Tp(Selector targets, Pos location, Pos facingLocation)
    {
        return Tp(targets, location, facingLocation, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tp Tp(Selector targets, Pos location, Pos facingLocation, bool serialize = true)
    public static Tp Tp(Selector targets, Pos location, Pos facingLocation, boolean serialize)
    {
        
        Tp tp = new Tp(targets, location, facingLocation);
        
        return tp;
    }


    public static Tp Tp(Selector targets, Pos location, Selector facingEntity, Tp.ef facingEntityAnchor)
    {
        return Tp(targets, location, facingEntity, facingEntityAnchor, true);
    }

    public static Tp Tp(Selector targets, Pos location, Selector facingEntity)
    {
        return Tp(targets, location, facingEntity, Tp.ef.feet, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Tp Tp(Selector targets, Pos location, Selector facingEntity, Tp.ef facingEntityAnchor = Tp.ef.feet, bool serialize = true)
    public static Tp Tp(Selector targets, Pos location, Selector facingEntity, Tp.ef facingEntityAnchor, boolean serialize)
    {
        
        Tp tp = new Tp(targets, location, facingEntity, facingEntityAnchor);
        
        return tp;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region trigger

    public static Trigger TriggerAdd(SbObject objective, int value)
    {
        return TriggerAdd(objective, value, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Trigger TriggerAdd(SbObject objective, int value, bool serialize = true)
    public static Trigger TriggerAdd(SbObject objective, int value, boolean serialize)
    {
        
        Trigger trigger = new Trigger(objective, Trigger.As.add, value);
        
        return trigger;
    }


    public static Trigger TriggerSet(SbObject objective, int value)
    {
        return TriggerSet(objective, value, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Trigger TriggerSet(SbObject objective, int value, bool serialize = true)
    public static Trigger TriggerSet(SbObject objective, int value, boolean serialize)
    {
        
        Trigger trigger = new Trigger(objective, Trigger.As.set, value);
        
        return trigger;
    }


    public static Trigger TriggerCheck(SbObject objective)
    {
        return TriggerCheck(objective, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Trigger TriggerCheck(SbObject objective, bool serialize = true)
    public static Trigger TriggerCheck(SbObject objective, boolean serialize)
    {
        
        Trigger trigger = new Trigger(objective);
        
        return trigger;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region w

    public static W W(Selector target, String msg)
    {
        return W(target, msg, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static W W(Selector target, string msg, bool serialize = true)
    public static W W(Selector target, String msg, boolean serialize)
    {
        
        W w = new W(target, msg);
        
        return w;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region weather

    public static Weather Weather(Weather.WeatherType weatherType, int duration)
    {
        return Weather(weatherType, duration, true);
    }

    public static Weather Weather(Weather.WeatherType weatherType)
    {
        return Weather(weatherType, 300, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Weather Weather(Weather.WeatherType weatherType, int duration = 300, bool serialize = true)
    public static Weather Weather(Weather.WeatherType weatherType, int duration, boolean serialize)
    {
        
        Weather weather = new Weather(weatherType, duration);
        
        return weather;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region whitelist

    public static Whitelist WhitelistAdd(Selector player)
    {
        return WhitelistAdd(player, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Whitelist WhitelistAdd(Selector player, bool serialize = true)
    public static Whitelist WhitelistAdd(Selector player, boolean serialize)
    {
        
        Whitelist whitelist = new Whitelist(player, Whitelist.ar.add);
        
        return whitelist;
    }


    public static Whitelist WhitelistRemove(Selector player)
    {
        return WhitelistRemove(player, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Whitelist WhitelistRemove(Selector player, bool serialize = true)
    public static Whitelist WhitelistRemove(Selector player, boolean serialize)
    {
        
        Whitelist whitelist = new Whitelist(player, Whitelist.ar.remove);
        
        return whitelist;
    }


    public static Whitelist WhitelistList()
    {
        return WhitelistList(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Whitelist WhitelistList(bool serialize = true)
    public static Whitelist WhitelistList(boolean serialize)
    {
        
        Whitelist whitelist = new Whitelist(Whitelist.loor.list);
        
        return whitelist;
    }


    public static Whitelist WhitelistOn()
    {
        return WhitelistOn(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Whitelist WhitelistOn(bool serialize = true)
    public static Whitelist WhitelistOn(boolean serialize)
    {
        
        Whitelist whitelist = new Whitelist(Whitelist.loor.on);
        
        return whitelist;
    }


    public static Whitelist WhitelistOff()
    {
        return WhitelistOff(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Whitelist WhitelistOff(bool serialize = true)
    public static Whitelist WhitelistOff(boolean serialize)
    {
        
        Whitelist whitelist = new Whitelist(Whitelist.loor.off);
        
        return whitelist;
    }


    public static Whitelist WhitelistReload()
    {
        return WhitelistReload(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Whitelist WhitelistReload(bool serialize = true)
    public static Whitelist WhitelistReload(boolean serialize)
    {
        
        Whitelist whitelist = new Whitelist(Whitelist.loor.reload);
        
        return whitelist;
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region worldborder

    public static Worldborder WorldborderAdd(double distance, int time)
    {
        return WorldborderAdd(distance, time, true);
    }

    public static Worldborder WorldborderAdd(double distance)
    {
        return WorldborderAdd(distance, 0, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Worldborder WorldborderAdd(double distance, int time = 0, bool serialize = true)
    public static Worldborder WorldborderAdd(double distance, int time, boolean serialize)
    {
        
        Worldborder worldborder = new Worldborder(Worldborder.As.add, distance, time);
        
        return worldborder;
    }


    public static Worldborder WorldborderCenter(Pos2D pos)
    {
        return WorldborderCenter(pos, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Worldborder WorldborderCenter(Pos2D pos, bool serialize = true)
    public static Worldborder WorldborderCenter(Pos2D pos, boolean serialize)
    {
        
        Worldborder worldborder = new Worldborder(pos);
        
        return worldborder;
    }


    public static Worldborder WorldborderSetDamageAmount(float damagePerBlock)
    {
        return WorldborderSetDamageAmount(damagePerBlock, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Worldborder WorldborderSetDamageAmount(float damagePerBlock, bool serialize = true)
    public static Worldborder WorldborderSetDamageAmount(float damagePerBlock, boolean serialize)
    {
        
        Worldborder worldborder = new Worldborder(damagePerBlock);
        
        return worldborder;
    }


    public static Worldborder WorldborderSetDamageBuffer(double distance)
    {
        return WorldborderSetDamageBuffer(distance, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Worldborder WorldborderSetDamageBuffer(double distance, bool serialize = true)
    public static Worldborder WorldborderSetDamageBuffer(double distance, boolean serialize)
    {
        
        Worldborder worldborder = new Worldborder(distance);
        
        return worldborder;
    }


    public static Worldborder WorldborderGet()
    {
        return WorldborderGet(true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Worldborder WorldborderGet(bool serialize = true)
    public static Worldborder WorldborderGet(boolean serialize)
    {
        
        Worldborder worldborder = new Worldborder();
        
        return worldborder;
    }


    public static Worldborder WorldborderSet(double distance, int time)
    {
        return WorldborderSet(distance, time, true);
    }

    public static Worldborder WorldborderSet(double distance)
    {
        return WorldborderSet(distance, 0, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Worldborder WorldborderSet(double distance, int time = 0, bool serialize = true)
    public static Worldborder WorldborderSet(double distance, int time, boolean serialize)
    {
        
        Worldborder worldborder = new Worldborder(Worldborder.As.set, distance, time);
        
        return worldborder;
    }


    public static Worldborder WorldborderSetWarningDistance(int distance)
    {
        return WorldborderSetWarningDistance(distance, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Worldborder WorldborderSetWarningDistance(int distance, bool serialize = true)
    public static Worldborder WorldborderSetWarningDistance(int distance, boolean serialize)
    {
        
        Worldborder worldborder = new Worldborder(Worldborder.dt.distance, distance);
        
        return worldborder;
    }


    public static Worldborder WorldborderSetWarningTime(int time)
    {
        return WorldborderSetWarningTime(time, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Worldborder WorldborderSetWarningTime(int time, bool serialize = true)
    public static Worldborder WorldborderSetWarningTime(int time, boolean serialize)
    {
        
        Worldborder worldborder = new Worldborder(Worldborder.dt.time, time);
        
        return worldborder;
    }

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#region xp

    public static Xp XpAdd(Selector player, int amount, boolean levels)
    {
        return XpAdd(player, amount, levels, true);
    }

    public static Xp XpAdd(Selector player, int amount)
    {
        return XpAdd(player, amount, false, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Xp XpAdd(Selector player, int amount, bool levels = false, bool serialize = true)
    public static Xp XpAdd(Selector player, int amount, boolean levels, boolean serialize)
    {
        
        Xp xp = new Xp("add", player, amount, levels ? "levels" : "points");
        
        return xp;
    }


    public static Xp XpSet(Selector player, int amount, boolean levels)
    {
        return XpSet(player, amount, levels, true);
    }

    public static Xp XpSet(Selector player, int amount)
    {
        return XpSet(player, amount, false, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Xp XpSet(Selector player, int amount, bool levels = false, bool serialize = true)
    public static Xp XpSet(Selector player, int amount, boolean levels, boolean serialize)
    {
        
        Xp xp = new Xp("set", player, amount, levels ? "levels" : "points");
        
        return xp;
    }


    public static Xp XpQuery(Selector player, boolean levels)
    {
        return XpQuery(player, levels, true);
    }

    public static Xp XpQuery(Selector player)
    {
        return XpQuery(player, false, true);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static Xp XpQuery(Selector player, bool levels = false, bool serialize = true)
    public static Xp XpQuery(Selector player, boolean levels, boolean serialize)
    {

        return new Xp(player, levels ? "levels" : "points");
    }
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
    ///#endregion
}

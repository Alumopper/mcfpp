package top.alumopper.mcfpp.type;

import java.util.Arrays;
import java.util.List;

public class NBTTag {
    public String getValueString(){return  "";}
    public static NBTTag Prase(String nbt){return null;}

    public static List<String> attributes = Arrays.asList
            (
                    "generic.max_health",
                    "generic.follow_range",
                    "generic.knockback_resistance",
                    "generic.movement_speed",
                    "generic.attack_damage",
                    "generic.attack_knockback",
                    "generic.armor",
                    "generic.armor_toughness"
            );
}

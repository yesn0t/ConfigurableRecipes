package net.spacegoat.configurable_recipes;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = ModMain.MOD_ID)
@Config.Gui.Background("minecraft:textures/block/crafting_table_top.png")
public class ModConfig implements ConfigData {

        @ConfigEntry.Gui.Excluded
    private transient static boolean registered = false;

    @ConfigEntry.Gui.TransitiveObject
    public Recipes vanillaRecipes = new Recipes();

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("rotten_flesh_to_leather")
    public RottenFleshToLeather fleshToLeather = new RottenFleshToLeather();

    public static synchronized ModConfig getConfig() {
        if (!registered) {
            AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
            registered = true;
        }
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
    public static class Recipes {
        @ConfigEntry.Gui.RequiresRestart
        @Comment("6 Source Material + 1 Leather = Horse Armor")
        public boolean enableHorseArmorRecipes = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("5 Leather + 1 Iron Ingot + 2 Tripwire Hook = Saddle")
        public boolean enableSaddleRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("4 Yellow Wool + 4 Any Type of Seed + 1 Magma Cream = Sponge")
        public boolean enableSpongeRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("4 Redstone + 5 Gold Nuggets = Glowstone Dust")
        public boolean enableGlowstoneDustRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("2 Maps + 3 Strings = Name Tag")
        public boolean enableNameTagRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Makes all saplings craftable into stick.")
        public boolean saplingToStick = true;
    }
    public static class RottenFleshToLeather{
        @ConfigEntry.Gui.RequiresRestart
        public boolean rottenFleshFromFurnace = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean rottenFleshFromCampfire = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean driedKelpFromFurnace = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean driedKelpFromCampfire = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean rottenFleshToBeef = true;
    }
}

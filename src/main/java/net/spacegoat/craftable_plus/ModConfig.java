package net.spacegoat.craftable_plus;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;

@Config(name = ModMain.MOD_ID)
@Config.Gui.Background("minecraft:textures/block/crafting_table_top.png")
public class ModConfig implements ConfigData {

        @ConfigEntry.Gui.Excluded
    private transient static boolean registered = false;

    @ConfigEntry.Gui.TransitiveObject
    public Recipes recipes = new Recipes();

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
        public boolean enableHorseArmorRecipes = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableSaddleRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableSpongeRecipes = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableGlowstoneDustRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableNameTagRecipe = true;
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

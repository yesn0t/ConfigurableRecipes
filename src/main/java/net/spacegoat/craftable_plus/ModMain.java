package net.spacegoat.craftable_plus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModMain implements ModInitializer {
	public static final String MOD_ID = "craftable_plus";
	public static final Logger LOGGER = LogManager.getLogger("craftable_plus");

	@Override
	public void onInitialize() {

		//NORMAL RECIPES
		if (ModConfig.getConfig().recipes.enableSaddleRecipe){
			saddleRecipe();
		}
		if (ModConfig.getConfig().recipes.enableHorseArmorRecipes){
			horseArmorRecipes();
		}
		if (ModConfig.getConfig().recipes.enableSpongeRecipes){
			spongeRecipes();
		}
		if (ModConfig.getConfig().recipes.enableGlowstoneDustRecipe){
			glowstoneDustRecipe();
		}
		if (ModConfig.getConfig().recipes.enableNameTagRecipe){
			nametagRecipe();
		}

		//ROTTEN FLESH TO LEATHER
		if (ModConfig.getConfig().fleshToLeather.rottenFleshFromFurnace){
			rottenFleshToLeatherFromFurnace();
		}
		if (ModConfig.getConfig().fleshToLeather.rottenFleshFromCampfire){
			rottenFleshToLeatherFromCampfire();
		}
		if (ModConfig.getConfig().fleshToLeather.driedKelpFromFurnace){
            driedKelpToLeatherFurnace();
		}
		if (ModConfig.getConfig().fleshToLeather.driedKelpFromCampfire){
			driedKelpToLeatherCampfire();
		}
		if (ModConfig.getConfig().fleshToLeather.rottenFleshToBeef){
			rottenFleshToBeef();
		}
	}

	//NORMAL RECIPES
	private void saddleRecipe() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "saddle_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void horseArmorRecipes() {
		FabricLoader.getInstance().getModContainer(ModMain.MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					ModMain.MOD_ID, "horse_armor_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void spongeRecipes() {
		FabricLoader.getInstance().getModContainer(ModMain.MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					ModMain.MOD_ID, "sponge_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void glowstoneDustRecipe() {
		FabricLoader.getInstance().getModContainer(ModMain.MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					ModMain.MOD_ID, "glowstone_dust_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void nametagRecipe() {
		FabricLoader.getInstance().getModContainer(ModMain.MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					ModMain.MOD_ID, "nametag_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}

	//ROTTEN FLESH TO LEATHER
	private void rottenFleshToLeatherFromFurnace() {
		FabricLoader.getInstance().getModContainer(ModMain.MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					ModMain.MOD_ID, "rottenflesh_to_leather_furnace"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void rottenFleshToLeatherFromCampfire() {
		FabricLoader.getInstance().getModContainer(ModMain.MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					ModMain.MOD_ID, "rottenflesh_to_leather_campfire"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void rottenFleshToBeef() {
		FabricLoader.getInstance().getModContainer(ModMain.MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					ModMain.MOD_ID, "rottenflesh_to_beef"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void driedKelpToLeatherFurnace() {
		FabricLoader.getInstance().getModContainer(ModMain.MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					ModMain.MOD_ID, "driedkelp_to_leather_furnace"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void driedKelpToLeatherCampfire() {
		FabricLoader.getInstance().getModContainer(ModMain.MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					ModMain.MOD_ID, "driedkelp_to_leather_campfire"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
}

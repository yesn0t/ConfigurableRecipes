package net.spacegoat.configurable_recipes;

import com.terraformersmc.modmenu.util.mod.Mod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModMain implements ModInitializer {
	public static final String MOD_ID = "configurable_recipes";
	public static final Logger LOGGER = LogManager.getLogger("configurable_recipes");

	@Override
	public void onInitialize() {

		//NORMAL RECIPES
		if (ModConfig.getConfig().vanillaRecipes.enableSaddleRecipe){
			saddleRecipe();
		}
		if (ModConfig.getConfig().vanillaRecipes.enableHorseArmorRecipes){
			horseArmorRecipes();
		}
		if (ModConfig.getConfig().vanillaRecipes.enableSpongeRecipe){
			spongeRecipe();
		}
		if (ModConfig.getConfig().vanillaRecipes.enableGlowstoneDustRecipe){
			glowstoneDustRecipe();
		}
		if (ModConfig.getConfig().vanillaRecipes.enableNameTagRecipe){
			nametagRecipe();
		}
		if (ModConfig.getConfig().vanillaRecipes.saplingToStick){
			saplingToStickRecipes();
		}
		if (ModConfig.getConfig().vanillaRecipes.enableTotemOfUndyingRecipe){
			totemOfUndyingRecipe();
		}
		if (ModConfig.getConfig().vanillaRecipes.enableBellRecipe){
			bellRecipe();
		}
		if (ModConfig.getConfig().vanillaRecipes.enableTridentRecipe){
			tridentRecipe();
		}
		if (ModConfig.getConfig().vanillaRecipes.enableChainmailArmorRecipes){
			chainmailArmorRecipes();
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
		if (ModConfig.getConfig().fleshToLeather.rottenFleshToBeefFromSmoker){
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
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "horse_armor_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void spongeRecipe() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "sponge_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void glowstoneDustRecipe() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "glowstone_dust_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void nametagRecipe() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "nametag_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void saplingToStickRecipes() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "sapling_to_stick_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void totemOfUndyingRecipe(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added  = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "totem_of_undying_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void bellRecipe(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added  = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "bell_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void tridentRecipe(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added  = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "trident_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void chainmailArmorRecipes(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added  = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "chainmail_armor_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}

	//ROTTEN FLESH TO LEATHER
	private void rottenFleshToLeatherFromFurnace() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "rottenflesh_to_leather_furnace"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void rottenFleshToLeatherFromCampfire() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "rottenflesh_to_leather_campfire"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void rottenFleshToBeef() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "rottenflesh_to_beef"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void driedKelpToLeatherFurnace() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "driedkelp_to_leather_furnace"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void driedKelpToLeatherCampfire() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "driedkelp_to_leather_campfire"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
}

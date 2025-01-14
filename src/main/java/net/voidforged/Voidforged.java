package net.voidforged;

import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.voidforged.block.ModBlocks;
import net.voidforged.item.ModItems;
import net.voidforged.recipe.ModRecipeTypes;
import net.voidforged.screen.AncientForgeScreenHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Voidforged implements ModInitializer {
	public static final String MOD_ID = "voidforged";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ScreenHandlerType<AncientForgeScreenHandler> BOX_SCREEN_HANDLER =
			Registry.register(
					Registries.SCREEN_HANDLER,
					Identifier.of(MOD_ID, "ancient_forge"),
					new ScreenHandlerType<>(AncientForgeScreenHandler::new,
							FeatureSet.empty())
			);



	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRecipeTypes.registerModRecipeTypes();
	}
}
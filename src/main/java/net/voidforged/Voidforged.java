package net.voidforged;

import net.fabricmc.api.ModInitializer;

import net.voidforged.block.ModBlocks;
import net.voidforged.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Voidforged implements ModInitializer {
	public static final String MOD_ID = "voidforged";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		//ModBlockEntities.load();
		//ModScreenHandlers.load();
		//ModScreenHandlers.load();
	}
}
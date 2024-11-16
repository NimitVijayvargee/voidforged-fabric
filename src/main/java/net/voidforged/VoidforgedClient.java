package net.voidforged;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.voidforged.screenhandler.ModScreenHandlers;
import net.voidforged.screenhandler.screen.AncientForgeScreen;

public class VoidforgedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		HandledScreens.register(ModScreenHandlers.ANCIENT_FORGE_SCREEN_HANDLER, AncientForgeScreen::new);
	}
}
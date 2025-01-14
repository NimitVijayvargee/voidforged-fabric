package net.voidforged;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.voidforged.screen.AncientForgeScreenHandler;
import net.voidforged.screen.ModScreenHandlers;

public class VoidforgedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

        onInitializeClient;
        {
			HandledScreens.register(ModScreenHandlers.ANCIENT_FORGE_SCREEN_HANDLER_TYPE, AncientForgeScreenHandler::new);
		}
	}
}
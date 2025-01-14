package net.voidforged.screen;

import net.minecraft.screen.ScreenHandlerType;
import net.voidforged.Voidforged;

public class ModScreenHandlers {
    public static final ScreenHandlerType<AncientForgeScreenHandler> ANCIENT_FORGE_SCREEN_HANDLER_TYPE =
            ScreenHandlerType.register((Voidforged.MOD_ID + "ancient_forge"), AncientForgeScreenHandler::new);
    public static final ScreenHandlerType<?> ANCIENT_FORGE = ;
}

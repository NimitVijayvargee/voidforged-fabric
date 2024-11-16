package net.voidforged.screenhandler;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.voidforged.Voidforged;
import net.voidforged.network.BlockPosPayload;


public class ModScreenHandlers {

    public static final ScreenHandlerType<AncientForgeScreenHandler> ANCIENT_FORGE_SCREEN_HANDLER =
            register("ancient_forge", AncientForgeScreenHandler::new, BlockPosPayload.PACKET_CODEC);

    public static <T extends ScreenHandler, D extends CustomPayload>ExtendedScreenHandlerType<T, D>
    register(String name, ExtendedScreenHandlerType.ExtendedFactory<T,D>factory, PacketCodec<? super
            RegistryByteBuf, D> codec) {

        return Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Voidforged.MOD_ID, name),
                new ExtendedScreenHandlerType<>(factory, codec));
    }
    public static void load() {

    }
}

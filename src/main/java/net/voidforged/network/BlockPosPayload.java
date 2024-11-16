package net.voidforged.network;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.voidforged.Voidforged;

public record BlockPosPayload(BlockPos pos) implements CustomPayload {
    public static final Id<BlockPosPayload> ID = new Id<>(Identifier.of(Voidforged.MOD_ID, "block_pos"));

    public static final PacketCodec<RegistryByteBuf, BlockPosPayload> PACKET_CODEC =
            PacketCodec.tuple(BlockPos.PACKET_CODEC, BlockPosPayload::pos, BlockPosPayload::new);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}

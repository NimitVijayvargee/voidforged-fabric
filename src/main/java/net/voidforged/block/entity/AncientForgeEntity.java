package net.voidforged.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.voidforged.Voidforged;
import net.voidforged.block.ModBlockEntities;
import net.voidforged.network.BlockPosPayload;
import net.voidforged.screenhandler.AncientForgeScreenHandler;
import org.jetbrains.annotations.Nullable;

public class AncientForgeEntity extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPosPayload> {

    public static final Text TITLE = Text.translatable("container." + Voidforged.MOD_ID + ".ancient_forge");

    public AncientForgeEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ANCIENT_FORGE_ENTITY, pos, state);
    }

    @Override
    public BlockPosPayload getScreenOpeningData(ServerPlayerEntity serverPlayerEntity) {
        return new BlockPosPayload(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return TITLE;
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new AncientForgeScreenHandler(syncId, playerInventory, this);
    }
}
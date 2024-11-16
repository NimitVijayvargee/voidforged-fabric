package net.voidforged.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.voidforged.block.entity.AncientForgeEntity;
import org.jetbrains.annotations.Nullable;

public class AncientForgeBlock extends HorizontalFacingBlock implements BlockEntityProvider {
    public AncientForgeBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }


    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new AncientForgeEntity(pos,state);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient) {
            if(world.getBlockEntity(pos) instanceof AncientForgeEntity ancientForge) {
                player.openHandledScreen(ancientForge);
            }
        }
        return ActionResult.success(world.isClient);
    }
}

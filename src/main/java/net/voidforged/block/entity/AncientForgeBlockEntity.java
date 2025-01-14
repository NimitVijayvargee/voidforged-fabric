package net.voidforged.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.voidforged.recipe.ModRecipeTypes;

public class AncientForgeBlockEntity extends AbstractFurnaceBlockEntity {
    public AncientForgeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ANCIENT_FORGE_BLOCK_ENTITY_TYPE, pos, state, ModRecipeTypes.FORGING);
    }

    protected Text getContainerName() {
        return Text.translatable("container.voidforged.ancient_forge");
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new FurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
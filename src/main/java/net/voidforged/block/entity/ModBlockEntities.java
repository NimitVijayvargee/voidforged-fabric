package net.voidforged.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.voidforged.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<AncientForgeBlockEntity> ANCIENT_FORGE_BLOCK_ENTITY_TYPE =
            FabricBlockEntityTypeBuilder
                    .create(AncientForgeBlockEntity::new, ModBlocks.ANCIENT_FORGE)
                    .build(null);
}

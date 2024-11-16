package net.voidforged.block;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.voidforged.Voidforged;
import net.voidforged.block.entity.AncientForgeEntity;


public class ModBlockEntities {
    public static final BlockEntityType<AncientForgeEntity> ANCIENT_FORGE_ENTITY = register("ancient_forge_entity",
            BlockEntityType.Builder.create(AncientForgeEntity::new, ModBlocks.ANCIENT_FORGE).build());

    private static <T extends BlockEntity> BlockEntityType<T> register(String name, BlockEntityType<T> type) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Voidforged.MOD_ID, name), type);
    }

    public static void load() {

    }
}
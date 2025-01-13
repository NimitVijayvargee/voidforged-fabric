package net.voidforged.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.voidforged.Voidforged;


public class ModBlocks {

    public static final Block ANCIENT_FORGE = registerBlock("ancient_forge",
            new Block (AbstractBlock.Settings.copy(Blocks.BLAST_FURNACE)
                    .luminance(state -> 15)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Voidforged.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Voidforged.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Voidforged.LOGGER.info("Registering mod blocks for " + Voidforged.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.ANCIENT_FORGE);
        });
    }
}

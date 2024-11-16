package net.voidforged.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.voidforged.Voidforged;

public class ModItems {

    public static Item VOID_SHARD = registerItem("void_shard", new Item(new Item.Settings()));
    public static Item ANCIENT_FORGE_BLUEPRINT = registerItem("ancient_forge_blueprint", new Item(new Item.Settings()));
    public static Item SOUL_FUEL_CELL = registerItem("soul_fuel_cell", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Voidforged.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Voidforged.LOGGER.info("Registering items for mod " + Voidforged.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(VOID_SHARD);
            fabricItemGroupEntries.add(ANCIENT_FORGE_BLUEPRINT);
            fabricItemGroupEntries.add(SOUL_FUEL_CELL);
        });
    }
}

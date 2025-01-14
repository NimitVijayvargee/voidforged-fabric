package net.voidforged.screen;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;
import net.voidforged.recipe.ModRecipeTypes;

public class AncientForgeScreenHandler extends AbstractFurnaceScreenHandler {
    public AncientForgeScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.ANCIENT_FORGE, ModRecipeTypes.FORGING, RecipeBookCategory.BLAST_FURNACE, syncId, playerInventory);
    }

    public AncientForgeScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(ModScreenHandlers.ANCIENT_FORGE, ModRecipeTypes.FORGING, RecipeBookCategory.BLAST_FURNACE, syncId, playerInventory, inventory, propertyDelegate);
}
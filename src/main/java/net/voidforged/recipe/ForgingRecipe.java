package net.voidforged.recipe;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.voidforged.block.ModBlocks;
import net.voidforged.block.entity.ModBlockEntities;

public class ForgingRecipe extends AbstractCookingRecipe {
    public ForgingRecipe(String group, CookingRecipeCategory category, Ingredient ingredient, ItemStack result, float experience, int cookingTime) {
        super(ModRecipeTypes.FORGING, group, category, ingredient, result, experience, cookingTime);

    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.ANCIENT_FORGE);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeSerializer.SMELTING;
    }
}

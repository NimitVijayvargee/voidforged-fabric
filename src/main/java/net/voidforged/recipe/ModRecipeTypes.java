package net.voidforged.recipe;

import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.voidforged.Voidforged;

public class ModRecipeTypes {
    public static RecipeType<ForgingRecipe> FORGING =
            RecipeType.register(String.valueOf(Identifier.of(Voidforged.MOD_ID, "forging")));

    public static void registerModRecipeTypes() {
        Voidforged.LOGGER.info("Registering recipe types for mod " + Voidforged.MOD_ID);

    }
}

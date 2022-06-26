package de.thekitsunephoenix.better_mechanics.recipe;

import de.thekitsunephoenix.better_mechanics.Better_mechanics;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Better_mechanics.MOD_ID, ElectricFurnaceRecipe.Serializer.ID),
                ElectricFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Better_mechanics.MOD_ID, ElectricFurnaceRecipe.Type.ID),
                ElectricFurnaceRecipe.Type.INSTANCE);
    }
}


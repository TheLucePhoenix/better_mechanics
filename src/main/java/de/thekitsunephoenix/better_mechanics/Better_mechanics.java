package de.thekitsunephoenix.better_mechanics;

import de.thekitsunephoenix.better_mechanics.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class Better_mechanics implements ModInitializer {

    public static String MOD_ID = "better_mechanics";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}

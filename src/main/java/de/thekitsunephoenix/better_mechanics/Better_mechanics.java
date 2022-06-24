package de.thekitsunephoenix.better_mechanics;

import de.thekitsunephoenix.better_mechanics.block.ModBlocks;
import de.thekitsunephoenix.better_mechanics.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Better_mechanics implements ModInitializer {

    public static String MOD_ID = "better_mechanics";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();




    }
}

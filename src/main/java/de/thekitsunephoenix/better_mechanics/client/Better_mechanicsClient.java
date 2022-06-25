package de.thekitsunephoenix.better_mechanics.client;

import de.thekitsunephoenix.better_mechanics.screen.ElectricFurnaceScreen;
import de.thekitsunephoenix.better_mechanics.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class Better_mechanicsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ModScreenHandlers.ELECTRIC_FURNACE_SCREE_HANDLER, ElectricFurnaceScreen::new);
    }
}

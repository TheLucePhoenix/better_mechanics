package de.thekitsunephoenix.better_mechanics.screen;

import de.thekitsunephoenix.better_mechanics.Better_mechanics;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<ElectricFurnaceScreenHandler> ELECTRIC_FURNACE_SCREE_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Better_mechanics.MOD_ID, "electic_furnace"),
                    ElectricFurnaceScreenHandler::new);
}

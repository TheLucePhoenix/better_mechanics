package de.thekitsunephoenix.better_mechanics.block.entity;

import de.thekitsunephoenix.better_mechanics.Better_mechanics;
import de.thekitsunephoenix.better_mechanics.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlockEntities {
    public static BlockEntityType<ElectricFurnaceBlockEntity> ELECTRIC_FURNACE;

    public static void registerAllBlockEntities() {
        ELECTRIC_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Better_mechanics.MOD_ID, "electric_furnace"),
                FabricBlockEntityTypeBuilder.create(ElectricFurnaceBlockEntity::new,
                        ModBlocks.ELECTRIC_FURNACE).build(null));
    }
}

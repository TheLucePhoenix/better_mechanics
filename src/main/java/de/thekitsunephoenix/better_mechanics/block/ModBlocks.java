package de.thekitsunephoenix.better_mechanics.block;

import de.thekitsunephoenix.better_mechanics.Better_mechanics;
import de.thekitsunephoenix.better_mechanics.block.custom.ElectricFurnaceBlock;
import de.thekitsunephoenix.better_mechanics.block.custom.SandBlock;
import de.thekitsunephoenix.better_mechanics.block.custom.SlowingBlock;
import de.thekitsunephoenix.better_mechanics.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
//import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
//import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {

   public static final Block EXAMPLE_BLOCK = registerBlock("example_block",
           new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
           ModItemGroup.BetterMechanics, "YEEEEEEEEEETTTTTTTTT");

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0f).requiresTool()),
            ModItemGroup.BetterMechanics);

    public static final Block SLOWING_BLOCK = registerBlock("slowing_block",
            new SlowingBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            ModItemGroup.BetterMechanics);

    public static final Block ELECTRIC_FURNACE = registerBlock("electric_furnace",
            new ElectricFurnaceBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().strength(2.0f)),
            ModItemGroup.BetterMechanics);

    public static final Block MECHANICAL_FRAME_BASIC = registerBlock("mechanical_frame_basic",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            ModItemGroup.BetterMechanics);

    public static final Block MECHANICAL_FRAME_ENHANCED = registerBlock("mechanical_frame_enhanced",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            ModItemGroup.BetterMechanics);

    public static Block registerBlock(String name, Block block, ItemGroup group,String tooltipKey){
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(Better_mechanics.MOD_ID,name), block);

    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(Better_mechanics.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(Better_mechanics.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Better_mechanics.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Better_mechanics.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Better_mechanics.LOGGER.info("Registering ModBlocks for " + Better_mechanics.MOD_ID);
    }
}

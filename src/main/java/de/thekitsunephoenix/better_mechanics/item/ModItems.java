package de.thekitsunephoenix.better_mechanics.item;

import de.thekitsunephoenix.better_mechanics.Better_mechanics;
import de.thekitsunephoenix.better_mechanics.item.custom.ModAxeItem;
import de.thekitsunephoenix.better_mechanics.item.custom.ModHoeItem;
import de.thekitsunephoenix.better_mechanics.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COPPER, 0,0,new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterials.COPPER, 4,-1f,new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, 1,-1.25f,new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterials.COPPER, 1,-1.5f,new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, 1,-2f,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.TITANIUM, 0,0,new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new ModAxeItem(ModToolMaterials.TITANIUM, 4,-1f,new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterials.TITANIUM, 1,-1.25f,new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new ModHoeItem(ModToolMaterials.TITANIUM, 1,-1.5f,new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterials.TITANIUM, 1,-2f,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item PURPLE_MUSHROOM = registerItem( "purple_mushroom"
            , new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    public static final Item ORANGE_MUSHROOM = registerItem( "orange_mushroom"
            , new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    public static final Item GREEN_MUSHROOM = registerItem( "green_mushroom"
            , new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    public static final Item BLUE_MUSHROOM = registerItem( "blue_mushroom"
            , new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    public static final Item YELLOW_MUSHROOM = registerItem( "yellow_mushroom"
            , new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    public static final Item GREY_MUSHROOM = registerItem( "grey_mushroom"
            , new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS)));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SAPPHIRE_REFINED = registerItem("sapphire_refined"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Better_mechanics.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Better_mechanics.LOGGER.info("Registering ModItems for " + Better_mechanics.MOD_ID);
    }

}

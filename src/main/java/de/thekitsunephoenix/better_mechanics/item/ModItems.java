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

    // Copper Tools
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COPPER, 0,0
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterials.COPPER, 4,-1f
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, 1,-1.25f
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterials.COPPER, 1,-1.5f
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, 1,-2f
                    , new FabricItemSettings().group(ItemGroup.COMBAT)));

    // Titanium Tools
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.TITANIUM, 0,0
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new ModAxeItem(ModToolMaterials.TITANIUM, 4,-1f
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterials.TITANIUM, 1,-1.25f
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new ModHoeItem(ModToolMaterials.TITANIUM, 1,-1.5f
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterials.TITANIUM, 1,-2f
                    , new FabricItemSettings().group(ItemGroup.COMBAT)));

    // Mythril Tools
    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe",
            new ModPickaxeItem(ModToolMaterials.MYTHRIL, 0,0
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new ModAxeItem(ModToolMaterials.MYTHRIL, 4,-1f
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel",
            new ShovelItem(ModToolMaterials.MYTHRIL, 1,-1.25f
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe",
            new ModHoeItem(ModToolMaterials.MYTHRIL, 1,-1.5f
                    , new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new SwordItem(ModToolMaterials.MYTHRIL, 1,-2f
                    , new FabricItemSettings().group(ItemGroup.COMBAT)));

    // Mushrooms
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

    // Ingots and Refined Materials
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SAPPHIRE_REFINED = registerItem("sapphire_refined"
            , new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // Raw Materials and Ores
    public  static  final  Item SAPPHIRE_RAW = registerItem("sapphire_raw",
            new Item((new FabricItemSettings().group(ItemGroup.MISC).group(ModItemGroup.BetterMechanics))));

    // Crafting Items
        // Gears
        public  static  final  Item GEAR_WOOD = registerItem("gear_wood",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_STONE = registerItem("gear_stone",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_TIN = registerItem("gear_tin",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_ALUMINIUM = registerItem("gear_aluminium",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_BRASS = registerItem("gear_brass",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_BRONZE = registerItem("gear_bronze",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_COPPER = registerItem("gear_copper",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_GOLD = registerItem("gear_gold",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_SILVER = registerItem("gear_silver",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_IRON = registerItem("gear_iron",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_MYTHRIL = registerItem("gear_mythril",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_STEEL = registerItem("gear_steel",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_TITANIUM = registerItem("gear_titanium",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item GEAR_TUNGSTEN = registerItem("gear_tungsten",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));

        // Wires
        public  static  final  Item WIRE_TIN = registerItem("wire_tin",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item WIRE_ALUMINIUM = registerItem("wire_aluminium",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item WIRE_BRASS = registerItem("wire_brass",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item WIRE_BRONZE = registerItem("wire_bronze",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item WIRE_COPPER = registerItem("wire_copper",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item WIRE_GOLD = registerItem("wire_gold",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item WIRE_PLATINUM = registerItem("wire_platinum",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item WIRE_STEEL = registerItem("wire_steel",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item WIRE_TITANIUM = registerItem("wire_titanium",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item WIRE_TUNGSTEN = registerItem("wire_tungsten",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));

        // Plates
        public  static  final  Item PLATE_TIN = registerItem("plate_tin",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_ALUMINIUM = registerItem("plate_aluminium",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_BRASS = registerItem("plate_brass",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_BRONZE = registerItem("plate_bronze",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_COPPER = registerItem("plate_copper",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_IRON = registerItem("plate_iron",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_MYTHRIL = registerItem("plate_mythril",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_PLATINUM = registerItem("plate_platinum",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_STEEL = registerItem("plate_steel",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_TITANIUM = registerItem("plate_titanium",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item PLATE_TUNGSTEN = registerItem("plate_tungsten",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));

        // Rods
        public  static  final  Item ROD_WOOD = registerItem("rod_wood",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item ROD_STONE = registerItem("rod_stone",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item ROD_ALUMINIUM = registerItem("rod_aluminium",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item ROD_BRASS = registerItem("rod_brass",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item ROD_IRON = registerItem("rod_iron",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item ROD_MYTHRIL = registerItem("rod_mythril",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item ROD_STEEL = registerItem("rod_steel",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item ROD_TITANIUM = registerItem("rod_titanium",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));
        public  static  final  Item ROD_TUNGSTEN = registerItem("rod_tungsten",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));

        // Frames and Coils
        public  static  final  Item COIL_HEATING = registerItem("coil_heating",
                new Item((new FabricItemSettings().group(ModItemGroup.BetterMechanics))));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Better_mechanics.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Better_mechanics.LOGGER.info("Registering ModItems for " + Better_mechanics.MOD_ID);
    }

}

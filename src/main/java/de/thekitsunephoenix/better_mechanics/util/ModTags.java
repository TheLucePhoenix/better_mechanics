package de.thekitsunephoenix.better_mechanics.util;

import de.thekitsunephoenix.better_mechanics.Better_mechanics;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Better_mechanics.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MUSHROOMS = createCommonTag("mushrooms");
        public static final TagKey<Item> COPPER_INGOT = createCommonTag("copper_ingot");
        public static final TagKey<Item> STEEL_INGOT = createCommonTag("steel_ingot");
        public static final TagKey<Item> MYTHRIL_INGOT = createCommonTag("mythril_ingot");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Better_mechanics.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}

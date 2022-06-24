package de.thekitsunephoenix.better_mechanics.item;

import de.thekitsunephoenix.better_mechanics.util.ModTags;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import java.util.function.Supplier;

    public enum ModToolMaterials implements ToolMaterial {
        COPPER(0, 48, 1.8F, 0.0F, 12, () -> {
            return Ingredient.fromTag(ModTags.Items.COPPER_INGOTS);
        }),
        MYTHRIL(2, 220, 6.5F, 2.8F, 12, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ModItems.MYTHRIL_INGOT});
        }),
        TITANIUM(4, 2327, 8.0F, 3.5F, 17, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ModItems.TITANIUM_INGOT});
        }),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
        }),
        GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
        }),
        NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
        });

        private final int miningLevel;
        private final int itemDurability;
        private final float miningSpeed;
        private final float attackDamage;
        private final int enchantability;
        private final Lazy<Ingredient> repairIngredient;

        private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
            this.miningLevel = miningLevel;
            this.itemDurability = itemDurability;
            this.miningSpeed = miningSpeed;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairIngredient = new Lazy(repairIngredient);
        }

        public int getDurability() {
            return this.itemDurability;
        }

        public float getMiningSpeedMultiplier() {
            return this.miningSpeed;
        }

        public float getAttackDamage() {
            return this.attackDamage;
        }

        public int getMiningLevel() {
            return this.miningLevel;
        }

        public int getEnchantability() {
            return this.enchantability;
        }

        public Ingredient getRepairIngredient() {
            return (Ingredient) this.repairIngredient.get();
        }
    }


package de.thekitsunephoenix.better_mechanics.item;

import de.thekitsunephoenix.better_mechanics.util.ModTags;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import java.util.function.Supplier;

    public enum ModToolMaterials implements ToolMaterial {
        COPPER(0, 48, 1.8F, 0.0F, 11, () -> {
            return Ingredient.fromTag(ModTags.Items.COPPER_INGOT);
        }),
        STEEL(2, 561, 5.0F, 2.0F, 12, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ModItems.STEEL_INGOT});
        }),
        SAPPHIRE(2, 137, 14.0F, 5.0F, 22, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ModItems.SAPPHIRE_REFINED});
        }),
        MYTHRIL(3, 735, 9.75F, 2.8F, 18, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ModItems.MYTHRIL_INGOT});
        }),
        TITANIUM(4, 2327, 8.5F, 3.5F, 17, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ModItems.TITANIUM_INGOT});
        }),
        TUNGSTEN(5, 2731, 6.5F, 4.0F, 15, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ModItems.TUNGSTEN_INGOT});
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


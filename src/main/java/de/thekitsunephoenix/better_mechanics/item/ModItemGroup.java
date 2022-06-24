package de.thekitsunephoenix.better_mechanics.item;

import de.thekitsunephoenix.better_mechanics.Better_mechanics;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public  static  final ItemGroup BetterMechanics = FabricItemGroupBuilder.build(new Identifier(Better_mechanics.MOD_ID,
                    "better_mechanics"), () -> new ItemStack(ModItems.GREY_MUSHROOM));
}

package de.thekitsunephoenix.better_mechanics.block.entity;

import de.thekitsunephoenix.better_mechanics.item.ModItems;
import de.thekitsunephoenix.better_mechanics.screen.ElectricFurnaceScreenHandler;
import de.thekitsunephoenix.better_mechanics.util.inventory.ImplementedInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ElectricFurnaceBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
        DefaultedList.ofSize(2,ItemStack.EMPTY);

    public ElectricFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ELECTRIC_FURNACE, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Electric Furnace");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new ElectricFurnaceScreenHandler(syncId, inv, this);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
    }
    public static void tick(World world, BlockPos pos, BlockState state, ElectricFurnaceBlockEntity entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(ElectricFurnaceBlockEntity entity) {
        entity.removeStack(0, 1);

        entity.setStack(1, new ItemStack(ModItems.MYTHRIL_PICKAXE,
                entity.getStack(1).getCount() + 1));
    }

    private static boolean hasRecipe(ElectricFurnaceBlockEntity entity) {
        return entity.getStack(0).getItem() == ModItems.SAPPHIRE_REFINED;
    }

    private static boolean hasNotReachedStackLimit(ElectricFurnaceBlockEntity entity) {
        return entity.getStack(1).getCount() < entity.getStack(1).getMaxCount();
    }

}

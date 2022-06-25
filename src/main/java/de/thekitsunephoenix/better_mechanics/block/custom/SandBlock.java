package de.thekitsunephoenix.better_mechanics.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class SandBlock extends FallingBlock {
    private final int color;

    public SandBlock(int color, AbstractBlock.Settings settings) {
            super(settings);
            this.color = color;
    }

    public int getColor(BlockState state, BlockView world, BlockPos pos) {
            return this.color;
        }
}


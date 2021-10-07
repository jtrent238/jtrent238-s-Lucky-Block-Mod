package com.jtrent238.luckyblock.structures;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class DiamondPoleStructure {
    public static void placeStructure(World world, EntityPlayer player) {

        int x = (int) player.posX - 6;
        int y = (int) player.posY - 1;
        int z = (int) player.posZ - 5;

        world.setBlock(x + 0, y + 0, z + 0, Blocks.diamond_block, 0, 3);
        world.setBlock(x + 0, y + 1, z + 0, Blocks.diamond_block, 0, 3);
        world.setBlock(x + 0, y + 2, z + 0, Blocks.diamond_block, 0, 3);
        world.setBlock(x + 0, y + 3, z + 0, Blocks.diamond_block, 0, 3);
        world.setBlock(x + 0, y + 4, z + 0, Blocks.diamond_block, 0, 3);
        world.setBlock(x + 0, y + 5, z + 0, Blocks.diamond_block, 0, 3);
        world.setBlock(x + 0, y + 6, z + 0, Blocks.diamond_block, 0, 3);
        world.setBlock(x + 0, y + 7, z + 0, Blocks.diamond_block, 0, 3);
        world.setBlock(x + 0, y + 8, z + 0, Blocks.diamond_block, 0, 3);
        world.setBlock(x + 0, y + 9, z + 0, Blocks.diamond_block, 0, 3);
    }
}

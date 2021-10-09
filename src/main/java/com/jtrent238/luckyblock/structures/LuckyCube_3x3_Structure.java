package com.jtrent238.luckyblock.structures;

import com.jtrent238.luckyblock.BlockLoader;
import com.jtrent238.luckyblock.Main;
import com.jtrent238.luckyblock.util.LuckyColorPicker;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.Random;

public class LuckyCube_3x3_Structure {


    public static void placeStructure(World world, EntityPlayer player) {

        int x = (int) player.posX - 6;
        int y = (int) player.posY - 1;
        int z = (int) player.posZ - 5;

        world.setBlock(x + 0, y + 0, z + 0, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 1, y + 0, z + 0, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 2, y + 0, z + 0, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 0, y + 0, z + 1, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 1, y + 0, z + 1, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 2, y + 0, z + 1, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 0, y + 0, z + 2, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 1, y + 0, z + 2, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 2, y + 0, z + 2, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 0, y + 1, z + 0, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 1, y + 1, z + 0, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 2, y + 1, z + 0, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 0, y + 1, z + 1, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 1, y + 1, z + 1, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 2, y + 1, z + 1, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 0, y + 1, z + 2, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 1, y + 1, z + 2, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 2, y + 1, z + 2, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 0, y + 2, z + 0, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 1, y + 2, z + 0, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 2, y + 2, z + 0, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 0, y + 2, z + 1, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 1, y + 2, z + 1, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 2, y + 2, z + 1, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 0, y + 2, z + 2, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 1, y + 2, z + 2, new LuckyColorPicker().pickColor(), 0, 3);
        world.setBlock(x + 2, y + 2, z + 2, new LuckyColorPicker().pickColor(), 0, 3);
    }
}

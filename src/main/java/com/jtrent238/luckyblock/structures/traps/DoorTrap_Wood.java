package com.jtrent238.luckyblock.structures.traps;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class DoorTrap_Wood {

	public static void createTrap(World world, EntityPlayer p_149636_2_) {

		int x = (int) p_149636_2_.posX - 6;
		int y = (int) p_149636_2_.posY - 1;
		int z = (int) p_149636_2_.posZ - 5;
		
		world.setBlock(x + 0, y + 0, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 0, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 0, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 0, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 0, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 0, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 0, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 0, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 0, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 1, z + 0, Blocks.mob_spawner, 0, 3);
		world.setBlock(x + 1, y + 1, z + 0, Blocks.wooden_door, 2, 3);
		world.setBlock(x + 2, y + 1, z + 0, Blocks.mob_spawner, 0, 3);
		world.setBlock(x + 0, y + 1, z + 1, Blocks.wooden_door, 1, 3);
		world.setBlock(x + 1, y + 1, z + 1, Blocks.stone_pressure_plate, 0, 3);
		world.setBlock(x + 2, y + 1, z + 1, Blocks.wooden_door, 3, 3);
		world.setBlock(x + 0, y + 1, z + 2, Blocks.mob_spawner, 0, 3);
		world.setBlock(x + 1, y + 1, z + 2, Blocks.wooden_door, 0, 3);
		world.setBlock(x + 2, y + 1, z + 2, Blocks.mob_spawner, 0, 3);
		world.setBlock(x + 0, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 0, Blocks.wooden_door, 8, 3);
		world.setBlock(x + 2, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 1, Blocks.wooden_door, 8, 3);
		world.setBlock(x + 1, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 1, Blocks.wooden_door, 8, 3);
		world.setBlock(x + 0, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 2, Blocks.wooden_door, 8, 3);
		world.setBlock(x + 2, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 3, z + 0, Blocks.mob_spawner, 0, 3);
		world.setBlock(x + 0, y + 3, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 3, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 2, Blocks.mob_spawner, 0, 3);
		world.setBlock(x + 1, y + 3, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 3, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 1, Blocks.mob_spawner, 0, 3);
		world.setBlock(x + 2, y + 4, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 2, Blocks.mob_spawner, 0, 3);
		world.setBlock(x + 1, y + 4, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 2, Blocks.air, 0, 3);
	}

}

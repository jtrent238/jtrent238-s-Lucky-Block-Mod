package com.jtrent238.luckyblock.structures;

import java.util.Random;

import com.jtrent238.luckyblock.BlockLoader;

import com.jtrent238.luckyblock.blocks.BlockLucky;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;


public class LuckyStructure extends WorldGenerator
{

	private static Random rand = new Random();

	public static Block lucky_block;
	public LuckyStructure() {
	}

	public static void placeStructure(World world, EntityPlayer thePlayer) {
		int luckyColorPickerMin = 0;
		int luckyColorPickerMax = 14;

		for (int rl = 0; rl < 25; rl++) {

			int luckyColorPicker = rand.nextInt((luckyColorPickerMax - luckyColorPickerMin) + 1) + luckyColorPickerMin;


			switch (luckyColorPicker) {

				case 0:
					lucky_block = BlockLoader.BlockLucky;
					break;
				case 1:
					lucky_block = BlockLoader.BlockLucky_Black;
					break;
				case 2:
					lucky_block = BlockLoader.BlockLucky_Brown;
					break;
				case 3:
					lucky_block = BlockLoader.BlockLucky_Cyan;
					break;
				case 4:
					lucky_block = BlockLoader.BlockLucky_Green;
					break;
				case 5:
					lucky_block = BlockLoader.BlockLucky_Grey;
					break;
				case 6:
					lucky_block = BlockLoader.BlockLucky_Lime;
					break;
				case 7:
					lucky_block = BlockLoader.BlockLucky_LightBlue;
					break;
				case 8:
					lucky_block = BlockLoader.BlockLucky_Magenta;
					break;
				case 9:
					lucky_block = BlockLoader.BlockLucky_Orange;
					break;
				case 10:
					lucky_block = BlockLoader.BlockLucky_Pink;
					break;
				case 11:
					lucky_block = BlockLoader.BlockLucky_Purple;
					break;
				case 12:
					lucky_block = BlockLoader.BlockLucky_White;
					break;
				case 13:
					lucky_block = BlockLoader.BlockLucky_Blue;
					break;
				case 14:
					lucky_block = BlockLoader.BlockLucky_Red;
					break;

				default:
					break;
			}
		}

		int x = (int) thePlayer.posX - 6;
		int y = (int) thePlayer.posY - 1;
		int z = (int) thePlayer.posZ - 5;

		world.setBlock(x + 0, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 1, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 2, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 3, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 4, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 5, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 6, y + 0, z + 0, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 1, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 1, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 1, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 3, y + 0, z + 1, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 4, y + 0, z + 1, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 5, y + 0, z + 1, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 6, y + 0, z + 1, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 2, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 3, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 4, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 5, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 6, y + 0, z + 2, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 3, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 3, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 3, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 3, y + 0, z + 3, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 4, y + 0, z + 3, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 5, y + 0, z + 3, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 6, y + 0, z + 3, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 4, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 3, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 4, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 5, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 6, y + 0, z + 4, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 5, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 5, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 5, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 3, y + 0, z + 5, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 4, y + 0, z + 5, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 5, y + 0, z + 5, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 6, y + 0, z + 5, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 6, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 2, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 3, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 4, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 5, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 6, y + 0, z + 6, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 2, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 3, y + 1, z + 2, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 4, y + 1, z + 2, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 5, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 3, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 3, y + 1, z + 3, Blocks.stonebrick, 3, 3);
		world.setBlock(x + 4, y + 1, z + 3, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 5, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 4, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 3, y + 1, z + 4, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 4, y + 1, z + 4, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 5, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 3, lucky_block, 0, 3);
		world.setBlock(x + 4, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 6, Blocks.air, 0, 3);

	}

	protected Block[] GetValidSpawnBlocks()
	{
		return new Block[]
		{
			Blocks.grass,
		};
	}

	public boolean LocationIsValidSpawn(World world, int x, int y, int z)
 {

		Block checkBlock = world.getBlock(x, y - 1, z);
		Block blockAbove = world.getBlock(x, y , z);
		Block blockBelow = world.getBlock(x, y - 2, z);

		for (Block i : GetValidSpawnBlocks())
		{
			if (blockAbove != Blocks.air)
			{
				return false;
			}
			if (checkBlock == i)
			{
				return true;
			}
			else if (checkBlock == Blocks.snow_layer && blockBelow == i)
			{
				return true;
			}
			else if (checkBlock.getMaterial() == Material.plants && blockBelow == i)
			{
				return true;
			}
		}
		return false;
	}

	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		int i = rand.nextInt(1);

		if(i == 0)
		{
		    generate_r0(world, rand, x, y, z);
		}

       return true;

	}

	public boolean generate_r0(World world, Random rand, int x, int y, int z)
	{

		int luckyColorPickerMin = 0;
		int luckyColorPickerMax = 14;

		for (int rl = 0; rl < 25; rl++) {

			int luckyColorPicker = rand.nextInt((luckyColorPickerMax - luckyColorPickerMin) + 1) + luckyColorPickerMin;


			switch (luckyColorPicker) {

				case 0:
					lucky_block = BlockLoader.BlockLucky;
					break;
				case 1:
					lucky_block = BlockLoader.BlockLucky_Black;
					break;
				case 2:
					lucky_block = BlockLoader.BlockLucky_Brown;
					break;
				case 3:
					lucky_block = BlockLoader.BlockLucky_Cyan;
					break;
				case 4:
					lucky_block = BlockLoader.BlockLucky_Green;
					break;
				case 5:
					lucky_block = BlockLoader.BlockLucky_Grey;
					break;
				case 6:
					lucky_block = BlockLoader.BlockLucky_Lime;
					break;
				case 7:
					lucky_block = BlockLoader.BlockLucky_LightBlue;
					break;
				case 8:
					lucky_block = BlockLoader.BlockLucky_Magenta;
					break;
				case 9:
					lucky_block = BlockLoader.BlockLucky_Orange;
					break;
				case 10:
					lucky_block = BlockLoader.BlockLucky_Pink;
					break;
				case 11:
					lucky_block = BlockLoader.BlockLucky_Purple;
					break;
				case 12:
					lucky_block = BlockLoader.BlockLucky_White;
					break;
				case 13:
					lucky_block = BlockLoader.BlockLucky_Blue;
					break;
				case 14:
					lucky_block = BlockLoader.BlockLucky_Red;
					break;

				default:
					break;
			}
		}

		if(!LocationIsValidSpawn(world, x, y, z) || !LocationIsValidSpawn(world, x + 6, y, z) || !LocationIsValidSpawn(world, x + 6, y, z + 6) || !LocationIsValidSpawn(world, x, y, z + 6))
		{
			return false;
		}

		world.setBlock(x + 0, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 1, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 2, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 3, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 4, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 5, y + 0, z + 0, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 6, y + 0, z + 0, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 1, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 1, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 1, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 3, y + 0, z + 1, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 4, y + 0, z + 1, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 5, y + 0, z + 1, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 6, y + 0, z + 1, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 2, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 3, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 4, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 5, y + 0, z + 2, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 6, y + 0, z + 2, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 3, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 3, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 3, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 3, y + 0, z + 3, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 4, y + 0, z + 3, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 5, y + 0, z + 3, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 6, y + 0, z + 3, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 4, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 3, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 4, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 5, y + 0, z + 4, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 6, y + 0, z + 4, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 5, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 5, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 2, y + 0, z + 5, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 3, y + 0, z + 5, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 4, y + 0, z + 5, Blocks.stonebrick, 2, 3);
		world.setBlock(x + 5, y + 0, z + 5, Blocks.stonebrick, 0, 3);
		world.setBlock(x + 6, y + 0, z + 5, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 0, z + 6, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 1, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 2, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 3, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 4, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 5, y + 0, z + 6, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 6, y + 0, z + 6, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 0, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 2, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 3, y + 1, z + 2, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 4, y + 1, z + 2, Blocks.stone_brick_stairs, 2, 3);
		world.setBlock(x + 5, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 3, Blocks.stone_brick_stairs, 0, 3);
		world.setBlock(x + 3, y + 1, z + 3, Blocks.stonebrick, 3, 3);
		world.setBlock(x + 4, y + 1, z + 3, Blocks.stone_brick_stairs, 1, 3);
		world.setBlock(x + 5, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 4, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 3, y + 1, z + 4, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 4, y + 1, z + 4, Blocks.stone_brick_stairs, 3, 3);
		world.setBlock(x + 5, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 3, lucky_block, 0, 3);
		world.setBlock(x + 4, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 6, Blocks.air, 0, 3);
		return true;

	}


}
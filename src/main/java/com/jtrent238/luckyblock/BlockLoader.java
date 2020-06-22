package com.jtrent238.luckyblock;

import com.jtrent238.luckyblock.blocks.BlockLucky;
import com.jtrent238.luckyblock.blocks.BlockLucky_2;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLoader {

	public static Block BlockLucky;
	public static Block BlockLucky_Red;
	public static Block BlockLucky_Green;
	public static Block BlockLucky_White;
	public static Block BlockLucky_Orange;
	public static Block BlockLucky_Magenta;
	public static Block BlockLucky_LightBlue;
	public static Block BlockLucky_Lime;
	public static Block BlockLucky_Pink;
	public static Block BlockLucky_Grey;
	public static Block BlockLucky_Cyan;
	public static Block BlockLucky_Purple;
	public static Block BlockLucky_Blue;
	public static Block BlockLucky_Brown;
	public static Block BlockLucky_red;
	public static Block BlockLucky_Black;
	
	public static Block BlockLucky_Red_2;
	public static Block BlockLucky_Green_2;
	public static Block BlockLucky_White_2;
	public static Block BlockLucky_Orange_2;
	public static Block BlockLucky_Magenta_2;
	public static Block BlockLucky_LightBlue_2;
	public static Block BlockLucky_Lime_2;
	public static Block BlockLucky_Pink_2;
	public static Block BlockLucky_Grey_2;
	public static Block BlockLucky_Cyan_2;
	public static Block BlockLucky_Purple_2;
	public static Block BlockLucky_Blue_2;
	public static Block BlockLucky_Brown_2;
	public static Block BlockLucky_red_2;
	public static Block BlockLucky_Black_2;
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {

		BlockLucky = new BlockLucky(Material.wood, "BlockLucky", "yellow");
		BlockLucky_Red = new BlockLucky(Material.wood, "BlockLucky_Red", "red");
		BlockLucky_Green = new BlockLucky(Material.wood, "BlockLucky_Green", "green");
		BlockLucky_White = new BlockLucky(Material.wood, "BlockLucky_White", "white");
		BlockLucky_Orange = new BlockLucky(Material.wood, "BlockLucky_Orange", "orange");
		BlockLucky_Magenta = new BlockLucky(Material.wood, "BlockLucky_Magenta", "magenta");
		BlockLucky_LightBlue = new BlockLucky(Material.wood, "BlockLucky_LightBlue", "light_blue");
		BlockLucky_Lime = new BlockLucky(Material.wood, "BlockLucky_Lime", "lime");
		BlockLucky_Pink = new BlockLucky(Material.wood, "BlockLucky_Pink", "pink");
		BlockLucky_Grey = new BlockLucky(Material.wood, "BlockLucky_Grey", "grey");
		BlockLucky_Cyan = new BlockLucky(Material.wood, "BlockLucky_Cyan", "cyan");
		BlockLucky_Purple = new BlockLucky(Material.wood, "BlockLucky_Purple", "purple");
		BlockLucky_Blue = new BlockLucky(Material.wood, "BlockLucky_Blue", "blue");
		BlockLucky_Brown = new BlockLucky(Material.wood, "BlockLucky_Brown", "brown");
		BlockLucky_Black = new BlockLucky(Material.wood, "BlockLucky_Black", "black");

		if(Main.isLuckyBlockInstalled == true) {
			BlockLucky_Red_2 = new BlockLucky_2(Material.wood, "BlockLucky_Red_2", "red");
			BlockLucky_Green_2 = new BlockLucky_2(Material.wood, "BlockLucky_Green_2", "green");
			BlockLucky_White_2 = new BlockLucky_2(Material.wood, "BlockLucky_White_2", "white");
			BlockLucky_Orange_2 = new BlockLucky_2(Material.wood, "BlockLucky_Orange_2", "orange");
			BlockLucky_Magenta_2 = new BlockLucky_2(Material.wood, "BlockLucky_Magenta_2", "magenta");
			BlockLucky_LightBlue_2 = new BlockLucky_2(Material.wood, "BlockLucky_LightBlue_2", "light_blue");
			BlockLucky_Lime_2 = new BlockLucky_2(Material.wood, "BlockLucky_Lime_2", "lime");
			BlockLucky_Pink_2 = new BlockLucky_2(Material.wood, "BlockLucky_Pink_2", "pink");
			BlockLucky_Grey_2 = new BlockLucky_2(Material.wood, "BlockLucky_Grey_2", "grey");
			BlockLucky_Cyan_2 = new BlockLucky_2(Material.wood, "BlockLucky_Cyan_2", "cyan");
			BlockLucky_Purple_2 = new BlockLucky_2(Material.wood, "BlockLucky_Purple_2", "purple");
			BlockLucky_Blue_2 = new BlockLucky_2(Material.wood, "BlockLucky_Blue_2", "blue");
			BlockLucky_Brown_2 = new BlockLucky_2(Material.wood, "BlockLucky_Brown_2", "brown");
			BlockLucky_Black_2 = new BlockLucky_2(Material.wood, "BlockLucky_Black_2", "black");
		}
		registerBlocks();
	}

		/**
		 * Register Blocks.
		 */
		private static void registerBlocks() {
			
			// If the lucky block mod is not installed use our blocks
			if(Main.isLuckyBlockInstalled == true) {
				
				GameRegistry.registerBlock(BlockLucky_Red_2, "BlockLucky_Red_2");
				GameRegistry.registerBlock(BlockLucky_Green_2, "BlockLucky_Green_2");
				GameRegistry.registerBlock(BlockLucky_White_2, "BlockLucky_White_2");
				GameRegistry.registerBlock(BlockLucky_Orange_2, "BlockLucky_Orange_2");
				GameRegistry.registerBlock(BlockLucky_Magenta_2, "BlockLucky_Magenta_2");
				GameRegistry.registerBlock(BlockLucky_LightBlue_2, "BlockLucky_LightBlue_2");
				GameRegistry.registerBlock(BlockLucky_Lime_2, "BlockLucky_Lime_2");
				GameRegistry.registerBlock(BlockLucky_Pink_2, "BlockLucky_Pink_2");
				GameRegistry.registerBlock(BlockLucky_Grey_2, "BlockLucky_Grey_2");
				GameRegistry.registerBlock(BlockLucky_Cyan_2, "BlockLucky_Cyan_2");
				GameRegistry.registerBlock(BlockLucky_Purple_2, "BlockLucky_Purple_2");
				GameRegistry.registerBlock(BlockLucky_Blue_2, "BlockLucky_Blue_2");
				GameRegistry.registerBlock(BlockLucky_Brown_2, "BlockLucky_Brown_2");
				GameRegistry.registerBlock(BlockLucky_Black_2, "BlockLucky_Black_2");
				
			} 
			
			if(Main.isLuckyBlockInstalled == false || Main.LuckyOveride == true) {
				

				GameRegistry.registerBlock(BlockLucky, "BlockLucky");
				GameRegistry.registerBlock(BlockLucky_Red, "BlockLucky_Red");
				GameRegistry.registerBlock(BlockLucky_Green, "BlockLucky_Green");
				GameRegistry.registerBlock(BlockLucky_White, "BlockLucky_White");
				GameRegistry.registerBlock(BlockLucky_Orange, "BlockLucky_Orange");
				GameRegistry.registerBlock(BlockLucky_Magenta, "BlockLucky_Magenta");
				GameRegistry.registerBlock(BlockLucky_LightBlue, "BlockLucky_LightBlue");
				GameRegistry.registerBlock(BlockLucky_Lime, "BlockLucky_Lime");
				GameRegistry.registerBlock(BlockLucky_Pink, "BlockLucky_Pink");
				GameRegistry.registerBlock(BlockLucky_Grey, "BlockLucky_Grey");
				GameRegistry.registerBlock(BlockLucky_Cyan, "BlockLucky_Cyan");
				GameRegistry.registerBlock(BlockLucky_Purple, "BlockLucky_Purple");
				GameRegistry.registerBlock(BlockLucky_Blue, "BlockLucky_Blue");
				GameRegistry.registerBlock(BlockLucky_Brown, "BlockLucky_Brown");
				GameRegistry.registerBlock(BlockLucky_Black, "BlockLucky_Black");
				
			}
			
			
			
			
		}
}

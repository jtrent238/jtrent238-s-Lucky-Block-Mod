package com.jtrent238.luckyblock;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

	
	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
	
	if(Main.isLuckyBlockInstalled == true) {
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky), "X", "X", "S", 'X', mod.lucky.Lucky.lucky_block, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky), "XXX", "BSB", "BSB", 'X', mod.lucky.Lucky.lucky_block, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky), "X", "S", "S", 'X', mod.lucky.Lucky.lucky_block, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky), "XXB", "S", "S", 'X', mod.lucky.Lucky.lucky_block, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky), "XXB", "XSB", "BSB", 'X', mod.lucky.Lucky.lucky_block, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky), "XXX", "XBX", 'X', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky), "XBX", "XBX", 'X', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky), "XBX", "XXX", "XXX", 'X', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky), "XXX", "XBX", "XBX", 'X', mod.lucky.Lucky.lucky_block);
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Red_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 1), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_White_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 15), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Purple_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 5), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Pink_2) , "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 9), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Orange_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 14), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Magenta_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 13), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Lime_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 10), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_LightBlue_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 12), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Grey_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 8), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Green_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 2), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Cyan_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 6), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Brown_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 3), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Blue_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 4), 'B', mod.lucky.Lucky.lucky_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Black_2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 0), 'B', mod.lucky.Lucky.lucky_block);
		
	} 
	
	if(Main.isLuckyBlockInstalled == false || Main.LuckyOveride == true) {
		if(ConfigManager.ENABLE_CRAFTING == true) {
			GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky), "XXX", "XDX", "XXX", 'X', Items.gold_ingot, 'D' , Blocks.dropper); // If the lucky block mod is installed disable our recipe
		}
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky), "X", "X", "S", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky), "X", "S", "S", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky), "XXB", "S", "S", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky), "XXX", "XBX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky), "XBX", "XBX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky);
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Red), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 1), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_White), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 15), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Purple), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 5), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Pink) , "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 9), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Orange), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 14), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Magenta), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 13), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Lime), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 10), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_LightBlue), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 12), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Grey), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 8), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Green), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 2), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Cyan), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 6), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Brown), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 3), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Blue), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 4), 'B', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky_Black), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 0), 'B', BlockLoader.BlockLucky);

		
	}
	
	}
	
	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		
		}
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
		
	}
}

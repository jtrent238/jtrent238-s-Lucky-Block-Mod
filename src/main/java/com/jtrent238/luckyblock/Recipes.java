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
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Red), "X", "X", "S", 'X', BlockLoader.BlockLucky_Red_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_White), "X", "X", "S", 'X', BlockLoader.BlockLucky_White_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Purple), "X", "X", "S", 'X', BlockLoader.BlockLucky_Purple_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Pink), "X", "X", "S", 'X', BlockLoader.BlockLucky_Pink_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Orange), "X", "X", "S", 'X', BlockLoader.BlockLucky_Orange_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Magenta), "X", "X", "S", 'X', BlockLoader.BlockLucky_Magenta_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Lime), "X", "X", "S", 'X', BlockLoader.BlockLucky_Lime_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_LightBlue), "X", "X", "S", 'X', BlockLoader.BlockLucky_LightBlue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Grey), "X", "X", "S", 'X', BlockLoader.BlockLucky_Grey_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Green), "X", "X", "S", 'X', BlockLoader.BlockLucky_Green_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Cyan), "X", "X", "S", 'X', BlockLoader.BlockLucky_Cyan_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Brown), "X", "X", "S", 'X', BlockLoader.BlockLucky_Brown_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Blue), "X", "X", "S", 'X', BlockLoader.BlockLucky_Blue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Black), "X", "X", "S", 'X', BlockLoader.BlockLucky_Black_2, 'S' , Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Red), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Red_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_White), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_White_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Purple), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Purple_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Pink), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Pink_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Orange), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Orange_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Magenta), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Magenta_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Lime), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Lime_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_LightBlue), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_LightBlue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Grey), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Grey_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Green), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Green_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Cyan), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Cyan_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Brown), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Brown_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Blue), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Blue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Black), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Black_2, 'S' , Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Red), "X", "S", "S", 'X', BlockLoader.BlockLucky_Red_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_White), "X", "S", "S", 'X', BlockLoader.BlockLucky_White_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Purple), "X", "S", "S", 'X', BlockLoader.BlockLucky_Purple_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Pink), "X", "S", "S", 'X', BlockLoader.BlockLucky_Pink_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Orange), "X", "S", "S", 'X', BlockLoader.BlockLucky_Orange_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Magenta), "X", "S", "S", 'X', BlockLoader.BlockLucky_Magenta_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Lime), "X", "S", "S", 'X', BlockLoader.BlockLucky_Lime_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_LightBlue), "X", "S", "S", 'X', BlockLoader.BlockLucky_LightBlue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Grey), "X", "S", "S", 'X', BlockLoader.BlockLucky_Grey_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Green), "X", "S", "S", 'X', BlockLoader.BlockLucky_Green_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Cyan), "X", "S", "S", 'X', BlockLoader.BlockLucky_Cyan_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Brown), "X", "S", "S", 'X', BlockLoader.BlockLucky_Brown_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Blue), "X", "S", "S", 'X', BlockLoader.BlockLucky_Blue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Black), "X", "S", "S", 'X', BlockLoader.BlockLucky_Black_2, 'S' , Items.stick);

		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Red), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Red_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_White), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_White_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Purple), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Purple_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Pink), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Pink_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Orange), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Orange_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Magenta), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Magenta_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Lime), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Lime_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_LightBlue), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_LightBlue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Grey), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Grey_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Green), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Green_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Cyan), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Cyan_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Brown), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Brown_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Blue), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Blue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Black), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Black_2, 'S' , Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Red), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Red_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_White), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_White_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Purple), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Purple_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Pink), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Pink_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Orange), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Orange_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Magenta), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Magenta_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Lime), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Lime_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_LightBlue), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_LightBlue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Grey), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Grey_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Green), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Green_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Cyan), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Cyan_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Brown), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Brown_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Blue), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Blue_2, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Black), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Black_2, 'S' , Items.stick);

		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Red), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Red_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_White), "XXX", "XBX", 'X', BlockLoader.BlockLucky_White_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Purple), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Purple_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Pink), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Pink_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Orange), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Orange_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Magenta), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Magenta_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Lime), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Lime_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_LightBlue), "XXX", "XBX", 'X', BlockLoader.BlockLucky_LightBlue_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Grey), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Grey_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Green), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Green_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Cyan), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Cyan_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Brown), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Brown_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Blue), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Blue_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Black), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Black_2);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Red), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Red_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_White), "XBX", "XBX", 'X', BlockLoader.BlockLucky_White_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Purple), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Purple_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Pink), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Pink_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Orange), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Orange_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Magenta), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Magenta_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Lime), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Lime_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_LightBlue), "XBX", "XBX", 'X', BlockLoader.BlockLucky_LightBlue_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Grey), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Grey_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Green), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Green_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Cyan), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Cyan_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Brown), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Brown_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Blue), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Blue_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Black), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Black_2);
			
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Red), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Red_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_White), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_White_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Purple), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Purple_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Pink), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Pink_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Orange), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Orange_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Magenta), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Magenta_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Lime), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Lime_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_LightBlue), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_LightBlue_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Grey), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Grey_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Green), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Green_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Cyan), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Cyan_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Brown), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Brown_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Blue), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Blue_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Black), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Black_2);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Red), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Red_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_White), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_White_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Purple), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Purple_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Pink), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Pink_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Orange), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Orange_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Magenta), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Magenta_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Lime), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Lime_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_LightBlue), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_LightBlue_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Grey), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Grey_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Green), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Green_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Cyan), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Cyan_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Brown), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Brown_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Blue), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Blue_2);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Black), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Black_2);
		
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
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Red), "X", "X", "S", 'X', BlockLoader.BlockLucky_Red, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_White), "X", "X", "S", 'X', BlockLoader.BlockLucky_White, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Purple), "X", "X", "S", 'X', BlockLoader.BlockLucky_Purple, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Pink), "X", "X", "S", 'X', BlockLoader.BlockLucky_Pink, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Orange), "X", "X", "S", 'X', BlockLoader.BlockLucky_Orange, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Magenta), "X", "X", "S", 'X', BlockLoader.BlockLucky_Magenta, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Lime), "X", "X", "S", 'X', BlockLoader.BlockLucky_Lime, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_LightBlue), "X", "X", "S", 'X', BlockLoader.BlockLucky_LightBlue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Grey), "X", "X", "S", 'X', BlockLoader.BlockLucky_Grey, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Green), "X", "X", "S", 'X', BlockLoader.BlockLucky_Green, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Cyan), "X", "X", "S", 'X', BlockLoader.BlockLucky_Cyan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Brown), "X", "X", "S", 'X', BlockLoader.BlockLucky_Brown, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Blue), "X", "X", "S", 'X', BlockLoader.BlockLucky_Blue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky_Black), "X", "X", "S", 'X', BlockLoader.BlockLucky_Black, 'S' , Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Red), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Red, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_White), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_White, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Purple), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Purple, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Pink), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Pink, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Orange), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Orange, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Magenta), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Magenta, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Lime), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Lime, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_LightBlue), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_LightBlue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Grey), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Grey, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Green), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Green, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Cyan), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Cyan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Brown), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Brown, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Blue), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Blue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky_Black), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky_Black, 'S' , Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky), "X", "S", "S", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Red), "X", "S", "S", 'X', BlockLoader.BlockLucky_Red, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_White), "X", "S", "S", 'X', BlockLoader.BlockLucky_White, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Purple), "X", "S", "S", 'X', BlockLoader.BlockLucky_Purple, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Pink), "X", "S", "S", 'X', BlockLoader.BlockLucky_Pink, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Orange), "X", "S", "S", 'X', BlockLoader.BlockLucky_Orange, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Magenta), "X", "S", "S", 'X', BlockLoader.BlockLucky_Magenta, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Lime), "X", "S", "S", 'X', BlockLoader.BlockLucky_Lime, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_LightBlue), "X", "S", "S", 'X', BlockLoader.BlockLucky_LightBlue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Grey), "X", "S", "S", 'X', BlockLoader.BlockLucky_Grey, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Green), "X", "S", "S", 'X', BlockLoader.BlockLucky_Green, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Cyan), "X", "S", "S", 'X', BlockLoader.BlockLucky_Cyan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Brown), "X", "S", "S", 'X', BlockLoader.BlockLucky_Brown, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Blue), "X", "S", "S", 'X', BlockLoader.BlockLucky_Blue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky_Black), "X", "S", "S", 'X', BlockLoader.BlockLucky_Black, 'S' , Items.stick);

		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky), "XXB", "S", "S", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Red), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Red, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_White), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_White, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Purple), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Purple, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Pink), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Pink, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Orange), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Orange, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Magenta), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Magenta, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Lime), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Lime, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_LightBlue), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_LightBlue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Grey), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Grey, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Green), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Green, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Cyan), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Cyan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Brown), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Brown, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Blue), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Blue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky_Black), "XXB", "S", "S", 'X', BlockLoader.BlockLucky_Black, 'S' , Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Red), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Red, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_White), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_White, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Purple), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Purple, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Pink), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Pink, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Orange), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Orange, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Magenta), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Magenta, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Lime), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Lime, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_LightBlue), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_LightBlue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Grey), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Grey, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Green), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Green, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Cyan), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Cyan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Brown), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Brown, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Blue), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Blue, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky_Black), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky_Black, 'S' , Items.stick);

		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky), "XXX", "XBX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Red), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Red);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_White), "XXX", "XBX", 'X', BlockLoader.BlockLucky_White);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Purple), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Purple);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Pink), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Pink);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Orange), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Orange);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Magenta), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Magenta);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Lime), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Lime);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_LightBlue), "XXX", "XBX", 'X', BlockLoader.BlockLucky_LightBlue);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Grey), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Grey);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Green), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Green);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Cyan), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Cyan);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Brown), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Brown);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Blue), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Blue);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky_Black), "XXX", "XBX", 'X', BlockLoader.BlockLucky_Black);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky), "XBX", "XBX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Red), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Red);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_White), "XBX", "XBX", 'X', BlockLoader.BlockLucky_White);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Purple), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Purple);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Pink), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Pink);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Orange), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Orange);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Magenta), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Magenta);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Lime), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Lime);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_LightBlue), "XBX", "XBX", 'X', BlockLoader.BlockLucky_LightBlue);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Grey), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Grey);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Green), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Green);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Cyan), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Cyan);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Brown), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Brown);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Blue), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Blue);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky_Black), "XBX", "XBX", 'X', BlockLoader.BlockLucky_Black);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Red), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Red);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_White), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_White);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Purple), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Purple);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Pink), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Pink);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Orange), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Orange);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Magenta), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Magenta);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Lime), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Lime);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_LightBlue), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_LightBlue);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Grey), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Grey);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Green), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Green);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Cyan), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Cyan);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Brown), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Brown);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Blue), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Blue);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky_Black), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky_Black);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Red), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Red);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_White), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_White);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Purple), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Purple);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Pink), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Pink);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Orange), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Orange);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Magenta), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Magenta);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Lime), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Lime);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_LightBlue), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_LightBlue);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Grey), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Grey);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Green), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Green);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Cyan), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Cyan);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Brown), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Brown);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Blue), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Blue);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky_Black), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky_Black);
		
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

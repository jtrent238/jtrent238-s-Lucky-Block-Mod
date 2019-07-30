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
		
		
	} else {
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLucky), "XXX", "XDX", "XXX", 'X', Items.gold_ingot, 'S' , Blocks.dropper); // If the lucky block mod is installed disable our recipe
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.SwordLucky), "X", "X", "S", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.PickLucky), "XXX", "BSB", "BSB", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ShovelLucky), "X", "S", "S", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HoeLucky), "XXB", "S", "S", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.AxeLucky), "XXB", "XSB", "BSB", 'X', BlockLoader.BlockLucky, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.HelmentLucky), "XXX", "XBX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.BootsLucky), "XBX", "XBX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ChestplateLucky), "XBX", "XXX", "XXX", 'X', BlockLoader.BlockLucky);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.LeggingsLucky), "XXX", "XBX", "XBX", 'X', BlockLoader.BlockLucky);
		
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

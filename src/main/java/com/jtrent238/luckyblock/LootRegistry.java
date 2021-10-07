package com.jtrent238.luckyblock;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootRegistry {

	public static ArrayList<ItemStack> loot = new ArrayList<ItemStack>();

	LootRegistry(){
		addLoot();
		addToChests();
	}
	
	public static void registerLoot() {
		addLoot();
		addToChests();
	}
	
	public static void addLoot() {
			
			if(Main.isLuckyBlockInstalled == false || Main.LuckyOveride == true) {
				loot.add(new ItemStack(BlockLoader.BlockLucky));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Black));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Blue));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Brown));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Cyan));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Green));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Grey));
				loot.add(new ItemStack(BlockLoader.BlockLucky_LightBlue));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Lime));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Magenta));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Orange));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Pink));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Purple));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Red));
				loot.add(new ItemStack(BlockLoader.BlockLucky_White));
			}
			
			if(Main.isLuckyBlockInstalled == true) {
				loot.add(new ItemStack(BlockLoader.BlockLucky_Black_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Blue_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Brown_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Cyan_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Green_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Grey_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_LightBlue_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Lime_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Magenta_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Orange_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Pink_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Purple_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_Red_2));
				loot.add(new ItemStack(BlockLoader.BlockLucky_White_2));
			}
	}
	
	public static void addToChests() {
		//int numHammers = 98;
		int lootCounter = 15;
		if (Main.isLuckyBlockInstalled == true) {
			lootCounter = 14;
		}
		if(Main.LuckyOveride == true) {
			lootCounter = 29;
		}
		for (int i = 0; i < lootCounter ; i++) {
			
				
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(loot.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(loot.get(i), 0, 1, 1));
		 	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(loot.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(loot.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(loot.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(loot.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(loot.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(loot.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(loot.get(i), 0, 1, 1));
		}
		
	}

}

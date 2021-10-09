package com.jtrent238.luckyblock;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class OreDict {


	public static void addores() {
		
		// Build our list of items to replace with ore tags
        Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();

        replacements.put(new ItemStack(ItemLoader.ShardLucky), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Red), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_White), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Purple), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Pink), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Orange), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Magenta), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Lime), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_LightBlue), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Grey), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Green), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Cyan), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Brown), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Blue), "shardLucky");
        replacements.put(new ItemStack(ItemLoader.ShardLucky_Black), "shardLucky");

        replacements.put(new ItemStack(ItemLoader.OrbLucky), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Red), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_White), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Purple), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Pink), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Orange), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Magenta), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Lime), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_LightBlue), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Grey), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Green), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Cyan), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Brown), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Blue), "orbLucky");
        replacements.put(new ItemStack(ItemLoader.OrbLucky_Black), "orbLucky");
	}
}

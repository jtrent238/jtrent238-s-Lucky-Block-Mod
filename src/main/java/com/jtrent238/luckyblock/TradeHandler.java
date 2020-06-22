package com.jtrent238.luckyblock;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class TradeHandler implements IVillageTradeHandler {


	

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {

		switch(villager.getProfession()) {
		
		case 29626 : //Villager Of Epic Proportions
			// standard trade
			
			if(Main.isLuckyBlockInstalled == true) {
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky, 16), new ItemStack(mod.lucky.Lucky.lucky_block, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Red, 16), new ItemStack(BlockLoader.BlockLucky_Red_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_White, 16), new ItemStack(BlockLoader.BlockLucky_White_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Purple, 16), new ItemStack(BlockLoader.BlockLucky_Purple_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Pink, 16), new ItemStack(BlockLoader.BlockLucky_Pink_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Orange, 16), new ItemStack(BlockLoader.BlockLucky_Orange_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Magenta, 16), new ItemStack(BlockLoader.BlockLucky_Magenta_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Lime, 16), new ItemStack(BlockLoader.BlockLucky_Lime_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_LightBlue, 16), new ItemStack(BlockLoader.BlockLucky_LightBlue_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Grey, 16), new ItemStack(BlockLoader.BlockLucky_Grey_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Green, 16), new ItemStack(BlockLoader.BlockLucky_Green_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Cyan, 16), new ItemStack(BlockLoader.BlockLucky_Cyan_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Brown, 16), new ItemStack(BlockLoader.BlockLucky_Brown_2, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Black, 16), new ItemStack(BlockLoader.BlockLucky_Black_2, 1)));
			}
			
			if(Main.isLuckyBlockInstalled == false || Main.LuckyOveride == true) {
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky, 16), new ItemStack(BlockLoader.BlockLucky, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Red, 16), new ItemStack(BlockLoader.BlockLucky_Red, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_White, 16), new ItemStack(BlockLoader.BlockLucky_White, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Purple, 16), new ItemStack(BlockLoader.BlockLucky_Purple, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Pink, 16), new ItemStack(BlockLoader.BlockLucky_Pink, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Orange, 16), new ItemStack(BlockLoader.BlockLucky_Orange, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Magenta, 16), new ItemStack(BlockLoader.BlockLucky_Magenta, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Lime, 16), new ItemStack(BlockLoader.BlockLucky_Lime, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_LightBlue, 16), new ItemStack(BlockLoader.BlockLucky_LightBlue, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Grey, 16), new ItemStack(BlockLoader.BlockLucky_Grey, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Green, 16), new ItemStack(BlockLoader.BlockLucky_Green, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Cyan, 16), new ItemStack(BlockLoader.BlockLucky_Cyan, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Brown, 16), new ItemStack(BlockLoader.BlockLucky_Brown, 1)));
				recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ShardLucky_Black, 16), new ItemStack(BlockLoader.BlockLucky_Black, 1)));
			}
		}
	}

}

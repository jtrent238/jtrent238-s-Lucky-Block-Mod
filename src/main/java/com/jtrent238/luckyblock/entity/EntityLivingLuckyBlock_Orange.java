package com.jtrent238.luckyblock.entity;

import java.util.Random;

import com.jtrent238.luckyblock.BlockLoader;
import com.jtrent238.luckyblock.ItemLoader;
import com.jtrent238.luckyblock.Main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityLivingLuckyBlock_Orange extends EntityLivingLuckyBlock{

	public EntityLivingLuckyBlock_Orange(World p_i1733_1_) {
		super(p_i1733_1_);
	}

    /**
     * Drop items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
    	float maximumHomeDistance = 1;
    	
    	Random rand = new Random();  

    	int max = 6;
		int min = 1;
		
		int numDrop = rand.nextInt((max - min) + 1) + min;
    	
    	this.entityDropItem(new ItemStack(ItemLoader.ShardLucky_Orange, numDrop), 0F);
    	
    	if(Main.isLuckyBlockInstalled == true) {
			this.entityDropItem(new ItemStack(Item.getItemFromBlock(BlockLoader.BlockLucky_Orange_2)), maximumHomeDistance);
        }
        
        if(Main.isLuckyBlockInstalled == false || Main.LuckyOveride == true) {
			this.entityDropItem(new ItemStack(Item.getItemFromBlock(BlockLoader.BlockLucky_Orange)), maximumHomeDistance);
        }
    }
}

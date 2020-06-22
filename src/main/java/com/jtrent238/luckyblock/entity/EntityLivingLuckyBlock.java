package com.jtrent238.luckyblock.entity;

import java.util.Random;

import com.jtrent238.luckyblock.BlockLoader;
import com.jtrent238.luckyblock.ItemLoader;
import com.jtrent238.luckyblock.Main;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityLivingLuckyBlock extends EntityCreeper{

	public EntityLivingLuckyBlock(World p_i1733_1_) {
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
    	
    	this.entityDropItem(new ItemStack(ItemLoader.ShardLucky, numDrop), 0F);
    	
    	if(Main.isLuckyBlockInstalled == true) {
			this.entityDropItem(new ItemStack(Item.getItemFromBlock(mod.lucky.Lucky.lucky_block)), maximumHomeDistance);
        }
        
        if(Main.isLuckyBlockInstalled == false || Main.LuckyOveride == true) {
			this.entityDropItem(new ItemStack(Item.getItemFromBlock(BlockLoader.BlockLucky)), maximumHomeDistance);
        }
    }
}

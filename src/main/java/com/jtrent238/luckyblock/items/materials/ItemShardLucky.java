package com.jtrent238.luckyblock.items.materials;

import java.util.List;

import com.jtrent238.luckyblock.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class ItemShardLucky extends Item {

	public ItemShardLucky(String shardName, String shardColor) {
		super();
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setUnlocalizedName(shardName);
		this.setTextureName(Main.MODID + ":" + shardName);
	}
	
	@Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 
		list.add(EnumChatFormatting.YELLOW + StatCollector.translateToLocal("tooltip.shard.info"));
		list.add(EnumChatFormatting.AQUA + StatCollector.translateToLocal("tooltip.shard.use"));

	}
}

package com.jtrent238.luckyblock.items.tools;

import java.util.List;

import com.jtrent238.luckyblock.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class SwordLucky extends ItemSword {

	private String itemName = "SwordLucky";
	
	public SwordLucky(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setUnlocalizedName(itemName);
		this.setTextureName(Main.MODID + ":" + itemName);
	}
	
	@Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 
		list.add(EnumChatFormatting.YELLOW + StatCollector.translateToLocal("tooltip.tools.crafted"));

	}
}

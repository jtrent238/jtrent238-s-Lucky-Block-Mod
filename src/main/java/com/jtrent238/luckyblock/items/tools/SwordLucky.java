package com.jtrent238.luckyblock.items.tools;

import java.util.List;

import com.jtrent238.luckyblock.ItemLoader;
import com.jtrent238.luckyblock.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;

public class SwordLucky extends ItemSword {

	private String itemName = "SwordLucky";
	
	public SwordLucky(ToolMaterial material, String color) {
		super(material);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setUnlocalizedName(itemName + "." + color);
		this.setTextureName(Main.MODID + ":" + itemName + "." + color);
	}
	
	@Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 
		list.add(EnumChatFormatting.YELLOW + StatCollector.translateToLocal("tooltip.tools.crafted"));

	}
	
}

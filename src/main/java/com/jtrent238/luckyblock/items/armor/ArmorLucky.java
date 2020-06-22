package com.jtrent238.luckyblock.items.armor;

import java.util.List;

import com.jtrent238.luckyblock.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class ArmorLucky extends ItemArmor{

	private String textureName;
	private int armorType;
	

	public ArmorLucky(ArmorMaterial diamond, int i, int j, String color) {
		super(diamond, 0, i);
	    //this.textureName = textureName;
				
			this.setUnlocalizedName("Lucky_Armor");
		    this.setTextureName(Main.MODID + ":Lucky_Armor_");
	    
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
			
		return Main.MODID + ":textures/armor/Lucky_Armor_" + (this.armorType == 2 ? "2" : "1") + ".png";
		}
	
	@Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 
		list.add(EnumChatFormatting.YELLOW + StatCollector.translateToLocal("tooltip.armor.crafted"));

	}
}
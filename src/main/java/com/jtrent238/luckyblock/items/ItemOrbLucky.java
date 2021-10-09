package com.jtrent238.luckyblock.items;

import com.jtrent238.luckyblock.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemOrbLucky extends Item {

    public ItemOrbLucky(String orbName, String orbColor) {
        super();
        this.setCreativeTab(Main.tab_LuckyBlock);
        this.setUnlocalizedName(orbName);
        this.setTextureName(Main.MODID + ":" + orbName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {

        list.add(EnumChatFormatting.YELLOW + StatCollector.translateToLocal("tooltip.orb.info"));
        list.add(EnumChatFormatting.AQUA + StatCollector.translateToLocal("tooltip.orb.use"));

    }
}

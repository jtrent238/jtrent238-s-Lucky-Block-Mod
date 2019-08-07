package com.jtrent238.luckyblock.blocks;

import com.jtrent238.luckyblock.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLucky_Magenta  extends BlockLucky {

	private static String blockName = "BlockLucky_Magenta";
	
	public BlockLucky_Magenta(Material material) {
		super(material, blockName);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setBlockTextureName(Main.MODID + ":" + blockName);
		this.setBlockName(blockName);
		this.setHardness(0.5F);
	}

}

package com.jtrent238.luckyblock.blocks;

import com.jtrent238.luckyblock.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLucky_Green extends BlockLucky {

	private String blockName = "BlockLucky_Green";
	
	public BlockLucky_Green(Material material) {
		super(material);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setBlockTextureName(Main.MODID + ":" + blockName);
		this.setBlockName(blockName);
		this.setHardness(0.5F);
	}

}

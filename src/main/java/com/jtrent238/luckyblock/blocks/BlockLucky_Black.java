package com.jtrent238.luckyblock.blocks;

import com.jtrent238.luckyblock.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLucky_Black extends BlockLucky {

	private String blockName = "BlockLucky_Black";
	
	public BlockLucky_Black(Material material) {
		super(material);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setBlockTextureName(Main.MODID + ":" + blockName);
		this.setBlockName(blockName);
		this.setHardness(0.5F);
	}

}

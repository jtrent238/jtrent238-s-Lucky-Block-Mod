package com.jtrent238.luckyblock.blocks;

import com.jtrent238.luckyblock.Main;

import mod.lucky.block.BlockLuckyBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLucky_Brown_2 extends BlockLuckyBlock {

	private String blockName = "BlockLucky_Red";
	
	public BlockLucky_Brown_2(Material material) {
		super(material);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setBlockTextureName(Main.MODID + ":" + blockName);
		this.setBlockName(blockName);
		this.setHardness(0.5F);
	}

}

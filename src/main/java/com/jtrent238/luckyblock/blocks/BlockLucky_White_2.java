package com.jtrent238.luckyblock.blocks;

import com.jtrent238.luckyblock.Main;

import mod.lucky.block.BlockLuckyBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLucky_White_2 extends BlockLuckyBlock {

	private String blockName = "BlockLucky_White_2";
	
	public BlockLucky_White_2(Material material) {
		super(material);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setBlockTextureName(Main.MODID + ":" + blockName);
		this.setBlockName(blockName);
		this.setHardness(0.5F);
	}

}

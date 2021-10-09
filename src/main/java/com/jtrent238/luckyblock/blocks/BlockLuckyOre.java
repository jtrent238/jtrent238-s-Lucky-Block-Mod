package com.jtrent238.luckyblock.blocks;

import com.jtrent238.luckyblock.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLuckyOre extends Block {

    public BlockLuckyOre(Material material, String blockName, String blockColor) {
        super(material);
        this.setCreativeTab(Main.tab_LuckyBlock);
        this.setBlockTextureName(Main.MODID + ":" + blockName);
        this.setBlockName(blockName);
        this.setHardness(0.5F);
    }
}

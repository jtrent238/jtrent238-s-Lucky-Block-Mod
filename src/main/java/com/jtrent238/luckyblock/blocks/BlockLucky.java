package com.jtrent238.luckyblock.blocks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.jtrent238.luckyblock.Main;
import com.jtrent238.luckyblock.blocks.util.LuckyDropAlgorithm;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockLucky extends Block {

	private String blockName = "BlockLucky";

	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	private String get_drops_as_string;
	
	public static ArrayList<String> custom_drops;
	private static int lineCount = 0;
	
	ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	
	
	public BlockLucky(Material material) {
		super(material);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setBlockTextureName(Main.MODID + ":" + blockName);
		this.setBlockName(blockName);
		this.setHardness(0.5F);
	}

	public boolean enableStats(){
		
		return true;
	}
	
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return this.drop; //ItemLoader.itemBirthdayPresent;
    }
	
	@Override
	public int damageDropped(int metadata) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
	
	public void LuckyDrops( Item drop, int meta, int least_quantity, int most_quantity){
    	this.drop = drop;
        this.meta = meta;
        this.least_quantity = least_quantity;
        this.most_quantity = most_quantity;
    }
	
	@Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		
        int tatapatt = (int) 1;
        
		drops.add(new ItemStack(Items.gold_nugget, (int) tatapatt));
        drops.add(new ItemStack(Items.coal, (int) tatapatt));
        drops.add(new ItemStack(Items.iron_ingot, (int) tatapatt));
        drops.add(new ItemStack(Items.gold_ingot, (int) tatapatt));
        drops.add(new ItemStack(Items.dye, (int) tatapatt));
        drops.add(new ItemStack(Items.redstone, (int) tatapatt));
        if (world.rand.nextFloat() / (int) tatapatt < 0.5F)
            drops.add(new ItemStack(Items.diamond));
        if (world.rand.nextFloat() / (int) tatapatt < 0.3F)
            drops.add(new ItemStack(Items.golden_apple));
        
        get_drops_as_string = drops.toString();
        
        return drops;
    }

	private void addCustomDrops(World world) throws IOException {
		  File custom_drops = new File("custom_drops.txt");
		  custom_drops.createNewFile(); //Create the file if it don't already exist
		  
		  List<String> CustomDrops = new ArrayList<String>();
		  BufferedReader reader = new BufferedReader(new FileReader("custom_drops.txt"));
		  String line;
		  
		  while ((line = reader.readLine()) != null) {
			  CustomDrops.add(line);
			  drops.add(new ItemStack(Blocks.air, world.rand.nextInt(4) + 1));
		  }
		  
		  reader.close();
		
	}
	
	
}

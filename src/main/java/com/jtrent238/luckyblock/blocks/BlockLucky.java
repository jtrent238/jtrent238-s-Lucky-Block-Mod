package com.jtrent238.luckyblock.blocks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.jtrent238.luckyblock.ConfigManager;
import com.jtrent238.luckyblock.Main;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Black;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Blue;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Brown;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Cyan;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Green;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Grey;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_LightBlue;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Lime;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Magenta;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Orange;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Pink;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Purple;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Red;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_White;
import com.jtrent238.luckyblock.structures.traps.DoorTrap_Iron;
import com.jtrent238.luckyblock.structures.traps.DoorTrap_Wood;
import com.jtrent238.luckyblock.structures.traps.GoodLuckTrap;
import com.jtrent238.luckyblock.util.LuckyDropAlgorithm;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
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

	private String droptype;
	
	
	public BlockLucky(Material material, String blockName, String blockColor) {
		super(material);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setBlockTextureName(Main.MODID + ":" + blockName);
		this.setBlockName(blockName);
		this.setHardness(0.5F);
	}

	public boolean enableStats(){
		
		return true;
	}

	/*
	 * @Override public Item getItemDropped(int metadata, Random random, int
	 * fortune) { return this.drop; //ItemLoader.itemBirthdayPresent; }
	 * 
	 * @Override public int damageDropped(int metadata) { return this.meta; }
	 * 
	 * @Override public int quantityDropped(int meta, int fortune, Random random) {
	 * if (this.least_quantity >= this.most_quantity) return this.least_quantity;
	 * return this.least_quantity + random.nextInt(this.most_quantity -
	 * this.least_quantity + fortune + 1); }
	 * 
	 * public void LuckyDrops( Item drop, int meta, int least_quantity, int
	 * most_quantity){ this.drop = drop; this.meta = meta; this.least_quantity =
	 * least_quantity; this.most_quantity = most_quantity; }
	 * 
	 * @Override public ArrayList<ItemStack> getDrops(World world, int x, int y, int
	 * z, int metadata, int fortune) {
	 * 
	 * int tatapatt = (int) 1;
	 * 
	 * drops.add(new ItemStack(Items.gold_nugget, (int) tatapatt)); drops.add(new
	 * ItemStack(Items.coal, (int) tatapatt)); drops.add(new
	 * ItemStack(Items.iron_ingot, (int) tatapatt)); drops.add(new
	 * ItemStack(Items.gold_ingot, (int) tatapatt)); drops.add(new
	 * ItemStack(Items.dye, (int) tatapatt)); drops.add(new
	 * ItemStack(Items.redstone, (int) tatapatt)); if (world.rand.nextFloat() /
	 * (int) tatapatt < 0.5F) drops.add(new ItemStack(Items.diamond)); if
	 * (world.rand.nextFloat() / (int) tatapatt < 0.3F) drops.add(new
	 * ItemStack(Items.golden_apple));
	 * 
	 * get_drops_as_string = drops.toString();
	 * 
	 * return drops; }
	 * 
	 * private void addCustomDrops(World world) throws IOException { File
	 * custom_drops = new File("custom_drops.txt"); custom_drops.createNewFile();
	 * //Create the file if it don't already exist
	 * 
	 * List<String> CustomDrops = new ArrayList<String>(); BufferedReader reader =
	 * new BufferedReader(new FileReader("custom_drops.txt")); String line;
	 * 
	 * while ((line = reader.readLine()) != null) { CustomDrops.add(line);
	 * drops.add(new ItemStack(Blocks.air, world.rand.nextInt(4) + 1)); }
	 * 
	 * reader.close();
	 * 
	 * }
	 */
	
	 /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    public void harvestBlock(World world, EntityPlayer player, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_)
    {
    	//int luckValue = 0;
    	
    	
    	
    	EntityZombie zombieEntity = new EntityZombie(world); 
    	EntityWither witherEntity = new EntityWither(world); 
    	EntityCreeper creeperEntity = new EntityCreeper(world); 
    	EntityCow cowEntity = new EntityCow(world);
    	
    	
    	
    	
    	Random rand = new Random();
    	int  n = rand.nextInt(1) + 0;

    	int minDropID = 0;
    	int maxDropID = 11;
        int dropID = rand.nextInt((maxDropID - minDropID) + 1) + minDropID;

        
        int i;
		int j;
		int k;
		int posX = (int) player.posX - 6;
		int posY = (int) player.posY - 1;
		int posZ = (int) player.posZ - 5;

		
		System.out.println("dropID: " + dropID);
		
    	Object event;
		switch (dropID) {
    	
    	case 0:
    		
    		droptype = "explode";
            
			double p_72876_2_ = 1;
			double p_72876_4_ = 1;
			double p_72876_6_ = 1;
			float p_72876_8_ = 5;
			boolean p_72876_9_ = false;
		
        	world.createExplosion(player, p_72876_2_, p_72876_4_, p_72876_6_, p_72876_8_, p_72876_9_);
                 
        	if(ConfigManager.ENABLE_DEVLOGGING == true){
        		 
        		//System.out.println("Case 0, droptype: " + droptype);
        		System.out.println("Case , " + dropID + droptype);

        	}
    		break;
    		
    	case 1:
    		
        	droptype = "random_lava";
        	
        	player.addChatComponentMessage((IChatComponent) new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "Lava was randomly place around you!"));
        	
        	Block p_147449_4_ = Blocks.flowing_lava;
    		int lavatrap_posX = (int) player.posX;
    		int lavatrap_posY = (int) player.posY;
    		int lavatrap_posZ = (int) player.posZ;
            
            for (int LavaLoop = 0; LavaLoop < 100; LavaLoop++) {
        		int lavamax = 25;
        		int lavamin = -25;
                int randomLava = rand.nextInt((lavamax - lavamin) + 1) + lavamin;
                world.setBlock(lavatrap_posX + randomLava, lavatrap_posY + randomLava, lavatrap_posZ + randomLava, p_147449_4_);
                world.setBlock(lavatrap_posX - randomLava, lavatrap_posY - randomLava, lavatrap_posZ - randomLava, p_147449_4_);
            }
    		
    		
        	if(ConfigManager.ENABLE_DEVLOGGING == true){
        		System.out.println("Case , " + dropID + droptype);
        	}
    		break;
    		
    	case 2:
    		
    		droptype = "fire";
            
    		player.setFire(16);
        	
    		if(ConfigManager.ENABLE_DEVLOGGING == true){
    			System.out.println("Case , " + dropID + droptype);
        	}
    		break;
    		
    	case 3:
    		
    		droptype = "goodluck_trap";
    		
        	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "HA! Lets see you get out of this one!"));

    		GoodLuckTrap.createTrap(world, player);
    		
    		if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case , " + dropID + droptype);
    		}
    		
    		break;
    		
    	case 4: 
    		droptype ="wither_boss";
    		
        	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "Hope you were ready to fight the wither!"));
    		
    		witherEntity.setPosition(player.posX, player.posY+2,player.posZ+2); //These are the coordinates where he will appear 
		       world.spawnEntityInWorld(witherEntity);
    		
    		if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case , " + dropID + droptype);
    		}
    		break;
    		
    	case 5: 
    		droptype ="creeper_horde";
    		
        	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "I hear creepers"));

        	for (int h = 0; h < 25; h++) {
        		
        		int min = 5;
        		int max = 25;
        		int randPosX = rand.nextInt((max - min) + 1) + min;
        		int randPosY = rand.nextInt((max - min) + 1) + min;
        		
	        	
	        	creeperEntity.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
	 		       world.spawnEntityInWorld(creeperEntity);
        	}
        	
    		
    		if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case , " + dropID + droptype);
    		}
    		break;
    		
    	case 6: 
    		droptype ="zombie_horde";
    		
        	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "BRAINZ!!!"));

        	for (int z = 0; z < 25; z++) {
        		
        		int min = 5;
        		int max = 25;
        		int randPosX = rand.nextInt((max - min) + 1) + min;
        		int randPosY = rand.nextInt((max - min) + 1) + min;
        		
	        	zombieEntity.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
	 		       world.spawnEntityInWorld(zombieEntity);
        	}
        	
    		
    		if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case , " + dropID + droptype);
    		}
    		break;
    		
    	case 7: 
    		droptype ="explode";
    		
        	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "BOOM"));

        	int explodePowerMin = 0;
        	int explodePowerMax = 100;
        	
        	int explodePower = rand.nextInt((explodePowerMax - explodePowerMin) + 1) + explodePowerMin;
        	
        	world.createExplosion(player, player.posX, player.posY, player.posZ, explodePower, true);
    		
    		if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case , " + dropID + droptype);
    		}
    		break;
    		
    	case 8: 
    		droptype ="explode_5";
    		
        	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "BOOM"));

        	int explodePowerMin5 = 0;
        	int explodePowerMax5 = 100;
        	
        	for (int ex = 0; ex < 5; ex++) {
        		int explodePower5 = rand.nextInt((explodePowerMax5 - explodePowerMin5) + 1) + explodePowerMin5;
            	
            	world.createExplosion(player, player.posX, player.posY, player.posZ, explodePower5, true);
        	}
        	
    		
    		if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case , " + dropID + droptype);
    		}
    		break;
    		
        	
    	case 9: 
    		droptype ="moo";
    		
        	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.YELLOW + "" + EnumChatFormatting.BOLD + "MOOO!"));

        	cowEntity.setPosition(player.posX, player.posY, player.posZ); //These are the coordinates where he will appear 
		       world.spawnEntityInWorld(cowEntity);
        	
    		
    		if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case , " + dropID + droptype);
    		}
    		break;
    		
        	
    	case 10: 
    		droptype ="living_luckyblock_horde";
    		
        	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "L" + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + "U" + EnumChatFormatting.YELLOW + "" + EnumChatFormatting.BOLD + "C" + EnumChatFormatting.GREEN + "" + EnumChatFormatting.BOLD + "K" + EnumChatFormatting.BLUE + "" + EnumChatFormatting.BOLD + "Y" + " " + EnumChatFormatting.LIGHT_PURPLE + "" + EnumChatFormatting.BOLD + "B" + EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + "L" + EnumChatFormatting.DARK_GREEN + "" + EnumChatFormatting.BOLD + "O" + EnumChatFormatting.WHITE + "" + EnumChatFormatting.BOLD + "C" + EnumChatFormatting.BLUE + "" + EnumChatFormatting.BOLD + "S" + EnumChatFormatting.GREEN + "" + EnumChatFormatting.BOLD + "!" ));

        	int luckyColorPickerMin = 0;
        	int luckyColorPickerMax = 14;
        	
        	int luckyPosmin = 5;
    		int luckyPosmax = 25;
    		
    		for (int rl = 0; rl < 25; rl++) {
	        	int luckyColorPicker = rand.nextInt((luckyColorPickerMax - luckyColorPickerMin) + 1) + luckyColorPickerMin;
	        	
	        	
	        	switch (luckyColorPicker) {
	        	
	        	case 0:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock livingLuckyBlock = new EntityLivingLuckyBlock(world);

			        	livingLuckyBlock.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlock);
	            	}
	            	
	        		break;
	        		
	        	case 1:
	        		
	     		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Red livingLuckyBlockRed = new EntityLivingLuckyBlock_Red(world);

			        	livingLuckyBlockRed.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockRed);
	            	}
	            	
	        		break;
	        		
	        	case 2:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Green livingLuckyBlockGreen = new EntityLivingLuckyBlock_Green(world);

			        	livingLuckyBlockGreen.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockGreen);
	            	}
	            	
	        		break;
	        		
	        	case 3:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_White livingLuckyBlockWhite = new EntityLivingLuckyBlock_White(world);

			        	livingLuckyBlockWhite.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockWhite);
	            	}
	            	
	        		break;
	        		
	        	case 4:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Orange livingLuckyBlockOrange = new EntityLivingLuckyBlock_Orange(world);

			        	livingLuckyBlockOrange.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockOrange);
	            	}
	            	
	        		break;
	        		
	        	case 5:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Magenta livingLuckyBlockMagenta = new EntityLivingLuckyBlock_Magenta(world);

			        	livingLuckyBlockMagenta.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockMagenta);
	            	}
	            	
	        		break;
	        		
	        	case 6:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_LightBlue livingLuckyBlockLightBlue = new EntityLivingLuckyBlock_LightBlue(world);

			        	livingLuckyBlockLightBlue.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockLightBlue);
	            	}
	            	
	        		break;
	        		
	        	case 7:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Lime livingLuckyBlockLime = new EntityLivingLuckyBlock_Lime(world);

			        	livingLuckyBlockLime.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockLime);
	            	}
	            	
	        		break;
	        		
	        	case 8:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Pink livingLuckyBlockPink = new EntityLivingLuckyBlock_Pink(world);

			        	livingLuckyBlockPink.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockPink);
	            	}
	            	
	        		break;
	        		
	        	case 9:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Grey livingLuckyBlockGrey = new EntityLivingLuckyBlock_Grey(world);

			        	livingLuckyBlockGrey.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockGrey);
	            	}
	            	
	        		break;
	        		
				case 10:
					
					
					for (int l = 0; l < 5; l++) {
				
						int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
						int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
						
			        	EntityLivingLuckyBlock_Cyan livingLuckyBlockCyan = new EntityLivingLuckyBlock_Cyan(world);

				    	livingLuckyBlockCyan.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
						       world.spawnEntityInWorld(livingLuckyBlockCyan);
					}
					
					break;
						
				case 11:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Purple livingLuckyBlockPurple = new EntityLivingLuckyBlock_Purple(world);

			        	livingLuckyBlockPurple.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockPurple);
	            	}
	            	
	        		break;
	        		
				case 12:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Blue livingLuckyBlockBlue = new EntityLivingLuckyBlock_Blue(world);

			        	livingLuckyBlockBlue.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockBlue);
	            	}
	            	
	        		break;
	        		
				case 13:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Brown livingLuckyBlockBrown = new EntityLivingLuckyBlock_Brown(world);

			        	livingLuckyBlockBrown.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockBrown);
	            	}
	            	
	        		break;
	        		
				case 14:
	        		
	        		
	            	for (int l = 0; l < 5; l++) {
	
		        		int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
		        		
			        	EntityLivingLuckyBlock_Black livingLuckyBlockBlack = new EntityLivingLuckyBlock_Black(world);

			        	livingLuckyBlockBlack.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear 
			 		       world.spawnEntityInWorld(livingLuckyBlockBlack);
	            	}
	            	
	        		break;
	        		
	        	default:
	        		break;
	        	}
    		}
    		
    		
    		if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case , " + dropID + droptype);
    		}
    		break;
    		
    	case 11: 
    		droptype ="explode_x";
    		
        	//player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "BOOM"));

        	int explodePowerMinx = 0;
        	int explodePowerMaxx = 100;
        	int explodeCountMin = 5;
        	int explodeCountMax = 25;
        	int explodePosMin = 0;
        	int explodePosMax = 100;
        	
        	int explodeCount = rand.nextInt((explodeCountMax - explodeCountMin) + 1) + explodeCountMin;
        	
        	for (int exx = 0; exx < explodeCount; exx++) {
        		for (int ex = 0; ex < 5; ex++) {
        			int explodePos = rand.nextInt((explodePosMax - explodePosMin) + 1) + explodePosMin;
            		int explodePower5x = rand.nextInt((explodePowerMaxx - explodePowerMinx) + 1) + explodePowerMinx;
                	
                	world.createExplosion(player, player.posX + explodePos, player.posY, player.posZ + explodePos, explodePower5x, true);
            	}
        	}
        	
        	player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "BOOM x " + explodeCount));
    		
    		if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case , " + dropID + droptype);
    		}
    		
    		break;
    		
    		
    	default: 
        	droptype = "Invalid Drop";
        	
        	if(ConfigManager.ENABLE_DEVLOGGING == true) {
    			System.out.println("Case default, " + droptype);
    		}
                 break;
    	}
    	
    }
}

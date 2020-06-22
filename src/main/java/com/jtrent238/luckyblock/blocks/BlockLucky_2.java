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
import com.jtrent238.luckyblock.util.LuckyDropAlgorithm;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.PlayerSelector;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.IIcon;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class BlockLucky_2 extends BlockContainer {

	private String blockName = "BlockLucky_2";

    public mod.lucky.util.SpawnOther spawnOther;
    public mod.lucky.util.SpawnEntity spawnEntity;
    public mod.lucky.util.MakeLuckyDrops makeLuckyDrops;
    private final Random random;
    
	public BlockLucky_2(Material material, String blockName, String blockColor) {
		super(material);
		this.setCreativeTab(Main.tab_LuckyBlock);
		this.setBlockTextureName(Main.MODID + ":" + blockName);
		this.setBlockName(blockName);
		this.setHardness(0.5F);
        this.random = new Random();
        this.spawnEntity = new mod.lucky.util.SpawnEntity();
        this.spawnOther = new mod.lucky.util.SpawnOther();
        this.makeLuckyDrops = new mod.lucky.util.MakeLuckyDrops();
	}

	public boolean enableStats(){
		
		return true;
	}
	
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        return this.getIcon(p_149673_5_, p_149673_1_.getBlockMetadata(p_149673_2_, p_149673_3_, p_149673_4_));
    }
    
    
	 /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return this.blockIcon;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName());
    }
    
    public void doDrop(final mod.lucky.drop.LuckyDrop[] v16, final World v15, final EntityPlayer v14, final Random v13, final int v12, final int v11, final int v10) {
    	try {
            /*SL:152*/this.spawnEntity.setRandom(v13);
            /*SL:155*/for (int n = 0; v16[n] != null; /*SL:240*/++n) {
                final mod.lucky.drop.LuckyDrop luckyDrop = v16[n];
                if (luckyDrop.getType().equals("entity")) {
                    this.spawnEntity.spawnEntity(v15, v14, luckyDrop);
                }
                else if (luckyDrop.getType().equals("sound")) {
                    v15.playSoundAtEntity((Entity)v14, luckyDrop.getId(), 3.0f, 1.0f);
                }
                else if (luckyDrop.getType().equals("command")) {
                    final mod.lucky.command.LuckyCommandLogic a7 = new mod.lucky.command.LuckyCommandLogic();
                    a7.setWorld(v15);
                    a7.setCommandCoordinates(new ChunkCoordinates(luckyDrop.getPosX(), luckyDrop.getPosY(), luckyDrop.getPosZ()));
                    a7.setCommand(luckyDrop.getId());
                    a7.setCommandSender(luckyDrop.getCommandSender());
                    a7.setDoOutput(luckyDrop.getDisplayCommandOutput());
                    a7.executeCommand();
                }
                else if (luckyDrop.getType().equals("message")) {
                    MinecraftServer.getServer().addChatMessage((IChatComponent)new ChatComponentText(luckyDrop.getId()));
                }
                else if (luckyDrop.getType().equals("particle") || luckyDrop.getType().equals("block") || luckyDrop.getType().equals("structure") || luckyDrop.getType().equals("falling_block")) {
                    this.spawnOther.spawnOther(v15, v14, v13, luckyDrop);
                }
                
            }
        }
        catch (Exception ex) {
            System.err.println(/*EL:245*/"The Lucky Block encountered and error while trying to perform a function. Error report below:");
            /*SL:246*/ex.printStackTrace();
        }
    }
    
    public Item func_149650_a(final int a1, final Random a2, final int a3) {
        /*SL:253*/return null;
    }
    
    public TileEntity createNewTileEntity(final World a1, final int a2) {
        /*SL:272*/return new mod.lucky.tileentity.TileEntityLuckyBlock();
    }

    
}

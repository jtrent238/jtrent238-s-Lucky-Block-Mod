package com.jtrent238.luckyblock;


import com.jtrent238.luckyblock.proxy.CommonProxy;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;


@Mod(modid=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION))
public class Main
{

	
	@SidedProxy(clientSide="com.jtrent238.luckyblock.proxy.ClientProxy", serverSide="com.jtrent238.luckyblock.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "luckyblock";

	@Instance(MODID)
    public static Main instance;
	public static final String MODVERSION = "1.0.0.3";
	public static final String MODNAME = "jtrent238's Lucky Block Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";

	public static boolean isLuckyBlockInstalled = false;
	public static boolean LuckyOveride = false;
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	


@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	ConfigManager.Manage(event);
	
	//Check if Lucky Is Override
	if (ConfigManager.LUCKY_OVERRIDE == true) {
		LuckyOveride = true;
	} else if(ConfigManager.LUCKY_OVERRIDE == false) {
		LuckyOveride = false;
	}
}



@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	
	if(Loader.isModLoaded("lucky")) {
		isLuckyBlockInstalled = true;
	} if(Loader.isModLoaded("lucky") == false) {
		isLuckyBlockInstalled = false;
	}
	
	/*REMOVE BEFORE RELEASE*/ 
	//isLuckyBlockInstalled = false;
	
	ItemLoader.LoadItems();
	BlockLoader.loadBlocks();
	Recipes.registerRecpies();
	//EntityLoader.LoadEntitys();
	//OreDict.addores();
	//Achievements.loadAchievements();
	//Stats.RegisterStats();

	//PlayerChecker.checkPlayer(username);
	LootRegistry.registerLoot();
	
}


public static CreativeTabs tab_LuckyBlock = new CreativeTabs("tab_LuckyBlock")

{
	public Item getTabIconItem() {

		Block tabItem = null;
		
		if(isLuckyBlockInstalled == true) {
			tabItem = mod.lucky.Lucky.lucky_block;
		} else if(isLuckyBlockInstalled == false) {
			tabItem = BlockLoader.BlockLucky;
		}
		return new ItemStack(tabItem).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	/*
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "EpicProportionsMod_Halloween.png";
	}
	
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	*/
	};
;

@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		
	    Recipes.registerRecpies();

	    
	}
	
	
}


@EventHandler
public void serverStart(FMLServerStartingEvent event)
{
     MinecraftServer server = MinecraftServer.getServer();
     // Get's the current server instance
     
     ICommandManager command = server.getCommandManager();
     ServerCommandManager manager = (ServerCommandManager) command;
     
     //manager.registerCommand(new CommandModInfo());
     //manager.registerCommand(new CommandChangelog());
     //manager.registerCommand(new CommandAbilities());
}

					
}
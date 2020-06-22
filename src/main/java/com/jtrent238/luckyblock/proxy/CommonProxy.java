package com.jtrent238.luckyblock.proxy;

import com.jtrent238.luckyblock.EntityLoader;
import com.jtrent238.luckyblock.Main;
import com.jtrent238.luckyblock.structures.LuckyStructure;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	
	private static final String modid = Main.MODID;
	private String owner;

	public void init(FMLInitializationEvent e) {
		
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
	    
	}

	
}
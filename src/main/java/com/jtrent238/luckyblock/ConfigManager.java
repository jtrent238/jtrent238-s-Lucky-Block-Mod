package com.jtrent238.luckyblock;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigManager {

	private static String CATEGORY_GENERAL = "General";
	public static boolean LUCKY_OVERRIDE;
	public static boolean ENABLE_CRAFTING;
	public static boolean ENABLE_LOOT;
	public static int LUCKY_MULTIPLIER;
	public static int LUCKY_TRADER_ID;

	public static void Manage(FMLPreInitializationEvent event) {


		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		event.getModConfigurationDirectory();
		event.getModConfigurationDirectory();
		event.getModLog();
		event.getModMetadata();
		event.getModState();
		event.getSide();
		event.getVersionProperties();
		
		/*
		 * Config Start
		 */
		
		LUCKY_OVERRIDE = config.get(CATEGORY_GENERAL, "LuckyOveride", false).getBoolean(false);
		ENABLE_CRAFTING = config.get(CATEGORY_GENERAL, "enableCrafting", true).getBoolean(false);
		ENABLE_LOOT = config.get(CATEGORY_GENERAL, "enableLoot", true).getBoolean(false);
		LUCKY_MULTIPLIER = config.getInt("luckyMultiplier", CATEGORY_GENERAL, 100, 1, 65535, "How strong are the tools, weapons, and armor. (Diamond * LUCKY_MULTIPLIER)");
		LUCKY_TRADER_ID = config.getInt("luckyTraderID", CATEGORY_GENERAL, 29626, 60, 30000, "");
		
		/*
		 * Config Stop
		 */
		config.load();
		config.getLoadedConfigVersion();
		
		config.save();
		
		event.getModLog();
		event.getModState();
		//Configuration configFile = new Configuration(event.getSuggestedConfigurationFile());
		
		//loadConfiguration(configFile);
		
		System.out.println(Main.MODID + " >>> Configuration File Loaded");
	}

}

package com.jtrent238.luckyblock;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigManager {

	private static String CATEGORY_GENERAL = "General";
	public static boolean LUCKY_OVERRIDE;

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

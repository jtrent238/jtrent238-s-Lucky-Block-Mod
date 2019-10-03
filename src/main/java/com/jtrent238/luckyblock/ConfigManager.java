package com.jtrent238.luckyblock;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigManager {

	private static int minEntityID = 60;
	private static int maxEntityID = 65535;
	
	private static String CATEGORY_GENERAL = "General";
	//private static String CATEGORY_ENTITY_IDS = "EntityIds";
	
	public static boolean LUCKY_OVERRIDE;
	public static boolean ENABLE_CRAFTING;
	public static boolean ENABLE_LOOT;
	
	public static int LUCKY_MULTIPLIER;
	public static int LUCKY_TRADER_ID;
	
	public static int LIVING_LUCKY_ID;
	public static int LIVING_LUCKY_ID_BLACK;
	public static int LIVING_LUCKY_ID_BLUE;
	public static int LIVING_LUCKY_ID_BROWN;
	public static int LIVING_LUCKY_ID_CYAN;
	public static int LIVING_LUCKY_ID_GREEN;
	public static int LIVING_LUCKY_ID_GREY;
	public static int LIVING_LUCKY_ID_LIGHTBLUE;
	public static int LIVING_LUCKY_ID_LIME;
	public static int LIVING_LUCKY_ID_MAGENTA;
	public static int LIVING_LUCKY_ID_ORANGE;
	public static int LIVING_LUCKY_ID_PINK;
	public static int LIVING_LUCKY_ID_PURPLE;
	public static int LIVING_LUCKY_ID_RED;
	public static int LIVING_LUCKY_ID_WHITE;


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
		
		
//		LIVING_LUCKY_ID = config.getInt("EntityLivingLuckyBlock", CATEGORY_ENTITY_IDS, 29451, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_BLACK = config.getInt("EntityLivingLuckyBlock_Black", CATEGORY_ENTITY_IDS, 29451, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_BLUE = config.getInt("EntityLivingLuckyBlock_Blue", CATEGORY_ENTITY_IDS, 29452, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_BROWN = config.getInt("EntityLivingLuckyBlock_Brown", CATEGORY_ENTITY_IDS, 29453, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_CYAN = config.getInt("EntityLivingLuckyBlock_Cyan", CATEGORY_ENTITY_IDS, 29454, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_GREEN = config.getInt("EntityLivingLuckyBlock_Green", CATEGORY_ENTITY_IDS, 29455, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_GREY = config.getInt("EntityLivingLuckyBlock_Grey", CATEGORY_ENTITY_IDS, 29456, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_LIGHTBLUE = config.getInt("EntityLivingLuckyBlock_LightBlue", CATEGORY_ENTITY_IDS, 29457, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_LIME = config.getInt("EntityLivingLuckyBlock_Lime", CATEGORY_ENTITY_IDS, 29458, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_MAGENTA = config.getInt("EntityLivingLuckyBlock_Magenta", CATEGORY_ENTITY_IDS, 29459, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_ORANGE = config.getInt("EntityLivingLuckyBlock_Orange", CATEGORY_ENTITY_IDS, 29460, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_PINK = config.getInt("EntityLivingLuckyBlock_Pink", CATEGORY_ENTITY_IDS, 29461, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_PURPLE = config.getInt("EntityLivingLuckyBlock_Purple", CATEGORY_ENTITY_IDS, 29462, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_RED = config.getInt("EntityLivingLuckyBlock_Red", CATEGORY_ENTITY_IDS, 29463, minEntityID, maxEntityID, "");
//		LIVING_LUCKY_ID_WHITE = config.getInt("EntityLivingLuckyBlock_White", CATEGORY_ENTITY_IDS, 29464, minEntityID, maxEntityID, "");
		
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
		
//		if(true) {
//			System.out.println("Config:");
//			System.out.println("general {");
//			System.out.println("    B:LuckyOveride=" + LUCKY_OVERRIDE);
//			System.out.println("    B:enableCrafting=" + ENABLE_CRAFTING);
//			System.out.println("    B:enableLoot=" + ENABLE_LOOT);
//			System.out.println("    I:luckyMultiplier=" + LUCKY_MULTIPLIER);
//			System.out.println("    I:luckyTraderID=" + LUCKY_TRADER_ID);
//			System.out.println("}");
//			System.out.println("");
//			System.out.println("entityids {");
//			System.out.println("   	I:EntityLivingLuckyBlock=" + LIVING_LUCKY_ID);
//			System.out.println("   	I:EntityLivingLuckyBlock_Black=" + LIVING_LUCKY_ID_BLACK);
//			System.out.println("   	I:EntityLivingLuckyBlock_Blue=" + LIVING_LUCKY_ID_BLUE);
//			System.out.println("   	I:EntityLivingLuckyBlock_Brown=" + LIVING_LUCKY_ID_BROWN);
//			System.out.println("   	I:EntityLivingLuckyBlock_Cyan=" + LIVING_LUCKY_ID_CYAN);
//			System.out.println("   	I:EntityLivingLuckyBlock_Green=" + LIVING_LUCKY_ID_GREEN);
//			System.out.println("   	I:EntityLivingLuckyBlock_Grey=" + LIVING_LUCKY_ID_GREY);
//			System.out.println("   	I:EntityLivingLuckyBlock_LightBlue=" + LIVING_LUCKY_ID_LIGHTBLUE);
//			System.out.println("   	I:EntityLivingLuckyBlock_Lime=" + LIVING_LUCKY_ID_LIME);
//			System.out.println("   	I:EntityLivingLuckyBlock_Magenta=" + LIVING_LUCKY_ID_MAGENTA);
//			System.out.println("   	I:EntityLivingLuckyBlock_Orange=" + LIVING_LUCKY_ID_ORANGE);
//			System.out.println("   	I:EntityLivingLuckyBlock_Pink=" + LIVING_LUCKY_ID_PINK);
//			System.out.println("   	I:EntityLivingLuckyBlock_Purple=" + LIVING_LUCKY_ID_PURPLE);
//			System.out.println("   	I:EntityLivingLuckyBlock_Red=" + LIVING_LUCKY_ID_RED);
//			System.out.println("   	I:EntityLivingLuckyBlock_White=" + LIVING_LUCKY_ID_WHITE);
//			System.out.println("}");
//		}
		
		
		System.out.println(Main.MODID + " >>> Configuration File Loaded");
	}

}

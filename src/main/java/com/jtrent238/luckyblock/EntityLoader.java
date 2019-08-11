package com.jtrent238.luckyblock;


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

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLoader {

	public static int livingLuckySpawn_min = 1;
	public static int livingLuckySpawn_max = 4;
	public static int livingLuckySpawn_wProb = 6;
	
	public static void LoadEntitys() {

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock.class, "EntityLivingLuckyBlock",EntityRegistry.findGlobalUniqueEntityId(), 0xfcba03, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Red.class, "EntityLivingLuckyBlock_Red",EntityRegistry.findGlobalUniqueEntityId(), 0xff0000, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Red.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_White.class, "EntityLivingLuckyBlock_White",EntityRegistry.findGlobalUniqueEntityId(), 0xffffff, 0xbab5b5);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_White.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Purple.class, "EntityLivingLuckyBlock_Purple",EntityRegistry.findGlobalUniqueEntityId(), 0x9b0ac7, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Purple.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Pink.class, "EntityLivingLuckyBlock_Pink",EntityRegistry.findGlobalUniqueEntityId(), 0xff9eda, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Pink.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Orange.class, "EntityLivingLuckyBlock_Orange",EntityRegistry.findGlobalUniqueEntityId(), 0xff8800, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Orange.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Magenta.class, "EntityLivingLuckyBlock_Magenta",EntityRegistry.findGlobalUniqueEntityId(), 0xc41da9, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Magenta.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Lime.class, "EntityLivingLuckyBlock_Lime",EntityRegistry.findGlobalUniqueEntityId(), 0x4fe300, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Lime.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_LightBlue.class, "EntityLivingLuckyBlock_LightBlue",EntityRegistry.findGlobalUniqueEntityId(), 0x07dfeb, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_LightBlue.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Grey.class, "EntityLivingLuckyBlock_Grey",EntityRegistry.findGlobalUniqueEntityId(), 0x777a7a, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Grey.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Green.class, "EntityLivingLuckyBlock_Green",EntityRegistry.findGlobalUniqueEntityId(), 0x186900, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Green.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Cyan.class, "EntityLivingLuckyBlock_Cyan",EntityRegistry.findGlobalUniqueEntityId(), 0x02d4b8, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Cyan.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Brown.class, "EntityLivingLuckyBlock_Brown",EntityRegistry.findGlobalUniqueEntityId(), 0x784e30, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Brown.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Blue.class, "EntityLivingLuckyBlock_Blue",EntityRegistry.findGlobalUniqueEntityId(), 0x0633d6, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Blue.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    EntityRegistry.registerGlobalEntityID(EntityLivingLuckyBlock_Black.class, "EntityLivingLuckyBlock_Black",EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xfffefa);
	    EntityRegistry.addSpawn(EntityLivingLuckyBlock_Black.class, livingLuckySpawn_wProb, livingLuckySpawn_min, livingLuckySpawn_max, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    VillagerRegistry.instance().registerVillagerId(ConfigManager.LUCKY_TRADER_ID);
    	VillagerRegistry.instance().registerVillageTradeHandler(ConfigManager.LUCKY_TRADER_ID, new TradeHandler());
    	VillagerRegistry.instance().getRegisteredVillagers(); 
    	VillagerRegistry.instance().getClass();
	    
	}

}

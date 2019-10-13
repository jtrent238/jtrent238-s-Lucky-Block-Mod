package com.jtrent238.luckyblock;

import com.jtrent238.luckyblock.items.armor.ArmorLucky;
import com.jtrent238.luckyblock.items.materials.ItemShardLucky;
import com.jtrent238.luckyblock.items.tools.AxeLucky;
import com.jtrent238.luckyblock.items.tools.HoeLucky;
import com.jtrent238.luckyblock.items.tools.MultiLucky;
import com.jtrent238.luckyblock.items.tools.PickLucky;
import com.jtrent238.luckyblock.items.tools.ShovelLucky;
import com.jtrent238.luckyblock.items.tools.SwordLucky;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemLoader {

	public static SwordLucky SwordLucky;
	public static SwordLucky SwordLucky_Red;
	public static SwordLucky SwordLucky_White;
	public static SwordLucky SwordLucky_Purple;
	public static SwordLucky SwordLucky_Pink;
	public static SwordLucky SwordLucky_Orange;
	public static SwordLucky SwordLucky_Magenta;
	public static SwordLucky SwordLucky_Lime;
	public static SwordLucky SwordLucky_LightBlue;
	public static SwordLucky SwordLucky_Grey;
	public static SwordLucky SwordLucky_Green;
	public static SwordLucky SwordLucky_Cyan;
	public static SwordLucky SwordLucky_Brown;
	public static SwordLucky SwordLucky_Blue;
	public static SwordLucky SwordLucky_Black;
	
	public static PickLucky PickLucky;
	public static PickLucky PickLucky_Red;
	public static PickLucky PickLucky_White;
	public static PickLucky PickLucky_Purple;
	public static PickLucky PickLucky_Pink;
	public static PickLucky PickLucky_Orange;
	public static PickLucky PickLucky_Magenta;
	public static PickLucky PickLucky_Lime;
	public static PickLucky PickLucky_LightBlue;
	public static PickLucky PickLucky_Grey;
	public static PickLucky PickLucky_Green;
	public static PickLucky PickLucky_Cyan;
	public static PickLucky PickLucky_Brown;
	public static PickLucky PickLucky_Blue;
	public static PickLucky PickLucky_Black;
	
	public static ShovelLucky ShovelLucky;
	public static ShovelLucky ShovelLucky_Red;
	public static ShovelLucky ShovelLucky_White;
	public static ShovelLucky ShovelLucky_Purple;
	public static ShovelLucky ShovelLucky_Pink;
	public static ShovelLucky ShovelLucky_Orange;
	public static ShovelLucky ShovelLucky_Magenta;
	public static ShovelLucky ShovelLucky_Lime;
	public static ShovelLucky ShovelLucky_LightBlue;
	public static ShovelLucky ShovelLucky_Grey;
	public static ShovelLucky ShovelLucky_Green;
	public static ShovelLucky ShovelLucky_Cyan;
	public static ShovelLucky ShovelLucky_Brown;
	public static ShovelLucky ShovelLucky_Blue;
	public static ShovelLucky ShovelLucky_Black;
	
	public static AxeLucky AxeLucky;
	public static AxeLucky AxeLucky_Red;
	public static AxeLucky AxeLucky_White;
	public static AxeLucky AxeLucky_Purple;
	public static AxeLucky AxeLucky_Pink;
	public static AxeLucky AxeLucky_Orange;
	public static AxeLucky AxeLucky_Magenta;
	public static AxeLucky AxeLucky_Lime;
	public static AxeLucky AxeLucky_LightBlue;
	public static AxeLucky AxeLucky_Grey;
	public static AxeLucky AxeLucky_Green;
	public static AxeLucky AxeLucky_Cyan;
	public static AxeLucky AxeLucky_Brown;
	public static AxeLucky AxeLucky_Blue;
	public static AxeLucky AxeLucky_Black;
	
	public static HoeLucky HoeLucky;
	public static HoeLucky HoeLucky_Red;
	public static HoeLucky HoeLucky_White;
	public static HoeLucky HoeLucky_Purple;
	public static HoeLucky HoeLucky_Pink;
	public static HoeLucky HoeLucky_Orange;
	public static HoeLucky HoeLucky_Magenta;
	public static HoeLucky HoeLucky_Lime;
	public static HoeLucky HoeLucky_LightBlue;
	public static HoeLucky HoeLucky_Grey;
	public static HoeLucky HoeLucky_Green;
	public static HoeLucky HoeLucky_Cyan;
	public static HoeLucky HoeLucky_Brown;
	public static HoeLucky HoeLucky_Blue;
	public static HoeLucky HoeLucky_Black;
	
	public static MultiLucky MultiLucky;
	public static MultiLucky MultiLucky_Red;
	public static MultiLucky MultiLucky_White;
	public static MultiLucky MultiLucky_Purple;
	public static MultiLucky MultiLucky_Pink;
	public static MultiLucky MultiLucky_Orange;
	public static MultiLucky MultiLucky_Magenta;
	public static MultiLucky MultiLucky_Lime;
	public static MultiLucky MultiLucky_LightBlue;
	public static MultiLucky MultiLucky_Grey;
	public static MultiLucky MultiLucky_Green;
	public static MultiLucky MultiLucky_Cyan;
	public static MultiLucky MultiLucky_Brown;
	public static MultiLucky MultiLucky_Blue;
	public static MultiLucky MultiLucky_Black;
	
	public static Item HelmentLucky;
	public static Item HelmentLucky_Red;
	public static Item HelmentLucky_White;
	public static Item HelmentLucky_Purple;
	public static Item HelmentLucky_Pink;
	public static Item HelmentLucky_Orange;
	public static Item HelmentLucky_Magenta;
	public static Item HelmentLucky_Lime;
	public static Item HelmentLucky_LightBlue;
	public static Item HelmentLucky_Grey;
	public static Item HelmentLucky_Green;
	public static Item HelmentLucky_Cyan;
	public static Item HelmentLucky_Brown;
	public static Item HelmentLucky_Blue;
	public static Item HelmentLucky_Black;
	
	public static Item ChestplateLucky;
	public static Item ChestplateLucky_Red;
	public static Item ChestplateLucky_White;
	public static Item ChestplateLucky_Purple;
	public static Item ChestplateLucky_Pink;
	public static Item ChestplateLucky_Orange;
	public static Item ChestplateLucky_Magenta;
	public static Item ChestplateLucky_Lime;
	public static Item ChestplateLucky_LightBlue;
	public static Item ChestplateLucky_Grey;
	public static Item ChestplateLucky_Green;
	public static Item ChestplateLucky_Cyan;
	public static Item ChestplateLucky_Brown;
	public static Item ChestplateLucky_Blue;
	public static Item ChestplateLucky_Black;
	
	public static Item LeggingsLucky;
	public static Item LeggingsLucky_Red;
	public static Item LeggingsLucky_White;
	public static Item LeggingsLucky_Purple;
	public static Item LeggingsLucky_Pink;
	public static Item LeggingsLucky_Orange;
	public static Item LeggingsLucky_Magenta;
	public static Item LeggingsLucky_Lime;
	public static Item LeggingsLucky_LightBlue;
	public static Item LeggingsLucky_Grey;
	public static Item LeggingsLucky_Green;
	public static Item LeggingsLucky_Cyan;
	public static Item LeggingsLucky_Brown;
	public static Item LeggingsLucky_Blue;
	public static Item LeggingsLucky_Black;
	
	public static Item BootsLucky;
	public static Item BootsLucky_Red;
	public static Item BootsLucky_White;
	public static Item BootsLucky_Purple;
	public static Item BootsLucky_Pink;
	public static Item BootsLucky_Orange;
	public static Item BootsLucky_Magenta;
	public static Item BootsLucky_Lime;
	public static Item BootsLucky_LightBlue;
	public static Item BootsLucky_Grey;
	public static Item BootsLucky_Green;
	public static Item BootsLucky_Cyan;
	public static Item BootsLucky_Brown;
	public static Item BootsLucky_Blue;
	public static Item BootsLucky_Black;
	
	public static ItemShardLucky ShardLucky;
	public static ItemShardLucky ShardLucky_Red;
	public static ItemShardLucky ShardLucky_White;
	public static ItemShardLucky ShardLucky_Purple;
	public static ItemShardLucky ShardLucky_Pink;
	public static ItemShardLucky ShardLucky_Orange;
	public static ItemShardLucky ShardLucky_Magenta;
	public static ItemShardLucky ShardLucky_Lime;
	public static ItemShardLucky ShardLucky_LightBlue;
	public static ItemShardLucky ShardLucky_Grey;
	public static ItemShardLucky ShardLucky_Green;
	public static ItemShardLucky ShardLucky_Cyan;
	public static ItemShardLucky ShardLucky_Brown;
	public static ItemShardLucky ShardLucky_Blue;
	public static ItemShardLucky ShardLucky_Black;
	
	private static int LUCKY_MULTIPLIER = ConfigManager.LUCKY_MULTIPLIER;
	
	public static ToolMaterial toolMaterial_Lucky = EnumHelper.addToolMaterial("toolMaterial_Lucky", 3 * LUCKY_MULTIPLIER, 1561 * LUCKY_MULTIPLIER, 8.0F * LUCKY_MULTIPLIER, 3.0F * LUCKY_MULTIPLIER, 10 * LUCKY_MULTIPLIER);
	public static ArmorMaterial armorMaterial_Lucky = EnumHelper.addArmorMaterial("armorMaterial_Lucky", 16, new int[] {3 * LUCKY_MULTIPLIER, 8 * LUCKY_MULTIPLIER, 6 * LUCKY_MULTIPLIER, 3 * LUCKY_MULTIPLIER}, 30 * LUCKY_MULTIPLIER);


	/**
	 * Load Items.
	 */
	public static void LoadItems() {
	
		SwordLucky = new SwordLucky(toolMaterial_Lucky, "yellow");
		SwordLucky_Red = new SwordLucky(toolMaterial_Lucky, "red");
		SwordLucky_White = new SwordLucky(toolMaterial_Lucky, "white");
		SwordLucky_Purple = new SwordLucky(toolMaterial_Lucky, "purple");
		SwordLucky_Pink = new SwordLucky(toolMaterial_Lucky, "pink");
		SwordLucky_Orange = new SwordLucky(toolMaterial_Lucky, "orange");
		SwordLucky_Magenta = new SwordLucky(toolMaterial_Lucky, "magenta");
		SwordLucky_Lime = new SwordLucky(toolMaterial_Lucky, "lime");
		SwordLucky_LightBlue = new SwordLucky(toolMaterial_Lucky, "light_blue");
		SwordLucky_Grey = new SwordLucky(toolMaterial_Lucky, "grey");
		SwordLucky_Green = new SwordLucky(toolMaterial_Lucky, "green");
		SwordLucky_Cyan = new SwordLucky(toolMaterial_Lucky, "cyan");
		SwordLucky_Brown = new SwordLucky(toolMaterial_Lucky, "brown");
		SwordLucky_Blue = new SwordLucky(toolMaterial_Lucky, "blue");
		SwordLucky_Black = new SwordLucky(toolMaterial_Lucky, "black");
		
		PickLucky = new PickLucky(toolMaterial_Lucky, "yellow");
		PickLucky_Red = new PickLucky(toolMaterial_Lucky, "red");
		PickLucky_White = new PickLucky(toolMaterial_Lucky, "white");
		PickLucky_Purple = new PickLucky(toolMaterial_Lucky, "purple");
		PickLucky_Pink = new PickLucky(toolMaterial_Lucky, "pink");
		PickLucky_Orange = new PickLucky(toolMaterial_Lucky, "orange");
		PickLucky_Magenta = new PickLucky(toolMaterial_Lucky, "magenta");
		PickLucky_Lime = new PickLucky(toolMaterial_Lucky, "lime");
		PickLucky_LightBlue = new PickLucky(toolMaterial_Lucky, "light_blue");
		PickLucky_Grey = new PickLucky(toolMaterial_Lucky, "grey");
		PickLucky_Green = new PickLucky(toolMaterial_Lucky, "green");
		PickLucky_Cyan = new PickLucky(toolMaterial_Lucky, "cyan");
		PickLucky_Brown = new PickLucky(toolMaterial_Lucky, "brown");
		PickLucky_Blue = new PickLucky(toolMaterial_Lucky, "blue");
		PickLucky_Black = new PickLucky(toolMaterial_Lucky, "black");
		PickLucky_Purple = new PickLucky(toolMaterial_Lucky, "purple");
		
		ShovelLucky = new ShovelLucky(toolMaterial_Lucky, "yellow");
		ShovelLucky_Red = new ShovelLucky(toolMaterial_Lucky, "red");
		ShovelLucky_White = new ShovelLucky(toolMaterial_Lucky, "white");
		ShovelLucky_Purple = new ShovelLucky(toolMaterial_Lucky, "purple");
		ShovelLucky_Pink = new ShovelLucky(toolMaterial_Lucky, "pink");
		ShovelLucky_Orange = new ShovelLucky(toolMaterial_Lucky, "orange");
		ShovelLucky_Magenta = new ShovelLucky(toolMaterial_Lucky, "magenta");
		ShovelLucky_Lime = new ShovelLucky(toolMaterial_Lucky, "lime");
		ShovelLucky_LightBlue = new ShovelLucky(toolMaterial_Lucky, "light_blue");
		ShovelLucky_Grey = new ShovelLucky(toolMaterial_Lucky, "grey");
		ShovelLucky_Green = new ShovelLucky(toolMaterial_Lucky, "green");
		ShovelLucky_Cyan = new ShovelLucky(toolMaterial_Lucky, "cyan");
		ShovelLucky_Brown = new ShovelLucky(toolMaterial_Lucky, "brown");
		ShovelLucky_Blue = new ShovelLucky(toolMaterial_Lucky, "blue");
		ShovelLucky_Black = new ShovelLucky(toolMaterial_Lucky, "black");
		ShovelLucky_Purple = new ShovelLucky(toolMaterial_Lucky, "purple");
		
		AxeLucky = new AxeLucky(toolMaterial_Lucky, "yellow");
		AxeLucky_Red = new AxeLucky(toolMaterial_Lucky, "red");
		AxeLucky_White = new AxeLucky(toolMaterial_Lucky, "white");
		AxeLucky_Purple = new AxeLucky(toolMaterial_Lucky, "purple");
		AxeLucky_Pink = new AxeLucky(toolMaterial_Lucky, "pink");
		AxeLucky_Orange = new AxeLucky(toolMaterial_Lucky, "orange");
		AxeLucky_Magenta = new AxeLucky(toolMaterial_Lucky, "magenta");
		AxeLucky_Lime = new AxeLucky(toolMaterial_Lucky, "lime");
		AxeLucky_LightBlue = new AxeLucky(toolMaterial_Lucky, "light_blue");
		AxeLucky_Grey = new AxeLucky(toolMaterial_Lucky, "grey");
		AxeLucky_Green = new AxeLucky(toolMaterial_Lucky, "green");
		AxeLucky_Cyan = new AxeLucky(toolMaterial_Lucky, "cyan");
		AxeLucky_Brown = new AxeLucky(toolMaterial_Lucky, "brown");
		AxeLucky_Blue = new AxeLucky(toolMaterial_Lucky, "blue");
		AxeLucky_Black = new AxeLucky(toolMaterial_Lucky, "black");
		AxeLucky_Purple = new AxeLucky(toolMaterial_Lucky, "purple");
		
		HoeLucky = new HoeLucky(toolMaterial_Lucky, "yellow");
		HoeLucky_Red = new HoeLucky(toolMaterial_Lucky, "red");
		HoeLucky_White = new HoeLucky(toolMaterial_Lucky, "white");
		HoeLucky_Purple = new HoeLucky(toolMaterial_Lucky, "purple");
		HoeLucky_Pink = new HoeLucky(toolMaterial_Lucky, "pink");
		HoeLucky_Orange = new HoeLucky(toolMaterial_Lucky, "orange");
		HoeLucky_Magenta = new HoeLucky(toolMaterial_Lucky, "magenta");
		HoeLucky_Lime = new HoeLucky(toolMaterial_Lucky, "lime");
		HoeLucky_LightBlue = new HoeLucky(toolMaterial_Lucky, "light_blue");
		HoeLucky_Grey = new HoeLucky(toolMaterial_Lucky, "grey");
		HoeLucky_Green = new HoeLucky(toolMaterial_Lucky, "green");
		HoeLucky_Cyan = new HoeLucky(toolMaterial_Lucky, "cyan");
		HoeLucky_Brown = new HoeLucky(toolMaterial_Lucky, "brown");
		HoeLucky_Blue = new HoeLucky(toolMaterial_Lucky, "blue");
		HoeLucky_Black = new HoeLucky(toolMaterial_Lucky, "black");
		HoeLucky_Purple = new HoeLucky(toolMaterial_Lucky, "purple");
		
		MultiLucky = new MultiLucky(toolMaterial_Lucky, "yellow");
		MultiLucky_Red = new MultiLucky(toolMaterial_Lucky, "red");
		MultiLucky_White = new MultiLucky(toolMaterial_Lucky, "white");
		MultiLucky_Purple = new MultiLucky(toolMaterial_Lucky, "purple");
		MultiLucky_Pink = new MultiLucky(toolMaterial_Lucky, "pink");
		MultiLucky_Orange = new MultiLucky(toolMaterial_Lucky, "orange");
		MultiLucky_Magenta = new MultiLucky(toolMaterial_Lucky, "magenta");
		MultiLucky_Lime = new MultiLucky(toolMaterial_Lucky, "lime");
		MultiLucky_LightBlue = new MultiLucky(toolMaterial_Lucky, "light_blue");
		MultiLucky_Grey = new MultiLucky(toolMaterial_Lucky, "grey");
		MultiLucky_Green = new MultiLucky(toolMaterial_Lucky, "green");
		MultiLucky_Cyan = new MultiLucky(toolMaterial_Lucky, "cyan");
		MultiLucky_Brown = new MultiLucky(toolMaterial_Lucky, "brown");
		MultiLucky_Blue = new MultiLucky(toolMaterial_Lucky, "blue");
		MultiLucky_Black = new MultiLucky(toolMaterial_Lucky, "black");

		HelmentLucky = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky").setTextureName(Main.MODID + ":HelmentLucky").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky").setTextureName(Main.MODID + ":ChestplateLucky").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky").setTextureName(Main.MODID + ":LeggingsLucky").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky").setTextureName(Main.MODID + ":BootsLucky").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Red = new ArmorLucky(armorMaterial_Lucky, 0, 0, "red").setUnlocalizedName("HelmentLucky_Red").setTextureName(Main.MODID + ":HelmentLucky_Red").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Red = new ArmorLucky(armorMaterial_Lucky, 1, 1, "red").setUnlocalizedName("ChestplateLucky_Red").setTextureName(Main.MODID + ":ChestplateLucky_Red").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Red = new ArmorLucky(armorMaterial_Lucky, 2, 2, "red").setUnlocalizedName("LeggingsLucky_Red").setTextureName(Main.MODID + ":LeggingsLucky_Red").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Red = new ArmorLucky(armorMaterial_Lucky, 3, 3, "red").setUnlocalizedName("BootsLucky_Red").setTextureName(Main.MODID + ":BootsLucky_Red").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_White = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_White").setTextureName(Main.MODID + ":HelmentLucky_White").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_White = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_White").setTextureName(Main.MODID + ":ChestplateLucky_White").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_White = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_White").setTextureName(Main.MODID + ":LeggingsLucky_White").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_White = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_White").setTextureName(Main.MODID + ":BootsLucky_White").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Purple = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Purple").setTextureName(Main.MODID + ":HelmentLucky_Purple").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Purple = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Purple").setTextureName(Main.MODID + ":ChestplateLucky_Purple").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Purple = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Purple").setTextureName(Main.MODID + ":LeggingsLucky_Purple").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Purple = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Purple").setTextureName(Main.MODID + ":BootsLucky_Purple").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Pink = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Pink").setTextureName(Main.MODID + ":HelmentLucky_Pink").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Pink = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Pink").setTextureName(Main.MODID + ":ChestplateLucky_Pink").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Pink = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Pink").setTextureName(Main.MODID + ":LeggingsLucky_Pink").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Pink = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Pink").setTextureName(Main.MODID + ":BootsLucky_Pink").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Orange = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Orange").setTextureName(Main.MODID + ":HelmentLucky_Orange").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Orange = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Orange").setTextureName(Main.MODID + ":ChestplateLucky_Orange").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Orange = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Orange").setTextureName(Main.MODID + ":LeggingsLucky_Orange").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Orange = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Orange").setTextureName(Main.MODID + ":BootsLucky_Orange").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Magenta = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Magenta").setTextureName(Main.MODID + ":HelmentLucky_Magenta").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Magenta = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Magenta").setTextureName(Main.MODID + ":ChestplateLucky_Magenta").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Magenta = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Magenta").setTextureName(Main.MODID + ":LeggingsLucky_Magenta").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Magenta = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Magenta").setTextureName(Main.MODID + ":BootsLucky_Magenta").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Lime = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Lime").setTextureName(Main.MODID + ":HelmentLucky_Lime").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Lime = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Lime").setTextureName(Main.MODID + ":ChestplateLucky_Lime").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Lime = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Lime").setTextureName(Main.MODID + ":LeggingsLucky_Lime").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Lime = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Lime").setTextureName(Main.MODID + ":BootsLucky_Lime").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_LightBlue = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_LightBlue").setTextureName(Main.MODID + ":HelmentLucky_LightBlue").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_LightBlue = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_LightBlue").setTextureName(Main.MODID + ":ChestplateLucky_LightBlue").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_LightBlue = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_LightBlue").setTextureName(Main.MODID + ":LeggingsLucky_LightBlue").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_LightBlue = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_LightBlue").setTextureName(Main.MODID + ":BootsLucky_LightBlue").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Grey = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Grey").setTextureName(Main.MODID + ":HelmentLucky_Grey").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Grey = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Grey").setTextureName(Main.MODID + ":ChestplateLucky_Grey").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Grey = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Grey").setTextureName(Main.MODID + ":LeggingsLucky_Grey").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Grey = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Grey").setTextureName(Main.MODID + ":BootsLucky_Grey").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Green = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Green").setTextureName(Main.MODID + ":HelmentLucky_Green").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Green = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Green").setTextureName(Main.MODID + ":ChestplateLucky_Green").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Green = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Green").setTextureName(Main.MODID + ":LeggingsLucky_Green").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Green = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Green").setTextureName(Main.MODID + ":BootsLucky_Green").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Cyan = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Cyan").setTextureName(Main.MODID + ":HelmentLucky_Cyan").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Cyan = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Cyan").setTextureName(Main.MODID + ":ChestplateLucky_Cyan").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Cyan = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Cyan").setTextureName(Main.MODID + ":LeggingsLucky_Cyan").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Cyan = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Cyan").setTextureName(Main.MODID + ":BootsLucky_Cyan").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Brown = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Brown").setTextureName(Main.MODID + ":HelmentLucky_Brown").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Brown = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Brown").setTextureName(Main.MODID + ":ChestplateLucky_Brown").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Brown = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Brown").setTextureName(Main.MODID + ":LeggingsLucky_Brown").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Brown = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Brown").setTextureName(Main.MODID + ":BootsLucky_Brown").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Blue = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Blue").setTextureName(Main.MODID + ":HelmentLucky_Blue").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Blue = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Blue").setTextureName(Main.MODID + ":ChestplateLucky_Blue").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Blue = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Blue").setTextureName(Main.MODID + ":LeggingsLucky_Blue").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Blue = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Blue").setTextureName(Main.MODID + ":BootsLucky_Blue").setCreativeTab(Main.tab_LuckyBlock);

		HelmentLucky_Black = new ArmorLucky(armorMaterial_Lucky, 0, 0, "yellow").setUnlocalizedName("HelmentLucky_Black").setTextureName(Main.MODID + ":HelmentLucky_Black").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky_Black = new ArmorLucky(armorMaterial_Lucky, 1, 1, "yellow").setUnlocalizedName("ChestplateLucky_Black").setTextureName(Main.MODID + ":ChestplateLucky_Black").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky_Black = new ArmorLucky(armorMaterial_Lucky, 2, 2, "yellow").setUnlocalizedName("LeggingsLucky_Black").setTextureName(Main.MODID + ":LeggingsLucky_Black").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky_Black = new ArmorLucky(armorMaterial_Lucky, 3, 3, "yellow").setUnlocalizedName("BootsLucky_Black").setTextureName(Main.MODID + ":BootsLucky_Black").setCreativeTab(Main.tab_LuckyBlock);

		ShardLucky = new ItemShardLucky("ShardLucky", "yellow");
		ShardLucky_Red = new ItemShardLucky("ShardLucky_Red", "red");
		ShardLucky_White = new ItemShardLucky("ShardLucky_White", "white");
		ShardLucky_Purple = new ItemShardLucky("ShardLucky_Purple", "purple");
		ShardLucky_Pink = new ItemShardLucky("ShardLucky_Pink", "pink");
		ShardLucky_Orange = new ItemShardLucky("ShardLucky_Orange", "orange");
		ShardLucky_Magenta = new ItemShardLucky("ShardLucky_Magenta", "magenta");
		ShardLucky_Lime = new ItemShardLucky("ShardLucky_Lime", "lime");
		ShardLucky_LightBlue = new ItemShardLucky("ShardLucky_LightBlue", "light_blue");
		ShardLucky_Grey = new ItemShardLucky("ShardLucky_Grey", "grey");
		ShardLucky_Green = new ItemShardLucky("ShardLucky_Green", "green");
		ShardLucky_Cyan = new ItemShardLucky("ShardLucky_Cyan", "cyan");
		ShardLucky_Brown = new ItemShardLucky("ShardLucky_Brown", "brown");
		ShardLucky_Blue = new ItemShardLucky("ShardLucky_Blue", "blue");
		ShardLucky_Black = new ItemShardLucky("ShardLucky_Black", "black");
		
		registerItems();
	}

	/**
	 * Register Items.
	 */
	private static void registerItems(){
		
		GameRegistry.registerItem(SwordLucky, SwordLucky.getUnlocalizedName().substring(5));            
		GameRegistry.registerItem(SwordLucky_Red, SwordLucky_Red.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(SwordLucky_White, SwordLucky_White.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(SwordLucky_Purple, SwordLucky_Purple.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(SwordLucky_Pink, SwordLucky_Pink.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(SwordLucky_Orange, SwordLucky_Orange.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(SwordLucky_Magenta, SwordLucky_Magenta.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(SwordLucky_Lime, SwordLucky_Lime.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(SwordLucky_LightBlue, SwordLucky_LightBlue.getUnlocalizedName().substring(5));  
		GameRegistry.registerItem(SwordLucky_Grey, SwordLucky_Grey.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(SwordLucky_Green, SwordLucky_Green.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(SwordLucky_Cyan, SwordLucky_Cyan.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(SwordLucky_Brown, SwordLucky_Brown.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(SwordLucky_Blue, SwordLucky_Blue.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(SwordLucky_Black, SwordLucky_Black.getUnlocalizedName().substring(5));      

		GameRegistry.registerItem(PickLucky, PickLucky.getUnlocalizedName().substring(5));             
		GameRegistry.registerItem(PickLucky_Red, PickLucky_Red.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(PickLucky_White, PickLucky_White.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(PickLucky_Purple, PickLucky_Purple.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(PickLucky_Pink, PickLucky_Pink.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(PickLucky_Orange, PickLucky_Orange.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(PickLucky_Magenta, PickLucky_Magenta.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(PickLucky_Lime, PickLucky_Lime.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(PickLucky_LightBlue, PickLucky_LightBlue.getUnlocalizedName().substring(5));   
		GameRegistry.registerItem(PickLucky_Grey, PickLucky_Grey.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(PickLucky_Green, PickLucky_Green.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(PickLucky_Cyan, PickLucky_Cyan.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(PickLucky_Brown, PickLucky_Brown.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(PickLucky_Blue, PickLucky_Blue.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(PickLucky_Black, PickLucky_Black.getUnlocalizedName().substring(5));       

		GameRegistry.registerItem(ShovelLucky, ShovelLucky.getUnlocalizedName().substring(5));           
		GameRegistry.registerItem(ShovelLucky_Red, ShovelLucky_Red.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(ShovelLucky_White, ShovelLucky_White.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(ShovelLucky_Purple, ShovelLucky_Purple.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(ShovelLucky_Pink, ShovelLucky_Pink.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ShovelLucky_Orange, ShovelLucky_Orange.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(ShovelLucky_Magenta, ShovelLucky_Magenta.getUnlocalizedName().substring(5));   
		GameRegistry.registerItem(ShovelLucky_Lime, ShovelLucky_Lime.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ShovelLucky_LightBlue, ShovelLucky_LightBlue.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(ShovelLucky_Grey, ShovelLucky_Grey.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ShovelLucky_Green, ShovelLucky_Green.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(ShovelLucky_Cyan, ShovelLucky_Cyan.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ShovelLucky_Brown, ShovelLucky_Brown.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(ShovelLucky_Blue, ShovelLucky_Blue.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ShovelLucky_Black, ShovelLucky_Black.getUnlocalizedName().substring(5));     

		GameRegistry.registerItem(AxeLucky, AxeLucky.getUnlocalizedName().substring(5));              
		GameRegistry.registerItem(AxeLucky_Red, AxeLucky_Red.getUnlocalizedName().substring(5));          
		GameRegistry.registerItem(AxeLucky_White, AxeLucky_White.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(AxeLucky_Purple, AxeLucky_Purple.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(AxeLucky_Pink, AxeLucky_Pink.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(AxeLucky_Orange, AxeLucky_Orange.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(AxeLucky_Magenta, AxeLucky_Magenta.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(AxeLucky_Lime, AxeLucky_Lime.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(AxeLucky_LightBlue, AxeLucky_LightBlue.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(AxeLucky_Grey, AxeLucky_Grey.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(AxeLucky_Green, AxeLucky_Green.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(AxeLucky_Cyan, AxeLucky_Cyan.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(AxeLucky_Brown, AxeLucky_Brown.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(AxeLucky_Blue, AxeLucky_Blue.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(AxeLucky_Black, AxeLucky_Black.getUnlocalizedName().substring(5));        

		GameRegistry.registerItem(HoeLucky, HoeLucky.getUnlocalizedName().substring(5));              
		GameRegistry.registerItem(HoeLucky_Red, HoeLucky_Red.getUnlocalizedName().substring(5));          
		GameRegistry.registerItem(HoeLucky_White, HoeLucky_White.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(HoeLucky_Purple, HoeLucky_Purple.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(HoeLucky_Pink, HoeLucky_Pink.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(HoeLucky_Orange, HoeLucky_Orange.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(HoeLucky_Magenta, HoeLucky_Magenta.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(HoeLucky_Lime, HoeLucky_Lime.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(HoeLucky_LightBlue, HoeLucky_LightBlue.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(HoeLucky_Grey, HoeLucky_Grey.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(HoeLucky_Green, HoeLucky_Green.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(HoeLucky_Cyan, HoeLucky_Cyan.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(HoeLucky_Brown, HoeLucky_Brown.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(HoeLucky_Blue, HoeLucky_Blue.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(HoeLucky_Black, HoeLucky_Black.getUnlocalizedName().substring(5));        

		GameRegistry.registerItem(MultiLucky, MultiLucky.getUnlocalizedName().substring(5));            
		GameRegistry.registerItem(MultiLucky_Red, MultiLucky_Red.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(MultiLucky_White, MultiLucky_White.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(MultiLucky_Purple, MultiLucky_Purple.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(MultiLucky_Pink, MultiLucky_Pink.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(MultiLucky_Orange, MultiLucky_Orange.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(MultiLucky_Magenta, MultiLucky_Magenta.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(MultiLucky_Lime, MultiLucky_Lime.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(MultiLucky_LightBlue, MultiLucky_LightBlue.getUnlocalizedName().substring(5));  
		GameRegistry.registerItem(MultiLucky_Grey, MultiLucky_Grey.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(MultiLucky_Green, MultiLucky_Green.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(MultiLucky_Cyan, MultiLucky_Cyan.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(MultiLucky_Brown, MultiLucky_Brown.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(MultiLucky_Blue, MultiLucky_Blue.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(MultiLucky_Black, MultiLucky_Black.getUnlocalizedName().substring(5));      

		GameRegistry.registerItem(HelmentLucky, HelmentLucky.getUnlocalizedName().substring(5));             
		GameRegistry.registerItem(HelmentLucky_Red, HelmentLucky_Red.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(HelmentLucky_White, HelmentLucky_White.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(HelmentLucky_Purple, HelmentLucky_Purple.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(HelmentLucky_Pink, HelmentLucky_Pink.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(HelmentLucky_Orange, HelmentLucky_Orange.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(HelmentLucky_Magenta, HelmentLucky_Magenta.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(HelmentLucky_Lime, HelmentLucky_Lime.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(HelmentLucky_LightBlue, HelmentLucky_LightBlue.getUnlocalizedName().substring(5));   
		GameRegistry.registerItem(HelmentLucky_Grey, HelmentLucky_Grey.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(HelmentLucky_Green, HelmentLucky_Green.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(HelmentLucky_Cyan, HelmentLucky_Cyan.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(HelmentLucky_Brown, HelmentLucky_Brown.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(HelmentLucky_Blue, HelmentLucky_Blue.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(HelmentLucky_Black, HelmentLucky_Black.getUnlocalizedName().substring(5));       

		GameRegistry.registerItem(ChestplateLucky, ChestplateLucky.getUnlocalizedName().substring(5));           
		GameRegistry.registerItem(ChestplateLucky_Red, ChestplateLucky_Red.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(ChestplateLucky_White, ChestplateLucky_White.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(ChestplateLucky_Purple, ChestplateLucky_Purple.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(ChestplateLucky_Pink, ChestplateLucky_Pink.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ChestplateLucky_Orange, ChestplateLucky_Orange.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(ChestplateLucky_Magenta, ChestplateLucky_Magenta.getUnlocalizedName().substring(5));   
		GameRegistry.registerItem(ChestplateLucky_Lime, ChestplateLucky_Lime.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ChestplateLucky_LightBlue, ChestplateLucky_LightBlue.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(ChestplateLucky_Grey, ChestplateLucky_Grey.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ChestplateLucky_Green, ChestplateLucky_Green.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(ChestplateLucky_Cyan, ChestplateLucky_Cyan.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ChestplateLucky_Brown, ChestplateLucky_Brown.getUnlocalizedName().substring(5));     
		GameRegistry.registerItem(ChestplateLucky_Blue, ChestplateLucky_Blue.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(ChestplateLucky_Black, ChestplateLucky_Black.getUnlocalizedName().substring(5));     

		GameRegistry.registerItem(LeggingsLucky, LeggingsLucky.getUnlocalizedName().substring(5));              
		GameRegistry.registerItem(LeggingsLucky_Red, LeggingsLucky_Red.getUnlocalizedName().substring(5));          
		GameRegistry.registerItem(LeggingsLucky_White, LeggingsLucky_White.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(LeggingsLucky_Purple, LeggingsLucky_Purple.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(LeggingsLucky_Pink, LeggingsLucky_Pink.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(LeggingsLucky_Orange, LeggingsLucky_Orange.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(LeggingsLucky_Magenta, LeggingsLucky_Magenta.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(LeggingsLucky_Lime, LeggingsLucky_Lime.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(LeggingsLucky_LightBlue, LeggingsLucky_LightBlue.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(LeggingsLucky_Grey, LeggingsLucky_Grey.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(LeggingsLucky_Green, LeggingsLucky_Green.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(LeggingsLucky_Cyan, LeggingsLucky_Cyan.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(LeggingsLucky_Brown, LeggingsLucky_Brown.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(LeggingsLucky_Blue, LeggingsLucky_Blue.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(LeggingsLucky_Black, LeggingsLucky_Black.getUnlocalizedName().substring(5));        

		GameRegistry.registerItem(BootsLucky, BootsLucky.getUnlocalizedName().substring(5));              
		GameRegistry.registerItem(BootsLucky_Red, BootsLucky_Red.getUnlocalizedName().substring(5));          
		GameRegistry.registerItem(BootsLucky_White, BootsLucky_White.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(BootsLucky_Purple, BootsLucky_Purple.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(BootsLucky_Pink, BootsLucky_Pink.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(BootsLucky_Orange, BootsLucky_Orange.getUnlocalizedName().substring(5));       
		GameRegistry.registerItem(BootsLucky_Magenta, BootsLucky_Magenta.getUnlocalizedName().substring(5));      
		GameRegistry.registerItem(BootsLucky_Lime, BootsLucky_Lime.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(BootsLucky_LightBlue, BootsLucky_LightBlue.getUnlocalizedName().substring(5));    
		GameRegistry.registerItem(BootsLucky_Grey, BootsLucky_Grey.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(BootsLucky_Green, BootsLucky_Green.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(BootsLucky_Cyan, BootsLucky_Cyan.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(BootsLucky_Brown, BootsLucky_Brown.getUnlocalizedName().substring(5));        
		GameRegistry.registerItem(BootsLucky_Blue, BootsLucky_Blue.getUnlocalizedName().substring(5));         
		GameRegistry.registerItem(BootsLucky_Black, BootsLucky_Black.getUnlocalizedName().substring(5));        
		
		GameRegistry.registerItem(ShardLucky, ShardLucky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Red, ShardLucky_Red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_White, ShardLucky_White.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Purple, ShardLucky_Purple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Pink, ShardLucky_Pink.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Orange, ShardLucky_Orange.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Magenta, ShardLucky_Magenta.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Lime, ShardLucky_Lime.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_LightBlue, ShardLucky_LightBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Grey, ShardLucky_Grey.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Green, ShardLucky_Green.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Cyan, ShardLucky_Cyan.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Brown, ShardLucky_Brown.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Blue, ShardLucky_Blue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShardLucky_Black, ShardLucky_Black.getUnlocalizedName().substring(5));

	}
}

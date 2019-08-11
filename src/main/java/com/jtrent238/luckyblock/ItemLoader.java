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

	public static Item SwordLucky;
	public static Item PickLucky;
	public static Item ShovelLucky;
	public static Item AxeLucky;
	public static Item HoeLucky;
	public static Item MultiLucky;
	public static Item HelmentLucky;
	public static Item ChestplateLucky;
	public static Item LeggingsLucky;
	public static Item BootsLucky;
	
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
	
		SwordLucky = new SwordLucky(toolMaterial_Lucky);
		PickLucky = new PickLucky(toolMaterial_Lucky);
		ShovelLucky = new ShovelLucky(toolMaterial_Lucky);
		AxeLucky = new AxeLucky(toolMaterial_Lucky);
		HoeLucky = new HoeLucky(toolMaterial_Lucky);
		MultiLucky = new MultiLucky(toolMaterial_Lucky);

		HelmentLucky = new ArmorLucky(armorMaterial_Lucky, 0, 0).setUnlocalizedName("HelmentLucky").setTextureName(Main.MODID + ":HelmentLucky").setCreativeTab(Main.tab_LuckyBlock);
		ChestplateLucky = new ArmorLucky(armorMaterial_Lucky, 1, 1).setUnlocalizedName("ChestplateLucky").setTextureName(Main.MODID + ":ChestplateLucky").setCreativeTab(Main.tab_LuckyBlock);
		LeggingsLucky = new ArmorLucky(armorMaterial_Lucky, 2, 2).setUnlocalizedName("LeggingsLucky").setTextureName(Main.MODID + ":LeggingsLucky").setCreativeTab(Main.tab_LuckyBlock);
		BootsLucky = new ArmorLucky(armorMaterial_Lucky, 3, 3).setUnlocalizedName("BootsLucky").setTextureName(Main.MODID + ":BootsLucky").setCreativeTab(Main.tab_LuckyBlock);

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
		ShardLucky_Green = new ItemShardLucky("ShardLucky_Green", "grey");
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
		GameRegistry.registerItem(PickLucky, PickLucky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShovelLucky, ShovelLucky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(AxeLucky, AxeLucky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(HoeLucky, HoeLucky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MultiLucky, MultiLucky.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(HelmentLucky, HelmentLucky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ChestplateLucky, ChestplateLucky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LeggingsLucky, LeggingsLucky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BootsLucky, BootsLucky.getUnlocalizedName().substring(5));

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

package com.jtrent238.luckyblock;

import com.jtrent238.luckyblock.items.armor.ArmorLucky;
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

	}
}

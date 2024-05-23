
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bronzesteel.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bronzesteel.item.TinIngotItem;
import net.mcreator.bronzesteel.item.TinDustItem;
import net.mcreator.bronzesteel.item.SteelSwordItem;
import net.mcreator.bronzesteel.item.SteelShovelItem;
import net.mcreator.bronzesteel.item.SteelPickaxeItem;
import net.mcreator.bronzesteel.item.SteelIngotItem;
import net.mcreator.bronzesteel.item.SteelHoeItem;
import net.mcreator.bronzesteel.item.SteelDustItem;
import net.mcreator.bronzesteel.item.SteelAxeItem;
import net.mcreator.bronzesteel.item.SteelArmorItem;
import net.mcreator.bronzesteel.item.MortarAndPestleItem;
import net.mcreator.bronzesteel.item.IronDustItem;
import net.mcreator.bronzesteel.item.CopperDustItem;
import net.mcreator.bronzesteel.item.CoalDustItem;
import net.mcreator.bronzesteel.item.BronzeSwordItem;
import net.mcreator.bronzesteel.item.BronzeShovelItem;
import net.mcreator.bronzesteel.item.BronzePickaxeItem;
import net.mcreator.bronzesteel.item.BronzeIngotBsItem;
import net.mcreator.bronzesteel.item.BronzeHoeItem;
import net.mcreator.bronzesteel.item.BronzeDustItem;
import net.mcreator.bronzesteel.item.BronzeAxeItem;
import net.mcreator.bronzesteel.item.BronzeArmorItem;
import net.mcreator.bronzesteel.BronzeSteelMod;

public class BronzeSteelModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BronzeSteelMod.MODID);
	public static final RegistryObject<Item> TIN_BLOCK = block(BronzeSteelModBlocks.TIN_BLOCK);
	public static final RegistryObject<Item> TIN_ORE = block(BronzeSteelModBlocks.TIN_ORE);
	public static final RegistryObject<Item> MORTAR_AND_PESTLE = REGISTRY.register("mortar_and_pestle", () -> new MortarAndPestleItem());
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TIN_DUST = REGISTRY.register("tin_dust", () -> new TinDustItem());
	public static final RegistryObject<Item> COPPER_DUST = REGISTRY.register("copper_dust", () -> new CopperDustItem());
	public static final RegistryObject<Item> BRONZE_DUST = REGISTRY.register("bronze_dust", () -> new BronzeDustItem());
	public static final RegistryObject<Item> BRONZE_INGOT_BS = REGISTRY.register("bronze_ingot_bs", () -> new BronzeIngotBsItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> COAL_DUST = REGISTRY.register("coal_dust", () -> new CoalDustItem());
	public static final RegistryObject<Item> STEEL_DUST = REGISTRY.register("steel_dust", () -> new SteelDustItem());
	public static final RegistryObject<Item> IRON_DUST = REGISTRY.register("iron_dust", () -> new IronDustItem());
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate", () -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> BRONZE_ARMOR_HELMET = REGISTRY.register("bronze_armor_helmet", () -> new BronzeArmorItem.Helmet());
	public static final RegistryObject<Item> BRONZE_ARMOR_CHESTPLATE = REGISTRY.register("bronze_armor_chestplate", () -> new BronzeArmorItem.Chestplate());
	public static final RegistryObject<Item> BRONZE_ARMOR_LEGGINGS = REGISTRY.register("bronze_armor_leggings", () -> new BronzeArmorItem.Leggings());
	public static final RegistryObject<Item> BRONZE_ARMOR_BOOTS = REGISTRY.register("bronze_armor_boots", () -> new BronzeArmorItem.Boots());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> BRONZE_PICKAXE = REGISTRY.register("bronze_pickaxe", () -> new BronzePickaxeItem());
	public static final RegistryObject<Item> BRONZE_AXE = REGISTRY.register("bronze_axe", () -> new BronzeAxeItem());
	public static final RegistryObject<Item> BRONZE_SWORD = REGISTRY.register("bronze_sword", () -> new BronzeSwordItem());
	public static final RegistryObject<Item> BRONZE_SHOVEL = REGISTRY.register("bronze_shovel", () -> new BronzeShovelItem());
	public static final RegistryObject<Item> BRONZE_HOE = REGISTRY.register("bronze_hoe", () -> new BronzeHoeItem());
	public static final RegistryObject<Item> BRONZE_BLOCK = block(BronzeSteelModBlocks.BRONZE_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

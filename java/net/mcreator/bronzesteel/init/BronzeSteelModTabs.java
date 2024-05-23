
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bronzesteel.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.bronzesteel.BronzeSteelMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BronzeSteelModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BronzeSteelMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(BronzeSteelModBlocks.TIN_BLOCK.get().asItem());
			tabData.accept(BronzeSteelModBlocks.BRONZE_BLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BronzeSteelModItems.STEEL_ARMOR_HELMET.get());
			tabData.accept(BronzeSteelModItems.STEEL_ARMOR_CHESTPLATE.get());
			tabData.accept(BronzeSteelModItems.STEEL_ARMOR_LEGGINGS.get());
			tabData.accept(BronzeSteelModItems.STEEL_ARMOR_BOOTS.get());
			tabData.accept(BronzeSteelModItems.BRONZE_ARMOR_HELMET.get());
			tabData.accept(BronzeSteelModItems.BRONZE_ARMOR_CHESTPLATE.get());
			tabData.accept(BronzeSteelModItems.BRONZE_ARMOR_LEGGINGS.get());
			tabData.accept(BronzeSteelModItems.BRONZE_ARMOR_BOOTS.get());
			tabData.accept(BronzeSteelModItems.STEEL_SWORD.get());
			tabData.accept(BronzeSteelModItems.BRONZE_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(BronzeSteelModItems.TIN_INGOT.get());
			tabData.accept(BronzeSteelModItems.TIN_DUST.get());
			tabData.accept(BronzeSteelModItems.COPPER_DUST.get());
			tabData.accept(BronzeSteelModItems.BRONZE_DUST.get());
			tabData.accept(BronzeSteelModItems.BRONZE_INGOT_BS.get());
			tabData.accept(BronzeSteelModItems.STEEL_INGOT.get());
			tabData.accept(BronzeSteelModItems.COAL_DUST.get());
			tabData.accept(BronzeSteelModItems.STEEL_DUST.get());
			tabData.accept(BronzeSteelModItems.IRON_DUST.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(BronzeSteelModBlocks.TIN_ORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BronzeSteelModItems.MORTAR_AND_PESTLE.get());
			tabData.accept(BronzeSteelModItems.STEEL_AXE.get());
			tabData.accept(BronzeSteelModItems.STEEL_PICKAXE.get());
			tabData.accept(BronzeSteelModItems.STEEL_SHOVEL.get());
			tabData.accept(BronzeSteelModItems.STEEL_HOE.get());
			tabData.accept(BronzeSteelModItems.BRONZE_PICKAXE.get());
			tabData.accept(BronzeSteelModItems.BRONZE_AXE.get());
			tabData.accept(BronzeSteelModItems.BRONZE_SHOVEL.get());
			tabData.accept(BronzeSteelModItems.BRONZE_HOE.get());
		}
	}
}

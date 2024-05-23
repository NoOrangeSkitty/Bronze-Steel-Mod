
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bronzesteel.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.bronzesteel.world.features.ores.TinOreFeature;
import net.mcreator.bronzesteel.BronzeSteelMod;

@Mod.EventBusSubscriber
public class BronzeSteelModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BronzeSteelMod.MODID);
	public static final RegistryObject<Feature<?>> TIN_ORE = REGISTRY.register("tin_ore", TinOreFeature::new);
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bronzesteel.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bronzesteel.block.TinOreBlock;
import net.mcreator.bronzesteel.block.TinBlockBlock;
import net.mcreator.bronzesteel.block.BronzeBlockBlock;
import net.mcreator.bronzesteel.BronzeSteelMod;

public class BronzeSteelModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BronzeSteelMod.MODID);
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
}

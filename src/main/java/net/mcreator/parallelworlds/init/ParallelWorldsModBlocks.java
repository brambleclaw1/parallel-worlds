
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.parallelworlds.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.parallelworlds.block.AmberBlockBlock;
import net.mcreator.parallelworlds.ParallelWorldsMod;

public class ParallelWorldsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ParallelWorldsMod.MODID);
	public static final RegistryObject<Block> AMBER_BLOCK = REGISTRY.register("amber_block", () -> new AmberBlockBlock());
}

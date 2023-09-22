
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.parallelworlds.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.parallelworlds.ParallelWorldsMod;

public class ParallelWorldsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ParallelWorldsMod.MODID);
	public static final RegistryObject<CreativeModeTab> PARALLEL_WORLDS = REGISTRY.register("parallel_worlds",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.parallel_worlds.parallel_worlds")).icon(() -> new ItemStack(Blocks.GRASS_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(ParallelWorldsModBlocks.AMBER_BLOCK.get().asItem());
			})

					.build());
}

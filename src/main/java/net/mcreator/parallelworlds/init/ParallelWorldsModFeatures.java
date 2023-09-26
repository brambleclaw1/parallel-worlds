
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.parallelworlds.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.parallelworlds.world.features.AmberGeodeFeature;
import net.mcreator.parallelworlds.ParallelWorldsMod;

@Mod.EventBusSubscriber
public class ParallelWorldsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ParallelWorldsMod.MODID);
	public static final RegistryObject<Feature<?>> AMBER_GEODE = REGISTRY.register("amber_geode", AmberGeodeFeature::new);
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.parallelworlds.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.parallelworlds.ParallelWorldsMod;

public class ParallelWorldsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ParallelWorldsMod.MODID);
	public static final RegistryObject<SoundEvent> MODULO = REGISTRY.register("modulo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("parallel_worlds", "modulo")));
	public static final RegistryObject<SoundEvent> FAR_LANDS = REGISTRY.register("far_lands", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("parallel_worlds", "far_lands")));
	public static final RegistryObject<SoundEvent> ECHO_IN_THE_WIND_EPIC = REGISTRY.register("echo_in_the_wind_epic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("parallel_worlds", "echo_in_the_wind_epic")));
	public static final RegistryObject<SoundEvent> MINECRAFT_EPIC = REGISTRY.register("minecraft_epic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("parallel_worlds", "minecraft_epic")));
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.terribletwo.TerribletwoMod;

public class TerribletwoModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, TerribletwoMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LEAN_SMOKE = REGISTRY.register("lean_smoke", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> RICHTOFEN_PARTICLE = REGISTRY.register("richtofen_particle", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> FRENCH = REGISTRY.register("french", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PISS_PARTICLE = REGISTRY.register("piss_particle", () -> new SimpleParticleType(true));
}

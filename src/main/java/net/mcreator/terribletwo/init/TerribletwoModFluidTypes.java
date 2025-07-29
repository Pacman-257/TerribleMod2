
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.terribletwo.fluid.types.PissFluidType;
import net.mcreator.terribletwo.fluid.types.LeanFluidType;
import net.mcreator.terribletwo.TerribletwoMod;

public class TerribletwoModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, TerribletwoMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> LEAN_TYPE = REGISTRY.register("lean", () -> new LeanFluidType());
	public static final DeferredHolder<FluidType, FluidType> PISS_TYPE = REGISTRY.register("piss", () -> new PissFluidType());
}

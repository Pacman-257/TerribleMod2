
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.terribletwo.fluid.PissFluid;
import net.mcreator.terribletwo.fluid.LeanFluid;
import net.mcreator.terribletwo.TerribletwoMod;

public class TerribletwoModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, TerribletwoMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> LEAN = REGISTRY.register("lean", () -> new LeanFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LEAN = REGISTRY.register("flowing_lean", () -> new LeanFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> PISS = REGISTRY.register("piss", () -> new PissFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PISS = REGISTRY.register("flowing_piss", () -> new PissFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LEAN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LEAN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(PISS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PISS.get(), RenderType.translucent());
		}
	}
}

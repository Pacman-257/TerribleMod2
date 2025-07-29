
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.terribletwo.client.particle.RichtofenParticleParticle;
import net.mcreator.terribletwo.client.particle.PissParticleParticle;
import net.mcreator.terribletwo.client.particle.LeanSmokeParticle;
import net.mcreator.terribletwo.client.particle.FrenchParticle;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TerribletwoModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(TerribletwoModParticleTypes.LEAN_SMOKE.get(), LeanSmokeParticle::provider);
		event.registerSpriteSet(TerribletwoModParticleTypes.RICHTOFEN_PARTICLE.get(), RichtofenParticleParticle::provider);
		event.registerSpriteSet(TerribletwoModParticleTypes.FRENCH.get(), FrenchParticle::provider);
		event.registerSpriteSet(TerribletwoModParticleTypes.PISS_PARTICLE.get(), PissParticleParticle::provider);
	}
}

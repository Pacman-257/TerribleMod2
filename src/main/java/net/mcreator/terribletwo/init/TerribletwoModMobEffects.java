
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.terribletwo.procedures.MugsEffectEffectExpiresProcedure;
import net.mcreator.terribletwo.procedures.BarqsBiteEffectExpiresProcedure;
import net.mcreator.terribletwo.potion.MugsEffectMobEffect;
import net.mcreator.terribletwo.potion.LTGCutsceneMobEffect;
import net.mcreator.terribletwo.potion.FlashbangedMobEffect;
import net.mcreator.terribletwo.potion.DrenchedMobEffect;
import net.mcreator.terribletwo.potion.BarqsBiteMobEffect;
import net.mcreator.terribletwo.potion.AutisimMobEffect;
import net.mcreator.terribletwo.TerribletwoMod;

@EventBusSubscriber
public class TerribletwoModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, TerribletwoMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> BARQS_BITE = REGISTRY.register("barqs_bite", () -> new BarqsBiteMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MUGS_EFFECT = REGISTRY.register("mugs_effect", () -> new MugsEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DRENCHED = REGISTRY.register("drenched", () -> new DrenchedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> AUTISIM = REGISTRY.register("autisim", () -> new AutisimMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FLASHBANGED = REGISTRY.register("flashbanged", () -> new FlashbangedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LTG_CUTSCENE = REGISTRY.register("ltg_cutscene", () -> new LTGCutsceneMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(BARQS_BITE)) {
			BarqsBiteEffectExpiresProcedure.execute(entity.level(), entity);
		} else if (effectInstance.getEffect().is(MUGS_EFFECT)) {
			MugsEffectEffectExpiresProcedure.execute(entity.level(), entity);
		}
	}
}

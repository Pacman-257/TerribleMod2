
package net.mcreator.terribletwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.terribletwo.procedures.MugsEffectEffectStartedappliedProcedure;

public class MugsEffectMobEffect extends MobEffect {
	public MugsEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3381760);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		MugsEffectEffectStartedappliedProcedure.execute(entity);
	}
}

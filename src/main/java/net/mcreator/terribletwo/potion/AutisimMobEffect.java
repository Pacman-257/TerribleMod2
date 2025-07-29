
package net.mcreator.terribletwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.terribletwo.procedures.AutisimEffectStartedappliedProcedure;

public class AutisimMobEffect extends MobEffect {
	public AutisimMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		AutisimEffectStartedappliedProcedure.execute(entity);
	}
}

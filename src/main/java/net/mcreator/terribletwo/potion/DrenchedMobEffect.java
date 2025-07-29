
package net.mcreator.terribletwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.terribletwo.procedures.DrenchedOnEffectActiveTickProcedure;

public class DrenchedMobEffect extends MobEffect {
	public DrenchedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -205);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		DrenchedOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return super.applyEffectTick(entity, amplifier);
	}
}

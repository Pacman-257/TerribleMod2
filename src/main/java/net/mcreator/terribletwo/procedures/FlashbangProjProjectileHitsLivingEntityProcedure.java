package net.mcreator.terribletwo.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.terribletwo.init.TerribletwoModMobEffects;

public class FlashbangProjProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(TerribletwoModMobEffects.FLASHBANGED, 80, 0, true, false));
	}
}

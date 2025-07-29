package net.mcreator.terribletwo.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.terribletwo.init.TerribletwoModMobEffects;

public class FlashbangOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TerribletwoModMobEffects.FLASHBANGED);
	}
}

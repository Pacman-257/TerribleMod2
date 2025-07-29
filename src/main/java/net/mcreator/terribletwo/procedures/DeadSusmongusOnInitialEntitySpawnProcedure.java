package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.terribletwo.entity.DeadSusmongusEntity;
import net.mcreator.terribletwo.TerribletwoMod;

public class DeadSusmongusOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof DeadSusmongusEntity) {
			((DeadSusmongusEntity) entity).setAnimation("empty");
		}
		if (entity instanceof DeadSusmongusEntity) {
			((DeadSusmongusEntity) entity).setAnimation("spawn");
		}
		TerribletwoMod.queueServerWork((int) 17.6, () -> {
			if (entity instanceof DeadSusmongusEntity) {
				((DeadSusmongusEntity) entity).setAnimation("idle");
			}
		});
	}
}

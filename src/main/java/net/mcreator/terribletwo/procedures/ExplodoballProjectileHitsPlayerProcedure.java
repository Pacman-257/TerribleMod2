package net.mcreator.terribletwo.procedures;

import net.minecraft.world.entity.Entity;

public class ExplodoballProjectileHitsPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(3);
	}
}

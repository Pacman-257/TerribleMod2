package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class BoosDashProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(((entity.getX() - entity.getX()) * 0.35 - (entity.getX() - entity.getX()) * 0.05), ((entity.getY() - entity.getY()) * 0.35 - (entity.getY() - entity.getY()) * 0.05 + 0.15),
				((entity.getZ() - entity.getZ()) * 0.35 - (entity.getZ() - entity.getZ()) * 0.05)));
	}
}

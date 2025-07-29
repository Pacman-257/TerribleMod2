package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class BoosOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) || (entity.getPersistentData().getString("State")).equals("Fracture") || (entity.getPersistentData().getString("State")).equals("Disperse")) {
			entity.getPersistentData().putDouble("IA", (entity.getPersistentData().getDouble("IA") + 1));
		} else {
			entity.getPersistentData().putString("State", "Idle");
			entity.getPersistentData().putDouble("IA", 0);
		}
		if (entity.getPersistentData().getBoolean("Phase")) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLASH, x, (y + 0.9), z, 25, 0.2, 0.9, 0.2, 0);
		}
		if ((entity.getPersistentData().getString("State")).equals("Idle")) {
			if (entity.getPersistentData().getDouble("IA") == 20) {
				BoosStateChangerProcedure.execute(world, x, y, z, entity);
			}
		}
		if (!entity.getPersistentData().getBoolean("Phase")) {
			if ((entity.getPersistentData().getString("State")).equals("Melee")) {
				BoosMeleeProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Fireball")) {
				BoosFireballProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Summon")) {
				BoosSummonProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Regeneration")) {
				BoosRegenerationProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Teleport")) {
				BoosTeleportAttackProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Fracture")) {
				BoosFractureProcedure.execute(world, x, y, z, entity);
			}
		} else {
			if ((entity.getPersistentData().getString("State")).equals("FracturedArtemis")) {
				BoosFracturedArtemisProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedBeam")) {
				BoosFracturedBeamProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedTeleport")) {
				BoosFracturedTeleportExecutionProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedDispersion")) {
				BoosFracturedDispersionProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedArtemisTeleport")) {
				BoosFracturedTeleportArtemisProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedTeleportBeam")) {
				BoosFracturedBeamTeleportProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Disperse")) {
				BoosDisperseProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}

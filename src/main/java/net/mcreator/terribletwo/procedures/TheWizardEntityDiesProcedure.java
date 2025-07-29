package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.init.TerribletwoModParticleTypes;
import net.mcreator.terribletwo.init.TerribletwoModEntities;

public class TheWizardEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = TerribletwoModEntities.THE_V_VIZARD.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = TerribletwoModEntities.THE_PURPLE_WIZARD.get().spawn(_level, BlockPos.containing(x + Mth.nextInt(RandomSource.create(), 10, 20), y, z + Mth.nextInt(RandomSource.create(), 10, 20)), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = TerribletwoModEntities.THE_GREEN_WIZARD.get().spawn(_level, BlockPos.containing(x + Mth.nextInt(RandomSource.create(), 10, 20), y, z + Mth.nextInt(RandomSource.create(), 10, 20)), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = TerribletwoModEntities.THE_RED_WIZARD.get().spawn(_level, BlockPos.containing(x + Mth.nextInt(RandomSource.create(), 10, 20), y, z + Mth.nextInt(RandomSource.create(), 10, 20)), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = TerribletwoModEntities.THE_YELLOW_WIZARD.get().spawn(_level, BlockPos.containing(x + Mth.nextInt(RandomSource.create(), 10, 20), y, z + Mth.nextInt(RandomSource.create(), 10, 20)), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (TerribletwoModParticleTypes.LEAN_SMOKE.get()), x, y, z, 100, 3, 3, 3, 1);
	}
}

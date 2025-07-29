package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.terribletwo.init.TerribletwoModParticleTypes;

public class DrenchedOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (TerribletwoModParticleTypes.PISS_PARTICLE.get()), x, y, z, 1, 3, 3, 3, 1);
	}
}

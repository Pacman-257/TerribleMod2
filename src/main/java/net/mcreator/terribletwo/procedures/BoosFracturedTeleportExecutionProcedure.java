package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class BoosFracturedTeleportExecutionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (entity.getPersistentData().getDouble("IA") == 5) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 5, 1, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 20) {
			BoosFractureTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 25) {
			BoosFractureTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 30) {
			BoosFractureTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 35) {
			BoosFractureTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 40) {
			BoosFractureTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 45) {
			BoosFractureTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 50) {
			BoosFractureTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 55) {
			BoosFractureTeleportProcedure.execute(world, x, y, z, entity);
			BoosStateChangerProcedure.execute(world, x, y, z, entity);
		}
	}
}

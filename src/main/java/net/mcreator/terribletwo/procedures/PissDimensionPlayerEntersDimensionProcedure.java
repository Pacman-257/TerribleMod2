package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.init.TerribletwoModEntities;
import net.mcreator.terribletwo.TerribletwoMod;

public class PissDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(600, () -> {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("terribletwo:piss_dimension"))) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:peepeeman")), SoundSource.MASTER, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:peepeeman")), SoundSource.MASTER, 1, 1, false);
					}
				}
			} else if ((entity.level().dimension()) == Level.OVERWORLD) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:silence")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:silence")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		});
		TerribletwoMod.queueServerWork(650, () -> {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("terribletwo:piss_dimension"))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.PEEPEE_MAN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(5, 0, 5);
					}
				}
			} else if ((entity.level().dimension()) == Level.OVERWORLD) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:silence")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:silence")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		});
	}
}

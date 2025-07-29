package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.TerribletwoMod;

import java.util.List;
import java.util.Comparator;

public class BoosFracturedArtemisProcedure {
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
			Chain = 5;
			for (int index0 = 0; index0 < (int) Chain; index0++) {
				TerribletwoMod.queueServerWork((int) ChainWait, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())));;
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.FLASH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 5, 3, 3, 3, 1);
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())));;
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.FLASH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 5, 3, 3, 3, 1);
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())));;
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.FLASH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 5, 3, 3, 3, 1);
							}
						}
					}
				});
				ChainWait = ChainWait + 3;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 40) {
			BoosStateChangerProcedure.execute(world, x, y, z, entity);
		}
	}
}

package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.terribletwo.TerribletwoMod;

public class BoosDisperseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 15, 0.5, 1.8, 0.5, 1);
		if (entity.getPersistentData().getDouble("IA") < 100) {
			entity.setDeltaMovement(new Vec3(0, 0.075, 0));
		} else {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		}
		if (entity.getPersistentData().getDouble("IA") == 50) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 4, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 4, 1, false);
				}
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 10, Level.ExplosionInteraction.MOB);
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			for (int index0 = 0; index0 < 25; index0++) {
				world.addParticle(ParticleTypes.WITCH, x, y, z, (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)), (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)), (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)));
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 100) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 15, Level.ExplosionInteraction.MOB);
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 4, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 4, 1, false);
				}
			}
			for (int index1 = 0; index1 < 25; index1++) {
				world.addParticle(ParticleTypes.WITCH, x, y, z, (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)), (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)), (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)));
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 150) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 20, Level.ExplosionInteraction.MOB);
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 4, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 4, 1, false);
				}
			}
			for (int index2 = 0; index2 < 25; index2++) {
				world.addParticle(ParticleTypes.WITCH, x, y, z, (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)), (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)), (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)));
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 200) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 25, Level.ExplosionInteraction.MOB);
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 4, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 4, 1, false);
				}
			}
			for (int index3 = 0; index3 < 25; index3++) {
				world.addParticle(ParticleTypes.WITCH, x, y, z, (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)), (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)), (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)));
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 300) {
			entity.getPersistentData().putBoolean("CanDie", true);
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), 9999);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 30, Level.ExplosionInteraction.MOB);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/weather clear");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "/stopsound @a");
			TerribletwoMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound terribletwo:ltgdn master @a");
			});
		}
	}
}

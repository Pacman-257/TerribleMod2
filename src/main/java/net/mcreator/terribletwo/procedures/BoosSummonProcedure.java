package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.terribletwo.init.TerribletwoModEntities;

public class BoosSummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		double rngcheck = 0;
		rngcheck = Mth.nextInt(RandomSource.create(), 1, 10);
		Chain = 0.1;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3, 5));
		if (entity.getPersistentData().getDouble("IA") == 15) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:ltgmods")), SoundSource.NEUTRAL, 1, 0);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:ltgmods")), SoundSource.NEUTRAL, 1, 0, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 35) {
			if (rngcheck == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.GOD_OF_BASKETBALL_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (rngcheck == 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.THE_V_VIZARD_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.RED_WIZARD_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.PURPLE_WIZARD_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.YELLOW_WIZARD_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.GREEN_WIZARD_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (rngcheck == 3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.HAN_SOLO_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (rngcheck == 4) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.GOJO_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (rngcheck == 5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.NAPOLEON_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				for (int index0 = 0; index0 < 10; index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = TerribletwoModEntities.NAPOLEONIC_SOLDIER_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
			if (rngcheck == 6) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.FREDDY_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.BONNIE_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.CHICA_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.FOXY_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (rngcheck == 7) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.DARKIPLIER_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (rngcheck == 8) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.SANTA_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (rngcheck == 9) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.KANYE_WEST_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.SS_GOLEM_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.SS_GOLEM_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (rngcheck == 10) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.GUFF_LTG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/effect give @e[type=minecraft:bat] minecraft:invisibility infinite 1 true");
		}
		if (entity.getPersistentData().getDouble("IA") == 55) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/effect give @e[type=minecraft:bat] minecraft:invisibility infinite 1 true");
		}
		if (entity.getPersistentData().getDouble("IA") == 80) {
			BoosStateChangerProcedure.execute(world, x, y, z, entity);
		}
	}
}

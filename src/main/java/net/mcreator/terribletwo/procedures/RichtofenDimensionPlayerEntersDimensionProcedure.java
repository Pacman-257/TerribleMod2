package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
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

import net.mcreator.terribletwo.init.TerribletwoModGameRules;
import net.mcreator.terribletwo.init.TerribletwoModEntities;
import net.mcreator.terribletwo.entity.CShapeEntity;
import net.mcreator.terribletwo.TerribletwoMod;

public class RichtofenDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double cshapespawn = 0;
		cshapespawn = 0.12;
		if (!world.isClientSide()) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "playsound terribletwo:mahabre master @s");
				}
			}
			if (Math.random() < cshapespawn && world.getLevelData().getGameRules().getBoolean(TerribletwoModGameRules.TM_2_C_SHAPE_SPAWNING) == true) {
				TerribletwoMod.queueServerWork(2400, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "playsound terribletwo:cshapesiren neutral @a");
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = TerribletwoModEntities.C_SHAPE.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), 5, 15), y + Mth.nextInt(RandomSource.create(), 5, 15), z + Mth.nextInt(RandomSource.create(), 5, 15)), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
				TerribletwoMod.queueServerWork(4800, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + Mth.nextInt(RandomSource.create(), 5, 15)), (y + Mth.nextInt(RandomSource.create(), 5, 15)), (z + Mth.nextInt(RandomSource.create(), 5, 15))), Vec2.ZERO, _level,
										4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"tp @e[type=terribletwo:c_shape] @p");
				});
			} else if (!world.getEntitiesOfClass(CShapeEntity.class, AABB.ofSize(new Vec3(x, y, z), 8888, 8888, 8888), e -> true).isEmpty()) {
				TerribletwoMod.queueServerWork(2000, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:silence")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:silence")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				});
			}
		}
	}
}

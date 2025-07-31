package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

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
			}
		});
		TerribletwoMod.queueServerWork(655, () -> {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("terribletwo:piss_dimension"))) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"tp @e[type=terribletwo:peepee_man] @p");
			}
		});
	}
}

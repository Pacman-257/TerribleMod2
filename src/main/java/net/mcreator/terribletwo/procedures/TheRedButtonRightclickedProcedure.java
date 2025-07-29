package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
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

import net.mcreator.terribletwo.init.TerribletwoModGameRules;
import net.mcreator.terribletwo.TerribletwoMod;

public class TheRedButtonRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double nukechance = 0;
		nukechance = 0.001;
		if (Math.random() < nukechance) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 150, Level.ExplosionInteraction.TNT);
		} else if (world.getLevelData().getGameRules().getBoolean(TerribletwoModGameRules.TM_2_RED_BUTTON_NUKE) == true) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 150, Level.ExplosionInteraction.TNT);
		} else {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("terribletwo:richtofen_dimension"))) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a player terribletwo:hellnahecho");
				TerribletwoMod.queueServerWork(3, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnahecho")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnahecho")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
			if ((entity.level().dimension()) == Level.OVERWORLD) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a player terribletwo:hellnaw");
				TerribletwoMod.queueServerWork(3, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
			if ((entity.level().dimension()) == Level.NETHER) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a player terribletwo:hellnaw");
				TerribletwoMod.queueServerWork(3, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
			if ((entity.level().dimension()) == Level.END) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a player terribletwo:hellnahecho");
				TerribletwoMod.queueServerWork(3, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnahecho")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnahecho")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("terribletwo:piss_dimension"))) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a player terribletwo:hellnahecho");
				TerribletwoMod.queueServerWork(3, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnahecho")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnahecho")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("terribletwo:barrel_dimension"))) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a player terribletwo:hellnahecho");
				TerribletwoMod.queueServerWork(3, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnahecho")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnahecho")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("terribletwo:the_half_life_scientist_dimension"))) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a player terribletwo:hellnaw");
				TerribletwoMod.queueServerWork(3, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("terribletwo:the_real_rain_king_dimension"))) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a player terribletwo:hellnaw");
				TerribletwoMod.queueServerWork(3, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("terribletwo:the_vv_izard_v_veed"))) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a player terribletwo:hellnaw");
				TerribletwoMod.queueServerWork(3, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hellnaw")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
		}
	}
}

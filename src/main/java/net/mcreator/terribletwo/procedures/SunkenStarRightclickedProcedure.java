package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class SunkenStarRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 160);
			{
				ItemStack _ist = itemstack;
				_ist.hurtAndBreak(1, RandomSource.create(), null, () -> {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				});
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, (x + entity.getLookAngle().x * 2.5), y, (z + entity.getLookAngle().z * 2.5), 10, 3, 3, 3, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, (x + entity.getLookAngle().x * 5), y, (z + entity.getLookAngle().z * 5), 10, 3, 3, 3, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, (x + entity.getLookAngle().x * 8.5), y, (z + entity.getLookAngle().z * 8.5), 10, 3, 3, 3, 1);
			{
				Entity _ent = entity;
				_ent.teleportTo((x + entity.getLookAngle().x * 8.5), y, (z + entity.getLookAngle().z * 8.5));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + entity.getLookAngle().x * 8.5), y, (z + entity.getLookAngle().z * 8.5), _ent.getYRot(), _ent.getXRot());
			}
		} else if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 160);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, (x + entity.getLookAngle().x * 2.5), y, (z + entity.getLookAngle().z * 2.5), 10, 3, 3, 3, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, (x + entity.getLookAngle().x * 5), y, (z + entity.getLookAngle().z * 5), 10, 3, 3, 3, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, (x + entity.getLookAngle().x * 8.5), y, (z + entity.getLookAngle().z * 8.5), 10, 3, 3, 3, 1);
			{
				Entity _ent = entity;
				_ent.teleportTo((x + entity.getLookAngle().x * 8.5), y, (z + entity.getLookAngle().z * 8.5));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + entity.getLookAngle().x * 8.5), y, (z + entity.getLookAngle().z * 8.5), _ent.getYRot(), _ent.getXRot());
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:sunkenshine")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:sunkenshine")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 15, 3, 3, 3, 1);
	}
}

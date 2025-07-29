package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class CringeLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe cringiest of elements."), false);
		});
		TerribletwoMod.queueServerWork(120, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIt\u2019s only purpose is to be transmuted into the sigma Basedtanium using the Cosmic Kush."), false);
		});
		TerribletwoMod.queueServerWork(200, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oAlso I guess you can make armor with it but like why though?"), false);
		});
	}
}

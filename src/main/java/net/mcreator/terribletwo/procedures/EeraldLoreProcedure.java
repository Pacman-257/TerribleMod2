package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class EeraldLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oFake currency used to flood the market and control the world\u2019s commerce. "), false);
		});
		TerribletwoMod.queueServerWork(120, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oCreated by a shadowy kabbalah of very powerful and influential\u2026.."), false);
		});
		TerribletwoMod.queueServerWork(200, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oWell I would tell you more about this \u201Cquestion\u201D you ask me but I don\u2019t want to get canceled."), false);
		});
	}
}

package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class GermanManLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe union of creation between LowTierGod and Shia LaBeouf, the first human known only as the German Man rivals the gods in power."), false);
		});
		TerribletwoMod.queueServerWork(120, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHe does not carry with him the same responsibilities and duties befitting of his station, rather, he remains a wandering trickster of sorts. "), false);
		});
		TerribletwoMod.queueServerWork(200, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oLargely forgotten by the pages of history. He only emerges to annoy those he finds amusing. "), false);
		});
		TerribletwoMod.queueServerWork(300, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIf you are asking me of his existence then I\u2019m sure you have met him and if you have met him then you are more than likely the one he has taken an interest in."), false);
		});
	}
}

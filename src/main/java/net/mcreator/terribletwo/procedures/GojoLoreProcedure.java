package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class GojoLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal("\u00A7oThe self-proclaimed \u201CStrongest\u201D, when in actuality he doesn\u2019t even make the top 5, however I will say his Double Cup Technique is quite impressive for someone of his caliber. "),
						false);
		});
		TerribletwoMod.queueServerWork(120, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal("\u00A7oOne time Gojo fought Mordicus of the Park Pantheon and lost so hard to his death dump technique, he was vertically cut in half, it was some of the funniest shit i\u2019ve ever seen. "), false);
		});
	}
}

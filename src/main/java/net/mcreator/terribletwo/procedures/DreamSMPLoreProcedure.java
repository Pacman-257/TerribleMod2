package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class DreamSMPLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Little Saint James Island of Minecraft, the regular spot for groomers and pedos to hang out and plan for their next victims and videos."), false);
		});
		TerribletwoMod.queueServerWork(120, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThis place though was also the home of the Sussians, a peaceful species. "), false);
		});
		TerribletwoMod.queueServerWork(200, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThat all changed though when the Second Player attacked one man, Dream, to which the SMP was immediately outed & canceled on Twitter for \u201Cbeing too toxic\u201D."), false);
		});
		TerribletwoMod.queueServerWork(300, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe original space of the DreamSMP was a casualty of the Great Leansplosion."), false);
		});
	}
}

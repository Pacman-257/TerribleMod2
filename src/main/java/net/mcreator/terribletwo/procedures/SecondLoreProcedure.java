package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class SecondLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHe who walks amongst gods unrivaled in strength & power. "), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Second Player was the second vessel Shia LeBeouf created to take revenge on LowTierGod."), false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIt possessed a different body, yet the same soul. "), false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal("\u00A7oThe Second Player traveled across dimensions gathering powerful artifacts and creating weapons of immeasurable power in their quest to usurp LowTierGod from the throne of heaven. "), false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oMany of these dimensions though no longer exist due to the chaos that was the great Leansplosion."), false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oLowTierGod seeing the growing strength of The Second Player created a devious trap for them."), false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal("\u00A7oA dimension known as the Richtofen Dimension, that upon entering would entomb whoever was unfortunate enough to step inside under an infinite amount of matter trapping them for all eternity."),
						false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe bones of this dimension are the foundations of the one we currently reside"), false);
		});
		TerribletwoMod.queueServerWork(840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe very ground beneath your feet was the trap that was laid for you in a past life."), false);
		});
		TerribletwoMod.queueServerWork(940, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oYet here you stand again,"), false);
		});
		TerribletwoMod.queueServerWork(1040, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oReturned."), false);
		});
	}
}

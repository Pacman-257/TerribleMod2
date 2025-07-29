package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class WestLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oShakespeare, Lewis, and Clark set out for the frontier for riches, glory, honor, legacy, and bigger than all that friendship. "), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oTo save their dear friend, Benjamin Franklin, from the clutches of Jesse James and his posse of cow wranglers, the Van der Linde Gang. "), false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oTheir adventures were numerous, they discovered dinosaurs and other quirky things. Their legend will forever be remembered by history though the actual story from start to finish is far too long for me to recount here with our limited time so I will make a comparison..."),
						false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHave you ever seen Stardust Crusaders? "), false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oYeah you know, JoJo part III? "), false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oYeah, that's the one!"), false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIt was kinda like that. "), false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oUnfortunately, this story doesn\u2019t have a happy ending\u2026"), false);
		});
		TerribletwoMod.queueServerWork(840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oWhile Lewis and Clark returned home having successfully made it to the west coast hailed as heroes, Shakespeare would not be so lucky\u2026"), false);
		});
		TerribletwoMod.queueServerWork(940, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oUltimately failing to acquire the key to Benjamin Franklin\u2019s kite he was unable to bring him back from the dead. "), false);
		});
		TerribletwoMod.queueServerWork(1040, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oIn sadness, he took an extended vacation to Italy where he played the hit new game Spelunky for the Xbox 360 and went mad playing the game for over 100 hours straight before falling into a fugue state never to recover. "),
						false);
		});
		TerribletwoMod.queueServerWork(1140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oAbducted by the Vatican, he was sealed within a big black sarcophagus underneath the Vatican, UNDERNEATH the Vatican archives with the final remnant of Benjamin Franklin's memory, the kite he gave him on his deathbed. "),
						false);
		});
		TerribletwoMod.queueServerWork(1240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oEven in his madness he still guards the kite as he promised his friend he would, till the very end. "), false);
		});
	}
}

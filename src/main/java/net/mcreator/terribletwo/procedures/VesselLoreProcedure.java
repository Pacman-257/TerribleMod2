package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class VesselLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oA homunculus created by the vengeful god Shia LeBeouf to take revenge on LowTierGod."), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								"\u00A7oImbued with the divine essence of both creation and destruction the vessel was originally meant to be a servant, a mere instrument in the downfall of an egotistical megalomaniac but it became so much more."),
						false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oAs it strived toward its goal something happened."), false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIt began to think, to reason, to become something unique"), false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oA spirit of some kind had caught its flesh and had taken to it as it\u2019s home."), false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oLike a hermit crab finding a new shell."), false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIt gained consciousness and awoke into a world unknown, striving ahead for reasons it did not understand."), false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oDid it strive ahead to survive, to thrive, to live? "), false);
		});
		TerribletwoMod.queueServerWork(840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oPerhaps, but I think I know why it truly continued to struggle."), false);
		});
		TerribletwoMod.queueServerWork(940, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThough the mind was of alien origin, the flesh of the body had been manufactured towards a goal and that flesh had not lost its nature."), false);
		});
		TerribletwoMod.queueServerWork(1040, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe spirit sought to conquer the world, to see the highest peaks of creations and seek the secrets that lie at the far corners of the earth."), false);
		});
		TerribletwoMod.queueServerWork(1140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe vessel sought to conquer heaven to take revenge on LowTierGod in the name of its creator."), false);
		});
		TerribletwoMod.queueServerWork(1240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe vessel compelled the spirit and the spirit compelled the vessel."), false);
		});
		TerribletwoMod.queueServerWork(1340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oAnd in this union they stayed fueling each other forward."), false);
		});
		TerribletwoMod.queueServerWork(1440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oI tell you all this for one simple reason."), false);
		});
		TerribletwoMod.queueServerWork(1540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oYou strive forward to seek the completion of your mission because in part you are the vessel, and you are not the first."), false);
		});
		TerribletwoMod.queueServerWork(1640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oFor all the times you\u2019ve died you have returned and neither your vessel nor spirit are eternal."), false);
		});
		TerribletwoMod.queueServerWork(1740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThey change and shift like the wind and while your form is not concrete you, in a sense, always remain."), false);
		});
		TerribletwoMod.queueServerWork(1840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oYour mission always remains."), false);
		});
		TerribletwoMod.queueServerWork(1940, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oYour vessel is one of countless but your spirit is of a third incarnation as two more have come before you."), false);
		});
		TerribletwoMod.queueServerWork(2040, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oEach a player in a much larger game that neither you nor I have the ability to fully know or understand. Each of the \u201CPlayers\u201D have a story."), false);
		});
		TerribletwoMod.queueServerWork(2140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oI would be glad to share them with you if you would like."), false);
		});
	}
}

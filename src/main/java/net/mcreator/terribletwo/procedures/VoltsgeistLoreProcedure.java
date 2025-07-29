package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class VoltsgeistLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oOne of Benjamin Franklin\u2019s two masterworks and arguably his greatest."), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oVoltsgeist is the name of his time traveling kite. "), false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBenjamin Franklin, a cunning man, knew his time was running short in the dying days of 1787. "), false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal("\u00A7oHe planned his death and with the aid of his mentor and trusted friend William Shakespeare, he planned to circumvent death itself by bringing himself back from the past to the present. "), false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oOn his deathbed, he gave Shakespeare the kite necessary to begin the enactment of his plan. Telling him of the secret location of the key of the kite hidden away so that no one could use its power before his death. "),
						false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oUnfortunately, upon looking for the key Shakespeare found nothing save a ransom note from Jesse James taunting him to follow him west and claim back the stolen relic. "), false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								"\u00A7oKnowing it was a trap, but having no choice in the matter, Shakespeare with the help of Thomas Jefferson recruited the two greatest American explorers of his time, Meriweather Lewis and William Clark. "),
						false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oTogether the band would set out west to retrieve the stolen key to Benjamin Franklin's resurrection."), false);
		});
	}
}

package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class ShakespeareLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oWhat more can be said of the immortal William Shakespeare. "), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oA once in a century talent, Shakespeare is primarily known as the greatest playwright to have ever lived with his magnum opus being Hamlet II however, this fact often overshadows the rest of his life's achievements. "),
						false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								"\u00A7oWith a keen eye for the latent potential of a person, Shakespeare was above anything else a cultivator of talent. Taking on many students over the course of his life, helping them to achieve greatness. "),
						false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oHis greatest student and dearest friend, the illustrious Benjamin Franklin, cultivated the Cosmic Kush as well as invented a time traveling kite known as Voltsgeist which he planned to use to circumvent his own death. "),
						false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oOn his deathbed, Benjamin Franklin entrusted Shakespeare with one of the two pieces of Voltsgeist, that being the kite and was told the location of the second piece, the Key."),
						false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								"\u00A7oUpon looking though, Shakespeare only found a ransom note by the infamous cowpoke and master of Gun Fu, Jesse James, taunting the playwright west if he ever wished to see the Key or his dear friend again."),
						false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oUnfortunately though despite his best efforts, Shakespeare never managed to obtain the key to bring back his friend and after a trip to Italy were he played the hit new indie game Spelunky for over 100 hours straight\u2026 He lost his mind."),
						false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oAbducted by the Vatican he was put underneath the Vatican, UNDERNEATH the Vatican archives in a big black sarcophagus were he still lies today, holding the kite close as to at least partially keep the promise he made his friend to protect the kite."),
						false);
		});
		TerribletwoMod.queueServerWork(840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oCertainly the sarcophagus is still here, even after all this time and while you may not be able to access the sarcophagus by normal means there MUST be a way to get inside."),
						false);
		});
		TerribletwoMod.queueServerWork(940, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe kite will further assist you in your quest."), false);
		});
		TerribletwoMod.queueServerWork(1040, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oI can feel it."), false);
		});
	}
}

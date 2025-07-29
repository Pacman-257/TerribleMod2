package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class LTGLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oOne of the two gods who created the modern world."), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oLowTierGod alongside Shia LaBeouf reigned in heaven for all recorded history."), false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oCreating a combined media empire with no equal."), false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oShia LaBeouf controlled the realm of legacy media and LowTierGod controlled all new age media streaming, online video, memes etc."), false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oAs the internet grew and legacy media became more and more irrelevant Shia LaBeouf was increasingly sidelined while LowTierGod\u2019s influence only continued to grow."), false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal("\u00A7oWith his reign over legacy media waning and his movie career a total flop Shia LaBeouf grew jealous and resentful of LowTierGod\u2019s booming audience and egomaniacal personality."), false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThese tensions eventually boiled over and the two had a falling out."), false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oShia LaBeouf descended from heaven to create his own perfect world, in his image."), false);
		});
		TerribletwoMod.queueServerWork(840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHowever this world he birthed, later referred to as the Rain King dimension, was completely devoid of life and was nowhere near as vast or beautiful as the previous world."),
						false);
		});
		TerribletwoMod.queueServerWork(940, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oFor try as he might Shia LaBeouf could not alone create a world comparable to the original without LowTierGod."), false);
		});
		TerribletwoMod.queueServerWork(1040, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								"\u00A7oFilled with rage, Shia LaBeouf decided to take revenge on LowTierGod by eradicating all of humanity on the fateful day of 9/11, so that he might destroy his media empire. The one thing he truly cared about."),
						false);
		});
		TerribletwoMod.queueServerWork(1140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oIn the aftermath of the destruction, Shia LaBeouf and LowTierGod fought a fierce battle over the devastated world to determine who would hold the mantle of heaven. A battle like none seen before or since commenced."),
						false);
		});
		TerribletwoMod.queueServerWork(1240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("In the end LowTierGod emerged victorious and sealed Shia LaBeouf within his \u201Cperfect\u201D world to rot for all eternity."), false);
		});
		TerribletwoMod.queueServerWork(1340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIn the days thereafter LowTierGod grew more and more tyrannical in his rule over what little remained after 9/11."), false);
		});
		TerribletwoMod.queueServerWork(1440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oAttempting to build the world back to its previous state he alone could not create anything comparable to what used to be."), false);
		});
		TerribletwoMod.queueServerWork(1540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oOnly unleashing more chaos and memes upon the already broken world."), false);
		});
		TerribletwoMod.queueServerWork(1640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHe anointed many mods during this time the most prominent of which being Guff."), false);
		});
		TerribletwoMod.queueServerWork(1740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oGifted with the Spear of Longsusis he would maintain the current order."), false);
		});
		TerribletwoMod.queueServerWork(1840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oI know your task, I know you, the vessel, were sent here by Shia Labeouf to kill LowTierGod"), false);
		});
		TerribletwoMod.queueServerWork(1940, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBut I caution you, without the Spear of Longsusis you are no match for him and his mods"), false);
		});
		TerribletwoMod.queueServerWork(2040, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oFind the spear and you might just prevail."), false);
		});
	}
}

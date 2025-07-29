package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class TM2LoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe state of the world as it is now is not what has always been."), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThere was a time before recording, before even I existed that the world was a much less chaotic place."), false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe reign of the two tyrants"), false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oLowTierGod and Shia LaBeouf have thrown the world into unadulterated memetic chaos."), false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oAll the turmoil you see around you,"), false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oAll the insanity that doesn\u2019t seem to quite fit with the rest of creation,"), false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIt is all their doing."), false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oI know you seek the death of LowTierGod"), false);
		});
		TerribletwoMod.queueServerWork(840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								"\u00A7oAnd you were in part willed into being by the hand of Shia LaBeouf but I urge you to consider that all the suffering that has been and will be, could be undone if only Shia LaBeouf were to die as well."),
						false);
		});
		TerribletwoMod.queueServerWork(940, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe twisted tree of creation, the modified existence we find ourselves slaves to is held up by these two powers."), false);
		});
		TerribletwoMod.queueServerWork(1040, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIf one is to stand in the end this diseased tree will only rot in remnant thanks to your actions"), false);
		});
		TerribletwoMod.queueServerWork(1140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oA painful existence of tyranny by a vengeful god of a different name"), false);
		});
		TerribletwoMod.queueServerWork(1240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oTo strike down both though\u2026."), false);
		});
		TerribletwoMod.queueServerWork(1340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIt could bring us to liberation"), false);
		});
		TerribletwoMod.queueServerWork(1440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oTo true freedom and happiness."), false);
		});
	}
}

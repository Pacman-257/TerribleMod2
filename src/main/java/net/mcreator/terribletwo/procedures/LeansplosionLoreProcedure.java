package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class LeansplosionLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7There is a saying, \u201CYou can\u2019t make an omelet without breaking a few eggs.\u201D The great Leanspolsion was a textbook example of this. "), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oA powerful man only known as the Wizard, in his scientific pursuit of ever more powerful recreational drugs created the most potent potion of them all. "), false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHowever, in his hasty and reckless pursuit of his dream, he caused this terrible calamity. "), false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe world flooded with lean for well over 100 years."), false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oShaking the delicate balance of dimensions precariously, stacked upon themselves causing the shuffling of worlds and dimensions and creating rips and tears in space. "), false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oIn the chaos many dimensions fell and crashed to the floor of creation and there is where we reside now. When the flood subsided, pockets remained. Now called Lean Oceans they can still be seen across many dimensions today. "),
						false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oAs for the Wizard, during this time he gained mastery over the new element of lean creating a whole world for himself to rule over as a god."), false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBeyond just this though his mastery over lean and the dark arts of drugcraft granted him control of much of the Overworlds political and economic affairs."), false);
		});
		TerribletwoMod.queueServerWork(840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oAllowing him and some of his boyz to form a shadow government that still rules the wizarding world to this day."), false);
		});
	}
}

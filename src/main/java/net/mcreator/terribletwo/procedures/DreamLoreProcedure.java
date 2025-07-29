package net.mcreator.terribletwo.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.init.TerribletwoModItems;
import net.mcreator.terribletwo.TerribletwoMod;

public class DreamLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oThe masked speedrunner of popular acclaim, Dream used to be one of the top influencers of his time before he was caught faking his Minecraft Manhunt videos as well as breaking statistical probability to speedrun the game faster than his peers. "),
						false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHe fell from grace and was canceled after making a really shitty song. "), false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oActually, I have a copy here if you want to listen to it. "), false);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TerribletwoModItems.DREAM_MEMORY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBe warned it\u2019s straight ass. "), false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal("\u00A7oIn the end though, his life of grooming minors and playing Minecraft all day was cut short due to Shia LaBeouf\u2019s eradication of humanity on the dread day of revelation, September 11th 2001. "),
						false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHowever he did have a powerful ally LowTierGod who resurrected him after his death because he loved watching his funny little videos."), false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oNow as one of his mods Dream was sent by LowTie God to eliminate the second player where the speed runner fell for the final time in combat."), false);
		});
	}
}

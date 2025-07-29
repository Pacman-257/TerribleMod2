package net.mcreator.terribletwo.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.terribletwo.init.TerribletwoModItems;
import net.mcreator.terribletwo.TerribletwoMod;

import java.util.HashMap;

public class EmptyScrollProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:FirstVerse") ? ((EditBox) guistate.get("text:FirstVerse")).getValue() : "").equals("Pickle Rick")) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TerribletwoModItems.EMPTY_SCROLL.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("O LORD"), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("GIVE"), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("PICKLE RICK..."), false);
			TerribletwoMod.queueServerWork(100, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7oThe empty scroll transforms into a \u00A76Pickle Rick"), false);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(TerribletwoModItems.PICKLE_RICK.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			});
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe empty scroll fades away..."), false);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TerribletwoModItems.EMPTY_SCROLL.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}

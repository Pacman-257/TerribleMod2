package net.mcreator.terribletwo.procedures;

import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.terribletwo.init.TerribletwoModItems;

import javax.annotation.Nullable;

import java.util.List;

@EventBusSubscriber(value = {Dist.CLIENT})
public class TheEndTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == TerribletwoModItems.THE_END.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(1, Component.literal("\u00A7nTerrible Mod 2 - \u00A7oMade in MCreator."));
				tooltip.add(2, Component.literal("\u00A7lDesdinova \u00A7r- \u00A7oCoding, implementation, & spritework"));
				tooltip.add(3, Component.literal("\u00A7lFulcanelli \u00A7r- \u00A7oWriting, most audio work, LowTierGod code, voice of the Wizard & Elves."));
			} else {
				tooltip.add(Component.literal("\u00A7oPress SHIFT to see credits."));
			}
		}
	}
}

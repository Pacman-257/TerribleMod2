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
public class SecretEndingTooltipProcedure {
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
		if (itemstack.getItem() == TerribletwoModItems.SECRET_ENDING.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(1, Component.literal("\u00A7nTerrible Mod 2 - \u00A7oMade in MCreator."));
				tooltip.add(2, Component.literal("\u00A7lDesdinova \u00A7r- \u00A7oCoding, implementation, & spritework"));
				tooltip.add(3, Component.literal("\u00A7lFulcanelli \u00A7r- \u00A7oWriting, most audio work, LowTierGod code, voice of the Wizard & Elves."));
				tooltip.add(4, Component.literal("\u00A7n-Special Thanks-"));
				tooltip.add(5, Component.literal("\u00A7lCbrauto \u00A7r- \u00A7oLil' Gray Alien & voice of Athletic Steve"));
				tooltip.add(6, Component.literal("\u00A7lBuffMordo \u00A7r- \u00A7oPear paintings & Weezer music disc."));
				tooltip.add(7, Component.literal("\u00A7lTurtle_Licker \u00A7r- \u00A7oIdeas for Gojo & Terrible Mod 1 Guff"));
				tooltip.add(8, Component.literal("\u00A7lHeretic Hunter \u00A7r- \u00A7oJohn Adams painting."));
				tooltip.add(9, Component.literal("\u00A7lFrost_Beer \u00A7r- \u00A7oVatican City model."));
				tooltip.add(10, Component.literal("\u00A7lImNotaCausalty & ItsJim \u00A7r- \u00A7oMaking me find MCreator"));
				tooltip.add(11, Component.literal("\u00A7oVarious PlanetMinecraft & Skindex users, The MCreator Forums."));
				tooltip.add(12, Component.literal("\u00A7oAnyone who has supported my creative endeavours in the past."));
				tooltip.add(13, Component.literal("\u00A7lYou\u00A7r \u00A7ocurrently playing the mod, thank you!"));
			} else {
				tooltip.add(Component.literal("\u00A7oPress SHIFT to see the full credits."));
			}
		}
	}
}

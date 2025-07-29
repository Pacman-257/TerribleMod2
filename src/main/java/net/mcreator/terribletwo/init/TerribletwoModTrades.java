
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class TerribletwoModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == TerribletwoModVillagerProfessions.JEWIGER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(TerribletwoModItems.EERALD.get()), 1, 5, 0.05f));
		}
	}
}

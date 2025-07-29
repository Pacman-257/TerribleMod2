
package net.mcreator.terribletwo.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class DraculaFlowItem extends RecordItem {
	public DraculaFlowItem() {
		super(0, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:draculaflow")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4640);
	}
}

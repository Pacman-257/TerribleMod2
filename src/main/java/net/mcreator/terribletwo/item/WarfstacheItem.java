
package net.mcreator.terribletwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WarfstacheItem extends Item {
	public WarfstacheItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}


package net.mcreator.terribletwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MoneyiItem extends Item {
	public MoneyiItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

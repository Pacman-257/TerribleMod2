
package net.mcreator.terribletwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RainItem extends Item {
	public RainItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}


package net.mcreator.terribletwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MoustascheItem extends Item {
	public MoustascheItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

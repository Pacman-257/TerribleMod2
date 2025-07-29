
package net.mcreator.terribletwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.terribletwo.init.TerribletwoModFluids;

public class PissItem extends BucketItem {
	public PissItem() {
		super(TerribletwoModFluids.PISS.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}

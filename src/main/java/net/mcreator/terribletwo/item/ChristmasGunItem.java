
package net.mcreator.terribletwo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.terribletwo.procedures.ChristmasGunRightclickedProcedure;

public class ChristmasGunItem extends Item {
	public ChristmasGunItem() {
		super(new Item.Properties().durability(25).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ChristmasGunRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}

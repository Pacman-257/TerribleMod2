
package net.mcreator.terribletwo.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.procedures.LeanMobplayerCollidesBlockProcedure;
import net.mcreator.terribletwo.init.TerribletwoModFluids;

public class LeanBlock extends LiquidBlock {
	public LeanBlock() {
		super(TerribletwoModFluids.LEAN.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		LeanMobplayerCollidesBlockProcedure.execute(world, entity);
	}
}

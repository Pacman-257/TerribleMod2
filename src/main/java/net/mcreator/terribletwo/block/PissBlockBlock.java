
package net.mcreator.terribletwo.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.procedures.PissBlockBlockDestroyedByPlayerProcedure;

public class PissBlockBlock extends Block {
	public PissBlockBlock() {
		super(BlockBehaviour.Properties.of().liquid()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:piss")), () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:piss")),
						() -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:piss")), () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:piss")),
						() -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:piss"))))
				.strength(1024f).friction(0.7f).speedFactor(1.1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		PissBlockBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}

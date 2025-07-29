package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.init.TerribletwoModBlocks;

public class PissBlockBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), TerribletwoModBlocks.PISS.get().defaultBlockState(), 3);
	}
}

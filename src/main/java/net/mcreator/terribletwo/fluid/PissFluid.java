
package net.mcreator.terribletwo.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.terribletwo.init.TerribletwoModItems;
import net.mcreator.terribletwo.init.TerribletwoModFluids;
import net.mcreator.terribletwo.init.TerribletwoModFluidTypes;
import net.mcreator.terribletwo.init.TerribletwoModBlocks;

public abstract class PissFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> TerribletwoModFluidTypes.PISS_TYPE.get(), () -> TerribletwoModFluids.PISS.get(), () -> TerribletwoModFluids.FLOWING_PISS.get())
			.explosionResistance(100f).bucket(() -> TerribletwoModItems.PISS_BUCKET.get()).block(() -> (LiquidBlock) TerribletwoModBlocks.PISS.get());

	private PissFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PissFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PissFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

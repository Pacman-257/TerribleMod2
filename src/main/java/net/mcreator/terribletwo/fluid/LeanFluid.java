
package net.mcreator.terribletwo.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.terribletwo.init.TerribletwoModItems;
import net.mcreator.terribletwo.init.TerribletwoModFluids;
import net.mcreator.terribletwo.init.TerribletwoModFluidTypes;
import net.mcreator.terribletwo.init.TerribletwoModBlocks;

public abstract class LeanFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> TerribletwoModFluidTypes.LEAN_TYPE.get(), () -> TerribletwoModFluids.LEAN.get(), () -> TerribletwoModFluids.FLOWING_LEAN.get())
			.explosionResistance(100f).tickRate(1).bucket(() -> TerribletwoModItems.LEAN_BUCKET.get()).block(() -> (LiquidBlock) TerribletwoModBlocks.LEAN.get());

	private LeanFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRAGON_BREATH;
	}

	public static class Source extends LeanFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LeanFluid {
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

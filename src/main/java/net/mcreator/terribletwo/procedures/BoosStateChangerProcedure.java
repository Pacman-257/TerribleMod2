package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class BoosStateChangerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double StateSelector = 0;
		entity.getPersistentData().putString("PreviousPreviousState", (entity.getPersistentData().getString("PreviousState")));
		entity.getPersistentData().putString("PreviousState", (entity.getPersistentData().getString("State")));
		entity.getPersistentData().putDouble("IA", 0);
		if (!entity.getPersistentData().getBoolean("Phase")) {
			StateSelector = Mth.nextInt(RandomSource.create(), 0, 4);
			if (StateSelector == 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:ltgmelee")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:ltgmelee")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				entity.getPersistentData().putString("State", "Melee");
			}
			if (StateSelector == 1) {
				entity.getPersistentData().putString("State", "Fireball");
			}
			if (StateSelector == 2) {
				entity.getPersistentData().putString("State", "Summon");
			}
			if (StateSelector == 3) {
				entity.getPersistentData().putString("State", "Regeneration");
			}
			if (StateSelector == 4) {
				entity.getPersistentData().putString("State", "Teleport");
			}
		} else {
			StateSelector = Mth.nextInt(RandomSource.create(), 0, 7);
			if (StateSelector < 3) {
				entity.getPersistentData().putString("State", "FracturedTeleport");
			}
			if (StateSelector == 3) {
				entity.getPersistentData().putString("State", "FracturedArtemis");
			}
			if (StateSelector == 4) {
				entity.getPersistentData().putString("State", "FracturedBeam");
			}
			if (StateSelector == 5) {
				entity.getPersistentData().putString("State", "FracturedDispersion");
			}
			if (StateSelector == 6) {
				entity.getPersistentData().putString("State", "FracturedArtemisTeleport");
			}
			if (StateSelector == 7) {
				entity.getPersistentData().putString("State", "FracturedTeleportBeam");
			}
		}
		if ((entity.getPersistentData().getString("State")).equals(entity.getPersistentData().getString("PreviousState")) || (entity.getPersistentData().getString("State")).equals(entity.getPersistentData().getString("PreviousPreviousState"))) {
			BoosStateChangerProcedure.execute(world, x, y, z, entity);
		}
	}
}

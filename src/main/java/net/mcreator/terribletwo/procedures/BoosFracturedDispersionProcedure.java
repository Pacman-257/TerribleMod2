package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.init.TerribletwoModEntities;
import net.mcreator.terribletwo.entity.BoosShieldEntity;

public class BoosFracturedDispersionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Grow = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (entity.getPersistentData().getDouble("IA") == 30) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TerribletwoModEntities.BOOS_SHIELD.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
			if (entity.getPersistentData().getDouble("IA") == 50) {
				if (!world.getEntitiesOfClass(BoosShieldEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).isEmpty()) {
					for (int index0 = 0; index0 < 10; index0++) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SONIC_BOOM,
									(entity.getX()
											+ (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().x() * 3) - entity.getX()) * Grow),
									(entity.getY() + 1
											+ (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().y() * 3) - entity.getY()) * Grow),
									(entity.getZ()
											+ (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().z() * 3) - entity.getZ()) * Grow),
									1, 0.05, 0.05, 0.05, 0);
						Grow = Grow + 0.095;
					}
					(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)
							.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("terribletwo:low_tier_god_damage")))), (float) 0.5);
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.00035));
					entity.getPersistentData().putDouble("IA", 49);
					entity.getPersistentData().putDouble("TeleportTimer", (entity.getPersistentData().getDouble("TeleportTimer") + 1));
				}
			}
			if (entity.getPersistentData().getDouble("TeleportTimer") == 50) {
				entity.getPersistentData().putDouble("TeleportTimer", 0);
				BoosFractureTeleportProcedure.execute(world, x, y, z, entity);
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 200) {
			BoosStateChangerProcedure.execute(world, x, y, z, entity);
		}
	}
}

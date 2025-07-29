package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.terribletwo.init.TerribletwoModEntities;
import net.mcreator.terribletwo.entity.BoosSmallFireballProjectileEntity;
import net.mcreator.terribletwo.TerribletwoMod;

public class BoosTeleportAttackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (entity.getPersistentData().getDouble("IA") == 10) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLASH, x, y, z, 120, 0, 0, 0, 2);
		}
		if (entity.getPersistentData().getDouble("IA") == 30) {
			BoosTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 60) {
			BoosTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 90) {
			BoosTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 45) {
			Chain = 3;
			for (int index0 = 0; index0 < (int) Chain; index0++) {
				TerribletwoMod.queueServerWork((int) ChainWait, () -> {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback) {
									AbstractArrow entityToSpawn = new BoosSmallFireballProjectileEntity(TerribletwoModEntities.BOOS_SMALL_FIREBALL_PROJECTILE.get(), level);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 5, 1);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				});
				ChainWait = ChainWait + 3;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 75) {
			Chain = 3;
			for (int index1 = 0; index1 < (int) Chain; index1++) {
				TerribletwoMod.queueServerWork((int) ChainWait, () -> {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback) {
									AbstractArrow entityToSpawn = new BoosSmallFireballProjectileEntity(TerribletwoModEntities.BOOS_SMALL_FIREBALL_PROJECTILE.get(), level);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 5, 1);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				});
				ChainWait = ChainWait + 3;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 105) {
			Chain = 3;
			for (int index2 = 0; index2 < (int) Chain; index2++) {
				TerribletwoMod.queueServerWork((int) ChainWait, () -> {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback) {
									AbstractArrow entityToSpawn = new BoosSmallFireballProjectileEntity(TerribletwoModEntities.BOOS_SMALL_FIREBALL_PROJECTILE.get(), level);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 5, 1);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				});
				ChainWait = ChainWait + 3;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 140) {
			BoosStateChangerProcedure.execute(world, x, y, z, entity);
		}
	}
}

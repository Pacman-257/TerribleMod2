package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.entity.BoosEntity;

import java.util.List;
import java.util.Comparator;

public class BoosArtemisIAProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("Fly", (entity.getPersistentData().getDouble("Fly") + 1));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLASH, x, y, z, 3, 0.1, 0.1, 0.1, 0);
		if (entity.getPersistentData().getDouble("Fly") == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 2);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 2, false);
				}
			}
		}
		if (!world.getEntitiesOfClass(BoosEntity.class, AABB.ofSize(new Vec3(x, y, z), 110, 110, 110), e -> true).isEmpty()) {
			if (!((((Entity) world.getEntitiesOfClass(BoosEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + ((((Entity) world.getEntitiesOfClass(BoosEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) * 0.0125),
						(entity.getDeltaMovement().y() + (((((Entity) world.getEntitiesOfClass(BoosEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()
								+ (((Entity) world.getEntitiesOfClass(BoosEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getBbHeight() * 0.5) - entity.getY()) * 0.0125),
						(entity.getDeltaMovement().z() + ((((Entity) world.getEntitiesOfClass(BoosEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) * 0.0125)));
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator == (((Entity) world.getEntitiesOfClass(BoosEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("terribletwo:low_tier_god_damage")))),
									1);
						}
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("Fly") == 100) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}

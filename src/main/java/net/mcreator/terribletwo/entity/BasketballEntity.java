
package net.mcreator.terribletwo.entity;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;

import net.mcreator.terribletwo.procedures.BasketballProjectileHitsLivingEntityProcedure;
import net.mcreator.terribletwo.init.TerribletwoModItems;
import net.mcreator.terribletwo.init.TerribletwoModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class BasketballEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(TerribletwoModItems.BASKET.get());

	public BasketballEntity(EntityType<? extends BasketballEntity> type, Level world) {
		super(type, world, PROJECTILE_ITEM);
	}

	public BasketballEntity(EntityType<? extends BasketballEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world, PROJECTILE_ITEM);
	}

	public BasketballEntity(EntityType<? extends BasketballEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world, PROJECTILE_ITEM);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getDefaultPickupItem() {
		return new ItemStack(TerribletwoModItems.BASKET.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		BasketballProjectileHitsLivingEntityProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static BasketballEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 0.7f, 3, 100);
	}

	public static BasketballEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 0.7f, 3, 100);
	}

	public static BasketballEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		BasketballEntity entityarrow = new BasketballEntity(TerribletwoModEntities.BASKETBALL.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static BasketballEntity shoot(LivingEntity entity, LivingEntity target) {
		BasketballEntity entityarrow = new BasketballEntity(TerribletwoModEntities.BASKETBALL.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0.7f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(3);
		entityarrow.setKnockback(100);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}


package net.mcreator.terribletwo.entity;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;

import net.mcreator.terribletwo.procedures.JumpscareBonnieProjectileHitsPlayerProcedure;
import net.mcreator.terribletwo.init.TerribletwoModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class JumpscareBonnieEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.CAVE_AIR);

	public JumpscareBonnieEntity(EntityType<? extends JumpscareBonnieEntity> type, Level world) {
		super(type, world, PROJECTILE_ITEM);
	}

	public JumpscareBonnieEntity(EntityType<? extends JumpscareBonnieEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world, PROJECTILE_ITEM);
	}

	public JumpscareBonnieEntity(EntityType<? extends JumpscareBonnieEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world, PROJECTILE_ITEM);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getDefaultPickupItem() {
		return new ItemStack(Blocks.CAVE_AIR);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		JumpscareBonnieProjectileHitsPlayerProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), entity);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static JumpscareBonnieEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1f, 2, 0);
	}

	public static JumpscareBonnieEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 1f, 2, 0);
	}

	public static JumpscareBonnieEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		JumpscareBonnieEntity entityarrow = new JumpscareBonnieEntity(TerribletwoModEntities.JUMPSCARE_BONNIE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static JumpscareBonnieEntity shoot(LivingEntity entity, LivingEntity target) {
		JumpscareBonnieEntity entityarrow = new JumpscareBonnieEntity(TerribletwoModEntities.JUMPSCARE_BONNIE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(2);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}

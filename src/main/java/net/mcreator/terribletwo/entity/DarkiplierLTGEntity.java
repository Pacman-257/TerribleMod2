
package net.mcreator.terribletwo.entity;

import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class DarkiplierLTGEntity extends Monster {
	public DarkiplierLTGEntity(EntityType<DarkiplierLTGEntity> type, Level world) {
		super(type, world);
		xpReward = 50;
		setNoAi(false);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.DIAMOND_SWORD));
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, MarkiplierEntity.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, BaboonEntity.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PeashooterEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, FreddyFazbearEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, BonnieEntity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, ChicaEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, FoxyEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, HyperRealisticFreddyFazbearEntity.class, false, false));
		this.goalSelector.addGoal(11, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(12, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(14, new FloatGoal(this));
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public Vec3 getPassengerRidingPosition(Entity entity) {
		return super.getPassengerRidingPosition(entity).add(0, -0.35F, 0);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:darkalive"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:darkhit"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:darkdeath"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean fireImmune() {
		return true;
	}

	public static void init(SpawnPlacementRegisterEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 200);
		builder = builder.add(Attributes.ARMOR, 10);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}

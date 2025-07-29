
package net.mcreator.terribletwo.entity;

import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.terribletwo.init.TerribletwoModEntities;

public class GermanManEntity extends Monster {
	public GermanManEntity(EntityType<GermanManEntity> type, Level world) {
		super(type, world);
		xpReward = 69;
		setNoAi(false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new OpenDoorGoal(this, true));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(4, new RemoveBlockGoal(Blocks.BOOKSHELF, this, 1, (int) 128));
		this.goalSelector.addGoal(5, new RemoveBlockGoal(Blocks.CHEST, this, 1, (int) 128));
		this.goalSelector.addGoal(6, new RemoveBlockGoal(Blocks.RED_BED, this, 1, (int) 128));
		this.goalSelector.addGoal(7, new RemoveBlockGoal(Blocks.WHITE_BED, this, 1, (int) 128));
		this.goalSelector.addGoal(8, new RemoveBlockGoal(Blocks.ENDER_CHEST, this, 1, (int) 128));
		this.goalSelector.addGoal(9, new RemoveBlockGoal(Blocks.FURNACE, this, 1, (int) 128));
		this.goalSelector.addGoal(10, new RemoveBlockGoal(Blocks.BLAST_FURNACE, this, 1, (int) 128));
		this.goalSelector.addGoal(11, new RemoveBlockGoal(Blocks.SMOKER, this, 1, (int) 128));
		this.goalSelector.addGoal(12, new RemoveBlockGoal(Blocks.CRAFTING_TABLE, this, 1, (int) 128));
		this.goalSelector.addGoal(13, new RemoveBlockGoal(Blocks.ANVIL, this, 1, (int) 128));
		this.goalSelector.addGoal(14, new RemoveBlockGoal(Blocks.ENCHANTING_TABLE, this, 1, (int) 128));
		this.goalSelector.addGoal(15, new RemoveBlockGoal(Blocks.BREWING_STAND, this, 1, (int) 128));
		this.goalSelector.addGoal(16, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(17, new FollowMobGoal(this, 1, (float) 128, (float) 128));
		this.goalSelector.addGoal(18, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(19, new FloatGoal(this));
	}

	@Override
	public Vec3 getPassengerRidingPosition(Entity entity) {
		return super.getPassengerRidingPosition(entity).add(0, -0.35F, 0);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:germanmanlive"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hitgerman"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:hitgerman"));
	}

	public static void init(SpawnPlacementRegisterEvent event) {
		event.register(TerribletwoModEntities.GERMAN_MAN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), SpawnPlacementRegisterEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 100);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 128);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}

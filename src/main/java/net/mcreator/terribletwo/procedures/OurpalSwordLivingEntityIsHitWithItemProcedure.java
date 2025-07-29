package net.mcreator.terribletwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.init.TerribletwoModGameRules;
import net.mcreator.terribletwo.entity.BoosEntity;

public class OurpalSwordLivingEntityIsHitWithItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double critchance = 0;
		double multplier = 0;
		double additonaldamage = 0;
		multplier = 1;
		additonaldamage = 12 * multplier;
		critchance = 0.04;
		if (Math.random() < critchance && !(!world.getEntitiesOfClass(BoosEntity.class, AABB.ofSize(new Vec3(x, y, z), 192, 192, 192), e -> true).isEmpty())
				&& world.getLevelData().getGameRules().getBoolean(TerribletwoModGameRules.TM_2_OURPAL_CRITS) == true) {
			if (world.getLevelData().getGameRules().getBoolean(TerribletwoModGameRules.TM_2_OURPAL_HITSTOP) == true) {
				OurpalHitstopProcedure.execute(world, x, y, z, entity);
			}
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("terribletwo:crit")))), (float) (additonaldamage * 2));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:brokencrit")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:brokencrit")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (sourceentity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
		} else if (Math.random() < critchance && !world.getEntitiesOfClass(BoosEntity.class, AABB.ofSize(new Vec3(x, y, z), 192, 192, 192), e -> true).isEmpty()
				&& world.getLevelData().getGameRules().getBoolean(TerribletwoModGameRules.TM_2_OURPAL_CRITS) == true) {
			if (world.getLevelData().getGameRules().getBoolean(TerribletwoModGameRules.TM_2_OURPAL_HITSTOP) == true) {
				OurpalHitstopProcedure.execute(world, x, y, z, entity);
			}
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("terribletwo:crit")))), (float) (additonaldamage * 1));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:brokencrit")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("terribletwo:brokencrit")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (sourceentity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
		}
	}
}

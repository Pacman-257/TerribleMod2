
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.terribletwo.entity.YellowWizardLTGEntity;
import net.mcreator.terribletwo.entity.WilliamAftonEntity;
import net.mcreator.terribletwo.entity.WilliamAfton6Entity;
import net.mcreator.terribletwo.entity.WilliamAfton5Entity;
import net.mcreator.terribletwo.entity.WilliamAfton4Entity;
import net.mcreator.terribletwo.entity.WilliamAfton3Entity;
import net.mcreator.terribletwo.entity.WilliamAfton2Entity;
import net.mcreator.terribletwo.entity.VoltsgeistProjectileEntity;
import net.mcreator.terribletwo.entity.TheYellowWizardEntity;
import net.mcreator.terribletwo.entity.TheWizardEntity;
import net.mcreator.terribletwo.entity.TheVillianEntity;
import net.mcreator.terribletwo.entity.TheVVizardLTGEntityProjectile;
import net.mcreator.terribletwo.entity.TheVVizardLTGEntity;
import net.mcreator.terribletwo.entity.TheVVizardEntityProjectile;
import net.mcreator.terribletwo.entity.TheVVizardEntity;
import net.mcreator.terribletwo.entity.TheRedWizardEntity;
import net.mcreator.terribletwo.entity.ThePurpleWizardEntity;
import net.mcreator.terribletwo.entity.TheGreenWizardEntity;
import net.mcreator.terribletwo.entity.TNTBaboonEntity;
import net.mcreator.terribletwo.entity.SusmongusEntity;
import net.mcreator.terribletwo.entity.StairProjEntity;
import net.mcreator.terribletwo.entity.SpringtrapJumpscareEntity;
import net.mcreator.terribletwo.entity.SpringtrapEntity;
import net.mcreator.terribletwo.entity.SplashPissProjectileEntity;
import net.mcreator.terribletwo.entity.SpearProjEntity;
import net.mcreator.terribletwo.entity.SoLSProjectileEntity;
import net.mcreator.terribletwo.entity.ShiaLabeoufTheRainKingEntity;
import net.mcreator.terribletwo.entity.SantaLTGEntity;
import net.mcreator.terribletwo.entity.SantaEntity;
import net.mcreator.terribletwo.entity.SaintGuffEntity;
import net.mcreator.terribletwo.entity.SSGolemLTGEntity;
import net.mcreator.terribletwo.entity.SSGolemEntity;
import net.mcreator.terribletwo.entity.RenaissanceManEntityProjectile;
import net.mcreator.terribletwo.entity.RenaissanceManEntity;
import net.mcreator.terribletwo.entity.RedWizardLTGEntity;
import net.mcreator.terribletwo.entity.RedElfEntity;
import net.mcreator.terribletwo.entity.PurpleWizardLTGEntity;
import net.mcreator.terribletwo.entity.PeepeeManEntity;
import net.mcreator.terribletwo.entity.PeashooterEntity;
import net.mcreator.terribletwo.entity.PeaEntity;
import net.mcreator.terribletwo.entity.NukeEntity;
import net.mcreator.terribletwo.entity.NapoleonicSoldierLTGEntity;
import net.mcreator.terribletwo.entity.NapoleonicSoldierEntity;
import net.mcreator.terribletwo.entity.NapoleonLTGEntity;
import net.mcreator.terribletwo.entity.NapoleonEntity;
import net.mcreator.terribletwo.entity.MusketBallEntity;
import net.mcreator.terribletwo.entity.MoneyEntity;
import net.mcreator.terribletwo.entity.MarkiplierEntity;
import net.mcreator.terribletwo.entity.MarketPlierEntity;
import net.mcreator.terribletwo.entity.LilGrayAlienEntity;
import net.mcreator.terribletwo.entity.LaserProjectileEntity;
import net.mcreator.terribletwo.entity.KiteProjectileEntity;
import net.mcreator.terribletwo.entity.KanyeWestLTGEntity;
import net.mcreator.terribletwo.entity.KanyeWestEntity;
import net.mcreator.terribletwo.entity.JumpscareFreddyEntity;
import net.mcreator.terribletwo.entity.JumpscareFoxyEntity;
import net.mcreator.terribletwo.entity.JumpscareChicaEntity;
import net.mcreator.terribletwo.entity.JumpscareBonnieEntity;
import net.mcreator.terribletwo.entity.JewigerGonkEntity;
import net.mcreator.terribletwo.entity.HyperRealisticFreddyFazbearEntity;
import net.mcreator.terribletwo.entity.HollowPurplePlayerEntity;
import net.mcreator.terribletwo.entity.HollowPurpleEntity;
import net.mcreator.terribletwo.entity.HanSoloLTGEntityProjectile;
import net.mcreator.terribletwo.entity.HanSoloLTGEntity;
import net.mcreator.terribletwo.entity.HanSoloEntityProjectile;
import net.mcreator.terribletwo.entity.HanSoloEntity;
import net.mcreator.terribletwo.entity.HalfLifeScientistEntity;
import net.mcreator.terribletwo.entity.HRFJumpscareEntity;
import net.mcreator.terribletwo.entity.GuncraftProjEntity;
import net.mcreator.terribletwo.entity.GuffLTGEntity;
import net.mcreator.terribletwo.entity.GrenadeExplosionEntity;
import net.mcreator.terribletwo.entity.GreenWizardLTGEntity;
import net.mcreator.terribletwo.entity.GreenElfEntity;
import net.mcreator.terribletwo.entity.GonkDroidEntity;
import net.mcreator.terribletwo.entity.GoldenVillianEntity;
import net.mcreator.terribletwo.entity.GoldenJumpscareEntity;
import net.mcreator.terribletwo.entity.GoldenFreddyEntity;
import net.mcreator.terribletwo.entity.GojoLTGEntity;
import net.mcreator.terribletwo.entity.GojoEntity;
import net.mcreator.terribletwo.entity.GodOfBasketballLTGEntity;
import net.mcreator.terribletwo.entity.GodEntity;
import net.mcreator.terribletwo.entity.GlockEntity;
import net.mcreator.terribletwo.entity.GermanManEntity;
import net.mcreator.terribletwo.entity.FreddyLTGEntity;
import net.mcreator.terribletwo.entity.FreddyFazbearEntity;
import net.mcreator.terribletwo.entity.FoxyLTGEntity;
import net.mcreator.terribletwo.entity.FoxyEntity;
import net.mcreator.terribletwo.entity.FloorPorjEntity;
import net.mcreator.terribletwo.entity.FlashbangProjEntity;
import net.mcreator.terribletwo.entity.FireballEntity;
import net.mcreator.terribletwo.entity.ExplodoballEntity;
import net.mcreator.terribletwo.entity.DrippedOutSusmongusEntity;
import net.mcreator.terribletwo.entity.DiamondVillianEntity;
import net.mcreator.terribletwo.entity.DeadSusmongusEntity;
import net.mcreator.terribletwo.entity.DeadGonkEntity;
import net.mcreator.terribletwo.entity.DarkiplierLTGEntity;
import net.mcreator.terribletwo.entity.DarkMatterVillianEntity;
import net.mcreator.terribletwo.entity.DL44ThrowEntity;
import net.mcreator.terribletwo.entity.ConeProjEntity;
import net.mcreator.terribletwo.entity.ChristmasGunProjectileEntity;
import net.mcreator.terribletwo.entity.ChicaLTGEntity;
import net.mcreator.terribletwo.entity.ChicaEntity;
import net.mcreator.terribletwo.entity.CShapeEntity;
import net.mcreator.terribletwo.entity.BuildingWallProjEntity;
import net.mcreator.terribletwo.entity.BoosSmallFireballProjectileEntity;
import net.mcreator.terribletwo.entity.BoosShieldEntity;
import net.mcreator.terribletwo.entity.BoosEntity;
import net.mcreator.terribletwo.entity.BoosArtemisEntity;
import net.mcreator.terribletwo.entity.BonnieLTGEntity;
import net.mcreator.terribletwo.entity.BonnieEntity;
import net.mcreator.terribletwo.entity.BeenadeBeesEntity;
import net.mcreator.terribletwo.entity.BeenadeBees3Entity;
import net.mcreator.terribletwo.entity.BeenadeBees2Entity;
import net.mcreator.terribletwo.entity.BedbugEntity;
import net.mcreator.terribletwo.entity.BeatkingEntity;
import net.mcreator.terribletwo.entity.BasketballEntity;
import net.mcreator.terribletwo.entity.BaboonEntity;
import net.mcreator.terribletwo.entity.AthleticSteveEntity;
import net.mcreator.terribletwo.TerribletwoMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TerribletwoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, TerribletwoMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<WilliamAftonEntity>> WILLIAM_AFTON = register("william_afton",
			EntityType.Builder.<WilliamAftonEntity>of(WilliamAftonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WilliamAfton2Entity>> WILLIAM_AFTON_2 = register("william_afton_2",
			EntityType.Builder.<WilliamAfton2Entity>of(WilliamAfton2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WilliamAfton3Entity>> WILLIAM_AFTON_3 = register("william_afton_3",
			EntityType.Builder.<WilliamAfton3Entity>of(WilliamAfton3Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WilliamAfton4Entity>> WILLIAM_AFTON_4 = register("william_afton_4",
			EntityType.Builder.<WilliamAfton4Entity>of(WilliamAfton4Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WilliamAfton5Entity>> WILLIAM_AFTON_5 = register("william_afton_5",
			EntityType.Builder.<WilliamAfton5Entity>of(WilliamAfton5Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WilliamAfton6Entity>> WILLIAM_AFTON_6 = register("william_afton_6",
			EntityType.Builder.<WilliamAfton6Entity>of(WilliamAfton6Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LilGrayAlienEntity>> LIL_GRAY_ALIEN = register("lil_gray_alien",
			EntityType.Builder.<LilGrayAlienEntity>of(LilGrayAlienEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2000).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HanSoloEntity>> HAN_SOLO = register("han_solo",
			EntityType.Builder.<HanSoloEntity>of(HanSoloEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HanSoloEntityProjectile>> HAN_SOLO_PROJECTILE = register("projectile_han_solo",
			EntityType.Builder.<HanSoloEntityProjectile>of(HanSoloEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LaserProjectileEntity>> LASER_PROJECTILE = register("laser_projectile",
			EntityType.Builder.<LaserProjectileEntity>of(LaserProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DL44ThrowEntity>> DL_44_THROW = register("dl_44_throw",
			EntityType.Builder.<DL44ThrowEntity>of(DL44ThrowEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheWizardEntity>> THE_WIZARD = register("the_wizard",
			EntityType.Builder.<TheWizardEntity>of(TheWizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheVVizardEntity>> THE_V_VIZARD = register("the_v_vizard",
			EntityType.Builder.<TheVVizardEntity>of(TheVVizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheVVizardEntityProjectile>> THE_V_VIZARD_PROJECTILE = register("projectile_the_v_vizard",
			EntityType.Builder.<TheVVizardEntityProjectile>of(TheVVizardEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThePurpleWizardEntity>> THE_PURPLE_WIZARD = register("the_purple_wizard",
			EntityType.Builder.<ThePurpleWizardEntity>of(ThePurpleWizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GlockEntity>> GLOCK = register("glock",
			EntityType.Builder.<GlockEntity>of(GlockEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheRedWizardEntity>> THE_RED_WIZARD = register("the_red_wizard",
			EntityType.Builder.<TheRedWizardEntity>of(TheRedWizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExplodoballEntity>> EXPLODOBALL = register("explodoball",
			EntityType.Builder.<ExplodoballEntity>of(ExplodoballEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheGreenWizardEntity>> THE_GREEN_WIZARD = register("the_green_wizard",
			EntityType.Builder.<TheGreenWizardEntity>of(TheGreenWizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NukeEntity>> NUKE = register("nuke",
			EntityType.Builder.<NukeEntity>of(NukeEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheYellowWizardEntity>> THE_YELLOW_WIZARD = register("the_yellow_wizard",
			EntityType.Builder.<TheYellowWizardEntity>of(TheYellowWizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MoneyEntity>> MONEY = register("money",
			EntityType.Builder.<MoneyEntity>of(MoneyEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GermanManEntity>> GERMAN_MAN = register("german_man",
			EntityType.Builder.<GermanManEntity>of(GermanManEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GodEntity>> GOD = register("god", EntityType.Builder.<GodEntity>of(GodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BasketballEntity>> BASKETBALL = register("basketball",
			EntityType.Builder.<BasketballEntity>of(BasketballEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<HalfLifeScientistEntity>> HALF_LIFE_SCIENTIST = register("half_life_scientist",
			EntityType.Builder.<HalfLifeScientistEntity>of(HalfLifeScientistEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheVillianEntity>> THE_VILLIAN = register("the_villian",
			EntityType.Builder.<TheVillianEntity>of(TheVillianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShiaLabeoufTheRainKingEntity>> SHIA_LABEOUF_THE_RAIN_KING = register("shia_labeouf_the_rain_king",
			EntityType.Builder.<ShiaLabeoufTheRainKingEntity>of(ShiaLabeoufTheRainKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(1.4f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RenaissanceManEntity>> RENAISSANCE_MAN = register("renaissance_man",
			EntityType.Builder.<RenaissanceManEntity>of(RenaissanceManEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RenaissanceManEntityProjectile>> RENAISSANCE_MAN_PROJECTILE = register("projectile_renaissance_man",
			EntityType.Builder.<RenaissanceManEntityProjectile>of(RenaissanceManEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GojoEntity>> GOJO = register("gojo",
			EntityType.Builder.<GojoEntity>of(GojoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HollowPurpleEntity>> HOLLOW_PURPLE = register("hollow_purple",
			EntityType.Builder.<HollowPurpleEntity>of(HollowPurpleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FireballEntity>> FIREBALL = register("fireball",
			EntityType.Builder.<FireballEntity>of(FireballEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<HollowPurplePlayerEntity>> HOLLOW_PURPLE_PLAYER = register("hollow_purple_player",
			EntityType.Builder.<HollowPurplePlayerEntity>of(HollowPurplePlayerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SSGolemEntity>> SS_GOLEM = register("ss_golem",
			EntityType.Builder.<SSGolemEntity>of(SSGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NapoleonEntity>> NAPOLEON = register("napoleon",
			EntityType.Builder.<NapoleonEntity>of(NapoleonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NapoleonicSoldierEntity>> NAPOLEONIC_SOLDIER = register("napoleonic_soldier",
			EntityType.Builder.<NapoleonicSoldierEntity>of(NapoleonicSoldierEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MusketBallEntity>> MUSKET_BALL = register("musket_ball",
			EntityType.Builder.<MusketBallEntity>of(MusketBallEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BaboonEntity>> BABOON = register("baboon",
			EntityType.Builder.<BaboonEntity>of(BaboonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FreddyFazbearEntity>> FREDDY_FAZBEAR = register("freddy_fazbear",
			EntityType.Builder.<FreddyFazbearEntity>of(FreddyFazbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BonnieEntity>> BONNIE = register("bonnie",
			EntityType.Builder.<BonnieEntity>of(BonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChicaEntity>> CHICA = register("chica",
			EntityType.Builder.<ChicaEntity>of(ChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FoxyEntity>> FOXY = register("foxy",
			EntityType.Builder.<FoxyEntity>of(FoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<JumpscareFreddyEntity>> JUMPSCARE_FREDDY = register("jumpscare_freddy",
			EntityType.Builder.<JumpscareFreddyEntity>of(JumpscareFreddyEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<JumpscareBonnieEntity>> JUMPSCARE_BONNIE = register("jumpscare_bonnie",
			EntityType.Builder.<JumpscareBonnieEntity>of(JumpscareBonnieEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<JumpscareFoxyEntity>> JUMPSCARE_FOXY = register("jumpscare_foxy",
			EntityType.Builder.<JumpscareFoxyEntity>of(JumpscareFoxyEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<JumpscareChicaEntity>> JUMPSCARE_CHICA = register("jumpscare_chica",
			EntityType.Builder.<JumpscareChicaEntity>of(JumpscareChicaEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<HRFJumpscareEntity>> HRF_JUMPSCARE = register("hrf_jumpscare",
			EntityType.Builder.<HRFJumpscareEntity>of(HRFJumpscareEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<HyperRealisticFreddyFazbearEntity>> HYPER_REALISTIC_FREDDY_FAZBEAR = register("hyper_realistic_freddy_fazbear",
			EntityType.Builder.<HyperRealisticFreddyFazbearEntity>of(HyperRealisticFreddyFazbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SusmongusEntity>> SUSMONGUS = register("susmongus",
			EntityType.Builder.<SusmongusEntity>of(SusmongusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GonkDroidEntity>> GONK_DROID = register("gonk_droid",
			EntityType.Builder.<GonkDroidEntity>of(GonkDroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DeadGonkEntity>> DEAD_GONK = register("dead_gonk",
			EntityType.Builder.<DeadGonkEntity>of(DeadGonkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SoLSProjectileEntity>> SO_LS_PROJECTILE = register("so_ls_projectile",
			EntityType.Builder.<SoLSProjectileEntity>of(SoLSProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<KanyeWestEntity>> KANYE_WEST = register("kanye_west",
			EntityType.Builder.<KanyeWestEntity>of(KanyeWestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BedbugEntity>> BEDBUG = register("bedbug",
			EntityType.Builder.<BedbugEntity>of(BedbugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PeaEntity>> PEA = register("pea",
			EntityType.Builder.<PeaEntity>of(PeaEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PeashooterEntity>> PEASHOOTER = register("peashooter",
			EntityType.Builder.<PeashooterEntity>of(PeashooterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DeadSusmongusEntity>> DEAD_SUSMONGUS = register("dead_susmongus",
			EntityType.Builder.<DeadSusmongusEntity>of(DeadSusmongusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DrippedOutSusmongusEntity>> DRIPPED_OUT_SUSMONGUS = register("dripped_out_susmongus",
			EntityType.Builder.<DrippedOutSusmongusEntity>of(DrippedOutSusmongusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SplashPissProjectileEntity>> SPLASH_PISS_PROJECTILE = register("splash_piss_projectile",
			EntityType.Builder.<SplashPissProjectileEntity>of(SplashPissProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenVillianEntity>> GOLDEN_VILLIAN = register("golden_villian",
			EntityType.Builder.<GoldenVillianEntity>of(GoldenVillianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DiamondVillianEntity>> DIAMOND_VILLIAN = register("diamond_villian",
			EntityType.Builder.<DiamondVillianEntity>of(DiamondVillianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkMatterVillianEntity>> DARK_MATTER_VILLIAN = register("dark_matter_villian",
			EntityType.Builder.<DarkMatterVillianEntity>of(DarkMatterVillianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarkiplierEntity>> MARKIPLIER = register("markiplier",
			EntityType.Builder.<MarkiplierEntity>of(MarkiplierEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarketPlierEntity>> MARKET_PLIER = register("market_plier",
			EntityType.Builder.<MarketPlierEntity>of(MarketPlierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SaintGuffEntity>> SAINT_GUFF = register("saint_guff",
			EntityType.Builder.<SaintGuffEntity>of(SaintGuffEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1200).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KiteProjectileEntity>> KITE_PROJECTILE = register("kite_projectile",
			EntityType.Builder.<KiteProjectileEntity>of(KiteProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChristmasGunProjectileEntity>> CHRISTMAS_GUN_PROJECTILE = register("christmas_gun_projectile",
			EntityType.Builder.<ChristmasGunProjectileEntity>of(ChristmasGunProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GrenadeExplosionEntity>> GRENADE_EXPLOSION = register("grenade_explosion",
			EntityType.Builder.<GrenadeExplosionEntity>of(GrenadeExplosionEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SantaEntity>> SANTA = register("santa",
			EntityType.Builder.<SantaEntity>of(SantaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeenadeBeesEntity>> BEENADE_BEES = register("beenade_bees",
			EntityType.Builder.<BeenadeBeesEntity>of(BeenadeBeesEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeenadeBees2Entity>> BEENADE_BEES_2 = register("beenade_bees_2",
			EntityType.Builder.<BeenadeBees2Entity>of(BeenadeBees2Entity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeenadeBees3Entity>> BEENADE_BEES_3 = register("beenade_bees_3",
			EntityType.Builder.<BeenadeBees3Entity>of(BeenadeBees3Entity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ConeProjEntity>> CONE_PROJ = register("cone_proj",
			EntityType.Builder.<ConeProjEntity>of(ConeProjEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FloorPorjEntity>> FLOOR_PORJ = register("floor_porj",
			EntityType.Builder.<FloorPorjEntity>of(FloorPorjEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuildingWallProjEntity>> BUILDING_WALL_PROJ = register("building_wall_proj",
			EntityType.Builder.<BuildingWallProjEntity>of(BuildingWallProjEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<StairProjEntity>> STAIR_PROJ = register("stair_proj",
			EntityType.Builder.<StairProjEntity>of(StairProjEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GuncraftProjEntity>> GUNCRAFT_PROJ = register("guncraft_proj",
			EntityType.Builder.<GuncraftProjEntity>of(GuncraftProjEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PeepeeManEntity>> PEEPEE_MAN = register("peepee_man",
			EntityType.Builder.<PeepeeManEntity>of(PeepeeManEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GreenElfEntity>> GREEN_ELF = register("green_elf",
			EntityType.Builder.<GreenElfEntity>of(GreenElfEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RedElfEntity>> RED_ELF = register("red_elf",
			EntityType.Builder.<RedElfEntity>of(RedElfEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoosEntity>> BOOS = register("boos",
			EntityType.Builder.<BoosEntity>of(BoosEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoosShieldEntity>> BOOS_SHIELD = register("boos_shield",
			EntityType.Builder.<BoosShieldEntity>of(BoosShieldEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoosSmallFireballProjectileEntity>> BOOS_SMALL_FIREBALL_PROJECTILE = register("boos_small_fireball_projectile",
			EntityType.Builder.<BoosSmallFireballProjectileEntity>of(BoosSmallFireballProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<VoltsgeistProjectileEntity>> VOLTSGEIST_PROJECTILE = register("voltsgeist_projectile",
			EntityType.Builder.<VoltsgeistProjectileEntity>of(VoltsgeistProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoosArtemisEntity>> BOOS_ARTEMIS = register("boos_artemis",
			EntityType.Builder.<BoosArtemisEntity>of(BoosArtemisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.05f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<HanSoloLTGEntity>> HAN_SOLO_LTG = register("han_solo_ltg",
			EntityType.Builder.<HanSoloLTGEntity>of(HanSoloLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HanSoloLTGEntityProjectile>> HAN_SOLO_LTG_PROJECTILE = register("projectile_han_solo_ltg",
			EntityType.Builder.<HanSoloLTGEntityProjectile>of(HanSoloLTGEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheVVizardLTGEntity>> THE_V_VIZARD_LTG = register("the_v_vizard_ltg",
			EntityType.Builder.<TheVVizardLTGEntity>of(TheVVizardLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheVVizardLTGEntityProjectile>> THE_V_VIZARD_LTG_PROJECTILE = register("projectile_the_v_vizard_ltg",
			EntityType.Builder.<TheVVizardLTGEntityProjectile>of(TheVVizardLTGEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PurpleWizardLTGEntity>> PURPLE_WIZARD_LTG = register("purple_wizard_ltg",
			EntityType.Builder.<PurpleWizardLTGEntity>of(PurpleWizardLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RedWizardLTGEntity>> RED_WIZARD_LTG = register("red_wizard_ltg",
			EntityType.Builder.<RedWizardLTGEntity>of(RedWizardLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GreenWizardLTGEntity>> GREEN_WIZARD_LTG = register("green_wizard_ltg",
			EntityType.Builder.<GreenWizardLTGEntity>of(GreenWizardLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<YellowWizardLTGEntity>> YELLOW_WIZARD_LTG = register("yellow_wizard_ltg",
			EntityType.Builder.<YellowWizardLTGEntity>of(YellowWizardLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GodOfBasketballLTGEntity>> GOD_OF_BASKETBALL_LTG = register("god_of_basketball_ltg",
			EntityType.Builder.<GodOfBasketballLTGEntity>of(GodOfBasketballLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GojoLTGEntity>> GOJO_LTG = register("gojo_ltg",
			EntityType.Builder.<GojoLTGEntity>of(GojoLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NapoleonLTGEntity>> NAPOLEON_LTG = register("napoleon_ltg",
			EntityType.Builder.<NapoleonLTGEntity>of(NapoleonLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NapoleonicSoldierLTGEntity>> NAPOLEONIC_SOLDIER_LTG = register("napoleonic_soldier_ltg",
			EntityType.Builder.<NapoleonicSoldierLTGEntity>of(NapoleonicSoldierLTGEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FreddyLTGEntity>> FREDDY_LTG = register("freddy_ltg",
			EntityType.Builder.<FreddyLTGEntity>of(FreddyLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BonnieLTGEntity>> BONNIE_LTG = register("bonnie_ltg",
			EntityType.Builder.<BonnieLTGEntity>of(BonnieLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChicaLTGEntity>> CHICA_LTG = register("chica_ltg",
			EntityType.Builder.<ChicaLTGEntity>of(ChicaLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FoxyLTGEntity>> FOXY_LTG = register("foxy_ltg",
			EntityType.Builder.<FoxyLTGEntity>of(FoxyLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KanyeWestLTGEntity>> KANYE_WEST_LTG = register("kanye_west_ltg",
			EntityType.Builder.<KanyeWestLTGEntity>of(KanyeWestLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SSGolemLTGEntity>> SS_GOLEM_LTG = register("ss_golem_ltg",
			EntityType.Builder.<SSGolemLTGEntity>of(SSGolemLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkiplierLTGEntity>> DARKIPLIER_LTG = register("darkiplier_ltg",
			EntityType.Builder.<DarkiplierLTGEntity>of(DarkiplierLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SantaLTGEntity>> SANTA_LTG = register("santa_ltg",
			EntityType.Builder.<SantaLTGEntity>of(SantaLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GuffLTGEntity>> GUFF_LTG = register("guff_ltg",
			EntityType.Builder.<GuffLTGEntity>of(GuffLTGEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1200).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CShapeEntity>> C_SHAPE = register("c_shape",
			EntityType.Builder.<CShapeEntity>of(CShapeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TNTBaboonEntity>> TNT_BABOON = register("tnt_baboon",
			EntityType.Builder.<TNTBaboonEntity>of(TNTBaboonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlashbangProjEntity>> FLASHBANG_PROJ = register("flashbang_proj",
			EntityType.Builder.<FlashbangProjEntity>of(FlashbangProjEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpearProjEntity>> SPEAR_PROJ = register("spear_proj",
			EntityType.Builder.<SpearProjEntity>of(SpearProjEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AthleticSteveEntity>> ATHLETIC_STEVE = register("athletic_steve",
			EntityType.Builder.<AthleticSteveEntity>of(AthleticSteveEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenJumpscareEntity>> GOLDEN_JUMPSCARE = register("golden_jumpscare",
			EntityType.Builder.<GoldenJumpscareEntity>of(GoldenJumpscareEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenFreddyEntity>> GOLDEN_FREDDY = register("golden_freddy",
			EntityType.Builder.<GoldenFreddyEntity>of(GoldenFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeatkingEntity>> BEATKING = register("beatking",
			EntityType.Builder.<BeatkingEntity>of(BeatkingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<JewigerGonkEntity>> JEWIGER_GONK = register("jewiger_gonk",
			EntityType.Builder.<JewigerGonkEntity>of(JewigerGonkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpringtrapJumpscareEntity>> SPRINGTRAP_JUMPSCARE = register("springtrap_jumpscare",
			EntityType.Builder.<SpringtrapJumpscareEntity>of(SpringtrapJumpscareEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpringtrapEntity>> SPRINGTRAP = register("springtrap",
			EntityType.Builder.<SpringtrapEntity>of(SpringtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(SpawnPlacementRegisterEvent event) {
		WilliamAftonEntity.init(event);
		WilliamAfton2Entity.init(event);
		WilliamAfton3Entity.init(event);
		WilliamAfton4Entity.init(event);
		WilliamAfton5Entity.init(event);
		WilliamAfton6Entity.init(event);
		LilGrayAlienEntity.init(event);
		HanSoloEntity.init(event);
		TheWizardEntity.init(event);
		TheVVizardEntity.init(event);
		ThePurpleWizardEntity.init(event);
		TheRedWizardEntity.init(event);
		TheGreenWizardEntity.init(event);
		TheYellowWizardEntity.init(event);
		GermanManEntity.init(event);
		GodEntity.init(event);
		HalfLifeScientistEntity.init(event);
		TheVillianEntity.init(event);
		ShiaLabeoufTheRainKingEntity.init(event);
		RenaissanceManEntity.init(event);
		GojoEntity.init(event);
		SSGolemEntity.init(event);
		NapoleonEntity.init(event);
		NapoleonicSoldierEntity.init(event);
		BaboonEntity.init(event);
		FreddyFazbearEntity.init(event);
		BonnieEntity.init(event);
		ChicaEntity.init(event);
		FoxyEntity.init(event);
		HyperRealisticFreddyFazbearEntity.init(event);
		SusmongusEntity.init(event);
		GonkDroidEntity.init(event);
		DeadGonkEntity.init(event);
		KanyeWestEntity.init(event);
		BedbugEntity.init(event);
		PeashooterEntity.init(event);
		DeadSusmongusEntity.init(event);
		DrippedOutSusmongusEntity.init(event);
		GoldenVillianEntity.init(event);
		DiamondVillianEntity.init(event);
		DarkMatterVillianEntity.init(event);
		MarkiplierEntity.init(event);
		MarketPlierEntity.init(event);
		SaintGuffEntity.init(event);
		SantaEntity.init(event);
		PeepeeManEntity.init(event);
		GreenElfEntity.init(event);
		RedElfEntity.init(event);
		BoosEntity.init(event);
		BoosShieldEntity.init(event);
		BoosArtemisEntity.init(event);
		HanSoloLTGEntity.init(event);
		TheVVizardLTGEntity.init(event);
		PurpleWizardLTGEntity.init(event);
		RedWizardLTGEntity.init(event);
		GreenWizardLTGEntity.init(event);
		YellowWizardLTGEntity.init(event);
		GodOfBasketballLTGEntity.init(event);
		GojoLTGEntity.init(event);
		NapoleonLTGEntity.init(event);
		NapoleonicSoldierLTGEntity.init(event);
		FreddyLTGEntity.init(event);
		BonnieLTGEntity.init(event);
		ChicaLTGEntity.init(event);
		FoxyLTGEntity.init(event);
		KanyeWestLTGEntity.init(event);
		SSGolemLTGEntity.init(event);
		DarkiplierLTGEntity.init(event);
		SantaLTGEntity.init(event);
		GuffLTGEntity.init(event);
		CShapeEntity.init(event);
		TNTBaboonEntity.init(event);
		AthleticSteveEntity.init(event);
		GoldenFreddyEntity.init(event);
		BeatkingEntity.init(event);
		JewigerGonkEntity.init(event);
		SpringtrapEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WILLIAM_AFTON.get(), WilliamAftonEntity.createAttributes().build());
		event.put(WILLIAM_AFTON_2.get(), WilliamAfton2Entity.createAttributes().build());
		event.put(WILLIAM_AFTON_3.get(), WilliamAfton3Entity.createAttributes().build());
		event.put(WILLIAM_AFTON_4.get(), WilliamAfton4Entity.createAttributes().build());
		event.put(WILLIAM_AFTON_5.get(), WilliamAfton5Entity.createAttributes().build());
		event.put(WILLIAM_AFTON_6.get(), WilliamAfton6Entity.createAttributes().build());
		event.put(LIL_GRAY_ALIEN.get(), LilGrayAlienEntity.createAttributes().build());
		event.put(HAN_SOLO.get(), HanSoloEntity.createAttributes().build());
		event.put(THE_WIZARD.get(), TheWizardEntity.createAttributes().build());
		event.put(THE_V_VIZARD.get(), TheVVizardEntity.createAttributes().build());
		event.put(THE_PURPLE_WIZARD.get(), ThePurpleWizardEntity.createAttributes().build());
		event.put(THE_RED_WIZARD.get(), TheRedWizardEntity.createAttributes().build());
		event.put(THE_GREEN_WIZARD.get(), TheGreenWizardEntity.createAttributes().build());
		event.put(THE_YELLOW_WIZARD.get(), TheYellowWizardEntity.createAttributes().build());
		event.put(GERMAN_MAN.get(), GermanManEntity.createAttributes().build());
		event.put(GOD.get(), GodEntity.createAttributes().build());
		event.put(HALF_LIFE_SCIENTIST.get(), HalfLifeScientistEntity.createAttributes().build());
		event.put(THE_VILLIAN.get(), TheVillianEntity.createAttributes().build());
		event.put(SHIA_LABEOUF_THE_RAIN_KING.get(), ShiaLabeoufTheRainKingEntity.createAttributes().build());
		event.put(RENAISSANCE_MAN.get(), RenaissanceManEntity.createAttributes().build());
		event.put(GOJO.get(), GojoEntity.createAttributes().build());
		event.put(SS_GOLEM.get(), SSGolemEntity.createAttributes().build());
		event.put(NAPOLEON.get(), NapoleonEntity.createAttributes().build());
		event.put(NAPOLEONIC_SOLDIER.get(), NapoleonicSoldierEntity.createAttributes().build());
		event.put(BABOON.get(), BaboonEntity.createAttributes().build());
		event.put(FREDDY_FAZBEAR.get(), FreddyFazbearEntity.createAttributes().build());
		event.put(BONNIE.get(), BonnieEntity.createAttributes().build());
		event.put(CHICA.get(), ChicaEntity.createAttributes().build());
		event.put(FOXY.get(), FoxyEntity.createAttributes().build());
		event.put(HYPER_REALISTIC_FREDDY_FAZBEAR.get(), HyperRealisticFreddyFazbearEntity.createAttributes().build());
		event.put(SUSMONGUS.get(), SusmongusEntity.createAttributes().build());
		event.put(GONK_DROID.get(), GonkDroidEntity.createAttributes().build());
		event.put(DEAD_GONK.get(), DeadGonkEntity.createAttributes().build());
		event.put(KANYE_WEST.get(), KanyeWestEntity.createAttributes().build());
		event.put(BEDBUG.get(), BedbugEntity.createAttributes().build());
		event.put(PEASHOOTER.get(), PeashooterEntity.createAttributes().build());
		event.put(DEAD_SUSMONGUS.get(), DeadSusmongusEntity.createAttributes().build());
		event.put(DRIPPED_OUT_SUSMONGUS.get(), DrippedOutSusmongusEntity.createAttributes().build());
		event.put(GOLDEN_VILLIAN.get(), GoldenVillianEntity.createAttributes().build());
		event.put(DIAMOND_VILLIAN.get(), DiamondVillianEntity.createAttributes().build());
		event.put(DARK_MATTER_VILLIAN.get(), DarkMatterVillianEntity.createAttributes().build());
		event.put(MARKIPLIER.get(), MarkiplierEntity.createAttributes().build());
		event.put(MARKET_PLIER.get(), MarketPlierEntity.createAttributes().build());
		event.put(SAINT_GUFF.get(), SaintGuffEntity.createAttributes().build());
		event.put(SANTA.get(), SantaEntity.createAttributes().build());
		event.put(PEEPEE_MAN.get(), PeepeeManEntity.createAttributes().build());
		event.put(GREEN_ELF.get(), GreenElfEntity.createAttributes().build());
		event.put(RED_ELF.get(), RedElfEntity.createAttributes().build());
		event.put(BOOS.get(), BoosEntity.createAttributes().build());
		event.put(BOOS_SHIELD.get(), BoosShieldEntity.createAttributes().build());
		event.put(BOOS_ARTEMIS.get(), BoosArtemisEntity.createAttributes().build());
		event.put(HAN_SOLO_LTG.get(), HanSoloLTGEntity.createAttributes().build());
		event.put(THE_V_VIZARD_LTG.get(), TheVVizardLTGEntity.createAttributes().build());
		event.put(PURPLE_WIZARD_LTG.get(), PurpleWizardLTGEntity.createAttributes().build());
		event.put(RED_WIZARD_LTG.get(), RedWizardLTGEntity.createAttributes().build());
		event.put(GREEN_WIZARD_LTG.get(), GreenWizardLTGEntity.createAttributes().build());
		event.put(YELLOW_WIZARD_LTG.get(), YellowWizardLTGEntity.createAttributes().build());
		event.put(GOD_OF_BASKETBALL_LTG.get(), GodOfBasketballLTGEntity.createAttributes().build());
		event.put(GOJO_LTG.get(), GojoLTGEntity.createAttributes().build());
		event.put(NAPOLEON_LTG.get(), NapoleonLTGEntity.createAttributes().build());
		event.put(NAPOLEONIC_SOLDIER_LTG.get(), NapoleonicSoldierLTGEntity.createAttributes().build());
		event.put(FREDDY_LTG.get(), FreddyLTGEntity.createAttributes().build());
		event.put(BONNIE_LTG.get(), BonnieLTGEntity.createAttributes().build());
		event.put(CHICA_LTG.get(), ChicaLTGEntity.createAttributes().build());
		event.put(FOXY_LTG.get(), FoxyLTGEntity.createAttributes().build());
		event.put(KANYE_WEST_LTG.get(), KanyeWestLTGEntity.createAttributes().build());
		event.put(SS_GOLEM_LTG.get(), SSGolemLTGEntity.createAttributes().build());
		event.put(DARKIPLIER_LTG.get(), DarkiplierLTGEntity.createAttributes().build());
		event.put(SANTA_LTG.get(), SantaLTGEntity.createAttributes().build());
		event.put(GUFF_LTG.get(), GuffLTGEntity.createAttributes().build());
		event.put(C_SHAPE.get(), CShapeEntity.createAttributes().build());
		event.put(TNT_BABOON.get(), TNTBaboonEntity.createAttributes().build());
		event.put(ATHLETIC_STEVE.get(), AthleticSteveEntity.createAttributes().build());
		event.put(GOLDEN_FREDDY.get(), GoldenFreddyEntity.createAttributes().build());
		event.put(BEATKING.get(), BeatkingEntity.createAttributes().build());
		event.put(JEWIGER_GONK.get(), JewigerGonkEntity.createAttributes().build());
		event.put(SPRINGTRAP.get(), SpringtrapEntity.createAttributes().build());
	}
}

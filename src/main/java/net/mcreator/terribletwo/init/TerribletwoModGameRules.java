
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TerribletwoModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> TM_2_CLOCK_TICK_RATE;
	public static GameRules.Key<GameRules.BooleanValue> TM_2_OURPAL_CRITS;
	public static GameRules.Key<GameRules.BooleanValue> TM_2_RED_BUTTON_NUKE;
	public static GameRules.Key<GameRules.BooleanValue> TM_2_ORIGINS_FALLING_SEQUENCE;
	public static GameRules.Key<GameRules.BooleanValue> TM_2_C_SHAPE_SPAWNING;
	public static GameRules.Key<GameRules.BooleanValue> TM_2_TRANSMUTATIONS_CHALLENGE_RUN;
	public static GameRules.Key<GameRules.BooleanValue> TM_2_OURPAL_HITSTOP;
	public static GameRules.Key<GameRules.BooleanValue> TM_2_ATHLETIC_STEVE_SPAWNING;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		TM_2_CLOCK_TICK_RATE = GameRules.register("tm2ClockTickRate", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		TM_2_OURPAL_CRITS = GameRules.register("tm2OurpalCrits", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
		TM_2_RED_BUTTON_NUKE = GameRules.register("tm2RedButtonNuke", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		TM_2_ORIGINS_FALLING_SEQUENCE = GameRules.register("tm2OriginsFallingSequence", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
		TM_2_C_SHAPE_SPAWNING = GameRules.register("tm2CShapeSpawning", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
		TM_2_TRANSMUTATIONS_CHALLENGE_RUN = GameRules.register("tm2TransmutationsChallengeRun", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		TM_2_OURPAL_HITSTOP = GameRules.register("tm2OurpalHitstop", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		TM_2_ATHLETIC_STEVE_SPAWNING = GameRules.register("tm2AthleticSteveSpawning", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	}
}

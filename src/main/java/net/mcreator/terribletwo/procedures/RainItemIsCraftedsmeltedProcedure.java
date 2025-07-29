package net.mcreator.terribletwo.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import java.util.Collections;

public class RainItemIsCraftedsmeltedProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("terribletwo:rainblock")));
	}
}

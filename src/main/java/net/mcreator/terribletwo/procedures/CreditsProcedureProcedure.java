package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class CreditsProcedureProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7nTerrible Mod 2 - \u00A7oMade in MCreator."), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7lDesdinova \u00A7r- \u00A7oCoding, implementation, & spritework"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7lFulcanelli \u00A7r- \u00A7oWriting, most audio work, LowTierGod code, voice of the Wizard & Elves."), false);
	}
}

package net.mcreator.terribletwo.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class FullCreditsProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7nTerrible Mod 2 - \u00A7oMade in MCreator."), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lDesdinova \u00A7r- \u00A7oCoding, implementation, & spritework"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lFulcanelli \u00A7r- \u00A7oWriting, most audio work, LowTierGod code, voice of the Wizard & Elves."), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7n-Special Thanks-"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lCbrauto \u00A7r- \u00A7oLil' Gray Alien & voice of Athletic Steve"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lBuffMordo \u00A7r- \u00A7oPear paintings & Weezer music disc."), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lTurtle_Licker \u00A7r- \u00A7oIdeas for Gojo & Terrible Mod 1 Guff"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lHeretic Hunter \u00A7r- \u00A7oJohn Adams painting."), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lFrost_Beer \u00A7r- \u00A7oVatican City model."), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lImNotaCausalty & ItsJim \u00A7r- \u00A7oMaking me find MCreator"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7oVarious PlanetMinecraft & Skindex users"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7oThe MCreator Forums."), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7oAnyone who has supported my creative endeavours in the past."), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lYou\u00A7r \u00A7ocurrently playing the mod, thank you!"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7l^^^ Scroll up to read all the credits. ^^^"), false);
	}
}

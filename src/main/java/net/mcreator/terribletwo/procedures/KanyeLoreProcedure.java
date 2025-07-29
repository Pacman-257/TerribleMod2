package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class KanyeLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oA man of vanity and pride. Kanye believes himself to be ascended, above the rest of creation as a \u201Cgenius\u201D. "), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHe lives to seek two things; truth. Especially if it is of a contrarian nature and power. "), false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHe aspires to be untethered and unbounded by the restraints of mortal man as to have no one above him, to judge him for what he is. "), false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oHaving grown exhausted of his life as a multi millionaire in pursuit of his true passion he threw it all away. He gained the courage to do this after reading the book Mein Cock at his public library, a life changing experience for him. "),
						false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oAfter this he joined the Contrarian Party and became its leader calling upon the red hats to march on Vatican City and take it in the name of Kanye so that he might search its secret archives for an occult artifact known as The Spear of Longsusis. "),
						false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7oHowever the day of the march on the Vatican was also the day of the Great Leanspolsion that sent the world and all worlds for that matter tumbling headlong into chaos. Vatican City fell that day, not to the red hats but rather to the floor of creation, the base upon which all other worlds are built. "),
						false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe place we now stand. "), false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThough the Vatican lies scattered in ruins, power still resides here as does the Spear. "), false);
		});
		TerribletwoMod.queueServerWork(840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBest you find it before he does."), false);
		});
	}
}

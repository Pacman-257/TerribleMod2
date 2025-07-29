package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.terribletwo.TerribletwoMod;

public class NapoleonLoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerribletwoMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe man of destiny, the man who conquered half of Europe, the short king of our time. "), false);
		});
		TerribletwoMod.queueServerWork(140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								"\u00A7oNapoleon Bonapart, emperor of France was a man to be feared. With unbounded ambition and a searing intellect he sought not only domination of the physical world but heaven itself and for this he lived. "),
						false);
		});
		TerribletwoMod.queueServerWork(240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oVisiting the archives of Vatican City on one of his many campaigns he discovered an ancient book simply entitled \u201COrigins\u201D. "), false);
		});
		TerribletwoMod.queueServerWork(340, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe book filled his head with visions of the things that had been and would be, revealing to him the secrets of not just this world but all worlds."), false);
		});
		TerribletwoMod.queueServerWork(440, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal("\u00A7oEventually Napoleon's great leadership and military brilliance previously invincible now faltered with him spending almost every waking moment wrapped in the fantasies provided by the book. "),
						false);
		});
		TerribletwoMod.queueServerWork(540, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oImpossible worlds of splendor, dreams, and nightmares were shown to him without limit."), false);
		});
		TerribletwoMod.queueServerWork(640, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe book denied nothing to the emperor and his fantasies became his personal reality, his empire and renown crumbled."), false);
		});
		TerribletwoMod.queueServerWork(740, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oEventually he was abandoned by all but his most loyal soldiers and France fell into ruin crushed under heel of The Bed Bug Blitz, it would never recover. "), false);
		});
		TerribletwoMod.queueServerWork(840, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oOver time Napelon not only lost his strength and brilliance as a leader and tactician but also his prized possession the book of Origins. "), false);
		});
		TerribletwoMod.queueServerWork(940, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oPages being ripped from the book for their secrets. "), false);
		});
		TerribletwoMod.queueServerWork(1040, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oIn the end he lost everything and now there is simply nothing he can do. "), false);
		});
		TerribletwoMod.queueServerWork(1140, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHe still wanders the world a husk of his former self, clinging to the final pages of the ruined book of Origins."), false);
		});
		TerribletwoMod.queueServerWork(1240, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThough, if you are here, then I'm sure you know that by now and the emperor is probably long since dead."), false);
		});
	}
}

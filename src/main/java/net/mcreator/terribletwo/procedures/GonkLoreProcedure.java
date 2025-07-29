package net.mcreator.terribletwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class GonkLoreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Desdinova")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oDesdinova..."), false);
			CreatorsLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Fulcanelli")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oFulcanelli..."), false);
			CreatorsLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Voltsgeist")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oVoltsgeist..."), false);
			VoltsgeistLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("West")
				|| (guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Westward Expansion")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oWestward Expansion..."), false);
			WestLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Baboon Staff")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Staff of The Baboon King..."), false);
			BaboonLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Napoleon")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oNapoleon..."), false);
			NapoleonLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Freddy Fazbear")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oFreddy Fazbear..."), false);
			FreddyLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("William Afton")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oWilliam Afton..."), false);
			AftonLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Spear of Longsussis")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Spear of Longsussis..."), false);
			SpearLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("The Red Hat")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Red Hat..."), false);
			RedHatLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("The Blue Hat")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Blue Hat..."), false);
			BlueHatLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("The Wizard")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Wizard..."), false);
			WizardLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Shakespeare")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oWilliam Shakespeare..."), false);
			ShakespeareLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Kanye West")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oKanye West..."), false);
			KanyeLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Shia LaBeouf")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oShia LaBeouf..."), false);
			ShiaLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("LowTierGod")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oLowTierGod..."), false);
			LTGLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Terrible Mod 2")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oTerrible Mod 2..."), false);
			TM2LoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Basedtanium")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBasedtanium..."), false);
			BasedLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Cringetanium")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oCringetanium..."), false);
			CringeLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("9/11")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oJudgement day..."), false);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Markiplier")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oMarkiplier..."), false);
			MarkiplarLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("German Man")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oGerman Man..."), false);
			GermanManLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Jesse James")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oJesse James..."), false);
			JesseJamesLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Bedbug Blitz")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Bedbug Blitz..."), false);
			BedbugLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Vessel") || (guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("The Vessel")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Vessel..."), false);
			VesselLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("First Player") || (guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("First")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe First Player..."), false);
			FirstLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Second Player") || (guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Second")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Second Player..."), false);
			SecondLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Third Player") || (guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Third")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Third Player..."), false);
			ThirdLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Walter White")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oWalter White..."), false);
			WaltuhLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("DreamSMP")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oDreamSMP..."), false);
			DreamSMPLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Brazil")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBrazil..."), false);
			BrazilLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("MCreator")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oPossibly the worst coding software ever before Scratch and the only good game on there was Phantasm in The Sunset."), false);
			DogshitLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Satoru Gojo")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oSatoru Gojo..."), false);
			GojoLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Lord Cadicus")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oNO YOU FOOL! Do NOT speak his name"), false);
			CadicusLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("C-Shape")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oA terrible spectre haunts this place..."), false);
			CShapeLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Great Northern War")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Great Northern War..."), false);
			WarLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Santa") || (guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Santa Claus")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oSanta Claus..."), false);
			SantaLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Elves")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Elves..."), false);
			ElfLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Peepee Man")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oPeepee Man..."), false);
			PeePeeManLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Beatroot King")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Beatroot King..."), false);
			BeatrootLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Pickle Rick")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oPickle Rick..."), false);
			PickleRickLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Jewigers") || (guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Jews")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Jewigers..."), false);
			JewigerLoreProcedure.execute(world, x, y, z, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Ourpal Sword")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Ourpal Sword..."), false);
			OurpalLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("God of Basketball")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe God of Basketball..."), false);
			GodLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Miro")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oMiro..."), false);
			MiroLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Cosmic Kush")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oCosmic Kush..."), false);
			KushLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Pineapple Pizza")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oPineapple Pizza..."), false);
			FeasibleProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Bananas")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBananas..."), false);
			BananaLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Eeralds")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oEeralds..."), false);
			EeraldLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Leansplosion")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oLeansplosion..."), false);
			LeansplosionLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Guff")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oGuff..."), false);
			GuffLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Ninja")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oNinja..."), false);
			NinjaLorProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Mass Production Blevins")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oPoor souls..."), false);
			MPDLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Susmongus")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oSusmongus..."), false);
			SusmongusLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Rain King")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Rain King is real."), false);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Peashooter")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Peashooter..."), false);
			PeashooterLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("France")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oFrance..."), false);
			FranceLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Lil Gray Alien")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Lil' Gray Alien..."), false);
			AlienLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("True Gun")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe True Gun..."), false);
			TrueGunLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Han Solo")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oHan Solo..."), false);
			HanSoloLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Green")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oGreen..."), false);
			GreenLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Shadow Wizard Money Gang")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Shadow Wizard Money Gang..."), false);
			ShadowLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Renaissance Men")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oRenaissance Men..."), false);
			RenaissanceLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("The Creator")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Creator..."), false);
			CreatorLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Sunken Star")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Sunken Star..."), false);
			SunkenStarLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Gecko's Eye")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Gecko's Eye..."), false);
			GeckoLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Diabolist Flames")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Diabolist Flames..."), false);
			DiabolistLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Old Spice")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oOld Spice..."), false);
			OldSpiceLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Calculus")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oCalculus..."), false);
			CalculusLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Origins")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oOrigins..."), false);
			OriginsLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Ball State University")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBall State University keeps emailing me asking if I want to go to their college, cluttering up my inbox. "), false);
			BallStateUniversityProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Dream")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oDream..."), false);
			DreamLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Mousey McNuts")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oMousey McNuts..."), false);
			SmallArmsProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Richtofen Dimension")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Richtofen Dimension..."), false);
			RichtofenLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Clown Ending")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Clown Ending..."), false);
			ClownLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Vatican City")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oVatican City..."), false);
			VaticanLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Benjamin Franklin")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oBenjamin Franklin..."), false);
			FranklinLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Epitaph")) {
			EpitaphLoreProcedure.execute(world, entity);
		} else if ((guistate.containsKey("text:lore") ? ((EditBox) guistate.get("text:lore")).getValue() : "").equals("Park Pantheon")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oThe Park Pantheon..."), false);
			ParkLoreProcedure.execute(world, entity);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7oI do not understand the question."), false);
		}
	}
}

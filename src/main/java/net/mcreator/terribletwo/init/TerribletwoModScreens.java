
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.terribletwo.client.gui.SpringtrapJumpscarescreenScreen;
import net.mcreator.terribletwo.client.gui.SleepyJoeScreen;
import net.mcreator.terribletwo.client.gui.OriginsBookScreen;
import net.mcreator.terribletwo.client.gui.LowTierGodGUIScreen;
import net.mcreator.terribletwo.client.gui.HRFJUMPScreen;
import net.mcreator.terribletwo.client.gui.GonkLoreGUIScreen;
import net.mcreator.terribletwo.client.gui.GoldenJumpscareScreenScreen;
import net.mcreator.terribletwo.client.gui.FreddyJumpscareScreen;
import net.mcreator.terribletwo.client.gui.FoxyJumpscareScreen;
import net.mcreator.terribletwo.client.gui.EmptyScrollScreenScreen;
import net.mcreator.terribletwo.client.gui.CosmicKushGUIScreen;
import net.mcreator.terribletwo.client.gui.ChicaJumpscareScreen;
import net.mcreator.terribletwo.client.gui.Calc4ScreenScreen;
import net.mcreator.terribletwo.client.gui.Calc3ScreenScreen;
import net.mcreator.terribletwo.client.gui.Calc2BookScreenScreen;
import net.mcreator.terribletwo.client.gui.Calc1BookScreenScreen;
import net.mcreator.terribletwo.client.gui.BonnieJumpscareScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TerribletwoModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(TerribletwoModMenus.SLEEPY_JOE.get(), SleepyJoeScreen::new);
		event.register(TerribletwoModMenus.COSMIC_KUSH_GUI.get(), CosmicKushGUIScreen::new);
		event.register(TerribletwoModMenus.FREDDY_JUMPSCARE.get(), FreddyJumpscareScreen::new);
		event.register(TerribletwoModMenus.BONNIE_JUMPSCARE.get(), BonnieJumpscareScreen::new);
		event.register(TerribletwoModMenus.CHICA_JUMPSCARE.get(), ChicaJumpscareScreen::new);
		event.register(TerribletwoModMenus.FOXY_JUMPSCARE.get(), FoxyJumpscareScreen::new);
		event.register(TerribletwoModMenus.HRFJUMP.get(), HRFJUMPScreen::new);
		event.register(TerribletwoModMenus.ORIGINS_BOOK.get(), OriginsBookScreen::new);
		event.register(TerribletwoModMenus.GONK_LORE_GUI.get(), GonkLoreGUIScreen::new);
		event.register(TerribletwoModMenus.CALC_1_BOOK_SCREEN.get(), Calc1BookScreenScreen::new);
		event.register(TerribletwoModMenus.CALC_2_BOOK_SCREEN.get(), Calc2BookScreenScreen::new);
		event.register(TerribletwoModMenus.CALC_3_SCREEN.get(), Calc3ScreenScreen::new);
		event.register(TerribletwoModMenus.CALC_4_SCREEN.get(), Calc4ScreenScreen::new);
		event.register(TerribletwoModMenus.EMPTY_SCROLL_SCREEN.get(), EmptyScrollScreenScreen::new);
		event.register(TerribletwoModMenus.LOW_TIER_GOD_GUI.get(), LowTierGodGUIScreen::new);
		event.register(TerribletwoModMenus.GOLDEN_JUMPSCARE_SCREEN.get(), GoldenJumpscareScreenScreen::new);
		event.register(TerribletwoModMenus.SPRINGTRAP_JUMPSCARESCREEN.get(), SpringtrapJumpscarescreenScreen::new);
	}
}

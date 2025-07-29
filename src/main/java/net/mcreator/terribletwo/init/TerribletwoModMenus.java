
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.terribletwo.world.inventory.SpringtrapJumpscarescreenMenu;
import net.mcreator.terribletwo.world.inventory.SleepyJoeMenu;
import net.mcreator.terribletwo.world.inventory.OriginsBookMenu;
import net.mcreator.terribletwo.world.inventory.LowTierGodGUIMenu;
import net.mcreator.terribletwo.world.inventory.HRFJUMPMenu;
import net.mcreator.terribletwo.world.inventory.GonkLoreGUIMenu;
import net.mcreator.terribletwo.world.inventory.GoldenJumpscareScreenMenu;
import net.mcreator.terribletwo.world.inventory.FreddyJumpscareMenu;
import net.mcreator.terribletwo.world.inventory.FoxyJumpscareMenu;
import net.mcreator.terribletwo.world.inventory.EmptyScrollScreenMenu;
import net.mcreator.terribletwo.world.inventory.CosmicKushGUIMenu;
import net.mcreator.terribletwo.world.inventory.ChicaJumpscareMenu;
import net.mcreator.terribletwo.world.inventory.Calc4ScreenMenu;
import net.mcreator.terribletwo.world.inventory.Calc3ScreenMenu;
import net.mcreator.terribletwo.world.inventory.Calc2BookScreenMenu;
import net.mcreator.terribletwo.world.inventory.Calc1BookScreenMenu;
import net.mcreator.terribletwo.world.inventory.BonnieJumpscareMenu;
import net.mcreator.terribletwo.TerribletwoMod;

public class TerribletwoModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, TerribletwoMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<SleepyJoeMenu>> SLEEPY_JOE = REGISTRY.register("sleepy_joe", () -> IMenuTypeExtension.create(SleepyJoeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CosmicKushGUIMenu>> COSMIC_KUSH_GUI = REGISTRY.register("cosmic_kush_gui", () -> IMenuTypeExtension.create(CosmicKushGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FreddyJumpscareMenu>> FREDDY_JUMPSCARE = REGISTRY.register("freddy_jumpscare", () -> IMenuTypeExtension.create(FreddyJumpscareMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BonnieJumpscareMenu>> BONNIE_JUMPSCARE = REGISTRY.register("bonnie_jumpscare", () -> IMenuTypeExtension.create(BonnieJumpscareMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ChicaJumpscareMenu>> CHICA_JUMPSCARE = REGISTRY.register("chica_jumpscare", () -> IMenuTypeExtension.create(ChicaJumpscareMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FoxyJumpscareMenu>> FOXY_JUMPSCARE = REGISTRY.register("foxy_jumpscare", () -> IMenuTypeExtension.create(FoxyJumpscareMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HRFJUMPMenu>> HRFJUMP = REGISTRY.register("hrfjump", () -> IMenuTypeExtension.create(HRFJUMPMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<OriginsBookMenu>> ORIGINS_BOOK = REGISTRY.register("origins_book", () -> IMenuTypeExtension.create(OriginsBookMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GonkLoreGUIMenu>> GONK_LORE_GUI = REGISTRY.register("gonk_lore_gui", () -> IMenuTypeExtension.create(GonkLoreGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Calc1BookScreenMenu>> CALC_1_BOOK_SCREEN = REGISTRY.register("calc_1_book_screen", () -> IMenuTypeExtension.create(Calc1BookScreenMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Calc2BookScreenMenu>> CALC_2_BOOK_SCREEN = REGISTRY.register("calc_2_book_screen", () -> IMenuTypeExtension.create(Calc2BookScreenMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Calc3ScreenMenu>> CALC_3_SCREEN = REGISTRY.register("calc_3_screen", () -> IMenuTypeExtension.create(Calc3ScreenMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Calc4ScreenMenu>> CALC_4_SCREEN = REGISTRY.register("calc_4_screen", () -> IMenuTypeExtension.create(Calc4ScreenMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EmptyScrollScreenMenu>> EMPTY_SCROLL_SCREEN = REGISTRY.register("empty_scroll_screen", () -> IMenuTypeExtension.create(EmptyScrollScreenMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<LowTierGodGUIMenu>> LOW_TIER_GOD_GUI = REGISTRY.register("low_tier_god_gui", () -> IMenuTypeExtension.create(LowTierGodGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GoldenJumpscareScreenMenu>> GOLDEN_JUMPSCARE_SCREEN = REGISTRY.register("golden_jumpscare_screen", () -> IMenuTypeExtension.create(GoldenJumpscareScreenMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SpringtrapJumpscarescreenMenu>> SPRINGTRAP_JUMPSCARESCREEN = REGISTRY.register("springtrap_jumpscarescreen", () -> IMenuTypeExtension.create(SpringtrapJumpscarescreenMenu::new));
}

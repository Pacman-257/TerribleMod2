package net.mcreator.terribletwo.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.terribletwo.world.inventory.GonkLoreGUIMenu;
import net.mcreator.terribletwo.network.GonkLoreGUIButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GonkLoreGUIScreen extends AbstractContainerScreen<GonkLoreGUIMenu> {
	private final static HashMap<String, Object> guistate = GonkLoreGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox lore;
	Button button_submit;

	public GonkLoreGUIScreen(GonkLoreGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("terribletwo:textures/screens/gonk_lore_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		lore.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (lore.isFocused())
			return lore.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String loreValue = lore.getValue();
		super.resize(minecraft, width, height);
		lore.setValue(loreValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		lore = new EditBox(this.font, this.leftPos + 30, this.topPos + 65, 118, 18, Component.translatable("gui.terribletwo.gonk_lore_gui.lore")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.terribletwo.gonk_lore_gui.lore").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos, boolean flag) {
				super.moveCursorTo(pos, flag);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.terribletwo.gonk_lore_gui.lore").getString());
				else
					setSuggestion(null);
			}
		};
		lore.setMaxLength(32767);
		lore.setSuggestion(Component.translatable("gui.terribletwo.gonk_lore_gui.lore").getString());
		guistate.put("text:lore", lore);
		this.addWidget(this.lore);
		button_submit = Button.builder(Component.translatable("gui.terribletwo.gonk_lore_gui.button_submit"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new GonkLoreGUIButtonMessage(0, x, y, z));
				GonkLoreGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 61, this.topPos + 111, 56, 20).build();
		guistate.put("button:button_submit", button_submit);
		this.addRenderableWidget(button_submit);
	}
}

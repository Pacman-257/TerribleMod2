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

import net.mcreator.terribletwo.world.inventory.EmptyScrollScreenMenu;
import net.mcreator.terribletwo.network.EmptyScrollScreenButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EmptyScrollScreenScreen extends AbstractContainerScreen<EmptyScrollScreenMenu> {
	private final static HashMap<String, Object> guistate = EmptyScrollScreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox FirstVerse;
	Button button_complete;

	public EmptyScrollScreenScreen(EmptyScrollScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("terribletwo:textures/screens/empty_scroll_screen.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		FirstVerse.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (FirstVerse.isFocused())
			return FirstVerse.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String FirstVerseValue = FirstVerse.getValue();
		super.resize(minecraft, width, height);
		FirstVerse.setValue(FirstVerseValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		FirstVerse = new EditBox(this.font, this.leftPos + 29, this.topPos + 59, 118, 18, Component.translatable("gui.terribletwo.empty_scroll_screen.FirstVerse")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.terribletwo.empty_scroll_screen.FirstVerse").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos, boolean flag) {
				super.moveCursorTo(pos, flag);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.terribletwo.empty_scroll_screen.FirstVerse").getString());
				else
					setSuggestion(null);
			}
		};
		FirstVerse.setMaxLength(32767);
		FirstVerse.setSuggestion(Component.translatable("gui.terribletwo.empty_scroll_screen.FirstVerse").getString());
		guistate.put("text:FirstVerse", FirstVerse);
		this.addWidget(this.FirstVerse);
		button_complete = Button.builder(Component.translatable("gui.terribletwo.empty_scroll_screen.button_complete"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new EmptyScrollScreenButtonMessage(0, x, y, z));
				EmptyScrollScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 53, this.topPos + 113, 72, 20).build();
		guistate.put("button:button_complete", button_complete);
		this.addRenderableWidget(button_complete);
	}
}

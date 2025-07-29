
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.terribletwo.entity.BedbugEntity;
import net.mcreator.terribletwo.client.model.Modelbedbug;

import com.mojang.blaze3d.vertex.PoseStack;

public class BedbugRenderer extends MobRenderer<BedbugEntity, Modelbedbug<BedbugEntity>> {
	public BedbugRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbedbug(context.bakeLayer(Modelbedbug.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(BedbugEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BedbugEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/bedbug.png");
	}
}

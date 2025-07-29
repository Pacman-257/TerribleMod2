
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.terribletwo.entity.SusmongusEntity;
import net.mcreator.terribletwo.client.model.Modelsusmonguscopy;

import com.mojang.blaze3d.vertex.PoseStack;

public class SusmongusRenderer extends MobRenderer<SusmongusEntity, Modelsusmonguscopy<SusmongusEntity>> {
	public SusmongusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsusmonguscopy(context.bakeLayer(Modelsusmonguscopy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(SusmongusEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SusmongusEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/sustext.png");
	}
}

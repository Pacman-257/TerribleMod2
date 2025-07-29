
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.terribletwo.entity.DrippedOutSusmongusEntity;
import net.mcreator.terribletwo.client.model.Modelsusmongusdrip;

import com.mojang.blaze3d.vertex.PoseStack;

public class DrippedOutSusmongusRenderer extends MobRenderer<DrippedOutSusmongusEntity, Modelsusmongusdrip<DrippedOutSusmongusEntity>> {
	public DrippedOutSusmongusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsusmongusdrip(context.bakeLayer(Modelsusmongusdrip.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(DrippedOutSusmongusEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DrippedOutSusmongusEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/susdrip.png");
	}
}

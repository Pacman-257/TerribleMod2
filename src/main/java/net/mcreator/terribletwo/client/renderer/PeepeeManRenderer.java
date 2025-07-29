
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.terribletwo.entity.PeepeeManEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class PeepeeManRenderer extends HumanoidMobRenderer<PeepeeManEntity, HumanoidModel<PeepeeManEntity>> {
	public PeepeeManRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(PeepeeManEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(4f, 4f, 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(PeepeeManEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/peepeeman.png");
	}
}


package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.terribletwo.entity.ShiaLabeoufTheRainKingEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class ShiaLabeoufTheRainKingRenderer extends MobRenderer<ShiaLabeoufTheRainKingEntity, SpiderModel<ShiaLabeoufTheRainKingEntity>> {
	public ShiaLabeoufTheRainKingRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	protected void scale(ShiaLabeoufTheRainKingEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShiaLabeoufTheRainKingEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/actualcannibalshialabeouf9541742.png");
	}
}

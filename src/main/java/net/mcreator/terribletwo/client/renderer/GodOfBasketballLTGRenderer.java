
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.terribletwo.entity.GodOfBasketballLTGEntity;

public class GodOfBasketballLTGRenderer extends HumanoidMobRenderer<GodOfBasketballLTGEntity, HumanoidModel<GodOfBasketballLTGEntity>> {
	public GodOfBasketballLTGRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(GodOfBasketballLTGEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/2019_07_17_god-of-basketball--regular-show--13201081.png");
	}

	@Override
	protected boolean isBodyVisible(GodOfBasketballLTGEntity entity) {
		return false;
	}
}

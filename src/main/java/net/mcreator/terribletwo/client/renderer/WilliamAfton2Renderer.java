
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.terribletwo.entity.WilliamAfton2Entity;

public class WilliamAfton2Renderer extends HumanoidMobRenderer<WilliamAfton2Entity, HumanoidModel<WilliamAfton2Entity>> {
	public WilliamAfton2Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(WilliamAfton2Entity entity) {
		return new ResourceLocation("terribletwo:textures/entities/2023_03_25_william-afton--five-nights-at-freddy-s--21453936.png");
	}
}

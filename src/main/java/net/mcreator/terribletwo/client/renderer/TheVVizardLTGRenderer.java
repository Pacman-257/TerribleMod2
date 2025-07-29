
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.terribletwo.entity.TheVVizardLTGEntity;

public class TheVVizardLTGRenderer extends HumanoidMobRenderer<TheVVizardLTGEntity, HumanoidModel<TheVVizardLTGEntity>> {
	public TheVVizardLTGRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(TheVVizardLTGEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/ecc252134685b738.png");
	}

	@Override
	protected boolean isBodyVisible(TheVVizardLTGEntity entity) {
		return false;
	}
}

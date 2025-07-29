
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.terribletwo.entity.GreenWizardLTGEntity;

public class GreenWizardLTGRenderer extends HumanoidMobRenderer<GreenWizardLTGEntity, HumanoidModel<GreenWizardLTGEntity>> {
	public GreenWizardLTGRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(GreenWizardLTGEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/imgonline-com-ua-replacecolor-bfh9q5lyvypqo-removebg-preview.png");
	}

	@Override
	protected boolean isBodyVisible(GreenWizardLTGEntity entity) {
		return false;
	}
}

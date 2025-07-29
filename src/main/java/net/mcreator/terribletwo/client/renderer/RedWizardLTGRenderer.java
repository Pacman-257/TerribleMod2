
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.terribletwo.entity.RedWizardLTGEntity;

public class RedWizardLTGRenderer extends HumanoidMobRenderer<RedWizardLTGEntity, HumanoidModel<RedWizardLTGEntity>> {
	public RedWizardLTGRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RedWizardLTGEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/imgonline-com-ua-replacecolor-1u5oxiyfpqk7wa-removebg-preview.png");
	}

	@Override
	protected boolean isBodyVisible(RedWizardLTGEntity entity) {
		return false;
	}
}

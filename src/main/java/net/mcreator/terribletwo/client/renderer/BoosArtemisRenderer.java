
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.terribletwo.entity.BoosArtemisEntity;

public class BoosArtemisRenderer extends MobRenderer<BoosArtemisEntity, OcelotModel<BoosArtemisEntity>> {
	public BoosArtemisRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoosArtemisEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/placeholder.png");
	}
}

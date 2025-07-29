
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.terribletwo.entity.SSGolemEntity;
import net.mcreator.terribletwo.client.model.ModelSSGolem;

public class SSGolemRenderer extends MobRenderer<SSGolemEntity, ModelSSGolem<SSGolemEntity>> {
	public SSGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSSGolem(context.bakeLayer(ModelSSGolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SSGolemEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/iron-golem-planetminecraft-com-13092016.png");
	}
}

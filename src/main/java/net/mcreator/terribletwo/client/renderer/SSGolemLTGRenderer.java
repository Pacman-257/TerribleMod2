
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.terribletwo.entity.SSGolemLTGEntity;
import net.mcreator.terribletwo.client.model.ModelSSGolem;

public class SSGolemLTGRenderer extends MobRenderer<SSGolemLTGEntity, ModelSSGolem<SSGolemLTGEntity>> {
	public SSGolemLTGRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSSGolem(context.bakeLayer(ModelSSGolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SSGolemLTGEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/iron-golem-planetminecraft-com-13092016.png");
	}

	@Override
	protected boolean isBodyVisible(SSGolemLTGEntity entity) {
		return false;
	}
}

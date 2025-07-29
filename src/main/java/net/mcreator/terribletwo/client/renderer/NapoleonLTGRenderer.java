
package net.mcreator.terribletwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.terribletwo.entity.NapoleonLTGEntity;
import net.mcreator.terribletwo.client.model.Modelnap;

import com.mojang.blaze3d.vertex.PoseStack;

public class NapoleonLTGRenderer extends MobRenderer<NapoleonLTGEntity, Modelnap<NapoleonLTGEntity>> {
	public NapoleonLTGRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnap(context.bakeLayer(Modelnap.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(NapoleonLTGEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NapoleonLTGEntity entity) {
		return new ResourceLocation("terribletwo:textures/entities/3f4570baccb0227c8c5405ae92083a4bca0edf85-14771980.png");
	}

	@Override
	protected boolean isBodyVisible(NapoleonLTGEntity entity) {
		return false;
	}
}

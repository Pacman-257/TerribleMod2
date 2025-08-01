package net.mcreator.terribletwo.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.terribletwo.entity.HollowPurpleEntity;
import net.mcreator.terribletwo.client.model.Modelhollowpurple;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HollowPurpleRenderer extends EntityRenderer<HollowPurpleEntity> {
	private static final ResourceLocation texture = new ResourceLocation("terribletwo:textures/entities/images.png");
	private final Modelhollowpurple model;

	public HollowPurpleRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelhollowpurple(context.bakeLayer(Modelhollowpurple.LAYER_LOCATION));
	}

	@Override
	public void render(HollowPurpleEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(HollowPurpleEntity entity) {
		return texture;
	}
}

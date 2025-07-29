package net.mcreator.terribletwo.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.terribletwo.entity.DeadGonkEntity;

public class DeadGonkModel extends GeoModel<DeadGonkEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeadGonkEntity entity) {
		return new ResourceLocation("terribletwo", "animations/deadgonk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeadGonkEntity entity) {
		return new ResourceLocation("terribletwo", "geo/deadgonk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeadGonkEntity entity) {
		return new ResourceLocation("terribletwo", "textures/entities/" + entity.getTexture() + ".png");
	}

}

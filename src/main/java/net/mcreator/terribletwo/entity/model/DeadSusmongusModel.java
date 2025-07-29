package net.mcreator.terribletwo.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.terribletwo.entity.DeadSusmongusEntity;

public class DeadSusmongusModel extends GeoModel<DeadSusmongusEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeadSusmongusEntity entity) {
		return new ResourceLocation("terribletwo", "animations/susmonguscopy_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeadSusmongusEntity entity) {
		return new ResourceLocation("terribletwo", "geo/susmonguscopy_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeadSusmongusEntity entity) {
		return new ResourceLocation("terribletwo", "textures/entities/" + entity.getTexture() + ".png");
	}

}

package net.mcreator.terribletwo.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.terribletwo.entity.PeashooterEntity;

public class PeashooterModel extends GeoModel<PeashooterEntity> {
	@Override
	public ResourceLocation getAnimationResource(PeashooterEntity entity) {
		return new ResourceLocation("terribletwo", "animations/peashoote.geo_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PeashooterEntity entity) {
		return new ResourceLocation("terribletwo", "geo/peashoote.geo_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PeashooterEntity entity) {
		return new ResourceLocation("terribletwo", "textures/entities/" + entity.getTexture() + ".png");
	}

}

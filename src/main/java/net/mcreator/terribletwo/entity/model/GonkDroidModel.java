package net.mcreator.terribletwo.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.terribletwo.entity.GonkDroidEntity;

public class GonkDroidModel extends GeoModel<GonkDroidEntity> {
	@Override
	public ResourceLocation getAnimationResource(GonkDroidEntity entity) {
		return new ResourceLocation("terribletwo", "animations/gonkdroidcopy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GonkDroidEntity entity) {
		return new ResourceLocation("terribletwo", "geo/gonkdroidcopy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GonkDroidEntity entity) {
		return new ResourceLocation("terribletwo", "textures/entities/" + entity.getTexture() + ".png");
	}

}

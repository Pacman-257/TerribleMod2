
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terribletwo.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.terribletwo.client.model.Modelsusmongusdrip;
import net.mcreator.terribletwo.client.model.Modelsusmonguscopy;
import net.mcreator.terribletwo.client.model.Modelpea;
import net.mcreator.terribletwo.client.model.Modelnapoleonpants;
import net.mcreator.terribletwo.client.model.Modelnap;
import net.mcreator.terribletwo.client.model.Modeljordans;
import net.mcreator.terribletwo.client.model.Modelhollowpurple;
import net.mcreator.terribletwo.client.model.Modelgojoblindfoldl;
import net.mcreator.terribletwo.client.model.Modelfeddy;
import net.mcreator.terribletwo.client.model.Modelbedbug;
import net.mcreator.terribletwo.client.model.ModelSSGolem;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TerribletwoModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeljordans.LAYER_LOCATION, Modeljordans::createBodyLayer);
		event.registerLayerDefinition(Modelfeddy.LAYER_LOCATION, Modelfeddy::createBodyLayer);
		event.registerLayerDefinition(Modelgojoblindfoldl.LAYER_LOCATION, Modelgojoblindfoldl::createBodyLayer);
		event.registerLayerDefinition(Modelnapoleonpants.LAYER_LOCATION, Modelnapoleonpants::createBodyLayer);
		event.registerLayerDefinition(Modelbedbug.LAYER_LOCATION, Modelbedbug::createBodyLayer);
		event.registerLayerDefinition(Modelnap.LAYER_LOCATION, Modelnap::createBodyLayer);
		event.registerLayerDefinition(Modelpea.LAYER_LOCATION, Modelpea::createBodyLayer);
		event.registerLayerDefinition(Modelsusmonguscopy.LAYER_LOCATION, Modelsusmonguscopy::createBodyLayer);
		event.registerLayerDefinition(Modelsusmongusdrip.LAYER_LOCATION, Modelsusmongusdrip::createBodyLayer);
		event.registerLayerDefinition(Modelhollowpurple.LAYER_LOCATION, Modelhollowpurple::createBodyLayer);
		event.registerLayerDefinition(ModelSSGolem.LAYER_LOCATION, ModelSSGolem::createBodyLayer);
	}
}


package net.mcreator.terribletwo.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.terribletwo.world.inventory.EmptyScrollScreenMenu;
import net.mcreator.terribletwo.procedures.EmptyScrollProcedureProcedure;
import net.mcreator.terribletwo.TerribletwoMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record EmptyScrollScreenButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<EmptyScrollScreenButtonMessage> TYPE = new Type<>(new ResourceLocation(TerribletwoMod.MODID, "empty_scroll_screen_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, EmptyScrollScreenButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, EmptyScrollScreenButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new EmptyScrollScreenButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<EmptyScrollScreenButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final EmptyScrollScreenButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = EmptyScrollScreenMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			EmptyScrollProcedureProcedure.execute(world, entity, guistate);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TerribletwoMod.addNetworkMessage(EmptyScrollScreenButtonMessage.TYPE, EmptyScrollScreenButtonMessage.STREAM_CODEC, EmptyScrollScreenButtonMessage::handleData);
	}
}

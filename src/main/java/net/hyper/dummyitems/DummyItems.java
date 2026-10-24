package net.hyper.dummyitems;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class DummyItems implements ModInitializer {
	public static final String MOD_ID = "dummyitems";
	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

	private static void regItem(String name, Function<Item.Properties, Item> function) {
		Registry.register(BuiltInRegistries.ITEM, id(name), function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id("dummyitem")))));
	}
	@Override
	public void onInitialize() {
		LoggerFactory.getLogger(MOD_ID).info("Registering ❤'s");
		for (int i = 1; i <= 9999; i++) regItem("dummyitem" + i, Item::new);
	}
}
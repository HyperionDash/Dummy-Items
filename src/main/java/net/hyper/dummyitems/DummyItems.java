package net.hyper.dummyitems;

import net.fabricmc.api.ModInitializer;

import net.hyper.dummyitems.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DummyItems implements ModInitializer {
	public static final String MOD_ID = "dummyitems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
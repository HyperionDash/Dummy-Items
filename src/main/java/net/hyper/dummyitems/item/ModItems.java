package net.hyper.dummyitems.item;

import net.hyper.dummyitems.DummyItems;
import net.minecraft.entity.ai.brain.task.WantNewItemTask;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DUMMY_ITEM1 = registerItem("dummy_item1", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DummyItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DummyItems.LOGGER.info("Registering Mod Items for" + DummyItems.MOD_ID);
    }
}

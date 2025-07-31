package net.hyper.dummyitems.item;

import net.hyper.dummyitems.DummyItems;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DUMMYITEM1 = registerItem("dummyitem1", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DummyItems.MOD_ID, "dummyitem")))));
    public static final Item DUMMYITEM2 = registerItem("dummyitem2", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DummyItems.MOD_ID, "dummyitem")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DummyItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DummyItems.LOGGER.info("Registering Mod Items for" + DummyItems.MOD_ID);
    }
}

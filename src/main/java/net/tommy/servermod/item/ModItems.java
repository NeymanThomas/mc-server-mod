package net.tommy.servermod.item;

import net.tommy.servermod.ServerMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ServerMod.MOD_ID);

    public static final RegistryObject<Item> TOMMYCOIN = ITEMS.register("tommycoin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOMMYDOLLAR = ITEMS.register("tommydollar",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

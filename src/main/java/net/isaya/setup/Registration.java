package net.isaya.setup;

import net.isaya.items.LongerStickItem;
import net.isaya.items.RidiculouslyLongStickItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.isaya.ordinarymod.OrdinaryMod.MODID;

public class Registration {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> LSItem = ITEMS.register("longerstickitem", () -> new LongerStickItem(new Item.Properties()));

    public static final RegistryObject<Item> RLSItem = ITEMS.register("ridiculouslylongstickitem", () -> new RidiculouslyLongStickItem(new Item.Properties()));
}

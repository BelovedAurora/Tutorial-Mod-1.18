package com.tutorialmod.init;

import com.tutorialmod.TutorialMod;
import com.tutorialmod.init.custom.ScytheItem;
import com.tutorialmod.util.Tiers;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = register("ruby",
            () -> new Item(new Item.Properties().tab(TutorialMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe",
            () -> new ScytheItem(Tiers.RUBY, 4, -2.4f,
                    new Item.Properties().tab(TutorialMod.TUTORIAL_TAB)));


    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name, item);
    }




}


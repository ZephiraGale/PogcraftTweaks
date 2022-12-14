package com.zephira.pogtweaks.init;

import com.google.common.base.Supplier;
import com.zephira.pogtweaks.PogTweaks;
import com.zephira.pogtweaks.item.LevitationDust;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PogTweaks.MOD_ID);

    public static final RegistryObject<Item> LEVITATION_DUST = register("levitation_dust", () -> new LevitationDust(new Item.Properties().tab(PogTweaks.TWEAKS_TAB)));

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}

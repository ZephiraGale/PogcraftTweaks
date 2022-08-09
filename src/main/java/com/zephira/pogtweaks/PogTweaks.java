package com.zephira.pogtweaks;

import org.apache.commons.lang3.ObjectUtils.Null;

import com.mojang.datafixers.types.templates.List;
import com.zephira.pogtweaks.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("pogtweaks")
public class PogTweaks {

    public static final String MOD_ID = "pogtweaks";

    public static final CreativeModeTab TWEAKS_TAB = new CreativeModeTab(MOD_ID) {

        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
        }
        
    };

    public PogTweaks () {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}

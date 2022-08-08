package com.zephira.pogtweaks;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("pogtweaks")
public class PogTweaks {
    public PogTweaks () {
        MinecraftForge.EVENT_BUS.register(this);
    }
}

package com.zephira.pogtweaks.sound;


import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.util.ForgeSoundType;

public class ModSounds {
    public static final ForgeSoundType  HEAVY_OBSIDIAN = new ForgeSoundType( 1.0F,  1.0F, () -> SoundEvents.STONE_BREAK, () -> SoundEvents.STONE_STEP, () -> SoundEvents.NETHERITE_BLOCK_PLACE,  () -> SoundEvents.STONE_HIT, () -> SoundEvents.STONE_FALL);
}

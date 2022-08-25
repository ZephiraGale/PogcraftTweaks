package com.zephira.pogtweaks.sound;


//NOT BEING USED   8/24
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.util.ForgeSoundType;

public class CustomSoundTypes {
    public static final ForgeSoundType TEST = new ForgeSoundType( 1.0F,  1.0F, () -> SoundEvents.STONE_BREAK, () -> SoundEvents.STONE_STEP, () -> SoundEvents.NETHERITE_BLOCK_PLACE,  () -> SoundEvents.STONE_HIT, () -> SoundEvents.STONE_FALL);
}

package com.zephira.pogtweaks.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.ForgeSoundType;

public class ReinforcedObsidian extends Block {
    public static final ForgeSoundType TEST = new ForgeSoundType( 1.0F,  1.0F, () -> SoundEvents.STONE_BREAK, () -> SoundEvents.STONE_STEP, () -> SoundEvents.NETHERITE_BLOCK_PLACE,  () -> SoundEvents.STONE_HIT, () -> SoundEvents.STONE_FALL);

    public ReinforcedObsidian(Properties properties) {
        super(properties);
    }

    
    
}

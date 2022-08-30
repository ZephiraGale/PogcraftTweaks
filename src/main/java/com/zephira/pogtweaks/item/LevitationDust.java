package com.zephira.pogtweaks.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class LevitationDust extends Item {

    public LevitationDust(Properties properties) {
        super(properties);
    }
    
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        if(!world.isClientSide){
            player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, (int)((6+Math.random()*3)*20)));
        }
        itemStack.shrink(1);

                return super.use(world, player, hand);
    }

}

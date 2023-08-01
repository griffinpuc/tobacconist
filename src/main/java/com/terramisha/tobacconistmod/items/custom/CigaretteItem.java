package com.terramisha.tobacconistmod.items.custom;

import com.terramisha.tobacconistmod.items.SmokingItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CigaretteItem extends SmokingItem {

    public CigaretteItem(Properties properties) {
        super(properties);
    }

    // Use the cigarette and puff some smoke!
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {

            ServerLevel serverLevel = (ServerLevel) level;
            this.triggerSmokingEffectPlayer(player, serverLevel, 0);

            if(player.getItemInHand(hand).getDamageValue() >= getMaxDamage(player.getItemInHand(hand))){
                player.getItemInHand(hand).hurtAndBreak(1, player, (myPlayer -> myPlayer.broadcastBreakEvent(myPlayer.getUsedItemHand())));
            }
            player.getItemInHand(hand).setDamageValue(player.getItemInHand(hand).getDamageValue() + 1);

        }

        return super.use(level, player, hand);
    }

    @Override
    public void setTooltip(String tooltip) {
        super.setTooltip(tooltip);
    }
}

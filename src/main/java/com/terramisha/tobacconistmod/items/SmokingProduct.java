package com.terramisha.tobacconistmod.items;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public abstract class SmokingProduct extends Item {

    public SmokingProduct(Properties properties) {
        super(properties);
    }

    private String tooltip;

    public void setTooltip(String tooltip){
        this.tooltip = tooltip;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn){
        tooltip.add(Component.literal(String.valueOf(this.tooltip)));

        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    };
}

package com.diggydwarff.tobacconistmod.items.custom;

import com.diggydwarff.tobacconistmod.items.SmokingProduct;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AirItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nullable;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShishaTobaccoItem extends SmokingProduct {

    public ShishaTobaccoItem(Properties properties) {

        super(properties);

    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn){
        CompoundTag compoundtag = stack.getTag();

        if(compoundtag != null){

            String tobacco = compoundtag.getString("tobacco");
            String shishaFlavor1 = compoundtag.getString("flavor1");
            String shishaFlavor2 = compoundtag.getString("flavor2");
            String shishaFlavor3 = compoundtag.getString("flavor3");

            tooltip.add(Component.literal(tobacco.replace("[","").replace("]","")).withStyle(ChatFormatting.GOLD));

            for(String shishaFlavor : Arrays.asList(shishaFlavor1, shishaFlavor2, shishaFlavor3)){
                if(shishaFlavor.contains("Molasses")){

                    String pattern = "\\(([^)]+)\\)";
                    Pattern r = Pattern.compile(pattern);
                    Matcher m = r.matcher(shishaFlavor);

                    if(m.find()){
                        String match = m.group(0);
                        tooltip.add(Component.literal("* "+ match).withStyle(ChatFormatting.GOLD));
                    }

                }
            }

            super.appendHoverText(stack, worldIn, tooltip, flagIn);
        }
    };

}

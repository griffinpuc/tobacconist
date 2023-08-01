package com.terramisha.tobacconistmod.recipes;

import com.terramisha.tobacconistmod.TobacconistMod;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, TobacconistMod.MODID);

    public static final RegistryObject<RecipeSerializer<ShishaTobaccoRecipe>> SHISHA_TOBACCO_RECIPE_SERIALIZER =
            SERIALIZERS.register("crafting_special_shishatobacco", () -> ShishaTobaccoRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }



}

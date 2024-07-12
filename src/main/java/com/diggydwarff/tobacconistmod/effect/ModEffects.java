package com.diggydwarff.tobacconistmod.effect;

import com.diggydwarff.tobacconistmod.TobacconistMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TobacconistMod.MODID);

    public static final RegistryObject<MobEffect> NICOTINE = MOB_EFFECTS.register("nicotine",
            () -> new NicotineEffect(MobEffectCategory.NEUTRAL, 2495014));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }

}

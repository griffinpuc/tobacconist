package com.diggydwarff.tobacconistmod.world;

import com.diggydwarff.tobacconistmod.util.TobacconistIdentifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class TobacconistPlacedFeature {

    public static final ResourceKey<PlacedFeature> WILD_FLOWERING_TOBACCO_KEY = registerKey("wild_flowering_tobacco");

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new TobacconistIdentifier(name));
    }

}

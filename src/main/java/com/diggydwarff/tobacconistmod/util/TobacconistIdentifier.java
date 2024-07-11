package com.diggydwarff.tobacconistmod.util;

import com.diggydwarff.tobacconistmod.TobacconistMod;
import net.minecraft.resources.ResourceLocation;

public class TobacconistIdentifier extends ResourceLocation {
    public TobacconistIdentifier(String path) {
        super(TobacconistMod.MODID, path);
    }
}

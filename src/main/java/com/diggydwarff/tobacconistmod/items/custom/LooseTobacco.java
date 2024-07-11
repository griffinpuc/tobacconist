package com.diggydwarff.tobacconistmod.items.custom;

import com.diggydwarff.tobacconistmod.TobacconistCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.Locale;

public enum LooseTobacco {

    TOBACCO_LOOSE_WILD(0, 5),
    TOBACCO_LOOSE_VIRGINIA(1, 10),
    TOBACCO_LOOSE_BURLEY(2, 15),
    TOBACCO_LOOSE_ORIENTAL(3, 15),
    TOBACCO_LOOSE_DOKHA(4, 20),
    TOBACCO_LOOSE_SHADE(5, 10);

    private final Item item;

    LooseTobacco(int id, int strength){
        this.item = new LooseTobaccoItem(new Item.Properties());
    }

    public String getName() {
        return name().toLowerCase(Locale.ROOT); // Locale.ROOT will ensure consistent behavior (prevent crashes) on all locales
    }

    public Item getItem(){
        return item;
    }

    public ItemStack getStack(){
        return new ItemStack(this.item);
    }


}

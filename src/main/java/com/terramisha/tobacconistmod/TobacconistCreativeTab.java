package com.terramisha.tobacconistmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.terramisha.tobacconistmod.items.ModItems.*;

public class TobacconistCreativeTab extends CreativeModeTab {

    public static final TobacconistCreativeTab instance = new TobacconistCreativeTab(CreativeModeTab.TABS.length, "tobacconistmod");

    private TobacconistCreativeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() { return new ItemStack(WILD_TOBACCO_LEAF.get()); }
}

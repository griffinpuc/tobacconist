package com.terramisha.tobacconistmod.items;

import com.terramisha.tobacconistmod.TobacconistCreativeTab;
import com.terramisha.tobacconistmod.TobacconistMod;
import com.terramisha.tobacconistmod.block.ModBlocks;
import com.terramisha.tobacconistmod.items.custom.CigaretteItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TobacconistMod.MODID);

    // TOOL ITEMS
    public static final RegistryObject<Item> WOODEN_SMOKING_PIPE = ITEMS.register("wooden_smoking_pipe", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> GOLD_SMOKING_PIPE = ITEMS.register("gold_smoking_pipe", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));

    public static final RegistryObject<Item> HOOKAH = ITEMS.register("hookah", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> HOOKHA_BOWL = ITEMS.register("hookah_bowl", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> HOOKAH_VASE = ITEMS.register("hookah_vase", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> HOOKAH_PIPE = ITEMS.register("hookah_pipe", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));

    public static final RegistryObject<Item> ROLLING_PAPER = ITEMS.register("rolling_paper", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));

    // INGREDIENTS
    public static final RegistryObject<Item> BOTTLED_MOLASSES = ITEMS.register("bottled_molasses", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));

    // FINAL PRODUCTS
    public static final RegistryObject<Item> CIGAR = ITEMS.register("cigar",
            () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance).durability(50)));

    public static final RegistryObject<Item> CIGARETTE = ITEMS.register("cigarette",
            () -> new CigaretteItem(new Item.Properties().tab(TobacconistCreativeTab.instance).durability(20)));

    public static final RegistryObject<Item> SHISHA_TOBACCO = ITEMS.register("shisha_tobacco", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));


    // TOBACCO LEAF ITEMS (wet)
    public static final RegistryObject<Item> WILD_TOBACCO_LEAF = ITEMS.register("tobacco_leaf_wild", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> VIRGINIA_TOBACCO_LEAF = ITEMS.register("tobacco_leaf_virginia", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> BURLEY_TOBACCO_LEAF = ITEMS.register("tobacco_leaf_burley", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> ORIENTAL_TOBACCO_LEAF = ITEMS.register("tobacco_leaf_oriental", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> DOKHA_TOBACCO_LEAF = ITEMS.register("tobacco_leaf_dokha", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> SHADE_TOBACCO_LEAF = ITEMS.register("tobacco_leaf_shade", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));


    // TOBACCO LEAF ITEMS (dry)
    public static final RegistryObject<Item> WILD_TOBACCO_LEAF_DRY = ITEMS.register("tobacco_leaf_wild_dry", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> VIRGINIA_TOBACCO_LEAF_DRY = ITEMS.register("tobacco_leaf_virginia_dry", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> BURLEY_TOBACCO_LEAF_DRY = ITEMS.register("tobacco_leaf_burley_dry", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> ORIENTAL_TOBACCO_LEAF_DRY = ITEMS.register("tobacco_leaf_oriental_dry", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> DOKHA_TOBACCO_LEAF_DRY = ITEMS.register("tobacco_leaf_dokha_dry", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));
    public static final RegistryObject<Item> SHADE_TOBACCO_LEAF_DRY = ITEMS.register("tobacco_leaf_shade_dry", () -> new Item(new Item.Properties().tab(TobacconistCreativeTab.instance)));

    // TOBACCO SEED ITEMS
    public static final RegistryObject<Item> WILD_TOBACCO_SEEDS = ITEMS.register("tobacco_seeds_wild",
            () -> new ItemNameBlockItem(ModBlocks.WILD_TOBACCO_CROP.get(),
                    new Item.Properties().tab(TobacconistCreativeTab.instance)));

    public static final RegistryObject<Item> VIRGINIA_TOBACCO_SEEDS = ITEMS.register("tobacco_seeds_virginia",
            () -> new ItemNameBlockItem(ModBlocks.VIRGINIA_TOBACCO_CROP.get(),
                    new Item.Properties().tab(TobacconistCreativeTab.instance)));

    public static final RegistryObject<Item> BURLEY_TOBACCO_SEEDS = ITEMS.register("tobacco_seeds_burley",
            () -> new ItemNameBlockItem(ModBlocks.BURLEY_TOBACCO_CROP.get(),
                    new Item.Properties().tab(TobacconistCreativeTab.instance)));

    public static final RegistryObject<Item> ORIENTAL_TOBACCO_SEEDS = ITEMS.register("tobacco_seeds_oriental",
            () -> new ItemNameBlockItem(ModBlocks.ORIENTAL_TOBACCO_CROP.get(),
                    new Item.Properties().tab(TobacconistCreativeTab.instance)));

    public static final RegistryObject<Item> DOKHA_TOBACCO_SEEDS = ITEMS.register("tobacco_seeds_dokha",
            () -> new ItemNameBlockItem(ModBlocks.DOKHA_TOBACCO_CROP.get(),
                    new Item.Properties().tab(TobacconistCreativeTab.instance)));

    public static final RegistryObject<Item> SHADE_TOBACCO_SEEDS = ITEMS.register("tobacco_seeds_shade",
            () -> new ItemNameBlockItem(ModBlocks.SHADE_TOBACCO_CROP.get(),
                    new Item.Properties().tab(TobacconistCreativeTab.instance)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
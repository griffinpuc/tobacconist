package com.terramisha.tobacconistmod.block;

import com.terramisha.tobacconistmod.TobacconistMod;
import com.terramisha.tobacconistmod.block.custom.WildTobaccoCropBlock;
import com.terramisha.tobacconistmod.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TobacconistMod.MODID);

    public static final RegistryObject<Block> WILD_TOBACCO_CROP = BLOCKS.register("tobacco_crop_wild",
            () -> new WildTobaccoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> VIRGINIA_TOBACCO_CROP = BLOCKS.register("tobacco_crop_virginia",
            () -> new WildTobaccoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> BURLEY_TOBACCO_CROP = BLOCKS.register("tobacco_crop_burley",
            () -> new WildTobaccoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> ORIENTAL_TOBACCO_CROP = BLOCKS.register("tobacco_crop_oriental",
            () -> new WildTobaccoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> DOKHA_TOBACCO_CROP = BLOCKS.register("tobacco_crop_dokha",
            () -> new WildTobaccoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> SHADE_TOBACCO_CROP = BLOCKS.register("tobacco_crop_shade",
            () -> new WildTobaccoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
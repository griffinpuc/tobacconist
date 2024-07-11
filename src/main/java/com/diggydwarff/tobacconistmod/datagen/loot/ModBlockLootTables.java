package com.diggydwarff.tobacconistmod.datagen.loot;

import com.diggydwarff.tobacconistmod.block.ModBlocks;
import com.diggydwarff.tobacconistmod.block.custom.WildCropBlock;
import com.diggydwarff.tobacconistmod.items.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.HOOKAH.get());

        LootItemCondition.Builder wildBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.WILD_TOBACCO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 5))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.WILD_TOBACCO_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 6)));

        LootItemCondition.Builder virginiaBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.VIRGINIA_TOBACCO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 5))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.VIRGINIA_TOBACCO_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 6)));

        LootItemCondition.Builder burleyBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.BURLEY_TOBACCO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 5))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.BURLEY_TOBACCO_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 6)));

        LootItemCondition.Builder dokhaBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.DOKHA_TOBACCO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 5))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.DOKHA_TOBACCO_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 6)));

        LootItemCondition.Builder orientalBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.ORIENTAL_TOBACCO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 5))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.ORIENTAL_TOBACCO_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 6)));

        LootItemCondition.Builder shadeBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.SHADE_TOBACCO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 5))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.SHADE_TOBACCO_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(WildCropBlock.AGE, 6)));

        this.add(ModBlocks.WILD_TOBACCO_CROP.get(), createCropDrops(ModBlocks.WILD_TOBACCO_CROP.get(), ModItems.WILD_TOBACCO_LEAF.get(),
                ModItems.WILD_TOBACCO_SEEDS.get(), wildBuilder));

        this.add(ModBlocks.VIRGINIA_TOBACCO_CROP.get(), createCropDrops(ModBlocks.WILD_TOBACCO_CROP.get(), ModItems.WILD_TOBACCO_LEAF.get(),
                ModItems.VIRGINIA_TOBACCO_SEEDS.get(), virginiaBuilder));

        this.add(ModBlocks.BURLEY_TOBACCO_CROP.get(), createCropDrops(ModBlocks.WILD_TOBACCO_CROP.get(), ModItems.WILD_TOBACCO_LEAF.get(),
                ModItems.BURLEY_TOBACCO_SEEDS.get(), burleyBuilder));

        this.add(ModBlocks.DOKHA_TOBACCO_CROP.get(), createCropDrops(ModBlocks.WILD_TOBACCO_CROP.get(), ModItems.WILD_TOBACCO_LEAF.get(),
                ModItems.DOKHA_TOBACCO_SEEDS.get(), dokhaBuilder));

        this.add(ModBlocks.ORIENTAL_TOBACCO_CROP.get(), createCropDrops(ModBlocks.WILD_TOBACCO_CROP.get(), ModItems.WILD_TOBACCO_LEAF.get(),
                ModItems.ORIENTAL_TOBACCO_SEEDS.get(), orientalBuilder));

        this.add(ModBlocks.SHADE_TOBACCO_CROP.get(), createCropDrops(ModBlocks.WILD_TOBACCO_CROP.get(), ModItems.WILD_TOBACCO_LEAF.get(),
                ModItems.SHADE_TOBACCO_SEEDS.get(), shadeBuilder));

    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

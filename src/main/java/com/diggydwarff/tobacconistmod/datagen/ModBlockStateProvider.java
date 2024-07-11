package com.diggydwarff.tobacconistmod.datagen;

import com.diggydwarff.tobacconistmod.TobacconistMod;
import com.diggydwarff.tobacconistmod.block.ModBlocks;
import com.diggydwarff.tobacconistmod.block.custom.WildCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TobacconistMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.HOOKAH);

        makeTobaccoCrop(((CropBlock) ModBlocks.WILD_TOBACCO_CROP.get()), "tobacco_stage", "tobacco_stage");
        makeTobaccoCrop(((CropBlock) ModBlocks.VIRGINIA_TOBACCO_CROP.get()), "tobacco_stage", "tobacco_stage");
        makeTobaccoCrop(((CropBlock) ModBlocks.SHADE_TOBACCO_CROP.get()), "tobacco_stage", "tobacco_stage");
        makeTobaccoCrop(((CropBlock) ModBlocks.BURLEY_TOBACCO_CROP.get()), "tobacco_stage", "tobacco_stage");
        makeTobaccoCrop(((CropBlock) ModBlocks.DOKHA_TOBACCO_CROP.get()), "tobacco_stage", "tobacco_stage");
        makeTobaccoCrop(((CropBlock) ModBlocks.ORIENTAL_TOBACCO_CROP.get()), "tobacco_stage", "tobacco_stage");

    }

    public void makeTobaccoCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> tobaccoStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] tobaccoStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((WildCropBlock) block).getAgeProperty()),
                new ResourceLocation(TobacconistMod.MODID, "block/" + textureName + state.getValue(((WildCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}

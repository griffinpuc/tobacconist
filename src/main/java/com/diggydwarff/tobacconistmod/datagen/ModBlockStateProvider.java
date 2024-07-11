package com.diggydwarff.tobacconistmod.datagen;

import com.diggydwarff.tobacconistmod.TobacconistMod;
import com.diggydwarff.tobacconistmod.block.ModBlocks;
import com.diggydwarff.tobacconistmod.block.custom.*;
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

        makeTobaccoCrop(((CropBlock) ModBlocks.WILD_TOBACCO_CROP.get()), "tobaccowild", "tobaccowild", "wild");
        makeTobaccoCrop(((CropBlock) ModBlocks.VIRGINIA_TOBACCO_CROP.get()), "tobaccovirginia", "tobaccovirginia", "virginia");
        makeTobaccoCrop(((CropBlock) ModBlocks.SHADE_TOBACCO_CROP.get()), "tobaccoshade", "tobaccoshade", "shade");
        makeTobaccoCrop(((CropBlock) ModBlocks.BURLEY_TOBACCO_CROP.get()), "tobaccoburley", "tobaccoburley", "burley");
        makeTobaccoCrop(((CropBlock) ModBlocks.DOKHA_TOBACCO_CROP.get()), "tobaccodokha", "tobaccodokha", "dokha");
        makeTobaccoCrop(((CropBlock) ModBlocks.ORIENTAL_TOBACCO_CROP.get()), "tobaccooriental", "tobaccooriental", "oriental");

    }

    public void makeTobaccoCrop(CropBlock block, String modelName, String textureName, String type) {
        Function<BlockState, ConfiguredModel[]> function = state -> tobaccoStates(state, block, modelName, textureName, type);
        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] tobaccoStates(BlockState state, CropBlock block, String modelName, String textureName, String type) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        switch (type) {
            case "wild":
                models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((WildCropBlock) block).getAgeProperty()),
                        new ResourceLocation(TobacconistMod.MODID, "block/tobacco/wild/" + textureName + state.getValue(((WildCropBlock) block).getAgeProperty()))).renderType("cutout"));
                break;
            case "virginia":
                models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((VirginiaCropBlock) block).getAgeProperty()),
                        new ResourceLocation(TobacconistMod.MODID, "block/tobacco/virginia/" + textureName + state.getValue(((VirginiaCropBlock) block).getAgeProperty()))).renderType("cutout"));
                break;
            case "shade":
                models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((ShadeCropBlock) block).getAgeProperty()),
                        new ResourceLocation(TobacconistMod.MODID, "block/tobacco/shade/" + textureName + state.getValue(((ShadeCropBlock) block).getAgeProperty()))).renderType("cutout"));
                break;
            case "burley":
                models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((BurleyCropBlock) block).getAgeProperty()),
                        new ResourceLocation(TobacconistMod.MODID, "block/tobacco/burley/" + textureName + state.getValue(((BurleyCropBlock) block).getAgeProperty()))).renderType("cutout"));
                break;
            case "dokha":
                models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((DokhaCropBlock) block).getAgeProperty()),
                        new ResourceLocation(TobacconistMod.MODID, "block/tobacco/dokha/" + textureName + state.getValue(((DokhaCropBlock) block).getAgeProperty()))).renderType("cutout"));
                break;
            case "oriental":
                models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((OrientalCropBlock) block).getAgeProperty()),
                        new ResourceLocation(TobacconistMod.MODID, "block/tobacco/oriental/" + textureName + state.getValue(((OrientalCropBlock) block).getAgeProperty()))).renderType("cutout"));
                break;
        }

        return models;
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}

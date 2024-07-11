package com.diggydwarff.tobacconistmod.block.custom;

import com.diggydwarff.tobacconistmod.items.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class DokhaTobaccoCropBlock extends CropBlock {

    private static final int CROP_AGE = 5;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, CROP_AGE);


    public DokhaTobaccoCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId(){
        return ModItems.DOKHA_TOBACCO_LEAF.get();
    }

    @Override
    public int getMaxAge() {
        return CROP_AGE;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}

package com.dyonovan.neotech.nei;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import com.dyonovan.neotech.handlers.BlockHandler;
import com.dyonovan.neotech.lib.Constants;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class NEIAddonConfig implements IConfigureNEI {

    @Override
    public void loadConfig() {

        API.hideItem(new ItemStack(BlockHandler.electricCrusherActive));
        API.hideItem(new ItemStack(BlockHandler.electricFurnaceActive));
        API.hideItem(new ItemStack(BlockHandler.fluidGeneratorActive));
        API.hideItem(new ItemStack(BlockHandler.furnaceGeneratorActive));
    }

    @Override
    public String getName() {
        return StatCollector.translateToLocal("neotech.nei.name");
    }

    @Override
    public String getVersion() {
        return Constants.VERSION;
    }
}

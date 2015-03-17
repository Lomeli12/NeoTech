package com.dyonovan.jatm.handlers;

import com.dyonovan.jatm.client.gui.GuiElectricFurnace;
import com.dyonovan.jatm.client.gui.generators.GuiCoalGenerator;
import com.dyonovan.jatm.common.container.ContainerElectricFurnace;
import com.dyonovan.jatm.common.container.generators.ContainerCoalGenerator;
import com.dyonovan.jatm.common.tileentity.machine.TileElectricFurnace;
import com.dyonovan.jatm.common.tileentity.generator.TileCoalGenerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    public static final int COAL_GENERATOR_GUI_ID = 0;
    public static final int ELECTRIC_FURNACE_GUI_ID = 1;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID) {
            case COAL_GENERATOR_GUI_ID:
                return new ContainerCoalGenerator(player.inventory, (TileCoalGenerator) world.getTileEntity(new BlockPos(x, y, z)));
            case ELECTRIC_FURNACE_GUI_ID:
                return new ContainerElectricFurnace(player.inventory, (TileElectricFurnace) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID) {
            case COAL_GENERATOR_GUI_ID:
                return new GuiCoalGenerator(player.inventory, (TileCoalGenerator) world.getTileEntity(new BlockPos(x, y, z)));
            case ELECTRIC_FURNACE_GUI_ID:
                return new GuiElectricFurnace(player.inventory, (TileElectricFurnace) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }
}
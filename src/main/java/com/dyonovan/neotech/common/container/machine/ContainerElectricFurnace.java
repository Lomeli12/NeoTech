package com.dyonovan.neotech.common.container.machine;

import com.dyonovan.neotech.common.container.BaseContainer;
import com.dyonovan.neotech.common.container.SlotUpgrade;
import com.dyonovan.neotech.common.tileentity.machine.TileElectricFurnace;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceOutput;

public class ContainerElectricFurnace extends BaseContainer {

    public ContainerElectricFurnace(InventoryPlayer inventory, TileElectricFurnace tileEntity) {

        addSlotToContainer(new Slot(tileEntity, TileElectricFurnace.INPUT_SLOT, 57, 27));
        addSlotToContainer(new SlotFurnaceOutput(inventory.player, tileEntity, TileElectricFurnace.OUTPUT_SLOT, 117, 27));
        addSlotToContainer(new SlotUpgrade(tileEntity, TileElectricFurnace.UPGRADE_SLOT, 153, 7));
        bindPlayerInventory(inventory, 8, 100);
    }
}

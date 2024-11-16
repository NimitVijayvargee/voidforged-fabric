package net.voidforged.screenhandler;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.slot.Slot;
import net.voidforged.block.ModBlocks;
import net.voidforged.block.entity.AncientForgeEntity;
import net.voidforged.network.BlockPosPayload;

public class AncientForgeScreenHandler extends ScreenHandler {
    private final AncientForgeEntity blockEntity;
    private final ScreenHandlerContext context;

    public AncientForgeScreenHandler(int syncId, PlayerInventory playerInventory, AncientForgeEntity block_entity) {
        super(ModScreenHandlers.ANCIENT_FORGE_SCREEN_HANDLER, syncId);

        this.blockEntity = block_entity;
        this.context = ScreenHandlerContext.create(this.blockEntity.getWorld(), this.blockEntity.getPos());

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    private void addPlayerInventory(PlayerInventory inv) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlot(new Slot(inv, 9+(i + j*9), 8+ (j*18), 84+(i*18)));
            }

        }
    }
    private void addPlayerHotbar(PlayerInventory inv) {
        for (int i = 0; i < 9 ; i++) {
            addSlot(new Slot(inv,i, 8 + (i*18), 142));
        }
    }



    public AncientForgeScreenHandler(int syncId, PlayerInventory playerInventory, BlockPosPayload payload) {
        this(syncId, playerInventory, (AncientForgeEntity) playerInventory.player.getWorld().getBlockEntity(payload.pos()));
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return canUse(null, player, ModBlocks.ANCIENT_FORGE);
    }

    public AncientForgeEntity getBlockEntity() {
        return this.blockEntity;
    }
}

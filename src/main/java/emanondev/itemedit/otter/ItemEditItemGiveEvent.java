package emanondev.itemedit.otter;

import emanondev.itemedit.UtilsInventory;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemEditItemGiveEvent extends Event {


    private final HumanEntity humanEntity;
    private final ItemStack itemStack;
    private final int amount;
    private final UtilsInventory.ExcessManage excessManageMode;
    private boolean cancelled;

    public ItemEditItemGiveEvent(HumanEntity humanEntity, ItemStack itemStack, int amount, UtilsInventory.ExcessManage excessManageMode) {
        this.humanEntity = humanEntity;
        this.itemStack = itemStack;
        this.amount = amount;
        this.excessManageMode = excessManageMode;
    }

    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    public HumanEntity getHumanEntity() {
        return humanEntity;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public int getAmount() {
        return amount;
    }

    public UtilsInventory.ExcessManage getExcessManageMode() {
        return excessManageMode;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public @NotNull static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }
}

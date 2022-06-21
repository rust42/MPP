package exampractise.prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
    private LocalDate checkoutDate;
    private LendingItem lendingItem;
    private LocalDate dueDate;
    private ItemType itemType;

    CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
        this.lendingItem = item;
        this.checkoutDate = chDate;
        this.dueDate = dueDate;
        this.itemType = type;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LendingItem getLendingItem() {
        return lendingItem;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public ItemType getItemType() {
        return itemType;
    }
}

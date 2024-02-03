package com.amazon.DesignPatterns.DesignVendingMachine;

public class Inventory {
    private ItemShelf[] inventory;

    public Inventory() {
        this.inventory = null;
    }
    public Inventory(int size) {
        this.inventory = new ItemShelf[size];
        this.initialEmptyInventory();
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public ItemShelf[] getInventory() {
        return this.inventory;
    }

    public void initialEmptyInventory() {
        int defaultCode = 101;
        for(int index = 0; index < inventory.length; index++) {
            ItemShelf current = new ItemShelf();
            current.setCode(defaultCode);
            current.setSoldOut(false);
            inventory[index] = current;
            defaultCode++;
        }
    }

    public void addItem(Item item, int code) throws Exception {
        for(ItemShelf currentItem: this.inventory) {
            if (currentItem.getCode() == code) {
                if (currentItem.getSoldOut()) {
                    currentItem.setItem(item);
                    currentItem.setSoldOut(false);
                } else {
                    throw new Exception("Item already present, you can't update it newly");
                }
            }
        }
    }

    public Item getItem(int code) throws Exception {
        for(ItemShelf currentItem: this.inventory) {
            if (currentItem.getCode() == code) {
                if (currentItem.getSoldOut()) {
                    throw new Exception("Item out of stock");
                } else {
                    return currentItem.getItem();
                }
            }
        }
        throw new Exception("Invalid item code");
    }

    public void updateSoldOutItem(int code) {
        for(ItemShelf currentItem: this.inventory) {
            if (currentItem.getCode() == code) {
                currentItem.setSoldOut(true);
            }
        }
    }
}

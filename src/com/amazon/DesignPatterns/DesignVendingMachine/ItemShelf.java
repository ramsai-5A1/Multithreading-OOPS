package com.amazon.DesignPatterns.DesignVendingMachine;

public class ItemShelf {
    private int code;
    private Item item;
    private boolean soldOut;

    public ItemShelf() {

    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public boolean getSoldOut() {
        return this.soldOut;
    }
}

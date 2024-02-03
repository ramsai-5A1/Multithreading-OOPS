package com.amazon.DesignPatterns.DesignVendingMachine;

public class Item {
    private ItemType item;
    private int price;

    public Item() {

    }

    public Item(ItemType item, int price) {
        this.item = item;
        this.price = price;
    }

    public ItemType getItem() {
        return this.item;
    }

    public void setItem(ItemType item) {
        this.item = item;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}

package com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.impl;

import com.amazon.DesignPatterns.DesignVendingMachine.Coin;
import com.amazon.DesignPatterns.DesignVendingMachine.Item;
import com.amazon.DesignPatterns.DesignVendingMachine.VendingMachine;
import com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.State;

import java.util.List;

public class SelectionState implements State {
    public SelectionState() {
        System.out.println("Currently vending machine is in SelectionState");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item = machine.getInventory().getItem(codeNumber);
        int paidByUser = 0;
        for(Coin coin: machine.getCoinsList()) {
            paidByUser += coin.value;
        }

        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient amount");
            refundFullMoney(machine);
            throw new Exception("Insufficient amount");
        } else {
            if (paidByUser > item.getPrice()) {
                getChange(paidByUser - item.getPrice());
            }
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

    }
}

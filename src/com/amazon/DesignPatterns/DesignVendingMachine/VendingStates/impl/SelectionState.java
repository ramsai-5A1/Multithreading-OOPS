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
        throw new Exception("Invalid operation in Selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Invalid operation in Selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Invalid operation in Selection state");
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
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Change returned successfully of " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Invalid operation in Selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned back the full-refund");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinsList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Invalid operation in Selection state");
    }
}

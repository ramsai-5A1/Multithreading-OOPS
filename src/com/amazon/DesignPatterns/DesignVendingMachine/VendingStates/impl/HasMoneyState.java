package com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.impl;

import com.amazon.DesignPatterns.DesignVendingMachine.Coin;
import com.amazon.DesignPatterns.DesignVendingMachine.Item;
import com.amazon.DesignPatterns.DesignVendingMachine.VendingMachine;
import com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.State;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Currently Vending Machine is in HasMoneyState");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You've already clicked on this button, please insert a coin");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Inserted one coin");
        machine.getCoinsList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You have to click on start product selection button to proceed further");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You have to click on start product selection button to getChange");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You have to click on start product selection button to proceed further");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Refunded full amount back successfully");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinsList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("You cannot update the inventory in HasMoneyState");
    }
}

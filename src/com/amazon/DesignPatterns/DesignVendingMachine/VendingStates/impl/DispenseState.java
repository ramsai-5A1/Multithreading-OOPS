package com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.impl;

import com.amazon.DesignPatterns.DesignVendingMachine.Coin;
import com.amazon.DesignPatterns.DesignVendingMachine.Item;
import com.amazon.DesignPatterns.DesignVendingMachine.VendingMachine;
import com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.State;

import java.util.List;

public class DispenseState implements State {

    public DispenseState(VendingMachine machine, int code) throws Exception {
        System.out.println("Currently VM is in Dispense state");
        this.dispenseProduct(machine, code);
    }

    public DispenseState() {
        System.out.println("Currently vending machine is in dispensing state");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Invalid operation in dispense-state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Invalid operation in dispense-state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Invalid operation in dispense-state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Invalid operation in dispense-state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Invalid operation in dispense-state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Invalid operation in dispense-state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Invalid operation in dispense-state");
    }
}

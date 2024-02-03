package com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.impl;

import com.amazon.DesignPatterns.DesignVendingMachine.Coin;
import com.amazon.DesignPatterns.DesignVendingMachine.Item;
import com.amazon.DesignPatterns.DesignVendingMachine.VendingMachine;
import com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently vending machine is in IdleState");
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("Currently vending machine is in Idlestate");
        vendingMachine.setCoinsList(new ArrayList<>());
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("First you need to click on InsertCoinButton");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot choose product in Idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You cannot get change in Idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot dispense product in Idle State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("You cannot get refund in Idle State");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

    }
}

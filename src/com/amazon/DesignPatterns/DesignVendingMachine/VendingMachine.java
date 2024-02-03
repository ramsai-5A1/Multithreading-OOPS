package com.amazon.DesignPatterns.DesignVendingMachine;

import com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.State;
import com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinsList;

    public VendingMachine() {
        this.vendingMachineState = new IdleState();
        this.inventory = new Inventory(10);
        this.coinsList = new ArrayList<>();
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public State getVendingMachineState() {
        return this.vendingMachineState;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setCoinsList(List<Coin> coinsList) {
        this.coinsList = coinsList;
    }

    public List<Coin> getCoinsList() {
        return this.coinsList;
    }
}

package com.amazon.DesignPatterns.DesignVendingMachine;

import com.amazon.DesignPatterns.DesignVendingMachine.VendingStates.State;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main execution started");
        VendingMachine machine = new VendingMachine();
        try {
            fillUpInventory(machine);
            displayInventory(machine);

            System.out.println("Clicking on insertCoinButton");

            State vendingMachineState = machine.getVendingMachineState();
            vendingMachineState.clickOnInsertCoinButton(machine);

            vendingMachineState = machine.getVendingMachineState();
            vendingMachineState.insertCoin(machine, Coin.QUARTER);
            vendingMachineState.insertCoin(machine, Coin.QUARTER);

            System.out.println("Clicking on product select button");

            vendingMachineState.clickOnStartProductSelectionButton(machine);
            vendingMachineState = machine.getVendingMachineState();
            vendingMachineState.chooseProduct(machine, 103);

            displayInventory(machine);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main execution ended");
    }

    public static void fillUpInventory(VendingMachine machine) {
        ItemShelf[] shelves = machine.getInventory().getInventory();
        for (int index = 0; index < shelves.length; index++) {
            Item item = new Item();
            if (index <= 2) {
                item.setItem(ItemType.COKE);
                item.setPrice(Coin.QUARTER.value);
            } else if (index <= 5) {
                item.setItem(ItemType.SODA);
                item.setPrice(Coin.NICKEL.value);
            } else if (index <= 8) {
                item.setItem(ItemType.JUICE);
                item.setPrice(Coin.DIME.value);
            } else {
                item.setItem(ItemType.PEPSI);
                item.setPrice(Coin.PENNY.value);
            }
            shelves[index].setItem(item);
            shelves[index].setSoldOut(false);
        }
    }

    public static void displayInventory(VendingMachine machine) {
        ItemShelf[] shelves = machine.getInventory().getInventory();
        for(ItemShelf current: shelves) {
            System.out.println(current.getCode() + " " + current.getItem().getItem() + " " + current.getSoldOut());
        }
    }
}

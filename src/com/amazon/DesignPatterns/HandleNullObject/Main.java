package com.amazon.DesignPatterns.HandleNullObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicleObject("Bus");
        Vehicle vehicle2 = VehicleFactory.getVehicleObject("Car");
        printDetails(vehicle1);
        printDetails(vehicle2);
    }

    private static void printDetails(Vehicle vehicle) {
        System.out.println("Capacity is: " + vehicle.getCapacity());
        System.out.println("Milege is: " + vehicle.getMilage());
    }
}

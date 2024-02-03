package com.amazon.DesignPatterns.HandleNullObject;

public class VehicleFactory {
    public static Vehicle getVehicleObject(String type) {
        if (type.equals("Car")) {
            return new Car();
        }
        return new NullObject();
    }
}

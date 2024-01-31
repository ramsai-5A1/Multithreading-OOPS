package com.amazon.Interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("[ElectricEngine] Engine started");
    }

    @Override
    public void stop() {
        System.out.println("[ElectricEngine] engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("[ElectricEngine] Accelerated");
    }
}

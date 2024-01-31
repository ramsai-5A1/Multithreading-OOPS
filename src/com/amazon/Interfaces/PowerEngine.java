package com.amazon.Interfaces;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("[PowerEngine] engine started");
    }

    @Override
    public void stop() {
        System.out.println("[PowerEngine] Engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("[PowerEngine] Acclerated");
    }
}

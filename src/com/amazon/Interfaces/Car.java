package com.amazon.Interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("[Car] Brake method in Car");
    }

    @Override
    public void start() {
        System.out.println("[Car] start method in Car");
    }

    @Override
    public void stop() {
        System.out.println("[Car] Stop method in Car");
    }

    @Override
    public void increaseVolume() {
        System.out.println("[Car] Increased volume");
    }

    @Override
    public void accelerate() {
        System.out.println("[Car] Accelerate in Car");
    }
}

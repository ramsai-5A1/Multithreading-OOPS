package com.amazon.Interfaces;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("[CDPlayer] Music started");
    }

    @Override
    public void stop() {
        System.out.println("[CDPlayer] Music stopped");
    }

    @Override
    public void increaseVolume() {
        System.out.println("[CDPlayer] Increased volume");
    }
}

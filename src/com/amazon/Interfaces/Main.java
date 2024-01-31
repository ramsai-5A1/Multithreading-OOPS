package com.amazon.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.start();
//        car1.accelerate();
//        car1.increaseVolume();
//        car1.brake();
//        car1.stop();

        NiceCar car1 = new NiceCar();
        car1.start();
        car1.startMusic();
        car1.increaseVolume();
        car1.accelerate();
        car1.stopMusic();
        car1.upgradeEngine(new ElectricEngine());
        car1.accelerate();
        car1.stop();
    }
}

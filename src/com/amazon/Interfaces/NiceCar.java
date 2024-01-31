package com.amazon.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media music;

    public NiceCar() {
        engine = new PowerEngine();
        music = new CDPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        engine.accelerate();
    }

    public void startMusic() {
        music.start();
    }

    public void stopMusic() {
        music.stop();
    }

    public void increaseVolume() {
        music.increaseVolume();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }
}

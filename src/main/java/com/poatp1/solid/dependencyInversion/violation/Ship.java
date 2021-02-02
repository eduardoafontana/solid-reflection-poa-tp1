package com.poatp1.solid.dependencyInversion.violation;

public class Ship {

    private int maxFuel;
    private int remainingFuel;
    private int power;

    public Ship(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void accelerate() {
        power++;
        power++;
        remainingFuel--;
        remainingFuel--;
    }

    public int getMaxFuel() {
        return this.maxFuel;
    }

    public int getRemainingFuel() {
        return this.remainingFuel;
    }

    public int getPower() {
        return this.power;
    }
}

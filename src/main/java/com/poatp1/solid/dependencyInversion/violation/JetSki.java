package com.poatp1.solid.dependencyInversion.violation;

public class JetSki {

    private int maxFuel;
    private int remainingFuel;
    private int power;

    public JetSki(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void accelerate() {
        power++;
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

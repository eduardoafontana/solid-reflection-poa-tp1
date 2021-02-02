package com.solid.dependencyInversion.solution;

public abstract class Watercraft implements WatercraftInterface {
    
    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public Watercraft(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
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

    protected void setPower() {
        this.power++;
    }

    protected void setRemainingFuel() {
        this.remainingFuel--;
    }
}
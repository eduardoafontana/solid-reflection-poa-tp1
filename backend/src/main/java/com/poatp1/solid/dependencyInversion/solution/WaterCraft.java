package com.poatp1.solid.dependencyInversion.solution;

public abstract class WaterCraft implements WaterCraftInterface {
    
    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public WaterCraft(final int maxFuel) {
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
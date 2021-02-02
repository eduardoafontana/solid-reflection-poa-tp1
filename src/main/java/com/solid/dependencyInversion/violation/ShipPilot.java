package com.solid.dependencyInversion.violation;

public class ShipPilot {

    private Ship watercraft;

    public ShipPilot() {
        this.watercraft = new Ship(100);
    }

    public void increaseSpeed(){
        watercraft.accelerate();
    }

    public Ship getWatercraft() {
        return this.watercraft;
    }
}
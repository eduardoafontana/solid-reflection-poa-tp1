package com.solid.dependencyInversion.solution;

public class Pilot {

    private Watercraft watercraft;

    public Pilot(Watercraft watercraft) {
        this.watercraft = watercraft;
    }

    public void increaseSpeed(){
        watercraft.accelerate();
    }

    public Watercraft getWatercraft() {
        return this.watercraft;
    }
}
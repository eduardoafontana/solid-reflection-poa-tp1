package com.solid.dependencyInversion.solution;

public class Pilot {

    private WaterCraft watercraft;

    public Pilot(WaterCraft watercraft) {
        this.watercraft = watercraft;
    }

    public void increaseSpeed(){
        watercraft.accelerate();
    }

    public WaterCraft getWaterCraft() {
        return this.watercraft;
    }
}
package com.solid.dependencyInversion.violation;

public class JetSkiPilot {

    private JetSki watercraft;

    public JetSkiPilot() {
        this.watercraft = new JetSki(100);
    }

    public void increaseSpeed(){
        watercraft.accelerate();
    }

    public JetSki getWatercraft() {
        return this.watercraft;
    }
}
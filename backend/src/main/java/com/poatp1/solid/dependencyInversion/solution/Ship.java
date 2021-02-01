package com.poatp1.solid.dependencyInversion.solution;

public class Ship extends WaterCraft {

    public Ship(final int maxFuel) {
        super(maxFuel);
    }

    @Override
    public void accelerate() {
        super.setPower();
        super.setPower();
        super.setRemainingFuel();
        super.setRemainingFuel();
    }
}
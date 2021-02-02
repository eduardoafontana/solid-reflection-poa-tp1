package com.solid.dependencyInversion.solution;

public class Ship extends Watercraft {

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
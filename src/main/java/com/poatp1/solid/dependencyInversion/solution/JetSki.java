package com.poatp1.solid.dependencyInversion.solution;

public class JetSki extends WaterCraft {

    public JetSki(final int maxFuel) {
        super(maxFuel);
    }

    @Override
    public void accelerate() {
        super.setPower();
        super.setRemainingFuel();
    }
}
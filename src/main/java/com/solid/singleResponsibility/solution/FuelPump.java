package com.solid.singleResponsibility.solution;

public class FuelPump {

    public void reFuel(final Ship ship){
        final int remainingFuel = ship.getRemainingFuel();
        final int additionalFuel = ship.getMaxFuel() - remainingFuel;

        ship.setRemainingFuel(remainingFuel + additionalFuel);
    }
}

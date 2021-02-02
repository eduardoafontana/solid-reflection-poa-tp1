package com.solid.openClosed.solution;

public class EventHandler {

    private Ship ship;

    // if you need to add another loading configuration (e.g. Super loaded) just create a new class as PartillyLoaded.

    public EventHandler(final Ship ship) {
        this.ship = ship;
    }

    public void changeLoadingMode(final LoadingMode loadingMode){
        ship.setPower(loadingMode.getPower());
        ship.setWaterlineHeight(loadingMode.getWaterlineHeight());
    }
}

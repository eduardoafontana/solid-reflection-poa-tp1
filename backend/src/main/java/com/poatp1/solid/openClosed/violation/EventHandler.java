package com.poatp1.solid.openClosed.violation;

public class EventHandler {

    private Ship ship;

    public EventHandler(final Ship ship) {
        this.ship = ship;
    }

    // if you need another loading configuration (e.g. Super loaded) 2 classes will be changed: LoadingMode and EventHandler.
    public void changeLoadingMode(final LoadingMode loadingMode){
        switch (loadingMode){
            case EMPTY:
                ship.setPower(500);
                ship.setWaterlineHeight(10);
                break;
            case PARTIALLYLOADED:
                ship.setPower(400);
                ship.setWaterlineHeight(20);
                break;
            case LOADED:
                ship.setPower(300);
                ship.setWaterlineHeight(30);
                break;
            default:
                ship.setPower(500);
                ship.setWaterlineHeight(10);
                break;
        }
    }
}

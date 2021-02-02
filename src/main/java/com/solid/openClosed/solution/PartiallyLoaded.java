package com.solid.openClosed.solution;

public class PartiallyLoaded implements LoadingMode {

    private static final int POWER = 400;
    private static final int SUSPENSION_HEIGHT = 20;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getWaterlineHeight() {
        return SUSPENSION_HEIGHT;
    }
}
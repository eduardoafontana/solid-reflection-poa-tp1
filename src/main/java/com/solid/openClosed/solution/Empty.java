package com.solid.openClosed.solution;

public class Empty implements LoadingMode {

    private static final int POWER = 500;
    private static final int SUSPENSION_HEIGHT = 10;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getWaterlineHeight() {
        return SUSPENSION_HEIGHT;
    }
}
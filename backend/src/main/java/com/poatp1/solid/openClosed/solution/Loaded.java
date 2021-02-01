package com.poatp1.solid.openClosed.solution;

public class Loaded implements LoadingMode {

    private static final int POWER = 300;
    private static final int SUSPENSION_HEIGHT = 30;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getWaterlineHeight() {
        return SUSPENSION_HEIGHT;
    }
}
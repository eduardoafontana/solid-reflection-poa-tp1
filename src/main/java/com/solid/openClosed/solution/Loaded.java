package com.solid.openClosed.solution;

public class Loaded implements LoadingMode {

    private static final int POWER = 300;
    private static final int WATERLINE_HEIGHT = 30;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getWaterlineHeight() {
        return WATERLINE_HEIGHT;
    }
}
package com.solid.interfaceSegregation.solution;

public abstract class Watercraft implements EngineSwitch {
    
    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }
}

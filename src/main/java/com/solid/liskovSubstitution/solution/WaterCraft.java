package com.solid.liskovSubstitution.solution;

public abstract class WaterCraft {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

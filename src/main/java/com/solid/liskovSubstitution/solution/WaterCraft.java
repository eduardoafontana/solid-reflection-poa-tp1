package com.solid.liskovSubstitution.solution;

public abstract class Watercraft {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

package com.solid.liskovSubstitution.violation;

public abstract class Watercraft {

    private State state;

    public State getState() {
        return state;
    }

    public void changeState(final State state) {
        this.state = state;
    }

}

package com.poatp1.solid.liskovSubstitution.violation;

public abstract class WaterCraft {

    private State state;

    public State getState() {
        return state;
    }

    public void changeState(final State state) {
        this.state = state;
    }

}

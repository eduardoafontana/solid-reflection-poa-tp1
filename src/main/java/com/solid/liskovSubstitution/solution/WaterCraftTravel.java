package com.solid.liskovSubstitution.solution;

public abstract class WaterCraftTravel extends WaterCraft {

    //The ship supports all types of movement states.
    public void changeState(final State state) {
        super.setState(state);
    }
}

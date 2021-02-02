package com.solid.liskovSubstitution.solution;

public abstract class WatercraftTravel extends Watercraft {

    //The ship supports all types of movement states.
    public void changeState(final State state) {
        super.setState(state);
    }
}

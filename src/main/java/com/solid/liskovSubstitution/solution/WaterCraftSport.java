package com.solid.liskovSubstitution.solution;

public abstract class WatercraftSport extends Watercraft {

    //jetski now accepts only the states moving and moored without IFs or exceptions.
    public void changeState(final StateGeneral state) {
        super.setState(state);
    }
}

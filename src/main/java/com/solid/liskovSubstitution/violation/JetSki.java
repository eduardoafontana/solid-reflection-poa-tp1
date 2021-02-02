package com.solid.liskovSubstitution.violation;

public class JetSki extends WaterCraft {

    @Override
    public void changeState(State state) {
        if(state == State.CRUISING || state == State.TOWING){
            throw new RuntimeException("JetSki does not support Cruising and Towing movement states.");
        }

        super.changeState(state);
    }
}

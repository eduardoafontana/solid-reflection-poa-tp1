package com.solid.interfaceSegregation.violation;

import java.lang.UnsupportedOperationException;

public class JetSki extends Watercraft {

    private boolean turboJetBoosterActivated;

    @Override
    public void startTurboPropeller() {
        // Ship does not have Turbo Jet Booster.
        // This method needs to be overridden, but there is no behavior to be entered here.

        throw new UnsupportedOperationException();
    }

    @Override
    public void shutDownTurboPropeller() {
        // Ship does not have Turbo Jet Booster.
        // This method needs to be overridden, but there is no behavior to be entered here.

        throw new UnsupportedOperationException();
    }

    @Override
    public void startRadar() {
        // Ship does not have Turbo Jet Booster.
        // This method needs to be overridden, but there is no behavior to be entered here.

        throw new UnsupportedOperationException();
    }

    @Override
    public void shutDownRadar() {
        // Ship does not have Turbo Jet Booster.
        // This method needs to be overridden, but there is no behavior to be entered here.

        throw new UnsupportedOperationException();
    }

    public boolean isTurboJetBoosterActivated() {
        return this.turboJetBoosterActivated;
    }

    @Override
    public void startTurboJetBooster() {
        this.turboJetBoosterActivated = true;
    }

    @Override
    public void shutDownTurboJetBooster() {
        this.turboJetBoosterActivated = false;
    }
}

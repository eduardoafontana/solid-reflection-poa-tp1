package com.solid.interfaceSegregation.violation;

public class Ship extends WaterCraft {

    private boolean turboPropellerActivated;
    private boolean radarOn;

    @Override
    public void startTurboPropeller() {
        this.turboPropellerActivated = true;
    }

    @Override
    public void shutDownTurboPropeller() {
        this.turboPropellerActivated = false;
    }

    public boolean isTurboPropellerActivated() {
        return this.turboPropellerActivated;
    }

    @Override
    public void startRadar() {
        this.radarOn = true;
    }

    @Override
    public void shutDownRadar() {
        this.radarOn = false;
    }

    public boolean isRadarOn() {
        return this.radarOn;
    }

    @Override
    public void startTurboJetBooster() {
        // Ship does not have Turbo Jet Booster.
        // This method needs to be overridden, but there is no behavior to be entered here.

        throw new UnsupportedOperationException();
    }

    @Override
    public void shutDownTurboJetBooster() {
        // Ship does not have Turbo Jet Booster.
        // This method needs to be overridden, but there is no behavior to be entered here.

        throw new UnsupportedOperationException();
    }
}

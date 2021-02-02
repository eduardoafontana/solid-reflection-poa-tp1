package com.solid.interfaceSegregation.solution;

public class Ship extends Watercraft implements TurboPropellerSwitch, RadarSwitch {

    private boolean turboPropellerActivated;
    private boolean radarOn;

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
}

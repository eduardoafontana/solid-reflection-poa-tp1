package com.reflection;

@TypeHeader(
    developer = "Eduardo A. Fontana",
    lastModified = "2021-02-03",
    teamMembers = { "me", "mySelf", "andI" },
    meaningOfLife = 13
)

public class Ship extends Watercraft implements TurboPropellerSwitch, RadarSwitch {

    private boolean turboPropellerActivated;
    private boolean radarOn;

    public Ship() {}

    public Ship(boolean turboPropellerActivated, boolean radarOn) {
        super(true);

        this.turboPropellerActivated = true;
        this.radarOn = true;
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

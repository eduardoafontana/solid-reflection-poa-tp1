package com.poatp1.solid.interfaceSegregation.solution;

public class JetSki extends WaterCraft implements TurboJetBoosterSwitch {

    private boolean turboJetBoosterActivated;

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

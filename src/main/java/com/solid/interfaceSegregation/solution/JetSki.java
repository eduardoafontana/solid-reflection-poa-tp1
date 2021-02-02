package com.solid.interfaceSegregation.solution;

public class JetSki extends Watercraft implements TurboJetBoosterSwitch {

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

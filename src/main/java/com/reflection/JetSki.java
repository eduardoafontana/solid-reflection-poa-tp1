package com.reflection;

@TypeHeader(
    developer = "Eduardo A. Fontana",
    lastModified = "2021-02-03",
    teamMembers = { "me", "mySelf", "andI" },
    meaningOfLife = 14
)

public class JetSki extends Watercraft implements TurboJetBoosterSwitch {

    private boolean turboJetBoosterActivated;

    public JetSki() {}

    public JetSki(boolean turboJetBoosterActivated) {
        super(true);
        
        this.turboJetBoosterActivated = true;
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

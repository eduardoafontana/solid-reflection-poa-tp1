package com.reflection;

@TypeHeader(
    developer = "Eduardo A. Fontana",
    lastModified = "2021-02-03",
    teamMembers = { "me", "mySelf", "andI" },
    meaningOfLife = 12
)

public abstract class Watercraft implements EngineSwitch {
    
    private boolean engineRunning;

    private String name;

    public Watercraft() {}

    public Watercraft(boolean engineRunning) {
        this.engineRunning = true;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

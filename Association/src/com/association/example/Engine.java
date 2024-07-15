package com.association.example;

public class Engine {

    private int stokes;
    private boolean powerSteering;
    private boolean isPetrol;

    public Engine() {
    }

    public Engine(int stokes, boolean powerSteering, boolean isPetrol) {
        this.stokes = stokes;
        this.powerSteering = powerSteering;
        this.isPetrol = isPetrol;
    }

    public int getStokes() {
        return stokes;
    }

    public void setStokes(int stokes) {
        this.stokes = stokes;
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public boolean isPetrol() {
        return isPetrol;
    }

    public void setPetrol(boolean isPetrol) {
        this.isPetrol = isPetrol;
    }

    @Override
    public String toString() {
        return "Engine [stokes=" + stokes + ", powerSteering=" + powerSteering + ", isPetrol=" + isPetrol + "]";
    }

}

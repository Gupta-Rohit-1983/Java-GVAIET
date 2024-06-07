package com.oops.polymorphism.child;

import com.oops.polymorsim.parent.Products;

public class Electronic extends Products {

    private boolean battary;
    private boolean wireless;
    public Electronic() {
    }
    public Electronic(boolean battary, boolean wireless) {
        this.battary = battary;
        this.wireless = wireless;
    }
    public boolean isBattary() {
        return battary;
    }
    public void setBattary(boolean battary) {
        this.battary = battary;
    }
    public boolean isWireless() {
        return wireless;
    }
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    @Override
    public String toString() {
        return "Electronic [battary=" + battary + ", wireless=" + wireless + "]";
    }

    

}

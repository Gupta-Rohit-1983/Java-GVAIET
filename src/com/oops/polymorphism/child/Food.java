package com.oops.polymorphism.child;

import com.oops.polymorsim.parent.Products;

public class Food extends Products {

    private String expiryDate;
    private boolean veg;

    public Food() {
    }

    public Food(String expiryDate, boolean veg) {
        this.expiryDate = expiryDate;
        this.veg = veg;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    @Override
    public String toString() {
        return "Food [expiryDate=" + expiryDate + ", veg=" + veg + "]";
    }

}

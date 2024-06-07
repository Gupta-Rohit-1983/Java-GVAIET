package com.gvacharya;

public class FirstProgram {
    int price;
    int barcode;
    String brandName;

    // default constructor
    public FirstProgram() {

    }

    // paramaterized constructor
    public FirstProgram(int newPrice, int newBarcode, String newBrandname) {
        price = newPrice;
        barcode = newBarcode;
        brandName = newBrandname;

    }

    // behavior or methods
    // set price
    public void setPrice(int newPrice) {
        price = newPrice;

    }

    // set barcode
    public void setBarcode(int newBarcode) {
        barcode = newBarcode;
    }

    // set brandName
    public void setBrandname(String newBrandname) {
        brandName = newBrandname;
    }

    // get price
    public int getPrice() {
        return price;
    }

    // get barcode
    public int getBarcode() {
        return barcode;

    }

    // get brandName
    public String getBrandname() {
        return brandName;
    }
}

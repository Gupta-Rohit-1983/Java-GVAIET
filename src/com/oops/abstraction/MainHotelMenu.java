package com.oops.abstraction;

public class MainHotelMenu {

    public static void main(String[] args) {
        HotelMenu veg = new VegMenu();
        veg.printMenu();

        HotelMenu nonVeg = new NonVegMenu();
        nonVeg.printMenu();
    }
}

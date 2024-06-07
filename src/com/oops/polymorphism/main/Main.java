package com.oops.polymorphism.main;

import com.oops.polymorphism.child.Electronic;
import com.oops.polymorphism.child.Food;

public class Main {

    public static void main(String[] args) {
        Electronic charger= new Electronic();
        Food milk = new Food();
        

        charger.setPrice(1000.50F);
        charger.setBrand("Sumsung");
        charger.setBattary(false);
        charger.setWireless(false);

        milk.setBrand("Amul");
        milk.setPrice(80);
        milk.setExpiryDate("14 June");
        milk.setVeg(true);

        

    }

}

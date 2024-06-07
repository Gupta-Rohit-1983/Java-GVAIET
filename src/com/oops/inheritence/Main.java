package com.oops.inheritence;

public class Main {

    public static void main(String[] args) {
        Dog simba = new Dog(10,"black","Bark",25,4);
        System.out.println(simba.toString());

        Dog druvRathi = new Dog(12,"Brown","Modi",65,2);
        System.out.println(druvRathi.toString());

        GermanSepard gs = new GermanSepard(12,"Brown","Modi",65,2,"High");
        System.out.println(gs.toString());
    }
}

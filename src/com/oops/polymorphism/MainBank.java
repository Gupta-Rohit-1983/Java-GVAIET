package com.oops.polymorphism;

public class MainBank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccNumber(201040771983L);
        bank.setAccType("Saving");

        RBI rbi = new RBI();
        rbi.setAccNumber(123456789L);
        rbi.setAccType("Current");
        rbi.setPrintEquipment("Printer");

        bank.printAccDetail();
        rbi.printAccDetail();

        //downcasting super cast into sub class 
        // RBI rBI = (RBI) new Bank();

        // upcasting the sub cast into super class
        // Bank nBank = new RBI();
        // mainly used in abstraction layers.

        
        
    }

}

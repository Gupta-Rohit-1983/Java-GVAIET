package com.oops.abstraction.example3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Saving("Aryman",20,123456,10,1000);
        // bank.setName("Aryaman");
        // bank.setAge(25);
        // bank.setAccNo(123456789);
        bank.printAccDetails();

        System.out.println();

        Bank current = new Current(5, 10000);
        current.setAccNo(100000011);
        current.setAge(20);
        current.setName("Rohit");
        current.printAccDetails();

    }

}

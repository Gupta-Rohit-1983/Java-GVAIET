package com.collection.example;

public class GenericClassDemo {

    public static void main(String[] args) {
        add(10,20);


        Generic<Integer> intGeneric = new Generic<Integer>(10);

        System.out.println(intGeneric.getT());

        Generic<String> strGeneric = new Generic<>("Rohan Bakchod");
        System.out.println(strGeneric.getT());
    }

    private static void add(int i, int j) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'add'");
        System.out.println(i+j);
    }
}

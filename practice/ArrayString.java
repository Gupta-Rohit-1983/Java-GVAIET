package com.practice;

public class ArrayString {



    public static void main(String[] args) {
        String address="shelu GVAIET";
        String[] addComponent=address.split(" ");
        for (int i = 0; i < addComponent.length; i++) {
                System.out.println(addComponent[i]);
        }
        
        String newAddress=String.join("-",addComponent);
        System.out.println(newAddress);
    }
}

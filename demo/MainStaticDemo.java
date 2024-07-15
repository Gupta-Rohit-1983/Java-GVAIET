package com.demo;

public class MainStaticDemo {
    public static void main(String[] args) {
        System.out.println(StaticDemo.pincode);
        
        System.out.println(StaticDemo.additon(10, 20));

        StaticDemo.pincode = 421302;
        System.out.println(StaticDemo.pincode);
        System.out.println(StaticDemo.pincode);

        StaticDemo.pincode = 420032;
        System.out.println(StaticDemo.pincode);
        System.out.println(StaticDemo.pincode);

    }

}

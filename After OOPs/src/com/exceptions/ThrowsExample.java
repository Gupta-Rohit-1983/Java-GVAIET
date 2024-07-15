package com.exceptions;

public class ThrowsExample {

    public static void main(String[] args) {
        division(10, 0);
        
    }

   
    public static void division (int number1, int number2) throws RuntimeException{
        System.out.println(number1/number2);
    }
}

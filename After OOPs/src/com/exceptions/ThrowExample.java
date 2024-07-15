package com.exceptions;

public class ThrowExample {

    public static void main(String[] args) {
        try {
            division(0, 10);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
    }

    public static void division(int number1, int number2) throws Exception{
        if (number2 == 0) {
            throw new Exception("Can not Divide by Zero");
        }if (number1 == 0) {
            throw new Exception("Value can be infinite "); 
        } else {
            System.out.println(number1/number2);
        }
    }

}

package com.practice.swapnumber;

public class SwapNumberMain {
    public static void main(String[] args) {
        SwapNumber swapnumber = new SwapNumber(10,20);
        System.out.println("Number before swap " +swapnumber.getNumber1() +" "+ swapnumber.getNumber2());

        // swapnumber.usingThirdVariable();
        
        swapnumber.withoutUsingThirdVariable();

    }

}

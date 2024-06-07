package com.demo.operation.main;

import com.demo.operation.ArithmeticOperationServices;

public class MainArithmeticOperation {
    public static void main(String[] args) {
        ArithmeticOperationServices add =new ArithmeticOperationServices();

        System.out.println(add.additionServices());
        System.out.println(add.substractionServices());
        System.out.println(add.multiplicationServices());
  
    }

}

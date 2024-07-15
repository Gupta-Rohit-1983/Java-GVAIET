package com.exception.arithmeticutility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticUtilityImpl implements ArithmeticUtility {

    @Override
    public int printMenu(Scanner scanner) throws Exception {
        int choice = 0;
        for (Menu menu : Menu.values()) {
            System.out.println(menu.getSrNo() + "." +menu.name()+ "(" + menu.getInfo() + ")");
        }

        try {

            choice = scanner.nextInt();
        } catch (InputMismatchException imp) {
            throw new Exception("Please Enter Valid number");

        }
        return choice;
    }

    @Override 
    public void addition(Scanner scanner){
        System.out.println("Enter Two Number for Addition");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1+number2);
    }
    @Override 
    public void substraction(Scanner scanner){
        System.out.println("Enter Two Number for Substraction");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1-number2);
    }
    @Override 
    public void multiplication(Scanner scanner){
        System.out.println("Enter Two Number for Multiplication");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1*number2);
    }
    @Override 
    public void division(Scanner scanner){
        System.out.println("Enter Two Number for Division");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1/number2);
    }

}

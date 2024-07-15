package com.practice;

import java.util.Scanner;

public class MatchString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");

        String name = sc.next();

        if (name.matches("[A-Z][a-z]{1,29}")) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
        System.out.println("Enter Your Number");
        String num = sc.next();

        if (num.matches("[6-9][0-9]{9}")) {
            System.out.println("Valid Number");
        } else {

            System.out.println("Invalid Number");
        }
        sc.close();
    }
}

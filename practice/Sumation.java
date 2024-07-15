package com.practice;

public class Sumation {
    public static void main(String[] args) {
        int[] arrayElement = { 20, 10, 40, 20, 70 };

        int sum = 0;

        for (int i = 0; i < arrayElement.length; i++) {
            sum = sum + arrayElement[i];

        }
        System.out.println("Sumation of Array is " + sum + "\n Avarage of Array is " + sum / arrayElement.length);
    }
}

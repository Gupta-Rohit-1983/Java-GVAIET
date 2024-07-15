package com.practice;

import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a binary number: ");
                String binaryInput = scanner.next();
                int decimalResult = binaryToDecimal(binaryInput);
                System.out.println("Decimal equivalent: " + decimalResult);
                break;
            case 2:
                System.out.print("Enter a decimal number: ");
                int decimalInput = scanner.nextInt();
                String binaryResult = decimalToBinary(decimalInput);
                System.out.println("Binary equivalent: " + binaryResult);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int n = binary.length();
        for (int i = 0; i < n; i++) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, n - 1 - i);
        }
        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }
}
 

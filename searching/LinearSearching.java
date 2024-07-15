package com.searching;

import java.util.Scanner;

public class LinearSearching {

    public static void main(String[] args) {
        short[] array = { 1, 2, 5, 4, 8, 6, 9, 3 };
        boolean found = false;
        System.out.println("Enter a number to search in arary");
        Scanner sc = new Scanner(System.in);
        int elememt = sc.nextInt();
        sc.close();

        for (int i = 0; i < array.length; i++) {
            if (elememt == array[i]) {
                System.out.println("The number is present at the position :" + (i+1));
                found = true;
                break;
            }
            if (!found) {
                System.out.println("The is not present in the array.");
            }

        }

    }

}

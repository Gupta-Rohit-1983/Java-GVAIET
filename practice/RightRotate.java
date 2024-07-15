package com.practice;

public class RightRotate {
    public static void main(String[] args) {
        int[] element = { 10, 20, 30, 40, 50 };
        int lastElement = element[element.length - 1];

        // Before rotating the Array Element
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }
        System.out.println();

        for (int i = element.length - 1; i > 0; i--) {
            element[i] = element[i - 1];
        }
        element[0] = lastElement;

        // After rotating the Array Element
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }

    }

}

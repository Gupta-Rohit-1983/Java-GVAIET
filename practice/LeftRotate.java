package com.practice;

public class LeftRotate {
    public static void main(String[] args) {
        int[] rotateElement = { 10, 20, 30, 40, 50 };

        int firstElement = rotateElement[0];

        // Before rotating array element
        for (int i = 0; i < rotateElement.length; i++) {
            System.out.print(rotateElement[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < rotateElement.length - 1; i++) {
            rotateElement[i] = rotateElement[i + 1];
        }
        rotateElement[rotateElement.length - 1] = firstElement;

        // After rotate printing Array element
        for (int i = 0; i < rotateElement.length; i++) {
            System.out.print(rotateElement[i] + " ");
        }
    }

}

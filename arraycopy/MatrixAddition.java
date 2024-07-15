package com.arraycopy;

import java.util.Scanner;

public class MatrixAddition {

    public static void getInput(int[][] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Values for " + (i + 1) + " row");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("For colume " + (j + 1) + ":");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void matrixAddition(int[][] arr1, int[][] arr2, int[][] result){
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                result[i][j]=arr1[i][j] + arr2[i][j];
            }
        }
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matix1 = new int[3][3];
        int[][] matix2 = new int[3][3];
        int[][] result = new int[3][3];
        System.out.println("Get Value for matrix 1");
        getInput(matix1, sc);
        System.out.println("Get Value for matrix 2");
        getInput(matix2, sc);

        System.out.println("First matix is :");
        printArray(matix1);
        System.out.println("Second matrix is :");
        printArray(matix2);


        matrixAddition(matix1, matix2, result);

        // System.out.println(Arrays.deepToString(result));
        System.out.println("Result of Addition is :s");
        printArray(result);

    }

}

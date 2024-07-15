package com.arraycopy;

import java.util.Arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {
        
        // int[][] matix1 = {{1,2,3},{4,5,6},{7,8,9}};

        // for (int i = 0; i < matix1.length; i++) {
        //     for (int j = 0; j < matix1[i].length; j++) {
        //         System.out.print(matix1[i][j] +" ");
        //     }
        //     System.out.println();
        // }

        // Different way to inisialize multidimetional array

        int[][] matix2 = new int[3][3];

        int temp = 1;
        for (int i = 0; i < matix2.length; i++) {
            for (int j = 0; j < matix2[i].length; j++) {
                matix2[i][j] = temp++;
            }
        }

        
        matix2[0] = new int[] {1,2,3};
        matix2[1] = new int[] {4,5,6};
        matix2[2] = new int[] {7,8,9};
        
        System.out.println(Arrays.deepToString(matix2));
        // String matix2string = Arrays.deepToString(matix1);

        // System.out.println(matix2string);

    }


    

}

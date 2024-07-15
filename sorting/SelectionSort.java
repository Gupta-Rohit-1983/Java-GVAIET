package com.sorting;

public class SelectionSort {
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swaping using third variable
            // int temp = arr[min_idx];
            // arr[min_idx] = arr[i];
            // arr[i] = temp;

            // Swaping without using third variable
            if (min_idx != i) {
                arr[min_idx] = arr[min_idx] + arr[i];
                arr[i] = arr[min_idx] - arr[i];
                arr[min_idx] = arr[min_idx] - arr[i];
            }
        }

    }

    

    public void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] price = { 1, 5, 7, 9, 8, 6 };

        SelectionSort sSort = new SelectionSort();

        System.out.println("Price before sorting");
        sSort.printArr(price);
        System.out.println();

        sSort.selectionSort(price);

        System.out.println("Price after sorting");
        sSort.printArr(price);

    }

}

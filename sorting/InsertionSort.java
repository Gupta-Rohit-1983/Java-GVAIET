package com.sorting;

public class InsertionSort {

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = j;

            while (j >= 0 && arr[key] > arr[j + 1]) {
                int temp = arr[key];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
                key--;
            }
        }
    }

    public static void insertionSortString(String[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = j;

            while (j >= 0 && arr[key].compareTo(arr[j + 1]) > 0) {
                String temp = arr[key];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
                key--;
            }
        }
    }

    public static void printString(String[] arr){
        for (String string : arr) {
            System.out.print(string +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 4, 2 };

        String[] name = { "Rohit", "Rohan", "Krishna", "Jatin", "Kunal" };
        // Before sorting
        printArr(array);

        insertionSort(array);

        // After sorting
        printArr(array);
        System.out.println();

        printString(name);
        insertionSortString(name);
        printString(name);
        
    }
}

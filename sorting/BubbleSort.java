package com.sorting;

public class BubbleSort {

    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortString(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void printString(String[] arr){
        for (String string : arr) {
            System.out.print(string +" ");
        }
        System.out.println();
    }

    public void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = { 20, 50, 30, 40, 10 };

        String[] name = { "Rohit", "Rohan", "Krishna", "Jatin", "Kunal" };


        // int[] price = { 1, 5, 7, 9, 8, 6 };

        BubbleSort bSort = new BubbleSort();

        // before sorting the array
        System.out.println("Before sorting the Array");
        bSort.printArr(array);
        System.out.println();

        bSort.bubbleSort(array);

        System.out.println("After sorting the Array");
        // after sorting the array
        bSort.printArr(array);

        System.out.println();
        printString(name);
        bubbleSortString(name);
        printString(name);

    }

}

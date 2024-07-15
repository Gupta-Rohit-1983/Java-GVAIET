package com.searching;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;

            if (target > arr[mid]) {
                low = mid + 1;
            }
            if (target == arr[mid]) {
                return mid;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        int index = binarySearch(array, 10);

        if (index > -1) {
            System.out.println("Element found at index :" + index);
        } else
            System.out.println("Element not found");
    }
}

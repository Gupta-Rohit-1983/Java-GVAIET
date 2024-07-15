package com.arraycopy;

public class EqualArray {

    public static boolean isEqual(int[] a , int[] b){
        int sizeA = a.length-1;
        int sizeB = b.length-1;

        if (sizeA != sizeB) {
            return false;
        }

        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(isEqual(arr1, arr2));
    }

}

package com.arraycopy;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] intarray = new int[] { 1, 2, 3, 4, 5 };
        // int[] sourceArray = {1,2,3};
        int[] destinationArray = conditionalDeepCopy(intarray, 1, 3);

        System.out.println(Arrays.toString(destinationArray));

        int index = Arrays.binarySearch(intarray, 3);

        System.out.println(index);
        // // int[] intarray1 = intarray;

        // // for (int i : intarray1) {
        // // System.out.println(i);
        // // }

        // System.out.println("Shallow copy array ");
        // shallowCopy(intarray);

        // deepArary(sourceArray, destinationArray);
        // System.out.println("Destination Array of deep copy arr");
        // for (int i : destinationArray) {
        //     System.out.print(i +" ");
        // }




    }

    public static void shallowCopy(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void deepArary(int[] source, int[] destination) {
        for (int i = 0; i < destination.length; i++) {
            if(i < source.length){
                destination[i] = source[i];
            }else{
                destination[i] = 0;
            }
        }
    }

    public static int[]  conditionalDeepCopy(int[] source, int startPosition, int endPosition){

        int[] destination = new int[(endPosition-startPosition) +1];
        int j =0;

        for (int i = startPosition; i <= endPosition; i++) {
                destination[j] = source[i];
                j++;
        }

        // for (int i : destination) {
        //     System.out.println(i +  " ");
        // }
        return destination;
        
    }

}

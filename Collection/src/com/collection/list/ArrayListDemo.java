package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();

        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(1, 30);
        System.out.println(intArrayList);

        List<String> strList = new ArrayList<>();

        strList.add("Abc");
        strList.add("Pqr");
        strList.add("Xyz");

        System.out.println(strList);

        intArrayList.remove(2);
        System.out.println(intArrayList);
        System.out.println(intArrayList.size());

        intArrayList.addAll(Arrays.asList(10, 20, 30, 40, 50));
        intArrayList.sort(null);
        System.out.println(intArrayList);

        System.out.println(intArrayList.indexOf(20));
        System.out.println(intArrayList.lastIndexOf(10));
        System.out.println(intArrayList.hashCode());
        int[] intArray = { 1, 2, 4, 5, 6 };
        printArray(intArray);

    }

    public static void printArray(int[] arr) {

        System.out.println(Arrays.toString(arr));
    }

}

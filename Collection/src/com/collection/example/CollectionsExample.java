package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {
        List<Integer> intList1 = Collections.emptyList();

        // Initial Capacity
        List<Integer> intList = new ArrayList<>();

        intList.add(10);
        intList.add(20);

        Collections.reverse(intList);
        System.out.println(intList);
        Collections.shuffle(intList);
        System.out.println(intList);
        Collections.rotate(intList1, 1);
        System.out.println(intList);

        int index = Collections.binarySearch(intList, 10);
        System.out.println(index);

        int max = Collections.max(intList);
        System.out.println(max);
    }
}

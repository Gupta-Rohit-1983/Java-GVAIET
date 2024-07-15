package com.collection.example;

import java.util.ArrayList;
import java.util.List;

public class HetrogenousExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        List list = new ArrayList<>(5);

        list.add(10);
        list.add("abc");
        list.add("mumbai");
        System.out.println(list);

        
    }
}

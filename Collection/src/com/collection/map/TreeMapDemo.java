package com.collection.map;

import java.util.NavigableMap;
import java.util.TreeMap;

import com.collection.list.Employee;

public class TreeMapDemo {

    public static void main(String[] args) {

        NavigableMap<Employee, Float> empTreeMap = new TreeMap<>();

        empTreeMap.put(new Employee(4,"akjd",10000F), 10000F);
        empTreeMap.put(new Employee(42,"akjd",10000F), 10000F);
        empTreeMap.put(new Employee(3,"akjd",10000F), 10000F);
        empTreeMap.put(new Employee(5,"akjd",10000F), 10000F);
        empTreeMap.put(new Employee(6,"akjd",10000F), 10000F);

        empTreeMap.forEach((k,v)-> System.out.println("Keys =>"+ k + "::" + "Value =>"+v));
    }
    
}

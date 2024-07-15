package com.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;


public class VectorDemo {

    public static void main(String[] args) {
        List<Employee> empVector = new Vector<>();
        List<Employee> empVector1 = Arrays.asList(
            new Employee(2,"Abc2", 10000),
            new Employee(3,"Abc2", 10000),
            new Employee(4,"Abc3", 10000)

        );

        empVector.add(new Employee(1,"Abc",10000));
    
      empVector.addAll(empVector1);
       

        // // Employee emp1 = empVector.get(0);
        // // System.out.println(emp1);

        // empVector.removeIf(e->e.getName().equals("Abc"));
        empVector.forEach(System.out::println);

        empVector.retainAll(empVector1);
        System.out.println(empVector);

        
    }
}

package com.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import com.collection.list.Employee;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        
        Map<Employee, Float> liknedHashMap = new LinkedHashMap<>();
        

        liknedHashMap.put(new Employee(1,"dhggf",100F), 10000F);
        liknedHashMap.put(new Employee(2,"Abc",12000F), 10000F);
        liknedHashMap.put(new Employee(2,"Abc",12000F), 10000F);

        System.out.println(liknedHashMap.hashCode());
        System.out.println(liknedHashMap.hashCode());
        System.out.println(liknedHashMap.hashCode());
        

        for (Employee string : liknedHashMap.keySet()) {
            liknedHashMap.compute((Employee) string, (k,v)-> v + (v*0.05f));
        }
        
        liknedHashMap.forEach((k,v)-> System.out.println(k+","+v));
    }
}

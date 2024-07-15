package com.collection.list;

// import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class LinkedListDemo {

    public static void main(String[] args) {
        
        // List<Integer> intLinkedList = new LinkedList<>();

        // intLinkedList.addFirst(10);
        // intLinkedList.add(20);
        // intLinkedList.add(30);
        // intLinkedList.addLast(40);
        // intLinkedList.add(50);
        // intLinkedList.add(2,15);
        // intLinkedList.remove(Integer.valueOf(20));
        // intLinkedList.addAll(Arrays.asList(6,7,8,9));
        // System.out.println(intLinkedList);

        List<Employee> employeesList = new LinkedList<>();

        employeesList.add(new Employee(1,"Rohit",20000));
        employeesList.add(new Employee(2,"Kunal",10000));
        employeesList.add(new Employee(3,"Rohan",15000));
        employeesList.add(new Employee(4,"Jatin",5000));

        employeesList.sort(new EmployeeIdComparator());
        System.out.println(employeesList);

        employeesList.sort(new EmployeeNameComparator());
        System.out.println(employeesList);

        employeesList.sort(new EmployeeSalaryComparator());
        System.out.println(employeesList);

        Collections.sort(employeesList);
        System.out.println(employeesList);

        try (
        
            Stream<Employee> eStream = employeesList.stream();
        ) {
            eStream.sorted((e1,e2)-> e1.getName().compareTo(e2.getName())).forEach(System.out::println);;
           
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }

}

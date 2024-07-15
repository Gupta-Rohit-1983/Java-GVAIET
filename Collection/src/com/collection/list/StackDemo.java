package com.collection.list;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
         Stack<Employee> empStack = new Stack<>();

         empStack.push(new Employee(1,"Abc",10000));
         empStack.push(new Employee(2,"Abc",10000));
         empStack.push(new Employee(3,"Abc",10000));
         empStack.push(new Employee(4,"Abc",10000));
         empStack.push(new Employee(5,"Abc",10000));
         empStack.push(new Employee(6,"Abc",10000));


         empStack.peek();
        //  empStack.pop();

        //  for (Employee employee : empStack) {
        //     System.out.println(employee);
        //  }

        while (!empStack.isEmpty()) {
            System.out.println(empStack.pop());
        }
    }
}

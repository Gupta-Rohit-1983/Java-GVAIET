package com.collection.list;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        return Integer.compare((int)o1.getSalary(), (int)o2.getSalary());
    }

}

package com.collection.list;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private float salary;

    public Employee() {
    }

    public Employee(int id,String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    

    @Override
    public int compareTo(Employee o) {
        return Float.compare(this.getId(), o.salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj== null) {
            return false;
        }else if (this.getClass() != obj.getClass()) {
            return false;
        }

        Employee temp = (Employee) obj;

        return (temp.getId()==this.getId() && temp.name.equalsIgnoreCase(this.name));
    }

    @Override
    public int hashCode() {
        // float hash = 13;
        // hash = hash *17 + id;
        // hash = hash * 17 + name.toLowerCase().hashCode();
        // hash = (hash  * 17 + salary);

        // return (int) hash;

        return Objects.hash(id,name,salary);
    }
    
    
   
}

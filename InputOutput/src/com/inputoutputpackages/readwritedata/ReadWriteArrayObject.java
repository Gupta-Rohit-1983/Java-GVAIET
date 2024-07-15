package com.inputoutputpackages.readwritedata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

import com.inputoutputpackages.readwritedata.entities.Employee;

public class ReadWriteArrayObject implements Serializable {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "Rohit");
        employees[1] = new Employee(2, "Jatin");
        employees[2] = new Employee(3, "Rahul");
        employees[3] = new Employee(4, "Rohan");
        employees[4] = new Employee(5, "Kunal");

        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employee.docx"));) {
            oos.writeObject(employees);
        } catch (Exception e) {
            // TODO: handle exception
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.docx"));) {
            Employee[] employees2 = (Employee[]) ois.readObject();
            System.out.println(Arrays.toString(employees2));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}

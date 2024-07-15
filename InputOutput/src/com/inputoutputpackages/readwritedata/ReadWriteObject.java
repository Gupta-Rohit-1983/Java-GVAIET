package com.inputoutputpackages.readwritedata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.inputoutputpackages.readwritedata.entities.Employee;

public class ReadWriteObject {

    public static void main(String[] args) {
        
        Employee emp = new Employee(1, "Rohit");
        try(
            FileOutputStream fos = new FileOutputStream("Employee.docx");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

        ){

            oos.writeObject(emp);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        try (
            FileInputStream fis = new FileInputStream("Employee.docx");
            ObjectInputStream ois = new ObjectInputStream(fis); 
        ){
            Employee emp1 = (Employee) ois.readObject();
            System.out.println(emp1);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}

package com.student;

import java.util.List;

import com.student.entities.Address;
import com.student.entities.Student;
import com.student.services.StudentService;

public class App {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        // Address address = new Address("GV College","Shelu East",410101,"Karjat");
        // Student student = new Student(2,"Rohan","AIML",address);

        // System.out.println(service.insertStudent(student));

        // List<Student> studentList = service.selectAllStudent();
        // studentList.forEach(System.out::println);

        // System.out.println(service.selectStudent(1));

        System.out.println(service.deleteStudent(1));
    }
}

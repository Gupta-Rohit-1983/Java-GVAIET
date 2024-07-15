package com.association.ecample2;

import java.util.ArrayList;
import java.util.List;

import com.association.Subject;

public class MainTeacher {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        teacher1.setName("Kunal");
        teacher1.setNoOfLecture(6);

        List<Subject> subjects = new ArrayList<>();

        subjects.add(new Subject("Deep Learning"));

        teacher1.setSubjects(subjects);

        Department department = new Department();
        department.setDeptName("Computer");
        department.setDeptNo(1110033);

        teacher1.setDepartment(department);

        System.out.println(teacher1);
        
    }
}
